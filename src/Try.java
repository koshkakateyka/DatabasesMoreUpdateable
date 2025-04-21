import java.sql.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Try {

    public Document convertRSToDocument(ResultSet rs) {
        Document doc = null;

        try {
            ResultSetMetaData rsmd = rs.getMetaData();

            //Get an array of columns from the RSMetaData
            String[] columns = new String[rsmd.getColumnCount()];
            for (int i = 0; i < columns.length; i++) {
                //The set of column names begins with '1' rather than '0'
                columns[i] = rsmd.getColumnName(i + 1);
            }

            //Get an array of the types of each RS column from the RSMetaData
            int[] columnTypes = new int[columns.length];
            for (int i = 0; i < columnTypes.length; i++) {
                //The set of column types also begins with '1' rather than '0'
                columnTypes[i] = rsmd.getColumnType(i + 1);
            }

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.newDocument();

            Element root = doc.createElement("ResultSet");
            doc.appendChild(root);

            Text text = null;
            //We are now ready to loop through the ResultSet.  For each row found,
            //we add new elements that are named after the columns in the ResultSet,
            //have an attribute that mentions the formal (SQL) type of the result, and
            //hold the value for the column in each row
            while (rs.next()) {
                Element row = doc.createElement("row");
                root.appendChild(row);

                //Each row has a fixed set of columns, loop through each
                //column, testing against the type of the column as indicated in the
                //ResultSetMetaData interface.
                for (int i = 0; i < columns.length; i++) {
                    Element elem = doc.createElement(columns[i]);
                    row.appendChild(elem);

                    switch (columnTypes[i]) {
                        case Types.BIGINT:
                            long bint = rs.getLong(i + 1);
                            //Add a 'type' attribute to the element.  This may be
                            //useful in identifying how the data should be handled
                            //if it is read from the Document later on
                            elem.setAttribute("type", "BigInt");
                            text = doc.createTextNode(Long.toString(bint));
                            break;
                        case Types.BOOLEAN:
                            boolean bool = rs.getBoolean(i + 1);
                            elem.setAttribute("type", "boolean");
                            text = doc.createTextNode(Boolean.toString(bool));
                            break;
                        case Types.DATE:
                        //And so on for all the types defined in java.sql.Types
                        case Types.LONGVARCHAR:
                        case Types.VARCHAR:
                            String str = rs.getString(i + 1);
                            elem.setAttribute("type",  "Varchar");
                            if (str == null) {
                                //Add a null attribute to the element to represent null
                                //value in the database
                                elem.setAttribute("null", "true");
                                str = "";
                            }
                            text = (Text)doc.createCDATASection(str);
                            break;
                        default:
                            //log here because we didn't figure out
                            //what this thing was
//                            log.warn("Unknown element type found!!!");
//                            log.warn("Column = " + columns[i]);
                            elem.setAttribute("type", "Unknown");
                            text = doc.createTextNode("");
                            break;
                    }
                    elem.appendChild(text);
                }
            }

        } catch (SQLException sqle) {
            //Handle the exception in some way
        } catch (ParserConfigurationException pce) {
            //Handle the exception in some way
        }
        return doc;
    }
}

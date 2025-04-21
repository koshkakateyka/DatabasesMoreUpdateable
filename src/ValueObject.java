import org.w3c.dom.*;
import javax.xml.parsers.*;
public class ValueObject {
    private String someData;
    private int someNumber;
    //...
    //Standard accessor methods...
    public String getSomeData() {
        return someData;
    }

    //...
    //Standard mutator method...
    public void setSomeData(String somedata) {
        someData = somedata;
    }

    //...
    //And the toXML() method
    public org.w3c.dom.Document toXML() {
        // Document doc = "lol.xml";
        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.newDocument();
            Element root = doc.createElement("ValueObject");
            doc.appendChild(root);
            Element node = doc.createElement("someData");
            root.appendChild(node);
            Text value = doc.createTextNode(someData);
            node.appendChild(value);
            //.....//And so on for all the fields
        } catch (Exception e) {
            //Bad form, but just for demonstration!
        }
        return doc;
    }
}

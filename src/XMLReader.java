import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import uk.co.rodderscode.framework.Model;

import java.io.File;

public class XMLReader implements Model {

    private String filename;
    private Document doc;


    public XMLReader() {}

    public void setFilename(String filename){ this.filename = filename; }
    public String getFilename(){ return filename; }

    public Document getDocument(){
        if(doc.equals(null))
            load();
        return doc;
    }

    public Document load(){
        try {
            File fXmlFile = new File(filename);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Element getRoot(){
        return doc.getDocumentElement();
    }

    public NodeList getListByTagName(String tagName){
        return doc.getElementsByTagName(tagName);
    }


}

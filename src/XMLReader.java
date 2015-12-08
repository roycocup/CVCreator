import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.logging.Logger;

public class XMLReader {

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

    public Boolean load(){
        try {
            File fXmlFile = new File(filename);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            uk.co.rodderscode.utils.Logger.l("Warning", "this is fucked up");
            return false;
        }
    }

    public Element getRoot(){
        return doc.getDocumentElement();
    }

    public NodeList getListByTagName(String tagName){
        return doc.getElementsByTagName(tagName);
    }


}

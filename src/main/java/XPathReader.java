import com.sun.org.apache.xml.internal.dtm.ref.DTMNodeList;
import com.sun.tools.javac.util.Log;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import uk.co.rodderscode.utils.Printer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;


public class XPathReader {

    DocumentBuilderFactory dbf  = DocumentBuilderFactory.newInstance();
    DocumentBuilder db;
    Document d;
    XPath xp = XPathFactory.newInstance().newXPath();;
    NodeList nl;

    public XPathReader(){}

    public void load(File file){
        try {
            db = dbf.newDocumentBuilder();
            d = db.parse(file);
            nl = (NodeList) xp.compile("//section").evaluate(d, XPathConstants.NODESET);
        } catch(Exception e){
            Printer.pl(e.getMessage());
        }
    }

    public void getTitles(){
        try {
            for (int i = 0; i < nl.getLength(); i++)
                Printer.pl(xp.compile("./@title").evaluate(nl.item(i)));
        }catch (XPathExpressionException e){
            Printer.pl(e.getMessage());
        }

    }



}

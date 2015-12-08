import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import uk.co.rodderscode.utils.Printer;

/**
 *
 * This is the main class for the CV creator system
 */

public class CVCreator {

    private final static String filename = "cv.xml";
    private final static String resourcesFolderPath = "resources/";

    Document doc;
    XMLReader model = new XMLReader();
    Formatter view = new Formatter();


    public CVCreator() {
        model.setFilename(resourcesFolderPath+filename);
        model.load();
        Printer.pl(doc);
    }

    public String getTitleList()
    {
        Document doc = model.getDocument();
        String e = doc.getDocumentElement().getTagName();
        return e;
    }

    public void getCategories(){
        NodeList list = model.getListByTagName("cv");
        for (int i = 0; i < list.getLength(); i++) {
            Node nNode = list.item(i);
            Printer.pl(nNode.getChildNodes());
        }
    }

    public static void main(String[] args) {new CVCreator();}

}

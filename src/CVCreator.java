import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import uk.co.rodderscode.utils.Printer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * This is the main class for the CV creator system
 */

public class CVCreator {

    private final static String filename = "cv.xml";
    private final static String resourcesFolderPath = "resources/";

    XMLReader model = new XMLReader();
    Formatter view = new Formatter();


    public CVCreator() {
        model.setFilename(resourcesFolderPath+filename);
        model.load();
        getTitleList();
    }

    public void getTitleList()
    {
        List<String> list = new ArrayList<>();
        NodeList nodes = model.getDocument().getElementsByTagName("section");
        for(byte i = 0; i < nodes.getLength(); i++)
            list.add(nodes.item(i).getAttributes().getNamedItem("title").toString());
        Printer.pl(list);
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

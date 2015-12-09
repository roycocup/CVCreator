import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import uk.co.rodderscode.utils.Printer;

import java.util.ArrayList;
import java.util.HashMap;
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
    HashMap<String, Node> sectionsList;

    public CVCreator() {
        model.setFilename(resourcesFolderPath+filename);
        model.load();
        loadSectionsList();
        getLanguages();
    }

    public void loadSectionsList()
    {
        HashMap<String,Node> map = new HashMap<>();
        NodeList nodes = model.getDocument().getElementsByTagName("section");
        for(byte i = 0; i < nodes.getLength(); i++) {
            map.put(nodes.item(i).getAttributes().getNamedItem("title").toString(), nodes.item(i));
        }

        this.sectionsList = map;
    }

    public void getLanguages(){
        Printer.pl(sectionsList.get("overview"));
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

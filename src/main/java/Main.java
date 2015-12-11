import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import uk.co.rodderscode.utils.Printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;


/**
 *
 * This is the main class for the CV creator system
 */

public class Main {

    static final String resourcesFolderPath = "resources/";
    static final String filename = "cv.xml";


//    XMLReader model = new XMLReader();
    XPathReader model = new XPathReader();
//    SAXReader model = new SAXReader();
    Formatter view = new Formatter();
    HashMap<Node, Node> sectionsList;

    public Main() {
//        model.setFilename(resourcesFolderPath+filename);
//        model.load();
//        loadSectionsList();
//        getLanguages();
        model.load(getFile());
        model.getTitles();
    }

    private File getFile(){
        File f;
        try{
            f = new File(Main.resourcesFolderPath+Main.filename);
            if (f.exists() != true)
                throw new FileNotFoundException();
        } catch (Exception e){
            Printer.pl(e.getMessage());
            //TODO this is not very good... why is it legal?
            return null;
        }
        return f;
    }

    /*
    public void loadSectionsList() {
        NodeList nodes = model.getDocument().getElementsByTagName("section");
        for(byte i = 0; i < nodes.getLength(); i++) {
//            Printer.pl(nodes.item(i).);
            try {
                sectionsList.put(nodes.item(i).getAttributes().getNamedItem("title"), nodes.item(i));
            }catch (Exception e){
                Printer.pl(nodes.item(i).getAttributes().getNamedItem("title"));
            }
        }
    }

    public void getLanguages(){
        Printer.pl(sectionsList);
    }

    public void getCategories(){
        NodeList list = model.getListByTagName("cv");
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            Printer.pl(node.getChildNodes());
        }
    }
    */

    public static void main(String[] args) {new Main();}

}

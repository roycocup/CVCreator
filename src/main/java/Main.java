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


    XPathReader model = new XPathReader();
    Formatter view = new Formatter();
    HashMap<Node, Node> sectionsList;

    public Main() {
        model.load();
        model.getTitles();
    }




    public static void main(String[] args) {new Main();}

}

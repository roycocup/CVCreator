/**
 *
 * This is the main class for the CV creator system
 */

public class CVCreator {

    String filename = "cv.xml";
    static String resourcesFolderPath = "resources/";

    public CVCreator() {
        XMLReader parser = new XMLReader(resourcesFolderPath+filename);
        Formatter f = new Formatter();
        f.format(parser);
    }

    public static void main(String[] args) {new CVCreator();}

}

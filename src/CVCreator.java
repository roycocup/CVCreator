/**
 *
 * This is the main class for the whole CV creator system
 */

public class CVCreator {

    String filename = "cv.xml";
    static String resourcesFolderPath = "resources/";
    Object CV;

    public CVCreator() {
        XMLReader parser = new XMLReader(resourcesFolderPath+filename);
//        Object CV = parser.getObject();
//        System.out.println(CV.values());
    }

    public static void main(String[] args) {new CVCreator();}

}

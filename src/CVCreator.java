/**
 *
 * This is the main class for the whole CV creator system
 */

public class CVCreator {

    String yamlFileName = "cv.yaml";
    static String resourcesFolderPath = "resources/";
    Object CV;

    public CVCreator() {
        YamlParser parser = new YamlParser(yamlFileName);
        Object CV = parser.getObject();
//        System.out.println(CV.values());
    }

    public static void main(String[] args) {new CVCreator();}

}

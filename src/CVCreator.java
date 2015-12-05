import java.util.HashMap;

/**
 *
 * This is the main class for the whole CV creator system
 */

import java.util.*;

public class CVCreator {

    String yamlFileName = "cv.yaml";
    static String resourcesFolderPath = "resources/";
    Object CV;

    public CVCreator() {
        CVParser parser = new CVParser(yamlFileName);
        Object CV = parser.getObject();
//        System.out.println(CV.values());
    }

    public static void main(String[] args) {new CVCreator();}

}

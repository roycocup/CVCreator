
import java.io.File;
import java.io.FileNotFoundException;

import com.oracle.tools.packager.Log;
import org.ho.yaml.*;
import org.ho.yaml.exception.ObjectCreationException;


public class CVParser {

    private String filename;
    boolean loaded = false;
    private Object yamlObject;

    public CVParser(String filename) {
        setFilename(filename);
        loaded = loadYaml();
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setFilename(String filename){
        this.filename = filename;
    }

    public String getFilename(){
        return filename;
    }

    private boolean loadYaml() {
        File f = new File(CVCreator.resourcesFolderPath + filename);
        if (!f.exists()) {
            System.out.println("Problem");
            return false;
        }

        try {
            yamlObject = Yaml.load(f);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

        return true;

    }
    
    public Object getObject(){
        if (!isLoaded())
            loadYaml();
        return yamlObject;
    }



}


import java.io.File;

import org.ho.yaml.*;


public class YamlParser extends Parser{

    private String filename;
    boolean loaded = false;
    private Object yamlObject;

    public YamlParser(String filename) {
        setFilename(filename);
        loaded = load();
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

    private boolean load() {
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
            load();
        return yamlObject;
    }



}

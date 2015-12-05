
abstract class Parser {

    private String filename = "";
    Object finalObject;
    boolean loaded = false;

    private boolean load() { return false; }

    public boolean isLoaded() { return loaded;}

    public void setFilename(String filename){ this.filename = filename; }

    public String getFilename(){ return filename; }

}

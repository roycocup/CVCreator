import java.util.ArrayList;
import java.util.List;


public class Formatter{

    List data = new ArrayList<>();

    public Formatter() {}

    public List getData() {return data;}

    public void addToData(Object d) {
        data.add(d);
    }
}

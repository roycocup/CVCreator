import uk.co.rodderscode.framework.View;
import uk.co.rodderscode.utils.Printer;

import java.util.ArrayList;
import java.util.List;


public class Formatter implements View {

    List data = new ArrayList<>();

    public Formatter() {}

    public List getData() {return data;}

    public void addToData(Object d) {
        data.add(d);
    }
}

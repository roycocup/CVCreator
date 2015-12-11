import java.util.ArrayList;
import java.util.List;


public class Formatter{


    final String header = "    ____            __     _                ____  _               _______    __\n" +
            "   / __ \\____  ____/ /____(_)___ _____     / __ \\(_)___ ______   / ____/ |  / /\n" +
            "  / /_/ / __ \\/ __  / ___/ / __ `/ __ \\   / / / / / __ `/ ___/  / /    | | / / \n" +
            " / _, _/ /_/ / /_/ / /  / / /_/ / /_/ /  / /_/ / / /_/ (__  )  / /___  | |/ /  \n" +
            "/_/ |_|\\____/\\__,_/_/  /_/\\__, /\\____/  /_____/_/\\__,_/____/   \\____/  |___/   \n" +
            "                         /____/";
    List data = new ArrayList<>();

    public Formatter() {}

    public List getData() {return data;}

    public void addToData(Object d) {
        data.add(d);
    }
}

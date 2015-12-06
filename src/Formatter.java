import org.w3c.dom.Element;
import uk.co.rodderscode.utils.Printer;

import java.util.ArrayList;
import java.util.List;

public class Formatter {

    XMLReader parser;

    public String format(XMLReader parser)
    {
        this.parser = parser;
        getTitleList();
        return "";
    }

    public void getTitleList()
    {
        List l = new ArrayList<>();
        Element e = parser.doc.getDocumentElement();
        Printer.pl(e);
    }


}

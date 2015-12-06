import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import uk.co.rodderscode.utils.Printer;

import java.util.ArrayList;
import java.util.List;

public class Formatter {

    XMLReader parser;

    public String format(XMLReader parser)
    {
        this.parser = parser;
        //getTitleList();
        getCategories();
        return "";
    }

    public String getTitleList()
    {
        String e = parser.doc.getDocumentElement().getTagName();
        return e;
    }

    public void getCategories(){
        NodeList list = parser.getListByTagName("cv");
        for (int i = 0; i < list.getLength(); i++) {
            Node nNode = list.item(i);
            Printer.pl(nNode.getChildNodes());
        }
    }


}

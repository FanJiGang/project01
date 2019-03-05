import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XpathDemo {
    public static void main(String[] args) {
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(XpathDemo.class.getClassLoader().getResourceAsStream("hello.xml"));
            Element root = doc.getRootElement();
            Node node = root.selectSingleNode("//name");
            System.out.println(node.getText());
            List<Element> names = root.selectNodes("//name");
            for (Element n : names) {
                System.out.println("name = " + n.getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}

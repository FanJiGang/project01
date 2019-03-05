import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ReadDemo {
    public static void main(String[] args) {
        SAXReader reader=new SAXReader();
        InputStream in=null;
        try {
            in = ReadDemo.class.getClassLoader().getResourceAsStream("hello.xml");
            Document doc = reader.read(in);
            Element root = doc.getRootElement();
            List<Element> list = root.elements("stu");
            for (Element e : list) {
                String id = e.elementTextTrim("id");
                String name = e.elementTextTrim("name");
                String nick = e.element("name").attribute("nick").getValue();
                String age = e.elementTextTrim("age");
                String des = e.elementTextTrim("des");
                System.out.println("id = " + id + ",name = "+ name + ",nick = " + nick + ",age = "+age);
                System.out.println("des = " + des);
                System.out.println("------------------------");
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

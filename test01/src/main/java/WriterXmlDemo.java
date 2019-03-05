import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class WriterXmlDemo {
    public static void main(String[] args) {
        Document doc = DocumentHelper.createDocument();
        Element root = doc.addElement("root");
        Element list = root.addElement("list");
        Element properties = list.addElement("properties");
        Element property = properties.addElement("property");
        Element text = property.addText("我是文本内容");
        Element attr = property.addAttribute("class", "prop");
        FileOutputStream fos=null;
        XMLWriter xmlWriter =null;
        try {
            fos=new FileOutputStream("my.xml");
            xmlWriter=new XMLWriter(fos, OutputFormat.createPrettyPrint());
            xmlWriter.write(doc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (xmlWriter != null) {
                try {
                    xmlWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

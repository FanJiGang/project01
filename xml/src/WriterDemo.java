import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class WriterDemo {
    public static void main(String[] args) {
        Document document = DocumentHelper.createDocument();
        Element emps = document.addElement("emps");
        Element emp = emps.addElement("emp");
        emp.addElement("name").addAttribute("id", "1").addText("汤尼");
        emp.addElement("age").addText("25");
        XMLWriter xmlWriter=null;
        try {
            xmlWriter = new XMLWriter(new FileOutputStream("xml/resources/emp.xml"), OutputFormat.createPrettyPrint());
            xmlWriter.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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

package base;

import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;

public class ImplForSaxParser {

    //sax parsers
    static SAXParserFactory saxParserFactory = null;
    static SAXParser saxParser = null;

    //file features
    static String pathForWrite = "some_file.txt";
    static FileWriter fileWriter = null;
    static BufferedWriter bufferedWriter = null;

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, URISyntaxException {

        //initialising parser
        saxParserFactory = SAXParserFactory.newInstance();
        saxParser = saxParserFactory.newSAXParser();

        //initialising file, we will write
        fileWriter = new FileWriter(pathForWrite);
        bufferedWriter = new BufferedWriter(fileWriter);

        //implementing parser
        DefaultHandler defaultHandler = new DefaultHandler(){
            @Override
            public void startDocument() throws jdk.internal.org.xml.sax.SAXException {
                super.startDocument();
            }

            @Override
            public void endDocument() throws jdk.internal.org.xml.sax.SAXException {
                super.endDocument();
            }

            @Override
            public void startElement(String s, String s1, String s2, Attributes attributes) throws jdk.internal.org.xml.sax.SAXException {
                super.startElement(s, s1, s2, attributes);
            }

            @Override
            public void endElement(String s, String s1, String s2) throws jdk.internal.org.xml.sax.SAXException {
                super.endElement(s, s1, s2);
            }

            @Override
            public void characters(char[] chars, int i, int i1) throws jdk.internal.org.xml.sax.SAXException {
                super.characters(chars, i, i1);
            }
        };



        saxParser.parse("C:\\Users\\cavid\\Downloads\\spring-rabbitmq-messaging-microservices-master\\some_file.xml", defaultHandler);

    }

}

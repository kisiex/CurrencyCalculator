package pl.parser.nbp.parser;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import pl.parser.nbp.utils.MessageStrings;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class DocumentParser implements Parser<InputStream, Document> {

    @Override
    public Document parse(InputStream inputStream) {
        DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        Document doc = null;
        try {
            doc =  factory.newDocumentBuilder().parse(inputStream);
            inputStream.close();
        } catch (SAXException | IOException | ParserConfigurationException e) {
            throw new RuntimeException(MessageStrings.PARSING_ERR_MSG + e.getMessage());
        }

        return doc;
    }
}

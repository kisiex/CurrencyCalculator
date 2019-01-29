package pl.parser.nbp.parser;

import org.w3c.dom.Document;
import pl.parser.nbp.model.Table;

public class TableParser implements Parser<Document, Table> {

    @Override
    public Table parse(Document document) {
        document.getDoctype();
        return null;
    }
}

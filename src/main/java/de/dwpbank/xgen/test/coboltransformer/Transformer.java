package de.dwpbank.xgen.test.coboltransformer;

import de.dwpbank.xgen.test.coboltransformer.datadef.MsgDef;
import de.dwpbank.xgen.test.coboltransformer.datadef.ResultSet;
import de.dwpbank.xgen.test.coboltransformer.interfaces.TransformerInterface;
import de.dwpbank.xgen.test.coboltransformer.utils.CobolParser;
import java.awt.print.Book;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Transformer implements TransformerInterface {

    @Override
    public void transform(File xmlDescriptionFile, File fileToTransform, boolean storeTransformed) throws JAXBException {
        try {
            // marshall the descriptor
            JAXBContext jaxbContext = JAXBContext.newInstance(MsgDef.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            MsgDef cobolFormat = (MsgDef) jaxbUnmarshaller.unmarshal(xmlDescriptionFile);
            System.out.println("Fields.field.size:" + cobolFormat.getFields().getField().size());
            CobolParser parser = new CobolParser(fileToTransform, cobolFormat);
            parser.getFormattedOutput();
            MsgDef result = parser.getResult();
            persistResults(result);
            System.out.println("File Created");
        } catch (IOException ex) {
            Logger.getLogger(Transformer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void persistResults(MsgDef result) throws JAXBException{
         JAXBContext context = JAXBContext.newInstance(MsgDef.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(result, new File("/home/gergo/NetBeansProjects/XmlValidator/tst/cobol.audit.xml"));
    }
    
    @Override
    public void transform(File xmlDescriptionFile, File fileToTransform) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

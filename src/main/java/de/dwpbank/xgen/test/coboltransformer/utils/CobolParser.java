/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dwpbank.xgen.test.coboltransformer.utils;

import de.dwpbank.xgen.test.coboltransformer.datadef.Field;
import de.dwpbank.xgen.test.coboltransformer.datadef.Group;
import de.dwpbank.xgen.test.coboltransformer.datadef.MsgDef;
import de.dwpbank.xgen.test.coboltransformer.datadef.ResultField;
import de.dwpbank.xgen.test.coboltransformer.datadef.ResultGroup;
import de.dwpbank.xgen.test.coboltransformer.datadef.ResultSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This Class parses a cobol formatted file 
 * into beans 
 * @author gergo
 */
public class CobolParser {

    private static final Logger log = LogManager.getLogger(CobolParser.class);
    private File cobolFormattedFile;
    private MsgDef formatDefinition;
    private String stringOfFileBytes;
    private MsgDef result;
    
    public CobolParser(File cblFmt, MsgDef defs){
        this.cobolFormattedFile = cblFmt;
        this.formatDefinition = defs;
        result = defs;
    }
    
    public void getFormattedOutput() throws IOException{
        int oldOffsetInFile = 0;
        int newOffsetInFile = 0;
        try {
            byte[] bytesOfFile = Files.readAllBytes(Paths.get(cobolFormattedFile.getCanonicalPath()));
            setStringOfFileBytes(new String(bytesOfFile)); 
            //file is open parse the Fields of the Fields element first
            for (Field formatDefinitionField : formatDefinition.getFields().getField()){
                log.debug("oldOffset: " + oldOffsetInFile);
                Integer newoffset = Integer.parseInt(formatDefinitionField.getSizedLength());
                log.debug("offset: " + newoffset);
                newOffsetInFile += newoffset;
                log.debug("newOffset:" + newOffsetInFile);
                formatDefinitionField.setValue(getFieldFromString(oldOffsetInFile, newOffsetInFile));
                oldOffsetInFile=newOffsetInFile;
            }
            // we have the header Fields
            getOtherFields(formatDefinition.getFields().getGroup().getFieldOrGroup(), oldOffsetInFile, newOffsetInFile);
            
        } catch (FileNotFoundException ex) {
            log.error("Error while opening: " + cobolFormattedFile.getName(), ex);
        }  
    }
    
    private void getOtherFields(List<Object> fieldOrgroupList, int oldOffset, int newOffset){
        int oldOffsetInFile = oldOffset;
        int newOffsetInFile = newOffset;
        for (Object formatDefinitionObject : fieldOrgroupList){
            log.debug("oldOffset: " + oldOffsetInFile);
            if(formatDefinitionObject instanceof Field){
                Integer newoff = Integer.parseInt(((Field) formatDefinitionObject).getSizedLength());
                log.debug("offset: " + newoff);
                newOffsetInFile += newoff;
                log.debug("newOffset: " + newOffsetInFile);
                ((Field)formatDefinitionObject).setValue(getFieldFromString(oldOffsetInFile, newOffsetInFile));
                oldOffsetInFile=newOffsetInFile;
            }
            else if (formatDefinitionObject instanceof Group){
                String fieldName = ((Group) formatDefinitionObject).getName();
                log.debug("Got Group with name: " + fieldName);
                getOtherFields(((Group) formatDefinitionObject).getFieldOrGroup(), oldOffset, newOffset);
            }
        }
    }
    
    private String getFieldFromString(int begin, int end){
        return (getStringOfFileBytes().substring(begin, end));
    }
        

    /**
     * @return the stringOfFileBytes
     */
    public String getStringOfFileBytes() {
        return stringOfFileBytes;
    }

    /**
     * @param stringOfFileBytes the stringOfFileBytes to set
     */
    public void setStringOfFileBytes(String stringOfFileBytes) {
        this.stringOfFileBytes = stringOfFileBytes;
    }
    
    /**
     * @return the result
     */
    public MsgDef getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(MsgDef result) {
        this.result = result;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dwpbank.xgen.test.coboltransformer.interfaces;

import java.io.File;
import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;

/**
 *
 * @author gergo
 */
public interface TransformerInterface {
    /**
     * Transform the cobol structured file into xml based by the description
     * and store the file if needed
     * @param xmlDescriptionFile The description of the cobol structure
     * @param fileToTransform The file to be transformed into XML
     * @param storeTransformed Flag indicating to store the 
     *                         transformed struckture to file or not
     */
    public void transform(File xmlDescriptionFile, File fileToTransform, boolean storeTransformed) throws JAXBException, PropertyException; 
    
   /**
     * Transform the cobol structured file into xml based by the description 
     * and do not store the file 
     * @param xmlDescriptionFile The description of the cobol structure
     * @param fileToTransform The file to be transformed into XML
     * @param storeTransformed Flag indicating to store the transformed struckture to file or not
     */    
    public void transform(File xmlDescriptionFile, File fileToTransform);
}

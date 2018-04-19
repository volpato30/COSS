package com.compomics.coss.Model;


import com.compomics.ms2io.IndexKey;
import java.io.File;
import com.compomics.ms2io.SpectraReader;
import java.util.Iterator;
import uk.ac.ebi.pride.tools.jmzreader.model.*;
import java.util.List;
/**
 *this class holds the configuration data for spectral comparison
 * @author Genet
 */
public class ConfigData {
    
    //User input experimental and library spectra file
    private final File experimentalSpecFile;
    private final File specLibraryFile;
    
    private List<IndexKey> expIndex;
    private List<IndexKey> libIndex;
    private SpectraReader rdExperimental;
    private SpectraReader rdLibrary;
    private Iterator<Spectrum> ebiSpectrumIterator;
    
    //Decoy database index and reader
    
    private List<IndexKey> decoyDBIndex;
    private SpectraReader rdDecoyDB;
    
   //User input Search Settings
    private int ScoringFun;//index
    private double precTol;
    private double fragTol;
    private int MSRobinOption;
    private int intensityOption; 
    private int maxPrecursorCharge;
    
    
   /**
    * constructor
    */
    public ConfigData(File expFile, File libFile){
        this.experimentalSpecFile=expFile;
        this.specLibraryFile=libFile;
              
    }

    
    /**
     * return experimental spectra
     * @return 
     */
    public List<IndexKey> getExpSpectraIndex() {
        return this.expIndex;
    }

    public SpectraReader getExpSpecReader(){
        return this.rdExperimental;
    }
    
    public void setExpSpecReader(SpectraReader rd){
        this.rdExperimental=rd;
    }
    
    public void setLibSpecReader(SpectraReader rd){
        this.rdLibrary=rd;
    }
   
    public SpectraReader getLibSpecReader(){
        return this.rdLibrary;
    }
    
   public List<IndexKey>  getSpectraLibraryIndex(){
       return this.libIndex;
   }
   
   public void setSpectralLibraryIndex(List<IndexKey>  indx){
       this.libIndex=indx;
   }

    /**
     * set experimental spectra index
     * @param indx 
     */
    public void setExpSpectraIndex(List<IndexKey>  indx) {
        this.expIndex = indx;
    }


    /**
     * set spectra library
     * @return 
     */
     public int getMaxPrecursorCharg() {
        return this.maxPrecursorCharge;
    }
    
     
     /**
      * set maximum precursor charge
      * @param maxPrecCharge the value to be set to max precursor charge
      */
    public void setMaxPrecursorCharg(int maxPrecCharge) {
        this.maxPrecursorCharge=maxPrecCharge;
    }
    
     public int getScoringFunction() {
        return this.ScoringFun;
    }
    
    public void setScoringFunction(int matchAlgorithm) {
        this.ScoringFun=matchAlgorithm;
    }
       
    public File getExperimentalSpecFile() {
        return this.experimentalSpecFile;
    }

    public File getSpecLibraryFile() {
        return this.specLibraryFile;
    }

    public int getIntensityOption() {
        return this.intensityOption;
    }

    public void setIntensityOption(int sp) {
        this.intensityOption = sp;
    }

    public int getMsRobinOption() {
        return this.MSRobinOption;
    }

    public void setMsRobinOption(int sp) {
        this.MSRobinOption = sp;
    }

    public void setPrecTol(double prcTol) {
        this.precTol = prcTol;
    }

    public double getPrecTol() {
        return this.precTol;
    }

    public void setfragTol(double frTol) {
        this.fragTol = frTol;
    }

    public double getfragTol() {
        return this.fragTol;
    }
    
     public void setEbiSpecIterator(Iterator itrl) {
        this.ebiSpectrumIterator = itrl;
    }

    public Iterator<Spectrum> getEbiSpecIterator() {
        return this.ebiSpectrumIterator;
    }

    public void setDecoyDBIndexList( List<IndexKey>  indx) {
        this.decoyDBIndex=indx;
    }

    public  List<IndexKey> getDecoyDBIndexList() {
        return this.decoyDBIndex;
    }
    
    public void setDecoyDBReader( SpectraReader  rd) {
        this.rdDecoyDB=rd;
    }

    public  SpectraReader getDecoyDBReader() {
        return this.rdDecoyDB;
    }
}

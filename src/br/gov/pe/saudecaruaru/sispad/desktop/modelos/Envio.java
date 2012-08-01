/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.modelos;

import java.io.*;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/**
 *
 * @author Junior Pires
 */
public class Envio {
    private String sistema;
    private File arquivo;
    private Competencia competencia;
    private MenssagensWebService mensagensWeb;

    public Envio(MenssagensWebService mensagensWeb) {
        this.competencia = new Competencia();
        this.mensagensWeb = mensagensWeb;
    }

    /**
     * @return the sistema
     */
    public String getMesCompetencia(){
        return getCompetencia().getMes();
    }
    
    public void setmesCompetencia(String mes){
        getCompetencia().setMes(mes);
    }
    
    public String getAnoCompetencia(){
        return getCompetencia().getAno();
    }
    
    public void setAnoCompetencia(String ano){
        getCompetencia().setAno(ano);
    }
    
    public String getSistema() {
        return sistema;
    }

    /**
     * @param sistema the sistema to set
     */
    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    /**
     * @return the arquivo
     */
    public File getArquivo() {
        return arquivo;
    }

    /**
     * @param arquivo the arquivo to set
     */
    public void setArquivo(File arquivo) {
       this.arquivo = arquivo;
    }
    
     public Competencia getCompetencia() {
        return competencia;
     }

    /**
     * @return the competencia
     */
   
    public boolean extrairArquivo(){
         
            if(this.validaArquivoZip()){
            try {
                File directory = new File(Configuracao.pathDirectory);
                this.extrairArquivo(directory);
            } catch (ZipException ex) {
                Logger.getLogger(Envio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Envio.class.getName()).log(Level.SEVERE, null, ex);
            }
              }else
                  return false;

            
          return true;

    }
    
    public void extrairArquivo(File diretorio ) throws ZipException, IOException {
    ZipFile zip = null;
    File arquivo = null;
    InputStream is = null;
    OutputStream os = null;
    byte[] buffer = new byte[1024];
    try {
      //cria diretório informado, caso não exista
      if( !diretorio.exists() ) {
        diretorio.mkdirs();
      }
      if( !diretorio.exists() || !diretorio.isDirectory() ) {
        throw new IOException("Informe um diretório válido");
      }
      zip = new ZipFile( this.arquivo );
      Enumeration e = zip.entries();
      while( e.hasMoreElements() ) {
        ZipEntry entrada = (ZipEntry) e.nextElement();
        arquivo = new File( diretorio, entrada.getName() );
        //se for diretório inexistente, cria a estrutura
        //e pula pra próxima entrada
        if( entrada.isDirectory() && !arquivo.exists() ) {
          arquivo.mkdirs();
          continue;
        }
        //se a estrutura de diretórios não existe, cria
        if( !arquivo.getParentFile().exists() ) {
          arquivo.getParentFile().mkdirs();
        }
        try {
          //lê o arquivo do zip e grava em disco
          is = zip.getInputStream( entrada );
          os = new FileOutputStream( arquivo );
          int bytesLidos = 0;
          if( is == null ) {
            throw new ZipException("Erro ao ler a entrada do zip: "+entrada.getName());
          }
          while( (bytesLidos = is.read( buffer )) > 0 ) {
            os.write( buffer, 0, bytesLidos );
          }
        } finally {
          if( is != null ) {
            try {
              is.close();
            } catch( Exception ex ) {}
          }
          if( os != null ) {
            try {
              os.close();
            } catch( Exception ex ) {}
          }
        }
      }
    } finally {
      if( zip != null ) {
        try {
          zip.close();
        } catch( Exception e ) {}
      }
    }
  }
    
    public boolean validaArquivoZip(){
        String extension = this.arquivo.getName().substring(arquivo.getName().lastIndexOf("."));
        if(extension.equals(".ZIP") || extension.equals(".zip")){
             return true;
        }
        return false;
    }

    /**
     * @param mensagensWeb the mensagensWeb to set
     */
    

    /**
     * @return the mensagensWeb
     */
    public MenssagensWebService getMensagensWeb() {
        return mensagensWeb;
    }

    /**
     * @return the competencia
     */
   
}

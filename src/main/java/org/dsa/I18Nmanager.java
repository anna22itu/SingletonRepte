package org.dsa;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;

public class I18Nmanager {

    private static I18Nmanager instance; // referencia privada estatica a la única instancia
    //data
    private HashMap<String, ResourceBundle> traducciones;
    final static Logger logger = Logger.getLogger(I18Nmanager.class);


    /**
     * Constructor private
     */
    private I18Nmanager(){
        this.traducciones = new HashMap<String,ResourceBundle>();
    }

    /**
     * Mètode públic i estatic --> punt d'accés global --> únic métode que em genera una instancia
     */
    public static I18Nmanager getInstance(){
        if (instance == null) instance = new I18Nmanager();
        return instance;
    }


    // mètodes No estàtics
    // language = filename 'ca'  & line = key 'l1'
    public String getText(String language, String line){

        ResourceBundle rb = this.traducciones.get(language);
        if (rb == null){
            logger.warn("Error: no està afegit el fitxer a 'traducciones'");

            rb = ResourceBundle.getBundle(language);
            traducciones.put(language,rb);
        }
        else{
            logger.info("Good: el fitxer està afegit a 'traducciones'");
        }
        logger.info("El resultado es: " + rb.getString(line));
        return rb.getString(line);
    }

    public void clear() {
        instance.clear();
    }

}

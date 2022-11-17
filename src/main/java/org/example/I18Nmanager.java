package org.example;

import java.util.HashMap;
import java.util.ResourceBundle;

public class I18Nmanager {

    private static I18Nmanager instance; // referencia privada estatica a la única instancia
    //data
    private HashMap<String, ResourceBundle> traducciones;


    /**
     * Constructor private
     */
    private I18Nmanager(){
        this.traducciones = new HashMap<>();
    }

    /**
     * Mètode públic i estatic --> punt d'accés global --> únic métode que em genera una instancia
     */
    public static I18Nmanager getInstance(){
        if (instance == null) instance = new I18Nmanager();
        return instance;
    }

    // mètodes No estàtics
    public String getTxt(String language, String filename){

        ResourceBundle rs = this.traducciones.get(filename);
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author kuroc
 */
public class MyPropertyBean implements Serializable {
    
    public static final String SCORE_PROPERTY = "soccerscore";
    
    private String soccerscore ;
    
    private PropertyChangeSupport propertySupport;
    
    public MyPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSoccerscore() {
        return soccerscore;
    }
    
    public void setSoccerscore(String value) {
        String oldValue = soccerscore;
        soccerscore = value;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldValue, soccerscore);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}

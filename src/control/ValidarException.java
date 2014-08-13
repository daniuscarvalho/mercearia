/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import javax.swing.JOptionPane;


/**
 *
 * @author felipe
 */
public class ValidarException extends Exception{
    
    
    public  ValidarException(String msg){
        JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

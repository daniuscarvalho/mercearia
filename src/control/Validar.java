package control;

import javax.swing.JOptionPane;

public class Validar {

    public void validarString(String texto){
        
        if (texto.equals(null)){
            JOptionPane.showMessageDialog(null, "nulo");
            
        }
        
        
    }
    public void validarNumeros(String numero) throws Exception{
{                
          for (int i = 0; i < numero.length(); i++) {  
              if (!Character.isDigit(numero.charAt(i)))   
                throw new Exception("Só é aceito valores numericos.");
                }  
          }    
    }    
    public void exibeMsg(String msg){
         JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
        
    }   
         /* if(numero.matches("[A-Z a-z Çç]{"+numero.length()+"}")== true){
              throw ValidarException;
               JOptionPane.showMessageDialog(null, "digitou string onde so aceita numeros. ");
          }
          */
    
}

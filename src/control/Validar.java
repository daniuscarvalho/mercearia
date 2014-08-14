package control;

import javax.swing.JOptionPane;

public class Validar {
    
    public void ValidarObrigatorios(String texto,String tipo)throws Exception{
        this.validarNull(texto);
    }
    public void Validar(String texto,String tipo)throws Exception{
        this.validarNull(texto);
    }

    private void validarNull(String texto) throws Exception{
        
        if ((texto.isEmpty()) || (texto.equals(null) || (texto==""))){
                throw new Exception("Preencha os campos obrigatorios.");
            //JOptionPane.showMessageDialog(null, "nulo");
        }
        
        
    }
    private void validarNumeros(String numero) throws Exception{
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_meia;
import ventanas.Ventana_login;
import ventanas.Ventana_crearUsuario;
/**
 *
 * @author megan
 */
public class Proyecto1_MEIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana_login menu = new Ventana_login();
        menu.setVisible(false);
        
        Ventana_crearUsuario crear_usuario = new Ventana_crearUsuario();
        crear_usuario.setVisible(true);
        
    }
    
}

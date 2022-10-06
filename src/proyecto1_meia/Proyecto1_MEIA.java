/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_meia;
import clases.sort_log;
import java.io.IOException;
import ventanas.Ventana_login;
/**
 *
 * @author megan
 */
public class Proyecto1_MEIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Ventana_login menu = new Ventana_login();
        menu.setVisible(true);
        sort_log.reorganizar();
    }
    
}

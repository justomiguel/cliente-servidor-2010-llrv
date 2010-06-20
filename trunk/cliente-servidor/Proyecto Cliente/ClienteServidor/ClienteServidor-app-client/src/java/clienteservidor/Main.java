/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clienteservidor;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import servers.ServerLocator;
import sessionbeans.LocalidadesFacade;
import sessionbeans.LocalidadesFacadeRemote;

/**
 *
 * @author justomiguel
 */
public class Main {

    static ServerLocator sl;
    static LocalidadesFacadeRemote lm;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sl = new ServerLocator();
        try {
            System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
            lm = sl.getLocalidadesFacadeRemote();
            System.out.println(lm.findAll());
        } catch (NamingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

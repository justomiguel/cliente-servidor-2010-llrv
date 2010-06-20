/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface FTPRemote {

    public boolean downloadFileByFTP(String server, String user, String pass, String localPath, String remotePath);

    public boolean uploadFileByFTP(String server, String user, String pass, String localPath, String remotePath);
    
}

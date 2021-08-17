/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg2_tp;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Admin extends User implements Serializable {
    
    public Admin(String username, String password, String email) {
        super(username, password, email);
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
}

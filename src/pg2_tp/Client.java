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
public class Client extends User implements Serializable {
    
    private static int codeCli = 0;
    private String usernameCli;
    private String pswdCli;
    
    /**
     * Construtor do ator cliente
     * @param username
     * @param password
     * @param email emil do cliente, formatado
     * @param nome nome completo do cliente, formatado ou não
     * @param matricula matrícula do carro do cliente (formatada ou não)
     */
    public Client (String username, String password, String email) {
        super(username, password, email);
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg2_tp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public abstract class User implements Serializable {
    String username;
    String password;
    String email;
    //int userType; // 1-utilizador, 2-admninistrador
    ArrayList<Vehicle> vehicles;
    int code;
    static int nUsers = 0;

    /**
     * Construtor do utilizador do sistema
     * @param username nome completo do cliente, formatado ou não
     * @param matricula matrícula do carro do cliente (formatada ou não)
     */
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        //this.userType = userType;
        this.vehicles = new ArrayList<Vehicle>();
        this.code= ++nUsers;
    }
    
    /*public void inserirAtivo(Vehicle ativo) {
        boolean enc = false;
        for(int i=0; i<ativos.size(); i++){
            if(ativos.get(i).getCodigo()==ativo.getCodigo()){
                enc=true;
            }
        }
        if(!enc) {
            this.ativos.add(ativo);
            System.out.println("Ativo adicionado.");
        }
    }
    
    public void removerAtivo(Vehicle ativo) {
        boolean enc = false;
        for(int i=0; i<ativos.size(); i++) {
            if(ativos.get(i).getCodigo() == ativo.getCodigo()) {
                enc = true;
            }
        }
        if(enc) {
            this.ativos.remove(ativo);
            System.out.println("Ativo removido.");
        }
    }
    
    public void editarAtivo(Vehicle ativo) {
        boolean enc = false;
        for(int i=0; i<ativos.size(); i++) {
            if(ativos.get(i).getCodigo() == ativo.getCodigo()) {
                enc = true;
            }
        }
        
        //EDITAR
        //
        //
        
    }
    
    public Vehicle pesquisarAtivo(int cod) {
        for(int i=0; i<ativos.size(); i++){
            if(ativos.get(i).getCodigo() == cod) {
                return ativos.get(i);
            }
        }
        System.out.println("Ativo não encontrado.");
        return null;
    }
    
    public void listarAtivos() {
        System.out.println("Encontrados " + ativos.size() + "ativos.");
        for(int i=0; i<ativos.size(); i++){
            System.out.println("Ativo nº: " + ativos.get(i).getDesc());
            System.out.println("Descricao: " + ativos.get(i).getDesc());
            System.out.println("Utilizador: " + ativos.get(i).getUtilizador());
            System.out.println("Date de inicio: " + ativos.get(i).getDataInicio());
            System.out.println("Imposto: " + ativos.get(i).getImpostoPerc());
            System.out.println("Lucro: " + ativos.get(i).getLucro());
            System.out.println("");
            System.out.println("");
        }
    }*/
    
    public void pagarJuro() {
        
    }
    
    public void salvarFicheiro(User utilizador1) {
        //falta
    }
    
}

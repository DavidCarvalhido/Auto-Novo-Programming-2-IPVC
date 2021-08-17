/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg2_tp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author David
 */
public class Sale implements Serializable {
    
    private Stand stand;
    private double valor;
    private int numeroConta;
    private List<String> titulares;
    private float juro;

    public Sale(Stand banco, double valor, int numeroConta, List<String> titulares, float juro, String desc, User utilizador, Date dataInicio, float impostoPerc, double lucro) {
        //super(desc, utilizador, dataInicio, impostoPerc, lucro);
        //this.banco = banco;
        this.valor = valor;
        this.numeroConta = numeroConta;
        this.titulares = titulares;
        this.juro = juro;
    }

    /*public Stand getBanco() {
        return banco;
    }*/

    public void setBanco(Stand banco) {
        //this.banco = banco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public List<String> getTitulares() {
        return titulares;
    }

    public void setTitulares(List<String> titulares) {
        this.titulares = titulares;
    }

    public float getJuro() {
        return juro;
    }

    public void setJuro(float juro) {
        this.juro = juro;
    }
    
    
    
}

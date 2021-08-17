/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg2_tp;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author David
 */
public class Reserve implements Serializable {
    
    private String designacao;
    private String morada;
    double valorImovel, valorRenda, valorMensal, valorAnual;

    public Reserve(String designacao, String morada, double valorImovel, double valorRenda, double valorMensal, double valorAnual, String desc, User utilizador, Date dataInicio, float impostoPerc, double lucro) {
        //super(desc, utilizador, dataInicio, impostoPerc, lucro);
        this.designacao = designacao;
        this.morada = morada;
        this.valorImovel = valorImovel;
        this.valorRenda = valorRenda;
        this.valorMensal = valorMensal;
        this.valorAnual = valorAnual;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public double getValorRenda() {
        return valorRenda;
    }

    public void setValorRenda(double valorRenda) {
        this.valorRenda = valorRenda;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public double getValorAnual() {
        return valorAnual;
    }

    public void setValorAnual(double valorAnual) {
        this.valorAnual = valorAnual;
    }
    
    
    
}

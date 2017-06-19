/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class Compra {
    private static int CONTADOR_ID;
    protected int idNotaFiscal;
    protected String nomeDaLoja;
    protected double valorTotal;
    
    public Compra(String nomeDaLoja){
        this.nomeDaLoja = nomeDaLoja;
        this.idNotaFiscal = ++CONTADOR_ID;
    }
    
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }
    
    public double getValorTotal(){
        return this.valorTotal;
    }
    
    public String getInfoNota(){
        return "Nota Fiscal ºn: " + this.idNotaFiscal + "\n"
                + "Loja: " + this.nomeDaLoja + "\n"
                + "Valor Total: R$ " + this.valorTotal;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.PagamentoCommand;

/**
 *
 * @author Aluno
 */
public class Loja {
    protected String nomeDaLoja;
    
    public Loja(String nomeDaLoja){
        this.nomeDaLoja = nomeDaLoja;
    }
    
    public void executarCompra(double valor, PagamentoCommand formaDePagamento){
        Compra compra = new Compra(this.nomeDaLoja);
        compra.setValorTotal(valor);
        formaDePagamento.processarCompra(compra);
    }
}

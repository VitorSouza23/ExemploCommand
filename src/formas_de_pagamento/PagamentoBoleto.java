/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas_de_pagamento;

import interfaces.PagamentoCommand;
import model.Compra;

/**
 *
 * @author Aluno
 */
public class PagamentoBoleto implements PagamentoCommand{

    @Override
    public void processarCompra(Compra compra) {
        System.out.println("Boleto Criado:\n" + compra.getInfoNota() + "\n");
    }
    
}

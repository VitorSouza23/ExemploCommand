/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import formas_de_pagamento.PagamentoBoleto;
import formas_de_pagamento.PagamentoCartaoDeCredito;
import formas_de_pagamento.PagamentoCartaoDebito;
import model.Loja;

/**
 *
 * @author Aluno
 */
public class ExemploCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loja lojasTabajara = new Loja("Organizações Tabajara");
        lojasTabajara.executarCompra(850.00, new PagamentoBoleto());
        lojasTabajara.executarCompra(25.60, new PagamentoCartaoDeCredito());
        lojasTabajara.executarCompra(45.25, new PagamentoCartaoDebito());
        
        Loja lojaTiaJoana = new Loja("Loja Tia Joana");
        lojaTiaJoana.executarCompra(74.21, new PagamentoCartaoDeCredito());
        lojaTiaJoana.executarCompra(32.52, new PagamentoBoleto());
        lojaTiaJoana.executarCompra(37.98, new PagamentoBoleto());
    }
    
}

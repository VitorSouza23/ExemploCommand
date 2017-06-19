/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import model.Compra;

/**
 *
 * @author Aluno
 */
public interface PagamentoCommand {
    public void processarCompra(Compra compra);
}

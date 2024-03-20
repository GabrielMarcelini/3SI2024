/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContasPagas;

/**
 *
 * @author Gabriel
 */
public class Programa {
   public static void main(String[] args) {
       Produto produto1 = new Produto("Produto 1", 100.0);
       Produto produto2 = new Produto("Produto 2", 200.0);
       Cliente cliente1 = new Cliente("Cliente 1", "123.456.789-00");
       Cliente cliente2 = new Cliente("Cliente 2", "987.654.321-00");
       Conta conta1 = new Conta(1, "01/01/2023", "05/01/2023", produto1, cliente1);
       Conta conta2 = new Conta(2, "10/01/2023", "15/01/2023", produto2, cliente2);

       conta1.visualizarConta();
       conta2.visualizarConta();
   }
}

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
public class Cliente {
   private String nomeCliente;
   private String cpf;

   public Cliente(String nomeCliente, String cpf) {
       this.nomeCliente = nomeCliente;
       this.cpf = cpf;
   }

   public String getNomeCliente() {
       return nomeCliente;
   }

   public void setNomeCliente(String nomeCliente) {
       this.nomeCliente = nomeCliente;
   }

   public String getCpf() {
       return cpf;
   }

   public void setCpf(String cpf) {
       this.cpf = cpf;
   }
}


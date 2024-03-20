/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel
 */
public class TestaContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        c.atualizaConta(0.10);
        cc.atualizaConta(0.10);
        cp.atualizaConta(0.10);

        System.out.println("Saldo da Conta: " + c.getSaldo());
        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo da Conta Poupanca: " + cp.getSaldo());
    }
}

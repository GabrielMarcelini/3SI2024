/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel
 */
public class AtualizadorDeContas {
        private double saldoTotal = 0;
    private double selic;
    AtualizadorDeContas(double selic) {
    this.selic = selic;
}
    void roda(Conta c) {
        
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualizaConta(this.selic);
        System.out.println("Novo saldo: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();

}

    public double getSaldoTotal() {
        return saldoTotal;
    }

}


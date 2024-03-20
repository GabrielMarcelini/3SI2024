/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel
 */
public class ContaCorrente extends Conta {
    @Override
    public void atualizaConta(double taxa) {
        super.deposita(this.getSaldo() * (taxa*2));
    }
    @Override
    public void deposita(double valor) {
        super.deposita(valor-1);
}
}

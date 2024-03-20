/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel
 */
public class ContaPoupanca extends Conta {
    @Override
    public void atualizaConta(double taxa) {
    deposita(getSaldo() * (taxa*3));

    }
}    

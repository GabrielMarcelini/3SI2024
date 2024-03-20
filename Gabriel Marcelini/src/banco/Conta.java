/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Gabriel
 */
public class Conta {
    
    
    
    private int numero;
    private double saldo;
    private double limite;
    private static int TotalDeContas;
    private int identificador;
  
    
    Cliente objCliente = new Cliente();
    
    
    
    Conta(){
        System.out.println("Construindo uma conta!");
        TotalDeContas = TotalDeContas + 1;
        this.identificador = TotalDeContas;
    }
    Conta(double saldo){
        this();//chama o construtor padrão
        this.saldo = saldo;
    }
    Conta(double saldo, double limite, int numero){
        this(saldo);//executa o construtor acima
        this.limite = limite;
        this.numero = numero;
    }

    public int getIdentificador() {
        return identificador;
    }

    public static int getTotalDeContas(){
        return TotalDeContas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo + limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    public boolean saca(double quantidade) {
        if (this.getSaldo() >= quantidade){
        this.saldo = this.saldo - quantidade;
        System.out.println("Saque realizado com sucesso!");
        return true;
        }else{
            System.out.println("Saldo insuficiente: " + this.getSaldo());
            return false;
        }
    }
    public void deposita(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }
    
    public void transfere (Conta destino, double quantidade){
        if(this.saca(quantidade)){
            destino.deposita(quantidade);
        }else{
            System.out.println("Transferencia não realizada!");
        }
    }
    
    public void atualizaConta(double taxa) {
        this.saldo += this.saldo * (taxa);
    }
}

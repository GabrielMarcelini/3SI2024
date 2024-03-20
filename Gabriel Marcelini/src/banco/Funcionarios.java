/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel
 */
public class Funcionarios extends Pessoa{
    private double salario;
    private double bonificacao;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    public void setBonificacao(double boificacao) {
        this.bonificacao = boificacao;
    }
    
    
    public Funcionarios (String nome, String cpf, double salario){
        super(nome, cpf);
        this.salario = salario;
    }
    
}

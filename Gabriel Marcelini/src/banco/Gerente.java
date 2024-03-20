/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel
 */
public class Gerente extends Funcionarios {
    
    String nome;
    String cpf;
    double salario;

    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    public Gerente(String nome, String cpf, double salario){
        super (nome, cpf, salario);
    }

    public boolean autentica(int senha) {
    if (this.senha == senha) {
    System.out.println("Acesso Permitido!");
    return true;
    } else {
    System.out.println("Acesso Negado!");
    return false;
    }
    
    }
    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }
  
}


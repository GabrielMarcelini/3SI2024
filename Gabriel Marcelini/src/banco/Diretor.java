/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel
 */
public class Diretor extends Funcionarios {
    
    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    public double getBonificacao(){
        return super.getBonificacao() + 2000;
    }
}

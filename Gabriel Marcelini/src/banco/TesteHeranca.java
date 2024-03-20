/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel
 */
public class TesteHeranca {
    public static void main(String[] args) {
        Funcionarios objFuncionarios = new Funcionarios ("Pedro", "008", 100);
        Gerente objGerente = new Gerente ("Joao", "098798", 100);
        Diretor objDiretor = new Diretor("Maria", "00988712821", 100);
        
        System.out.println("Nome Funcionario:"+objFuncionarios.getNome());
        System.out.println("Nome Gerente:"+objGerente.getNome());
        System.out.println("Nome Diretor:"+objDiretor.getNome());
        
        System.out.println("Bonificacao de Funcionario:"+objFuncionarios.getBonificacao());
        System.out.println("Bonificacao de Gerente"+objGerente.getBonificacao());
        System.out.println("Bonificacao de Diretor"+objDiretor.getBonificacao());
    }
}

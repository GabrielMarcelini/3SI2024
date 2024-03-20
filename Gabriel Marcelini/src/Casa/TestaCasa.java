/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author Gabriel
 */
public class TestaCasa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", 20);
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());
        pessoa.fazAniversario();
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());
        pessoa.fazAniversario();
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());

        Porta porta = new Porta(false, "vermelha", 10, 20, 30);
        System.out.println("A porta está aberta? " + porta.isAberta());
        porta.abre();
        System.out.println("A porta está aberta? " + porta.isAberta());
        porta.pinta("azul");
        System.out.println("A cor da porta é " + porta.getCor());

        Casa casa = new Casa("branca", porta, new Porta(true, "preta", 10, 20, 30), new Porta(false, "amarela", 10, 20, 30));
        System.out.println("A casa está pintada de " + casa.getCor());
        System.out.println("Quantas portas estão abertas? " + casa.quantasPortasEstaoAbertas());
        casa.getPorta1().fecha();
        System.out.println("Quantas portas estão abertas? " + casa.quantasPortasEstaoAbertas());
    }
}

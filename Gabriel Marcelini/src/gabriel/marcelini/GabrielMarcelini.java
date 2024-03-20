/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabriel.marcelini;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class GabrielMarcelini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digite seu salário:");
        double salario = entrada.nextDouble();
        
        System.out.println("Nome:"+nome);
        System.out.println("Idade"+idade);
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Cliente {
    private String nome, endereço, dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", "Financeiro", 2000, LocalDate.of(2020, 1, 1), "123456");
        f1.mostra();
        System.out.println();

        f1.setNome("Maria");
        f1.setDepartamento("Recursos Humanos");
        f1.setSalario(2500);
        f1.setDataEntrada(LocalDate.of(2019, 1, 1));
        f1.setRG("654321");
        f1.setAtivo(false);
        f1.mostra();
        System.out.println();

        f1.bonifica(500);
        f1.mostra();
        System.out.println();

        f1.demite();
        f1.mostra();
    }
}


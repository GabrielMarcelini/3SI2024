
package banco;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private LocalDate dataEntrada;
    private String RG;
    private boolean ativo;

    public Funcionario(String nome, String departamento, double salario, LocalDate dataEntrada, String RG) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.RG = RG;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void bonifica(double aumento) {
        this.salario += aumento;
    }

    public void demite() {
        this.ativo = false;
    }

    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de Entrada: " + this.dataEntrada);
        System.out.println("RG: " + this.RG);
        System.out.println("Ativo: " + this.ativo);
    }
}



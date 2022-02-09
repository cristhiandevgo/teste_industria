/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author Ivanc
 */
public class Funcionario extends Pessoa {
    private Float salario;
    private String funcao;

    public Funcionario(int id_pessoa, String nome, String data_nascimento, Float salario, String funcao) {
        super(id_pessoa, nome, data_nascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    
}

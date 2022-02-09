/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste_industria;

import java.util.Objects;

/**
 *
 * @author Ivanc
 */

class Pessoa {
    private int id_pessoa;
    private String nome;
    private String data_nascimento;

    public Pessoa(int id_pessoa, String nome, String data_nascimento) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
}

class Funcionario extends Pessoa {
    private Float salario;
    private String funcao;
    private String situacao_funcionario;

    public Funcionario(int id_pessoa, String nome, String data_nascimento, Float salario, String funcao, String situacao_funcionario) {
        super(id_pessoa, nome, data_nascimento);
        this.salario = salario;
        this.funcao = funcao;
        this.situacao_funcionario = situacao_funcionario;
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

    public String getSituacao_funcionario() {
        return situacao_funcionario;
    }

    public void setSituacao_funcionario(String situacao_funcionario) {
        this.situacao_funcionario = situacao_funcionario;
    }
    
}

public class Principal {

    public static Funcionario[] add_funcionario(int total_elementos, Funcionario elemento_para_adicionar, Funcionario[] array_atual){
        
        int novo_indice = total_elementos + 1;
        
        Funcionario novo_array[] = new Funcionario[novo_indice];
        
        for (int i = 0; i < total_elementos; i++){
            novo_array[i] = array_atual[i];
        }
        
        novo_array[total_elementos] = elemento_para_adicionar;
        
        return novo_array;
    }
    
    public static Funcionario[] inativar_funcionario(int total_elementos, String funcionario_para_remover, Funcionario[] array_atual){    
                
        for (int i = 0; i < total_elementos; i++){
            if(new String(array_atual[i].getNome()).equals(funcionario_para_remover)){
                array_atual[i].setSituacao_funcionario("DEMITIDO");
            }
        }
        
        return array_atual;
    }
    
    public static void exibir_funcionarios(Funcionario[] funcionarios, String situacao){
        for(int i = 0; i < funcionarios.length; i++){
            
            if(new String(funcionarios[i].getSituacao_funcionario()).equals(situacao)){
                System.out.println("--------------------------------------------------------");
                System.out.println("Nome: " + funcionarios[i].getNome());
                System.out.println("Data de Nascimento: " + funcionarios[i].getData_nascimento());
                System.out.println("Salário: " + funcionarios[i].getSalario());
                System.out.println("Função: " + funcionarios[i].getFuncao());
                System.out.println("Situação: " + funcionarios[i].getSituacao_funcionario());
                System.out.println("--------------------------------------------------------");
            }
            
        }
    }
    
    public static void main(String[] args) {
        
        Funcionario funcionarios[] = {
            new Funcionario(0, "Maria", "18/10/2000", 2009.44f, "Operador", "ATIVO"),
            new Funcionario(1, "João", "12/05/1990", 2284.38f, "Operador", "ATIVO"),
            new Funcionario(2, "Caio", "02/05/1961", 9836.14f, "Coordenador", "ATIVO"),
            new Funcionario(3, "Miguel", "14/10/1988", 19119.88f, "Diretor", "ATIVO"),
            new Funcionario(4, "Alice", "05/01/1995", 2234.68f, "Recepcionista", "ATIVO"),
            new Funcionario(5, "Heitor", "19/11/1999", 1582.72f, "Operador", "ATIVO"),
            new Funcionario(6, "Arthur", "31/03/1993", 4071.84f, "Contador", "ATIVO"),
            new Funcionario(7, "Laura", "08/07/1994", 3017.45f, "Gerente", "ATIVO"),
            new Funcionario(8, "Heloísa", "24/05/2003", 1606.85f, "Eletricista", "ATIVO"),
            new Funcionario(9, "Helena", "02/09/1996", 2799.93f, "Gerente", "ATIVO")
        };
        
        funcionarios = add_funcionario(funcionarios.length, new Funcionario(funcionarios.length, "Teste", "18/10/2000", 2009.44f, "Operador", "ATIVO"), funcionarios);
        System.out.println("Total Elementos depois de ADD: " + funcionarios.length);
        
        // INATIVAR FUNCIONÁRIO JOÃO
        funcionarios = inativar_funcionario(funcionarios.length, "João", funcionarios);
        
        System.out.println("Total Elementos depois de REMOVER: " + funcionarios.length);
        
        exibir_funcionarios(funcionarios, "ATIVO");
        
    }
    
    
}

package com.example.saulo.studentlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saulo on 13/03/18.
 */

public class Student {
    private String nome;
    private String telefone;
    private String endereco;
    private String site;
    private List<Student> listaAlunos;

    public Student(){
        super();
        this.preencherLista();
    }

    public Student(String nome, String telefone, String endereco, String site){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setSite(site);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void preencherLista(){
        Student s1 = new Student("Saulo","81994179978","Rua Itaipava, 44","www.teste.com.br");
        Student s2 = new Student("Aurelio","81984773872","Rua José da Camara Vieira, 22","www.teste2.com.br");
        Student s3 = new Student("Matheus","81987645673","Rua Bom Jesus, 33","www.teste3.com.br");
        listaAlunos.add(s1);
        listaAlunos.add(s2);
        listaAlunos.add(s3);
    }

    public ArrayList<Student> getStudentList(){
        return (ArrayList<Student>) this.listaAlunos;
    }
}

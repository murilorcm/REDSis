/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.model;

import java.util.Calendar;

/**
 *
 * @author murilo
 */
public class Disciplina {
    String nome;
    String sigla;
    String pofessor;
    String semestre;
    Calendar ano;

    public Disciplina(String nome, String sigla, String pofessor, String semestre, int ano) {
        this.nome = nome;
        this.sigla = sigla;
        this.pofessor = pofessor;
        this.semestre = semestre;
        this.ano.set(Calendar.YEAR, ano);
    }

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getPofessor() {
        return pofessor;
    }

    public void setPofessor(String pofessor) {
        this.pofessor = pofessor;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano.get(Calendar.YEAR);
    }

    public void setAno(int ano) {
        this.ano.set(Calendar.YEAR, ano);
    }
}

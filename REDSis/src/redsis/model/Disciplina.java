package redsis.model;

import java.util.Calendar;

/**
 *
 * @author murilo
 */
public class Disciplina {
    private int codigo;
    private String nome;
    private String sigla;
    private String professor;
    private String semestre;
    private int ano;
    private RED red;
    
    public Disciplina(String nome, String sigla, String pofessor, String semestre, int ano) {
        this.nome = nome;
        this.sigla = sigla;
        this.professor = pofessor;
        this.semestre = semestre;
        this.ano = ano;
    }

    public Disciplina() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String pofessor) {
        this.professor = pofessor;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public RED getRed() {
        return red;
    }

    public void setRed(RED red) {
        this.red = red;
    }
}
package redsis.model;

import java.util.Calendar;

/**
 *
 * @author murilo
 */
public class Disciplina {
    private int codigo;
    String nome;
    String sigla;
    String professor;
    String semestre;
    Calendar ano;

    public Disciplina(String nome, String sigla, String pofessor, String semestre, int ano) {
        this.nome = nome;
        this.sigla = sigla;
        this.professor = pofessor;
        this.semestre = semestre;
        this.ano.set(Calendar.YEAR, ano);
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
        return ano.get(Calendar.YEAR);
    }

    public void setAno(int ano) {
        this.ano.set(Calendar.YEAR, ano);
    }
}
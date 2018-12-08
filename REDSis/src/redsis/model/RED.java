/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author murilo
 */
public class RED {
    String aluno;
    String prontuario;
    Date dataInicio;
    Date dataFim;
    ArrayList<Disciplina> disciplinas;

    public RED(String aluno, String prontuario, Date dataInicio, Date dataFim, Disciplina disciplina) {
        this.aluno = aluno;
        this.prontuario = prontuario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.disciplinas.add(disciplina);
    }

    public RED() {
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
}

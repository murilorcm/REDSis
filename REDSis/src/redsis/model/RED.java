package redsis.model;

import java.util.Date;

/**
 *
 * @author murilo
 */
public class RED {
    private int codigo;
    String nomeAluno;
    String prontuario;
    Date dataInicio;
    Date dataFim;
    Disciplina disciplina;

    public RED(String aluno, String prontuario, Date dataInicio, Date dataFim, Disciplina disciplina) {
        this.nomeAluno = aluno;
        this.prontuario = prontuario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.disciplina = disciplina;
    }

    public RED() {
    }

    public String getAluno() {
        return nomeAluno;
    }

    public void setAluno(String aluno) {
        this.nomeAluno = aluno;
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

    public Disciplina getDisciplinas() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
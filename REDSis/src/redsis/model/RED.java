package redsis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    List<Disciplina> disciplinas = new ArrayList<>();

    public RED(String aluno, String prontuario, Date dataInicio, Date dataFim, List<Disciplina> disciplinas) {
        this.nomeAluno = aluno;
        this.prontuario = prontuario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.disciplinas.addAll(disciplinas);
    }

    public RED() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
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

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas.addAll(disciplinas);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}
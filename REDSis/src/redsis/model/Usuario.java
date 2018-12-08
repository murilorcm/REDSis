package redsis.model;

/**
 *
 * @author murilo
 */
public class Usuario {
    private int codigo;
    String nome;
    String prontuário;
    String senha;

    public Usuario(int codigo, String nome, String prontuário, String senha) {
        this.nome = nome;
        this.prontuário = prontuário;
        this.senha = senha;
    }
    
    public Usuario() {
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

    public String getProntuário() {
        return prontuário;
    }

    public void setProntuário(String prontuário) {
        this.prontuário = prontuário;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
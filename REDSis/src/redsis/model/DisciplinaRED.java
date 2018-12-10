package redsis.model;

/**
 *
 * @author murilo
 */
public class DisciplinaRED {
    int codigo;
    int codigoDisciplina;
    int codigoRED;

    public DisciplinaRED(int codigo, int codigoDisciplina, int codigoRED) {
        this.codigo = codigo;
        this.codigoDisciplina = codigoDisciplina;
        this.codigoRED = codigoRED;
    }

    public DisciplinaRED() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public int getCodigoRED() {
        return codigoRED;
    }

    public void setCodigoRED(int codigoRED) {
        this.codigoRED = codigoRED;
    }    
}
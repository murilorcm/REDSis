package redsis.ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import redsis.model.Disciplina;

/**
 *
 * @author murilo
 */
public class DisciplinaTabelaModelo extends AbstractTableModel {
    private List<Disciplina> disciplinas;
    private String [] colunas = {"Disciplina", "Professor"};

    public DisciplinaTabelaModelo(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    @Override
    public int getRowCount() {
       return disciplinas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Disciplina disciplina = disciplinas.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return disciplina.getNome();
            case 1:
                return disciplina.getProfessor();
            default:
                return "dado inválido";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    public Disciplina getDisciplinaSelecionada(int rowIndex) {
        return disciplinas.get(rowIndex);
    }
}

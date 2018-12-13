package redsis.ui;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import redsis.controller.REDController;
import redsis.model.RED;

/**
 *
 * @author murilo
 */
public class REDTabelaModelo extends AbstractTableModel {
    private List<RED> listaREDs;
    private String[] colunas = {"Prontuário", "Nome", "Data início", "Data fim"};

    public REDTabelaModelo(List<RED> reds) {
        listaREDs = reds;
    }
    
    @Override
    public int getRowCount() {
        return listaREDs.size();
    }

    @Override
    public int getColumnCount() {
      return colunas.length;  
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RED red = listaREDs.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return red.getProntuario();
            case 1:
                return red.getNomeAluno();
            case 2:
                return red.getDataInicio();
            case 3:
                return red.getDataFim();
            default:
                return "Dado inválido";
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
    
    @Override 
    public void setValueAt(Object dado, int rowIndex, int columnIndex) {
        RED red = listaREDs.get(rowIndex);
        switch(columnIndex) {
            case 0:
                String prontuario = (String) dado;
                red.setProntuario(prontuario);
                break;
            case 1:
                String nomeAluno = (String) dado;
                red.setNomeAluno(nomeAluno);
                break;
            case 2:
                Date dataInicio = (Date) dado;
                red.setDataInicio(dataInicio);
                break;
            case 3:
                Date dataFim = (Date) dado;
                red.setDataFim(dataFim);
                break;
        }
        REDController redController = new REDController();
        redController.atualizar(red);
    }    
    
    @Override 
    public Class getColumnClass(int columnIndex) {
        return String.class;
    }
}

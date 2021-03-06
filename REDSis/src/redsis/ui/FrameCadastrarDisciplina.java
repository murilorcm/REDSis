/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.ui;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import redsis.controller.DisciplinaController;
import redsis.model.Disciplina;
import redsis.model.RED;

/**
 *
 * @author Andre
 */
public class FrameCadastrarDisciplina extends javax.swing.JFrame {
    private DisciplinaController disciplinaController = new DisciplinaController();
    private RED red = new RED();
    private JTable tbDisciplinas;
    /**
     * Creates new form FrameCadastroResponsavel
     */
    public FrameCadastrarDisciplina(RED red, JTable tbDisciplinas) {
        initComponents();
        this.red = red;
        this.tbDisciplinas = tbDisciplinas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSemestre = new javax.swing.ButtonGroup();
        btCancelar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbSigla = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbProfessor = new javax.swing.JLabel();
        tfSigla = new javax.swing.JFormattedTextField();
        btInserir = new javax.swing.JButton();
        lbSemestre = new javax.swing.JLabel();
        rbPrimeiroSemestre = new javax.swing.JRadioButton();
        rbSegundoSemestre = new javax.swing.JRadioButton();
        tfProfessor = new javax.swing.JFormattedTextField();
        lbAno = new javax.swing.JLabel();
        tfAno = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cadastrar Nova Disciplina");

        lbNome.setText("Nome:");

        lbSigla.setText("Sigla:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        lbProfessor.setText("Professor:");

        try {
            tfSigla.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUUU#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSiglaActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        lbSemestre.setText("Semestre:");

        grupoSemestre.add(rbPrimeiroSemestre);
        rbPrimeiroSemestre.setText("Primeiro");
        rbPrimeiroSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrimeiroSemestreActionPerformed(evt);
            }
        });

        grupoSemestre.add(rbSegundoSemestre);
        rbSegundoSemestre.setText("Segundo");

        try {
            tfProfessor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**********************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbAno.setText("Ano:");

        try {
            tfAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(btInserir)
                                        .addGap(18, 18, 18)
                                        .addComponent(btLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbAno)
                                            .addComponent(lbSemestre))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rbPrimeiroSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfAno))
                                        .addGap(18, 18, 18)
                                        .addComponent(rbSegundoSemestre))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(lbProfessor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbSigla)
                                        .addComponent(lbNome))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSigla)
                    .addComponent(tfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProfessor)
                    .addComponent(tfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSemestre)
                    .addComponent(rbPrimeiroSemestre)
                    .addComponent(rbSegundoSemestre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAno)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btCancelar)
                    .addComponent(btLimpar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void limpar() {
        tfNome.setText("");
        tfSigla.setText("");
        tfProfessor.setText("");
        rbPrimeiroSemestre.setSelected(false);
        rbSegundoSemestre.setSelected(false);
        tfAno.setText("");
        tfNome.requestFocusInWindow();
    }
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        Disciplina disciplina = new Disciplina();
        
        disciplina.setNome(tfNome.getText());
        disciplina.setSigla(tfSigla.getText());
        disciplina.setProfessor(tfProfessor.getText());
        String semestre = null;
        if (rbPrimeiroSemestre.isSelected()) {
            semestre = "primeiro";
        } else if (rbSegundoSemestre.isSelected()) {
            semestre = "segundo";
        } 
        disciplina.setSemestre(semestre);
        disciplina.setAno(Integer.parseInt(tfAno.getText()));
        
        red.adicionarDisciplina(disciplina);
        
        TableModel modeloTabela = new DisciplinaTabelaModelo(red.getDisciplinas());
        tbDisciplinas.setModel(modeloTabela);
        
        JOptionPane.showMessageDialog(this, "Disciplina inserida com sucesso!");
        this.setVisible(false);
    }//GEN-LAST:event_btInserirActionPerformed

    private void rbPrimeiroSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrimeiroSemestreActionPerformed

    }//GEN-LAST:event_rbPrimeiroSemestreActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSiglaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.ButtonGroup grupoSemestre;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbProfessor;
    private javax.swing.JLabel lbSemestre;
    private javax.swing.JLabel lbSigla;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JRadioButton rbPrimeiroSemestre;
    private javax.swing.JRadioButton rbSegundoSemestre;
    private javax.swing.JFormattedTextField tfAno;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfProfessor;
    private javax.swing.JFormattedTextField tfSigla;
    // End of variables declaration//GEN-END:variables
}

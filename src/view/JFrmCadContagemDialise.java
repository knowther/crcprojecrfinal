/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Dia;
import bean.Turno;
import java.awt.event.ItemEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author johnn
 */
public class JFrmCadContagemDialise extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFrmCadfichasala
     */
    public JFrmCadContagemDialise() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ClinicaFprojectPU").createEntityManager();
        cidadeQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cidade c");
        cidadeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(cidadeQuery.getResultList());
        diaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Dia d");
        diaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(diaQuery.getResultList());
        fichasalaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Fichasala f");
        fichasalaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(fichasalaQuery.getResultList());
        turnoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Turno t");
        turnoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(turnoQuery.getResultList());
        pacienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Paciente p");
        pacienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(pacienteQuery.getResultList());
        sessaoHasPacienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM SessaoHasPaciente s");
        sessaoHasPacienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(sessaoHasPacienteQuery.getResultList());
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDeclaracao = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBoxPaciente = new javax.swing.JComboBox<>();

        setClosable(true);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, turnoList, jComboBoxTurno);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBoxTurno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTurnoItemStateChanged(evt);
            }
        });

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, diaList, jComboBoxDia);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBoxDia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDiaItemStateChanged(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sessaoHasPacienteList, jTableDeclaracao);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${paciente}"));
        columnBinding.setColumnName("Paciente");
        columnBinding.setColumnClass(bean.Paciente.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idsessaoHasPaciente}"));
        columnBinding.setColumnName("Idsessao Has Paciente");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTableDeclaracao);

        jButton1.setText("Gerar Fichas de Sala");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxMes.setMaximumRowCount(12);
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        jComboBoxMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMesItemStateChanged(evt);
            }
        });

        jRadioButton1.setText("Todos pacientes");

        jRadioButton2.setText("Paciente específico");

        jComboBoxPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198)
                .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDiaItemStateChanged
        
         if (evt.getStateChange() == ItemEvent.SELECTED) {

           Dia d = (Dia) jComboBoxDia.getSelectedItem();
          turnoQuery = entityManager.createQuery("select t from Turno t where t.dia = :d");
           turnoQuery.setParameter("d", d);
          turnoList.clear();
            turnoList.addAll(turnoQuery.getResultList());
         }
    }//GEN-LAST:event_jComboBoxDiaItemStateChanged

    private void jComboBoxTurnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTurnoItemStateChanged
       
        if (evt.getStateChange() == ItemEvent.SELECTED) {

           Turno t = (Turno) jComboBoxTurno.getSelectedItem();
          sessaoHasPacienteQuery = entityManager.createQuery("select s from SessaoHasPaciente s INNER JOIN s.paciente where s.paciente.turno = :t");
           sessaoHasPacienteQuery.setParameter("t", t);
          sessaoHasPacienteList.clear();
            sessaoHasPacienteList.addAll(sessaoHasPacienteQuery.getResultList());
         }
        
    }//GEN-LAST:event_jComboBoxTurnoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
      String caminho = new File("./relatorios/report133.jrxml").getAbsolutePath();
         
             try {
                 JasperReport relatorio = JasperCompileManager.compileReport(caminho);
                 JRBeanCollectionDataSource dados = new JRBeanCollectionDataSource(sessaoHasPacienteList, false);
                 JasperPrint print = JasperFillManager.fillReport(relatorio, null, dados);
                 JasperViewer view = new JasperViewer(print, false);
                 view.setVisible(true);
                 
             } catch (JRException ex) {
                 Logger.getLogger(JFrmCadDeclaracaoPaciente.class.getName()).log(Level.SEVERE, null, ex);
             }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMesItemStateChanged

        int m = jComboBoxMes.getSelectedIndex();

        sessaoHasPacienteQuery = entityManager.createQuery("SELECT s from SessaoHasPaciente s where month(sessao.diasessao) = :m order by paciente, sessao.diasessao");
        sessaoHasPacienteQuery.setParameter("m", m);
        sessaoHasPacienteList.clear();
        sessaoHasPacienteList.addAll(sessaoHasPacienteQuery.getResultList());

    }//GEN-LAST:event_jComboBoxMesItemStateChanged
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<bean.Cidade> cidadeList;
    private javax.persistence.Query cidadeQuery;
    private java.util.List<bean.Dia> diaList;
    private javax.persistence.Query diaQuery;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<bean.Fichasala> fichasalaList;
    private javax.persistence.Query fichasalaQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JComboBox<String> jComboBoxPaciente;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDeclaracao;
    private java.util.List<bean.Paciente> pacienteList;
    private javax.persistence.Query pacienteQuery;
    private java.util.List<bean.SessaoHasPaciente> sessaoHasPacienteList;
    private javax.persistence.Query sessaoHasPacienteQuery;
    private java.util.List<bean.Turno> turnoList;
    private javax.persistence.Query turnoQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
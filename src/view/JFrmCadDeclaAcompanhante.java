/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Dia;
import bean.Paciente;
import bean.Turno;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
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
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author johnn
 */
public class JFrmCadDeclaAcompanhante extends javax.swing.JInternalFrame {
        int dias;
        //private int dia;
    /**
     * Creates new form JFrmCadDeclaAcompanhante
     */
    public JFrmCadDeclaAcompanhante() {
        initComponents();
       jRadioButtonTodos.setSelected(true);
       jComboBoxPaciente.setEnabled(false);
       //AutoCompleteDecorator.decorate(jComboBoxPaciente);
       
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

        ClinicaFprojectPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ClinicaFprojectPU").createEntityManager();
        pacienteQuery = java.beans.Beans.isDesignTime() ? null : ClinicaFprojectPUEntityManager.createQuery("SELECT p FROM Paciente p");
        pacienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pacienteQuery.getResultList();
        diaQuery = java.beans.Beans.isDesignTime() ? null : ClinicaFprojectPUEntityManager.createQuery("SELECT d FROM Dia d");
        diaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : diaQuery.getResultList();
        turnoQuery = java.beans.Beans.isDesignTime() ? null : ClinicaFprojectPUEntityManager.createQuery("SELECT t FROM Turno t");
        turnoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : turnoQuery.getResultList();
        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jRadioButtonTodos = new javax.swing.JRadioButton();
        jRadioButtonUnic = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxPaciente = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setTitle("Declaração de Acompanhante");

        jButton2.setText("Gerar declarações ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, diaList, jComboBoxDia);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBoxDia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDiaItemStateChanged(evt);
            }
        });

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, turnoList, jComboBoxTurno);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBoxTurno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTurnoItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButtonTodos);
        jRadioButtonTodos.setText("Todos Pacientes");
        jRadioButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonUnic);
        jRadioButtonUnic.setText("Paciente Específico");
        jRadioButtonUnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUnicActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pacienteList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("nome");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pacienteList, jComboBoxPaciente);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBoxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonUnic)
                            .addComponent(jRadioButtonTodos)
                            .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jRadioButtonTodos)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButtonUnic)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int lastDay = cal.getActualMaximum(Calendar.DATE);
        
        cal.setTime(date);
        
        int i = 0;
        Date dataSemana = null;
         dataSemana = cal.getTime();
//         int whatday = 
        Date [] dates = new Date [lastDay +1];
         do{
             i++;
             cal.set(Calendar.DAY_OF_MONTH, i);
             
            Date dataCatch = cal.getTime();
            if(cal.get(Calendar.DAY_OF_WEEK) == 2){
            dates [i] = dataCatch; }
            else if(cal.get(Calendar.DAY_OF_WEEK) == 4){
              dates [i] = dataCatch;  
            }
            else if(cal.get(Calendar.DAY_OF_WEEK) == 6){
              dates [i] = dataCatch;  
            }
            //System.out.println(dates[i]);
              //System.out.println(dates[i]);
                     }while(i < lastDay);
        List<Date> list = new ArrayList<>(Arrays.asList(dates));
            
             while (list.remove(null));
        
         if (jRadioButtonTodos.isSelected()) {

           Turno t = (Turno) jComboBoxTurno.getSelectedItem();
          pacienteQuery = ClinicaFprojectPUEntityManager.createQuery("select p from Paciente p where p.turno = :t");
           pacienteQuery.setParameter("t", t);
          pacienteList.clear();
            pacienteList.addAll(pacienteQuery.getResultList());
         }
        else if(jRadioButtonUnic.isSelected()){
               Paciente p = (Paciente) jComboBoxPaciente.getSelectedItem();
            pacienteQuery = ClinicaFprojectPUEntityManager.createQuery("select p from Paciente p where p = :p");
           pacienteQuery.setParameter("p", p);
          pacienteList.clear();
            pacienteList.addAll(pacienteQuery.getResultList());
           //dias = p.getDiaInt();
            // System.out.println(dias);
           
        }
         String caminho = new File("C://ArquivosCrsys/relatorios/reportAcompanhante.jrxml").getAbsolutePath();
        try {
                 JasperReport relatorio = JasperCompileManager.compileReport(caminho);
                 JRBeanCollectionDataSource dados = new JRBeanCollectionDataSource(pacienteList, false);
                 Map parametros = new HashMap();
                 int totDias = list.size();
                 if (totDias == 12){
                 parametros.put("DATA_1", list.get(0));
                 parametros.put("DATA_2", list.get(1));
                 parametros.put("DATA_3", list.get(2));
                 parametros.put("DATA_4", list.get(3));
                 parametros.put("DATA_5", list.get(4));
                 parametros.put("DATA_6", list.get(5));
                 parametros.put("DATA_7", list.get(6));
                 parametros.put("DATA_8", list.get(7));
                 parametros.put("DATA_9", list.get(8));
                 parametros.put("DATA_10", list.get(9));
                 parametros.put("DATA_11", list.get(10));
                 parametros.put("DATA_12", list.get(11));
                // parametros.put("DATA_13", list.get(12));
                // parametros.put("DATA_14", list.get(13));
                // parametros.put("DATA_15", list.get(15));
                 
                 }else if (totDias == 13){
                 parametros.put("DATA_1", list.get(0));
                 parametros.put("DATA_2", list.get(1));
                 parametros.put("DATA_3", list.get(2));
                 parametros.put("DATA_4", list.get(3));
                 parametros.put("DATA_5", list.get(4));
                 parametros.put("DATA_6", list.get(5));
                 parametros.put("DATA_7", list.get(6));
                 parametros.put("DATA_8", list.get(7));
                 parametros.put("DATA_9", list.get(8));
                 parametros.put("DATA_10", list.get(9));
                 parametros.put("DATA_11", list.get(10));
                 parametros.put("DATA_12", list.get(11));
                 parametros.put("DATA_13", list.get(12));
                 }else if (totDias == 14){
                 parametros.put("DATA_1", list.get(0));
                 parametros.put("DATA_2", list.get(1));
                 parametros.put("DATA_3", list.get(2));
                 parametros.put("DATA_4", list.get(3));
                 parametros.put("DATA_5", list.get(4));
                 parametros.put("DATA_6", list.get(5));
                 parametros.put("DATA_7", list.get(6));
                 parametros.put("DATA_8", list.get(7));
                 parametros.put("DATA_9", list.get(8));
                 parametros.put("DATA_10", list.get(9));
                 parametros.put("DATA_11", list.get(10));
                 parametros.put("DATA_12", list.get(11));
                 parametros.put("DATA_13", list.get(12));
                 parametros.put("DATA_14", list.get(13));
                 }else if (totDias == 15){
                   parametros.put("DATA_1", list.get(0));
                 parametros.put("DATA_2", list.get(1));
                 parametros.put("DATA_3", list.get(2));
                 parametros.put("DATA_4", list.get(3));
                 parametros.put("DATA_5", list.get(4));
                 parametros.put("DATA_6", list.get(5));
                 parametros.put("DATA_7", list.get(6));
                 parametros.put("DATA_8", list.get(7));
                 parametros.put("DATA_9", list.get(8));
                 parametros.put("DATA_10", list.get(9));
                 parametros.put("DATA_11", list.get(10));
                 parametros.put("DATA_12", list.get(11));
                 parametros.put("DATA_13", list.get(12));
                 parametros.put("DATA_14", list.get(13));
                 parametros.put("DATA_15", list.get(15));  
                 }
                 
                 JasperPrint print = JasperFillManager.fillReport(relatorio, parametros, dados);
                 JasperViewer view = new JasperViewer(print, false);
                 view.setVisible(true);
                 
             } catch (JRException ex) {
                 Logger.getLogger(JFrmCadDeclaracaoPaciente.class.getName()).log(Level.SEVERE, null, ex);
             }
        
        jButton2.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxDiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDiaItemStateChanged
       if (evt.getStateChange() == ItemEvent.SELECTED) {

           Dia d = (Dia) jComboBoxDia.getSelectedItem();
          turnoQuery = ClinicaFprojectPUEntityManager.createQuery("select t from Turno t where t.dia = :d");
           turnoQuery.setParameter("d", d);
          turnoList.clear();
            turnoList.addAll(turnoQuery.getResultList());
         }
    }//GEN-LAST:event_jComboBoxDiaItemStateChanged

    private void jComboBoxTurnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTurnoItemStateChanged
       // if (evt.getStateChange() == ItemEvent.SELECTED) {
          // Dia d = (Dia) jComboBoxDia.getSelectedItem(); 
          // Turno t = (Turno) jComboBoxTurno.getSelectedItem();
        //  pacienteQuery = ClinicaFprojectPUEntityManager.createQuery("select p from Paciente p where p.turno = :t and p.dia = :d and p.precisadeclaracao = 1");
          // pacienteQuery.setParameter("t", t);
          // pacienteQuery.setParameter("d", d);
         // pacienteList.clear();
          //  pacienteList.addAll(pacienteQuery.getResultList()); 
        
       // }
       jButton2.setEnabled(true);
    }//GEN-LAST:event_jComboBoxTurnoItemStateChanged

    private void jRadioButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodosActionPerformed
        jComboBoxPaciente.setEnabled(false);
        jComboBoxDia.setEnabled(true);
        jComboBoxTurno.setEnabled(true);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonTodosActionPerformed

    private void jRadioButtonUnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUnicActionPerformed
        jComboBoxPaciente.setEnabled(true);
        jComboBoxDia.setEnabled(false);
        jComboBoxTurno.setEnabled(false);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonUnicActionPerformed

    private void jComboBoxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPacienteActionPerformed
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jComboBoxPacienteActionPerformed

private String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
}
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ClinicaFprojectPUEntityManager;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.util.List<bean.Dia> diaList;
    private javax.persistence.Query diaQuery;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxPaciente;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private javax.swing.JRadioButton jRadioButtonTodos;
    private javax.swing.JRadioButton jRadioButtonUnic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<bean.Paciente> pacienteList;
    private javax.persistence.Query pacienteQuery;
    private java.util.List<bean.Turno> turnoList;
    private javax.persistence.Query turnoQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Ocorrencias;
import java.io.File;
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
public class JFrmGerarOcorrencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFrmcadOcorrencia
     */
    public JFrmGerarOcorrencia() {
        initComponents();
        ocorrenciasList.clear();
        desabilitartudo();
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
        ocorrenciasQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT o FROM Ocorrencias o");
        ocorrenciasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(ocorrenciasQuery.getResultList());
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonObito = new javax.swing.JRadioButton();
        jRadioButtonMelhora = new javax.swing.JRadioButton();
        jRadioButtonOutros = new javax.swing.JRadioButton();
        jRadioButtonAbandonoIgnorado = new javax.swing.JRadioButton();
        jRadioButtonTX = new javax.swing.JRadioButton();
        jRadioButtonCura = new javax.swing.JRadioButton();
        jRadioButtonTransferencia = new javax.swing.JRadioButton();
        parentPanel = new javax.swing.JPanel();
        jPanelMelhora = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMelhora = new javax.swing.JTextArea();
        jPanelCura = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaCura = new javax.swing.JTextArea();
        jPanelAbandonoIgnorado = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaAbandonoIgnorado = new javax.swing.JTextArea();
        jPanelTx = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaTX = new javax.swing.JTextArea();
        jPanelObito = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaObito = new javax.swing.JTextArea();
        jPanelTransferencia = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaTransferencia = new javax.swing.JTextArea();
        jPanelOutros = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaOutros = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Imprimir Ocorrências");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ocorrenciasList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${paciente}"));
        columnBinding.setColumnName("Paciente");
        columnBinding.setColumnClass(bean.Paciente.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Tipo da Ocorrência"));

        buttonGroup1.add(jRadioButtonObito);
        jRadioButtonObito.setText("Óbito");
        jRadioButtonObito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonObitoItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButtonMelhora);
        jRadioButtonMelhora.setText("Melhora");
        jRadioButtonMelhora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonMelhoraItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButtonOutros);
        jRadioButtonOutros.setText("Outros");
        jRadioButtonOutros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonOutrosItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButtonAbandonoIgnorado);
        jRadioButtonAbandonoIgnorado.setText("Abandono Ignorado");
        jRadioButtonAbandonoIgnorado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonAbandonoIgnoradoItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButtonTX);
        jRadioButtonTX.setText("Tx (Unid. de Transplante)");
        jRadioButtonTX.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonTXItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCura);
        jRadioButtonCura.setText("Cura");
        jRadioButtonCura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonCuraItemStateChanged(evt);
            }
        });
        jRadioButtonCura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonCuraStateChanged(evt);
            }
        });
        jRadioButtonCura.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jRadioButtonCuraPropertyChange(evt);
            }
        });

        buttonGroup1.add(jRadioButtonTransferencia);
        jRadioButtonTransferencia.setText("Transferência");
        jRadioButtonTransferencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonTransferenciaItemStateChanged(evt);
            }
        });
        jRadioButtonTransferencia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonTransferenciaStateChanged(evt);
            }
        });
        jRadioButtonTransferencia.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jRadioButtonTransferenciaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonTransferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOutros))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonMelhora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonCura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonAbandonoIgnorado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonTX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonObito)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMelhora)
                    .addComponent(jRadioButtonCura)
                    .addComponent(jRadioButtonAbandonoIgnorado)
                    .addComponent(jRadioButtonTX)
                    .addComponent(jRadioButtonObito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonTransferencia)
                    .addComponent(jRadioButtonOutros))
                .addContainerGap())
        );

        parentPanel.setBackground(new java.awt.Color(255, 255, 255));
        parentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Texto da Ocorrência"));
        parentPanel.setLayout(new java.awt.CardLayout());

        jTextAreaMelhora.setColumns(20);
        jTextAreaMelhora.setLineWrap(true);
        jTextAreaMelhora.setRows(5);
        jTextAreaMelhora.setTabSize(5);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.melhora}"), jTextAreaMelhora, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(jTextAreaMelhora);

        javax.swing.GroupLayout jPanelMelhoraLayout = new javax.swing.GroupLayout(jPanelMelhora);
        jPanelMelhora.setLayout(jPanelMelhoraLayout);
        jPanelMelhoraLayout.setHorizontalGroup(
            jPanelMelhoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMelhoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMelhoraLayout.setVerticalGroup(
            jPanelMelhoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMelhoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        parentPanel.add(jPanelMelhora, "card2");

        jTextAreaCura.setColumns(20);
        jTextAreaCura.setLineWrap(true);
        jTextAreaCura.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cura}"), jTextAreaCura, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(jTextAreaCura);

        javax.swing.GroupLayout jPanelCuraLayout = new javax.swing.GroupLayout(jPanelCura);
        jPanelCura.setLayout(jPanelCuraLayout);
        jPanelCuraLayout.setHorizontalGroup(
            jPanelCuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCuraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCuraLayout.setVerticalGroup(
            jPanelCuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCuraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        parentPanel.add(jPanelCura, "card3");

        jTextAreaAbandonoIgnorado.setColumns(20);
        jTextAreaAbandonoIgnorado.setLineWrap(true);
        jTextAreaAbandonoIgnorado.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.abandonoignorado}"), jTextAreaAbandonoIgnorado, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane4.setViewportView(jTextAreaAbandonoIgnorado);

        javax.swing.GroupLayout jPanelAbandonoIgnoradoLayout = new javax.swing.GroupLayout(jPanelAbandonoIgnorado);
        jPanelAbandonoIgnorado.setLayout(jPanelAbandonoIgnoradoLayout);
        jPanelAbandonoIgnoradoLayout.setHorizontalGroup(
            jPanelAbandonoIgnoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbandonoIgnoradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAbandonoIgnoradoLayout.setVerticalGroup(
            jPanelAbandonoIgnoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbandonoIgnoradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        parentPanel.add(jPanelAbandonoIgnorado, "card4");

        jTextAreaTX.setColumns(20);
        jTextAreaTX.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tx}"), jTextAreaTX, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane5.setViewportView(jTextAreaTX);

        javax.swing.GroupLayout jPanelTxLayout = new javax.swing.GroupLayout(jPanelTx);
        jPanelTx.setLayout(jPanelTxLayout);
        jPanelTxLayout.setHorizontalGroup(
            jPanelTxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTxLayout.setVerticalGroup(
            jPanelTxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        parentPanel.add(jPanelTx, "card5");

        jTextAreaObito.setColumns(20);
        jTextAreaObito.setLineWrap(true);
        jTextAreaObito.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.obito}"), jTextAreaObito, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane6.setViewportView(jTextAreaObito);

        javax.swing.GroupLayout jPanelObitoLayout = new javax.swing.GroupLayout(jPanelObito);
        jPanelObito.setLayout(jPanelObitoLayout);
        jPanelObitoLayout.setHorizontalGroup(
            jPanelObitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelObitoLayout.setVerticalGroup(
            jPanelObitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        parentPanel.add(jPanelObito, "card6");

        jTextAreaTransferencia.setColumns(20);
        jTextAreaTransferencia.setLineWrap(true);
        jTextAreaTransferencia.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.transferencia}"), jTextAreaTransferencia, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane7.setViewportView(jTextAreaTransferencia);

        javax.swing.GroupLayout jPanelTransferenciaLayout = new javax.swing.GroupLayout(jPanelTransferencia);
        jPanelTransferencia.setLayout(jPanelTransferenciaLayout);
        jPanelTransferenciaLayout.setHorizontalGroup(
            jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTransferenciaLayout.setVerticalGroup(
            jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        parentPanel.add(jPanelTransferencia, "card7");

        jTextAreaOutros.setColumns(20);
        jTextAreaOutros.setLineWrap(true);
        jTextAreaOutros.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.outros}"), jTextAreaOutros, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane8.setViewportView(jTextAreaOutros);

        javax.swing.GroupLayout jPanelOutrosLayout = new javax.swing.GroupLayout(jPanelOutros);
        jPanelOutros.setLayout(jPanelOutrosLayout);
        jPanelOutrosLayout.setHorizontalGroup(
            jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOutrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelOutrosLayout.setVerticalGroup(
            jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOutrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        parentPanel.add(jPanelOutros, "card8");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_print_18px.png"))); // NOI18N
        jButton1.setText("Imprimir Ocorrências");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione a Ocorrência que deseja digitar o texto :");

        jLabel2.setText("Mês da ocorrência");

        jComboBoxMes.setMaximumRowCount(12);
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        jComboBoxMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parentPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String caminho = new File("./relatorios/reportOcorrencia.jrxml").getAbsolutePath();
         
             try {
                 JasperReport relatorio = JasperCompileManager.compileReport(caminho);
                 JRBeanCollectionDataSource dados = new JRBeanCollectionDataSource(ocorrenciasList, false);
                 JasperPrint print = JasperFillManager.fillReport(relatorio, null, dados);
                 JasperViewer view = new JasperViewer(print, false);
                 view.setVisible(true);
                 
             } catch (JRException ex) {
                 Logger.getLogger(JFrmCadDeclaracaoPaciente.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMesItemStateChanged

        int m = jComboBoxMes.getSelectedIndex();
        ocorrenciasQuery = entityManager.createQuery("select o from Ocorrencias o where month(o.dataocorrencia) = :m");
        ocorrenciasQuery.setParameter("m", m);
        ocorrenciasList.clear();
        ocorrenciasList.addAll(ocorrenciasQuery.getResultList());

    }//GEN-LAST:event_jComboBoxMesItemStateChanged

    private void jRadioButtonTransferenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonTransferenciaItemStateChanged
          parentPanel.removeAll();
        parentPanel.add(jPanelTransferencia);
        parentPanel.repaint();
        parentPanel.revalidate();
       // limpartextos();
    }//GEN-LAST:event_jRadioButtonTransferenciaItemStateChanged

    private void jRadioButtonMelhoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonMelhoraItemStateChanged
    parentPanel.removeAll();
        parentPanel.add(jPanelMelhora);
        parentPanel.repaint();
        parentPanel.revalidate();
     
    }//GEN-LAST:event_jRadioButtonMelhoraItemStateChanged

    private void jRadioButtonAbandonoIgnoradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonAbandonoIgnoradoItemStateChanged
           parentPanel.removeAll();
        parentPanel.add(jPanelAbandonoIgnorado);
        parentPanel.repaint();
        parentPanel.revalidate();
     
    }//GEN-LAST:event_jRadioButtonAbandonoIgnoradoItemStateChanged

    private void jRadioButtonObitoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonObitoItemStateChanged
        parentPanel.removeAll();
        parentPanel.add(jPanelObito);
        parentPanel.repaint();
        parentPanel.revalidate();
       
    }//GEN-LAST:event_jRadioButtonObitoItemStateChanged

    private void jRadioButtonTXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonTXItemStateChanged
        parentPanel.removeAll();
        parentPanel.add(jPanelTx);
        parentPanel.repaint();
        parentPanel.revalidate();
       
    }//GEN-LAST:event_jRadioButtonTXItemStateChanged

    private void jRadioButtonOutrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonOutrosItemStateChanged
        parentPanel.removeAll();
        parentPanel.add(jPanelOutros);
        parentPanel.repaint();
        parentPanel.revalidate();
        
    }//GEN-LAST:event_jRadioButtonOutrosItemStateChanged

    private void jRadioButtonTransferenciaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jRadioButtonTransferenciaPropertyChange
     
    }//GEN-LAST:event_jRadioButtonTransferenciaPropertyChange

    private void jRadioButtonCuraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jRadioButtonCuraPropertyChange
      
    }//GEN-LAST:event_jRadioButtonCuraPropertyChange

    private void jRadioButtonTransferenciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonTransferenciaStateChanged
         
    }//GEN-LAST:event_jRadioButtonTransferenciaStateChanged

    private void jRadioButtonCuraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonCuraStateChanged
           
    }//GEN-LAST:event_jRadioButtonCuraStateChanged

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
       
        
    }//GEN-LAST:event_jTable1PropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        buttonGroup1.clearSelection();
        if(jTextAreaTransferencia.getText().length() > 5){
            jRadioButtonTransferencia.setSelected(true);
        }
        else if(jTextAreaCura.getText().length() > 5){
            jRadioButtonCura.setSelected(true);
        }
        else if(jTextAreaAbandonoIgnorado.getText().length() > 5){
            jRadioButtonAbandonoIgnorado.setSelected(true);
        }
        else if(jTextAreaMelhora.getText().length() > 5){
            jRadioButtonMelhora.setSelected(true);
        }
        else if(jTextAreaObito.getText().length() > 5){
            jRadioButtonObito.setSelected(true);
        }
        else if(jTextAreaTX.getText().length() > 5){
            jRadioButtonTX.setSelected(true);
        }
        else if(jTextAreaOutros.getText().length() > 5){
            jRadioButtonOutros.setSelected(true);
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRadioButtonCuraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonCuraItemStateChanged
        parentPanel.removeAll();
        parentPanel.add(jPanelCura);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_jRadioButtonCuraItemStateChanged

    
    /*private void limpartextos (){
      jTextAreaMelhora.setText(null);
      jTextArea2.setText(null);
      jTextArea3.setText(null);
      jTextArea4.setText(null);
      jTextArea5.setText(null);
      jTextAreaTransferencia.setText(null);
      jTextArea7.setText(null);
    }*/
    
        private void desabilitartudo(){
        //jPanel1.setEnabled(false);
       // parentPanel.setEnabled(false);
        jRadioButtonMelhora.setEnabled(false);
        jRadioButtonCura.setEnabled(false);
        jRadioButtonAbandonoIgnorado.setEnabled(false);
        jRadioButtonObito.setEnabled(false);
        jRadioButtonOutros.setEnabled(false);
        jRadioButtonTX.setEnabled(false);
        jRadioButtonTransferencia.setEnabled(false);
        //jTextAreaMelhora.setEnabled(false);
        //jTable1.setVisible(false);
    }
        
        
         private void habilitartudo(){
        jPanel1.setEnabled(true);
        parentPanel.setEnabled(true);
        jRadioButtonMelhora.setEnabled(true);
        jRadioButtonCura.setEnabled(true);
        jRadioButtonAbandonoIgnorado.setEnabled(true);
        jRadioButtonObito.setEnabled(true);
        jRadioButtonOutros.setEnabled(true);
        jRadioButtonTX.setEnabled(true);
        jRadioButtonTransferencia.setEnabled(true);
        jTextAreaMelhora.setEnabled(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAbandonoIgnorado;
    private javax.swing.JPanel jPanelCura;
    private javax.swing.JPanel jPanelMelhora;
    private javax.swing.JPanel jPanelObito;
    private javax.swing.JPanel jPanelOutros;
    private javax.swing.JPanel jPanelTransferencia;
    private javax.swing.JPanel jPanelTx;
    private javax.swing.JRadioButton jRadioButtonAbandonoIgnorado;
    private javax.swing.JRadioButton jRadioButtonCura;
    private javax.swing.JRadioButton jRadioButtonMelhora;
    private javax.swing.JRadioButton jRadioButtonObito;
    private javax.swing.JRadioButton jRadioButtonOutros;
    private javax.swing.JRadioButton jRadioButtonTX;
    private javax.swing.JRadioButton jRadioButtonTransferencia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAbandonoIgnorado;
    private javax.swing.JTextArea jTextAreaCura;
    private javax.swing.JTextArea jTextAreaMelhora;
    private javax.swing.JTextArea jTextAreaObito;
    private javax.swing.JTextArea jTextAreaOutros;
    private javax.swing.JTextArea jTextAreaTX;
    private javax.swing.JTextArea jTextAreaTransferencia;
    private java.util.List<bean.Ocorrencias> ocorrenciasList;
    private javax.persistence.Query ocorrenciasQuery;
    private javax.swing.JPanel parentPanel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

package sistemalogisticofinal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sistemalogisticofinal.Funciones.registrosDeposito;
import static sistemalogisticofinal.Funciones.registroCamion;
import static sistemalogisticofinal.Funciones.registroTotal;

public final class Vista1 extends javax.swing.JFrame {

    Archivos Archivo = new Archivos();
    DefaultTableModel tabla = new DefaultTableModel();

    public Vista1() throws IOException {
        initComponents();

        Funciones.registroTotal = Archivo.leerArrayList("C:\\Users\\usuarios\\Desktop\\datosHistoricos.txt");
        Funciones.registrosDeposito = Archivo.leerArrayList("C:\\Users\\usuarios\\Desktop\\cargasRecebidas.txt");

        ArrayList<Transportadora> invertirArray = Funciones.invertirArray(registrosDeposito);

        tabla.addColumn("Remitente");
        tabla.addColumn("Destinatario");
        tabla.addColumn("Destino");
        tabla.addColumn("Volumen");

        actualizaTabla(invertirArray);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        inputRemitente = new javax.swing.JTextField();
        IngresarBtn = new javax.swing.JButton();
        BorrarBtn = new javax.swing.JButton();
        inputDestinatario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputVolumen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputDistancia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        administracionBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CargarCamionBtn = new javax.swing.JButton();
        EntregarBtn = new javax.swing.JButton();
        RespaldoBtn = new javax.swing.JButton();
        label1 = new java.awt.Label();

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("Panel del Deposito");

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setText("Panel del Deposito");

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setText("Panel del Deposito");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transportadora de Objetos");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de Encomiendas"));

        jLabel6.setText("Remitente:");

        IngresarBtn.setText("Ingresar");
        IngresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBtnActionPerformed(evt);
            }
        });

        BorrarBtn.setText("Borrar ");
        BorrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Destinatario:");

        jLabel9.setText("Distancia:");

        jLabel10.setText("Volumen:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bage", "Pelotas", "Rio Grande" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        administracionBtn.setText("Administrar");
        administracionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administracionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputDestinatario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputRemitente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(inputVolumen)
                                .addGap(139, 139, 139))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputDistancia))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IngresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BorrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(administracionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(139, 139, 139)))
                .addGap(244, 244, 244))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(inputRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(inputVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(inputDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(administracionBtn))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BorrarBtn)
                    .addComponent(IngresarBtn))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros en Deposito"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Remite", "Destinatario", "Volumen", "Distancia"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        CargarCamionBtn.setText("Cargar Camion");
        CargarCamionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarCamionBtnActionPerformed(evt);
            }
        });

        EntregarBtn.setText("Entregar Encomiendas");
        EntregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntregarBtnActionPerformed(evt);
            }
        });

        RespaldoBtn.setText("Recuperar Datos");
        RespaldoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespaldoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EntregarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CargarCamionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(RespaldoBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RespaldoBtn)
                    .addComponent(CargarCamionBtn))
                .addGap(18, 18, 18)
                .addComponent(EntregarBtn)
                .addContainerGap())
        );

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Panel de Ingreso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String deposito = "C:\\Users\\usuarios\\Desktop\\cargasRecebidas.txt";
    String camion = "C:\\Users\\usuarios\\Desktop\\camion.txt";
    String respaldo = "C:\\Users\\usuarios\\Desktop\\cargasRespaldo.txt";
    String datosHistoricos = "C:\\Users\\usuarios\\Desktop\\datosHistoricos.txt";

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String ciudad;
        ciudad = jComboBox1.getSelectedItem().toString();
        switch (ciudad.toLowerCase()) {
            case "bage" ->
                inputDistancia.setText("180");
            case "pelotas" ->
                inputDistancia.setText("340");
            case "rio grande" ->
                inputDistancia.setText("400");
            default ->
                JOptionPane.showMessageDialog(null, "Atencion: Ciudad no registrada");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void IngresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarBtnActionPerformed
        float vol;
        try {

            vol = Float.parseFloat(inputVolumen.getText());
            if (vol > 50) {
                JOptionPane.showMessageDialog(null,
                        "Atencion: El volumen maximo es 50");
                inputVolumen.setText("");
            }

            if (vol <= 50) {
                if ((inputDistancia.getText().equals("180") || inputDistancia.getText().equals("340") || inputDistancia.getText().equals("400"))) {

                    if (!(inputRemitente.getText().equals("") || inputDestinatario.getText().equals("") || inputVolumen.getText().equals("") || inputDistancia.getText().equals(""))) {

                        Funciones.Push(new Transportadora(inputRemitente.getText(), inputDestinatario.getText(), Float.parseFloat(inputVolumen.getText()), Float.parseFloat(inputDistancia.getText())), registrosDeposito);
                        Funciones.registrar(registroTotal, inputRemitente.getText(), inputDestinatario.getText(), Float.parseFloat(inputVolumen.getText()), Float.parseFloat(inputDistancia.getText()));

                        Archivo.escribirArrayList(registrosDeposito, deposito);
                        Archivo.escribirArrayList(registrosDeposito, respaldo);
                        Archivo.escribirArrayList(registroTotal, datosHistoricos);

                        actualizaTabla(Funciones.invertirArray(registrosDeposito));

                        inputRemitente.setText("");
                        inputDestinatario.setText("");
                        inputVolumen.setText("");
                        inputDistancia.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Atencion: Algún campo esta vacío");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Atencion: Ciudad no registrada");
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Atencion: El valumen máximo es 50");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Atencion: Error de formato o campos vacios, utilice los tipos de datos correctos en cada campo");
        }

    }//GEN-LAST:event_IngresarBtnActionPerformed

    private void CargarCamionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarCamionBtnActionPerformed
        if (!registrosDeposito.isEmpty()) {
            if (registroCamion.isEmpty()) {
                try {
                    Archivo.escribirArrayList(registrosDeposito, respaldo);
                    Funciones.cargarCamion(registrosDeposito, registroCamion);
                    Funciones.ordenarArrayPorDistancia(registroCamion);
                    Funciones.calcularCargaCamion(registroCamion);
                    Archivo.escribirArrayList(registroCamion, camion);
                    Archivo.escribirArrayList(registrosDeposito, deposito);

                    actualizaTabla(Funciones.invertirArray(registrosDeposito));

                } catch (IOException ex) {
                    Logger.getLogger(Vista1.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Atencion: Ya hay una carga lista para entregar");
                Funciones.calcularCargaCamion(registroCamion);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Alerta: No se han ingresado cargas al sistema");
        }
    }//GEN-LAST:event_CargarCamionBtnActionPerformed

    private void BorrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarBtnActionPerformed
        if (!registrosDeposito.isEmpty()) {
            Funciones.Pop(registrosDeposito);
            actualizaTabla(Funciones.invertirArray(registrosDeposito));
            try {
                Archivo.escribirArrayList(Funciones.registrosDeposito, deposito);
                Archivo.escribirArrayList(Funciones.registrosDeposito, respaldo);

            } catch (IOException ex) {
                Logger.getLogger(Vista1.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Alerta: El deposito esta vacio");
        }
    }//GEN-LAST:event_BorrarBtnActionPerformed

    private void RespaldoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespaldoBtnActionPerformed
        try {
            Funciones.registroCamion = Archivo.leerArrayList("C:\\Users\\usuarios\\Desktop\\camion.txt");

        } catch (IOException ex) {
            Logger.getLogger(Vista1.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (!registroCamion.isEmpty()) {

            try {
                Funciones.registrosDeposito = Archivo.leerArrayList("C:\\Users\\usuarios\\Desktop\\cargasRespaldo.txt");
                Archivo.escribirArrayList(registrosDeposito, deposito);
                actualizaTabla(Funciones.invertirArray(registrosDeposito));
                registroCamion.clear();
                Archivo.escribirArrayList(registroCamion, camion);

            } catch (IOException ex) {
                Logger.getLogger(Vista1.class
                        .getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,
                        "Error: No hay cargas listas para entregar ");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Error: No hay cargas listas para entregar ");
        }
    }//GEN-LAST:event_RespaldoBtnActionPerformed

    private void EntregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntregarBtnActionPerformed
        if (!registroCamion.isEmpty()) {

            VistaEntregas pantalla2 = null;
            try {
                pantalla2 = new VistaEntregas();

            } catch (IOException ex) {
                Logger.getLogger(Vista1.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            pantalla2.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Error: No hay cargas listas para entregar ");
        }
    }//GEN-LAST:event_EntregarBtnActionPerformed

    private void administracionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administracionBtnActionPerformed

        VistaAdministracion pantalla2 = null;
        try {
            pantalla2 = new VistaAdministracion();

        } catch (IOException ex) {
            Logger.getLogger(Vista1.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        pantalla2.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_administracionBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdministracion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Vista1().setVisible(true);

            } catch (IOException ex) {
                Logger.getLogger(Vista1.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public void borrartabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void actualizaTabla(ArrayList<Transportadora> array) {
        borrartabla();
        if (Funciones.Cantidad(array) > 0) {
            for (int g = 0; g < Funciones.Cantidad(array); g++) {
                String fila[] = new String[4];
                fila[0] = Funciones.setTabla(g, array).getNomeRemetente();
                fila[1] = Funciones.setTabla(g, array).getNomeClienteDestino();
                fila[2] = String.valueOf(Funciones.setTabla(g, array).getDistancaoCidadeDestino());
                fila[3] = String.valueOf(Funciones.setTabla(g, array).getVolumeCarga());
                tabla.addRow(fila);
            }
            jTable2.setModel(tabla);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarBtn;
    private javax.swing.JButton CargarCamionBtn;
    private javax.swing.JButton EntregarBtn;
    private javax.swing.JButton IngresarBtn;
    private javax.swing.JButton RespaldoBtn;
    private javax.swing.JButton administracionBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField inputDestinatario;
    private javax.swing.JTextField inputDistancia;
    private javax.swing.JTextField inputRemitente;
    private javax.swing.JTextField inputVolumen;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables

}

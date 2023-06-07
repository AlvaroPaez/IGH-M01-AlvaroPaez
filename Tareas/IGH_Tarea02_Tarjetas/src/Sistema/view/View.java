package Sistema.view;

import Sistema.excepciones.CamposErroneos;
import Sistema.excepciones.RangoDeNvlCrediticio;
import Sistema.service.Evaluador;
import javax.swing.JOptionPane;

public class View extends javax.swing.JFrame {
    Evaluador eval = new Evaluador();
    
    public View() {
        initComponents();
    }
    
    private void limpiar() {
        this.txtNivelCred.setText("");
        this.txtIngresosM.setText("");
        this.bgrLabora.clearSelection();
        this.bgrAtraso.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrLabora = new javax.swing.ButtonGroup();
        bgrAtraso = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNivelCred = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIngresosM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdoLaboSi = new javax.swing.JRadioButton();
        rdoLaboNo = new javax.swing.JRadioButton();
        rdoAtraSi = new javax.swing.JRadioButton();
        rdoAtraNo = new javax.swing.JRadioButton();
        btnEvaluar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nivel crediticio:");

        txtNivelCred.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Laborando en los ultimos 6 meses:");

        jLabel3.setText("Ingresos mensuales:");

        txtIngresosM.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Atrasos en pagos en los ultimos 6 meses:");

        bgrLabora.add(rdoLaboSi);
        rdoLaboSi.setText("Si");

        bgrLabora.add(rdoLaboNo);
        rdoLaboNo.setText("No");

        bgrAtraso.add(rdoAtraSi);
        rdoAtraSi.setText("Si");

        bgrAtraso.add(rdoAtraNo);
        rdoAtraNo.setText("No");

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("SISTEMA DE CALIFICACION DE CREDITO ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEvaluar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIngresosM, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(rdoLaboSi)
                                        .addGap(27, 27, 27)
                                        .addComponent(rdoLaboNo))
                                    .addComponent(txtNivelCred, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(rdoAtraSi)
                                        .addGap(32, 32, 32)
                                        .addComponent(rdoAtraNo))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNivelCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdoLaboSi)
                    .addComponent(rdoLaboNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIngresosM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdoAtraSi)
                    .addComponent(rdoAtraNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEvaluar)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        try {
            this.validarCampos();
            
            int nvcre = Integer.parseInt(this.txtNivelCred.getText());
            double ingre = Double.parseDouble(this.txtIngresosM.getText());
            boolean labora = this.rdoLaboSi.isSelected(), atraso = this.rdoAtraSi.isSelected();
            
            this.validarRango(nvcre);
            
            if (eval.calificarCliente(nvcre, labora, ingre, atraso)) {
                JOptionPane.showMessageDialog(null, "Cliente califica!", "Evaluador", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no califica!", "Evaluador", JOptionPane.ERROR_MESSAGE);
            }
        } catch (RangoDeNvlCrediticio | CamposErroneos ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrAtraso;
    private javax.swing.ButtonGroup bgrLabora;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdoAtraNo;
    private javax.swing.JRadioButton rdoAtraSi;
    private javax.swing.JRadioButton rdoLaboNo;
    private javax.swing.JRadioButton rdoLaboSi;
    private javax.swing.JTextField txtIngresosM;
    private javax.swing.JTextField txtNivelCred;
    // End of variables declaration//GEN-END:variables
    
    private void validarCampos() throws CamposErroneos {
        if (this.txtIngresosM.getText().isEmpty() || this.txtNivelCred.getText().isEmpty()) throw new CamposErroneos();
        
        if (!this.rdoLaboSi.isSelected() && !this.rdoLaboNo.isSelected())
            throw new CamposErroneos("Debe seleccionar una opción para verificar si labora.");
        
        if (!this.rdoAtraSi.isSelected() && !this.rdoAtraNo.isSelected())
            throw new CamposErroneos("Debe seleccionar una opción para verificar si tiene atraso.");
    }
    
    private void validarRango(int nvlCred) throws RangoDeNvlCrediticio {
        if (nvlCred < 0 || nvlCred > 775) throw new RangoDeNvlCrediticio();
    }
}


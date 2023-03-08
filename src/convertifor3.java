
public class convertifor3 extends javax.swing.JFrame {

    //double argen = 0.0051;
    double usd = 197.97 ;
    double euros = 0.0047;
    
    public convertifor3() {
        initComponents();
         this.setTitle("CONVERSOR DE DIVISAS");
        this.setLocationRelativeTo(null);
        jLabel3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboConvertidor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Entrada = new javax.swing.JTextField();
        jLresultado = new javax.swing.JLabel();
        btnconvertir = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Convertidor de divisas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 270, 40));

        comboConvertidor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboConvertidor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opcion", "De Peso a Dolares", "De Peso a Euros", "De Peso a Libra", "De Dolares a Peso", "De Dolares a Euros", "De Dolares a Libras", "De Libras a Pesos", "De Libras a Dolares", "De Libras a Euros" }));
        comboConvertidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboConvertidorActionPerformed(evt);
            }
        });
        getContentPane().add(comboConvertidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 180, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 200, 50));

        Entrada.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 150, 30));

        jLresultado.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLresultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        getContentPane().add(jLresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 310, 40));

        btnconvertir.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnconvertir.setText("Convertir");
        btnconvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconvertirActionPerformed(evt);
            }
        });
        getContentPane().add(btnconvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, 50));

        btnborrar.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 170, 50));

        btnsalir.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 170, 50));

        jLabel3.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel3.setText("Resultado de la Conversión");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 260, 20));

        jLabel4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel4.setText("Ingrese una cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 200, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboConvertidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboConvertidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboConvertidorActionPerformed

    private void btnconvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconvertirActionPerformed
        double valor = Double.parseDouble(Entrada.getText());
         jLabel3.setVisible(true);
               
             //--de peso argentino a dolares--------------
        if (comboConvertidor.getSelectedItem().equals("De Peso a Dolares")){
            String simbolo = String.format("$ %.2f", valor * 0.0051);
            jLresultado.setText(simbolo);
        }
             //---de peso a euros-ALT + 0128 simbolo euros8 €------------------
        if (comboConvertidor.getSelectedItem().equals("De Peso a Euros")){
            String simbolo = String.format("€ %.2f", valor * euros);
             jLresultado.setText(simbolo);
        }
        //---------de peso a Libra----ALT + 0163-------------------------
         if (comboConvertidor.getSelectedItem().equals("De Peso a Libra")){
            String simbolo = String.format("£ %.2f", valor * 0.0042);
             jLresultado.setText(simbolo);
        }
         //---------------Cambio de libra a peso
         if (comboConvertidor.getSelectedItem().equals("De Libras a Pesos")){
            String simbolo = String.format("$ %.2f ARS", valor * 238.78 );
             jLresultado.setText(simbolo);
        }
         //---------------Cambio de libra a dolares
         if (comboConvertidor.getSelectedItem().equals("De Libras a Dolares")){
            String simbolo = String.format("$ %.2f usd", valor * 1.20 );
             jLresultado.setText(simbolo);
        }
          //---------------Cambio de libra a euros
         if (comboConvertidor.getSelectedItem().equals("De Libras a Euros")){
            String simbolo = String.format("€ %.2f", valor * 1.13 );
             jLresultado.setText(simbolo);
        }
        //---------------De Dolares a peso-----------------------
         if (comboConvertidor.getSelectedItem().equals("De Dolares a Peso")){
            String simbolo = String.format("$ %.2f ARS", valor * 197.97 );
             jLresultado.setText(simbolo);
        }
         //---------------Cambio de usd a euros
         if (comboConvertidor.getSelectedItem().equals("De Dolares a Euros")){
            String simbolo = String.format("€ %.2f", valor * 0.94 );
             jLresultado.setText(simbolo);
        }
         //----usd a libra---------------------------------
         if (comboConvertidor.getSelectedItem().equals("De Dolares a Libras")){
            String simbolo = String.format("£ %.2f", valor * 0.83 );
             jLresultado.setText(simbolo);
    }//GEN-LAST:event_btnconvertirActionPerformed
  }
    
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        Entrada.setText(null);
        jLresultado.setText(null);
         comboConvertidor.setSelectedIndex(0);  
         jLabel3.setVisible(false);
    }//GEN-LAST:event_btnborrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(convertifor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convertifor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convertifor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convertifor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convertifor3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Entrada;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnconvertir;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> comboConvertidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLresultado;
    // End of variables declaration//GEN-END:variables
}

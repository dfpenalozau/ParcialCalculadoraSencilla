
package calculadora;

public class Grafica extends javax.swing.JFrame {
   
    Calculador Numero=new Calculador();
    
    public Grafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSumar = new javax.swing.JButton();
        BotonRestar = new javax.swing.JButton();
        BotonMultiplicar = new javax.swing.JButton();
        BotonDividir = new javax.swing.JButton();
        EtiquetaNumero1 = new javax.swing.JLabel();
        EtiquetaNumero2 = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        EtiquetaResultado = new javax.swing.JLabel();
        Valor1 = new javax.swing.JTextField();
        Valor2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonSumar.setText("+");
        BotonSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSumarMouseClicked(evt);
            }
        });

        BotonRestar.setText("-");
        BotonRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRestarMouseClicked(evt);
            }
        });

        BotonMultiplicar.setText("*");
        BotonMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMultiplicarMouseClicked(evt);
            }
        });

        BotonDividir.setText("/");
        BotonDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDividirMouseClicked(evt);
            }
        });

        EtiquetaNumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaNumero1.setText("Número1");

        EtiquetaNumero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaNumero2.setText("Número2");

        Resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        EtiquetaResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaResultado.setText("Resultado");

        Valor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Valor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EtiquetaNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EtiquetaNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Valor1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Valor2)))
                    .addComponent(EtiquetaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Valor1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(EtiquetaNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EtiquetaNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Valor2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EtiquetaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSumarMouseClicked
    Numero.Numero1=Float.parseFloat(Valor1.getText());
    Numero.Numero2=Float.parseFloat(Valor2.getText());
    this.Resultado.setText(String.valueOf(Numero.Sumar()));
    }//GEN-LAST:event_BotonSumarMouseClicked

    private void BotonRestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRestarMouseClicked
    Numero.Numero1=Float.parseFloat(Valor1.getText());
    Numero.Numero2=Float.parseFloat(Valor2.getText());
    this.Resultado.setText(String.valueOf(Numero.Restar()));
    }//GEN-LAST:event_BotonRestarMouseClicked

    private void BotonMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMultiplicarMouseClicked
    Numero.Numero1=Float.parseFloat(Valor1.getText());
    Numero.Numero2=Float.parseFloat(Valor2.getText());
    this.Resultado.setText(String.valueOf(Numero.Multiplicar()));
    }//GEN-LAST:event_BotonMultiplicarMouseClicked

    private void BotonDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDividirMouseClicked
    Numero.Numero1=Float.parseFloat(Valor1.getText());
    Numero.Numero2=Float.parseFloat(Valor2.getText());
    this.Resultado.setText(String.valueOf(Numero.Dividir()));
    }//GEN-LAST:event_BotonDividirMouseClicked

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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDividir;
    private javax.swing.JButton BotonMultiplicar;
    private javax.swing.JButton BotonRestar;
    private javax.swing.JButton BotonSumar;
    private javax.swing.JLabel EtiquetaNumero1;
    private javax.swing.JLabel EtiquetaNumero2;
    private javax.swing.JLabel EtiquetaResultado;
    private javax.swing.JTextField Resultado;
    private javax.swing.JTextField Valor1;
    private javax.swing.JTextField Valor2;
    // End of variables declaration//GEN-END:variables
}

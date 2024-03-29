
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author parad
 */
public class Calculadora extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private String operacion = "";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;

    public Calculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        jButtonC = new javax.swing.JButton();
        jButtonRAIZ = new javax.swing.JButton();
        jButtonDIVISION = new javax.swing.JButton();
        jButtonCE = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButtonMULTIPLICAR = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButtonRESTAR = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonSUMAR = new javax.swing.JButton();
        jButtonMASMENOS = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButtonPUNTO = new javax.swing.JButton();
        jButtonIGUAL = new javax.swing.JButton();
        jLabelNUMERO = new javax.swing.JLabel();
        jLabelMUESTRA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        jButtonC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonC.setText("C");
        jPanel1.add(jButtonC);

        jButtonRAIZ.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRAIZ.setText("√ ");
        jPanel1.add(jButtonRAIZ);

        jButtonDIVISION.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonDIVISION.setText("/");
        jButtonDIVISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDIVISIONActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDIVISION);

        jButtonCE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCE.setText("CE");
        jPanel1.add(jButtonCE);

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("7");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton11.setBackground(new java.awt.Color(153, 153, 153));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton11.setText("8");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("9");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButtonMULTIPLICAR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonMULTIPLICAR.setText("X");
        jButtonMULTIPLICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMULTIPLICARActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMULTIPLICAR);

        jButton13.setBackground(new java.awt.Color(153, 153, 153));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton13.setText("4");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton16.setBackground(new java.awt.Color(153, 153, 153));
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton16.setText("5");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);

        jButton12.setBackground(new java.awt.Color(153, 153, 153));
        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton12.setText("6");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButtonRESTAR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRESTAR.setText("-");
        jButtonRESTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRESTARActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRESTAR);

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton9.setText("1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton14.setBackground(new java.awt.Color(153, 153, 153));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton14.setText("2");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("3");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButtonSUMAR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSUMAR.setText("+");
        jButtonSUMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSUMARActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSUMAR);

        jButtonMASMENOS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonMASMENOS.setText("+/-");
        jPanel1.add(jButtonMASMENOS);

        jButton18.setBackground(new java.awt.Color(153, 153, 153));
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton18.setText("0");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);

        jButtonPUNTO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonPUNTO.setText(".");
        jPanel1.add(jButtonPUNTO);

        jButtonIGUAL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonIGUAL.setText("=");
        jButtonIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIGUALActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonIGUAL);

        jLabelNUMERO.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelNUMERO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNUMERO.setText("0");

        jLabelMUESTRA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelMUESTRA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMUESTRA, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelNUMERO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabelMUESTRA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora  
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (jLabelNUMERO.getText().equals("0")) {
            cadenaNumeros = "0";
        } else {
            cadenaNumeros += "0";
        }
        jLabelNUMERO.setText(cadenaNumeros);
        activado = true;//voy a usar calculadora        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButtonSUMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSUMARActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            jLabelMUESTRA.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";

            activado = false;
        }
    }//GEN-LAST:event_jButtonSUMARActionPerformed

    private void jButtonIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIGUALActionPerformed
        double segundoNumero;
        if (operacion.equals("nula")) {
            jLabelNUMERO.setText(cadenaNumeros);
        } else if (operacion.equals("sumar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero + segundoNumero;
            jLabelNUMERO.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("restar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero - segundoNumero;
            jLabelNUMERO.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("multiplicar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero * segundoNumero;
            jLabelNUMERO.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero / segundoNumero;
            jLabelNUMERO.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        jLabelMUESTRA.setText("");
        activado = true;
    }//GEN-LAST:event_jButtonIGUALActionPerformed

    private void jButtonMULTIPLICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMULTIPLICARActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            jLabelMUESTRA.setText(cadenaNumeros + " X ");
            cadenaNumeros = "";
            operacion = "multiplicar";

            activado = false;
        }
    }//GEN-LAST:event_jButtonMULTIPLICARActionPerformed

    private void jButtonRESTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRESTARActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            jLabelMUESTRA.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";

            activado = false;
        }
    }//GEN-LAST:event_jButtonRESTARActionPerformed

    private void jButtonDIVISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDIVISIONActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            jLabelMUESTRA.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";

            activado = false;
        }
    }//GEN-LAST:event_jButtonDIVISIONActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException, IllegalAccessException {
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//diseño
        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCE;
    private javax.swing.JButton jButtonDIVISION;
    private javax.swing.JButton jButtonIGUAL;
    private javax.swing.JButton jButtonMASMENOS;
    private javax.swing.JButton jButtonMULTIPLICAR;
    private javax.swing.JButton jButtonPUNTO;
    private javax.swing.JButton jButtonRAIZ;
    private javax.swing.JButton jButtonRESTAR;
    private javax.swing.JButton jButtonSUMAR;
    private javax.swing.JLabel jLabelMUESTRA;
    private javax.swing.JLabel jLabelNUMERO;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.miempresa.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author fullfontj
 */
public class calUI extends javax.swing.JFrame {

    /**
     * Creates new form calUI
     */
    public calUI() {
        initComponents();
    }
    
    public double result;
    public String opcion;
    public boolean selectOperacion = false;
    public boolean firtsOpera = true;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimpiar = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        operacion = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        num4.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        dividir.setBackground(new java.awt.Color(0, 204, 204));
        dividir.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacion(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        num5.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        num6.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        restar.setBackground(new java.awt.Color(0, 204, 204));
        restar.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        restar.setText("-");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacion(evt);
            }
        });

        num7.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        num8.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        num9.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        num3.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        multiplicar.setBackground(new java.awt.Color(0, 204, 204));
        multiplicar.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        multiplicar.setText("x");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacion(evt);
            }
        });

        punto.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        num0.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(153, 255, 153));
        btnIgual.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        sumar.setBackground(new java.awt.Color(0, 204, 204));
        sumar.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        sumar.setText("+");
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacion(evt);
            }
        });

        num2.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        num1.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 18)); // NOI18N
        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNum(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        operacion.setFont(new java.awt.Font("Segoe UI SemiLight", 0, 14)); // NOI18N
        operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        operacion.setToolTipText("");
        operacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        operacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelEstado.setFont(new java.awt.Font("Segoe UI SemiLight", 0, 10)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(51, 51, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(operacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num7)
                                        .addGap(18, 18, 18)
                                        .addComponent(num8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num4)
                                        .addGap(18, 18, 18)
                                        .addComponent(num5)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num6)
                                        .addGap(18, 18, 18)
                                        .addComponent(multiplicar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num9)
                                        .addGap(18, 18, 18)
                                        .addComponent(restar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(punto)
                                .addGap(18, 18, 18)
                                .addComponent(num0)
                                .addGap(18, 18, 18)
                                .addComponent(btnIgual)
                                .addGap(18, 18, 18)
                                .addComponent(sumar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num1)
                                .addGap(18, 18, 18)
                                .addComponent(num2)
                                .addGap(18, 18, 18)
                                .addComponent(num3)
                                .addGap(18, 18, 18)
                                .addComponent(dividir)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar)
                    .addComponent(btnBorrar))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2)
                    .addComponent(num3)
                    .addComponent(dividir)
                    .addComponent(num1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4)
                    .addComponent(num5)
                    .addComponent(num6)
                    .addComponent(multiplicar))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num8)
                    .addComponent(num7)
                    .addComponent(num9)
                    .addComponent(restar))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumar)
                    .addComponent(btnIgual)
                    .addComponent(num0)
                    .addComponent(punto))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        String numText = this.operacion.getText();
        if (numText == ""){
            JOptionPane.showMessageDialog(null, "Crear Operacion", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
            operacionResult(numText);
            this.operacion.setText(""+result);
            selectOperacion = true;
            firtsOpera = true;
            this.labelEstado.setText("RESULTADO");
        }
        
    }//GEN-LAST:event_btnIgualActionPerformed

    private void addNum(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNum
        String numText =  ((javax.swing.JButton) evt.getSource()).getText();
        this.labelEstado.setText("");
        if(selectOperacion){
            this.operacion.setText(numText);
            selectOperacion = false;
        }else{
            this.operacion.setText(this.operacion.getText() + "" + numText);
        }
    }//GEN-LAST:event_addNum

    private void btnOperacion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperacion
        this.labelEstado.setText("");
        String numText = this.operacion.getText();
        selectOperacion = true;
        if(firtsOpera){
            result = Double.parseDouble(numText);
            firtsOpera = false;
        }else{
            operacionResult(numText);
        }
        opcion =  ((javax.swing.JButton) evt.getSource()).getText();
       
    }//GEN-LAST:event_btnOperacion

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        result = 0;
        opcion = "";
        firtsOpera = true;
        selectOperacion = false;
        this.operacion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String numText = this.operacion.getText();
        
        if (numText == ""){
            JOptionPane.showMessageDialog(null, "Crear Operacion", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
            String borraUltNum = numText.substring(0, numText.length() -1);
            this.operacion.setText(borraUltNum);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    public void operacionResult(String numString){
         switch (opcion) {
            case "+" -> result += Double.parseDouble(numString);
            case "-" -> result = result - Double.parseDouble(numString);
            case "x" -> result *= Double.parseDouble(numString);
            case "/" -> result /= Double.parseDouble(numString);
            default -> throw new AssertionError();
        }
    }
    
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
            java.util.logging.Logger.getLogger(calUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calUI().setVisible(true);
            }
        });
    }
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton dividir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JLabel operacion;
    private javax.swing.JButton punto;
    private javax.swing.JButton restar;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}

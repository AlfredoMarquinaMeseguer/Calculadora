/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadoraotravez;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Alfre
 */
public class Calculadora extends javax.swing.JFrame {

    Modelo modelo;
    private boolean operadorPulsado, primerNumero, puntoPulsado, escribiendoNum;
    Modelo.Operacion operacion;

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        modelo = new Modelo();
        operacion = modelo.inicial;
        operadorPulsado = primerNumero = puntoPulsado = escribiendoNum = false;
        initComponents();
        //Boton 0
        this.b0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, NORMAL), "0");
        this.b0.getActionMap().put("0", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b0.doClick();
            }
        });
        //Boton 1
        this.b1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, NORMAL), "1");
        this.b1.getActionMap().put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b1.doClick();
            }
        });
        //Boton 2
        this.b2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, NORMAL), "2");
        this.b2.getActionMap().put("2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b2.doClick();
            }
        });
        //Boton 3
        this.b3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, NORMAL), "3");
        this.b3.getActionMap().put("3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b3.doClick();
            }
        });
        //Boton 4
        this.b4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, NORMAL), "4");
        this.b4.getActionMap().put("4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b4.doClick();
            }
        });
        //Boton 5
        this.b5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, NORMAL), "5");
        this.b5.getActionMap().put("5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b5.doClick();
            }
        });
        //Boton 6
        this.b6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, NORMAL), "6");
        this.b6.getActionMap().put("6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b6.doClick();
            }
        });
        //Boton 7
        this.b7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, NORMAL), "7");
        this.b7.getActionMap().put("7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b7.doClick();
            }
        });
        //Boton 8
        this.b8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, NORMAL), "8");
        this.b8.getActionMap().put("8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b8.doClick();
            }
        });
        //Boton 9
        this.b9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, NORMAL), "9");
        this.b9.getActionMap().put("9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b9.doClick();
            }
        });
        //Boton Division
        this.bDivision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, NORMAL), "/");
        this.bDivision.getActionMap().put("/", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bDivision.doClick();
            }
        });
        //Boton Multiplicacion
        this.bMultiplicacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, NORMAL), "*");
        this.bMultiplicacion.getActionMap().put("*", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bMultiplicacion.doClick();
            }
        });
        //Boton Suma
        this.bSuma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, NORMAL), "+");
        this.bSuma.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bSuma.doClick();
            }
        });
        //Boton Resta
        this.bResta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, NORMAL), "-");
        this.bResta.getActionMap().put("-", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bResta.doClick();
            }
        });
        //Boton Punto
        this.bPunto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, NORMAL), ".");
        this.bPunto.getActionMap().put(".", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bPunto.doClick();
            }
        });
    }

    private void iniciarAcumulado() {
        try {
            modelo.sumar(Double.parseDouble(resultado.getText()));
            primerNumero = true;
            operadorPulsado = true;
        } catch (Exception ex) {
            resultado.setText("0.");
        }
    }

    private boolean operar() {
        boolean seHaEjecutado = true;

        if (escribiendoNum || operadorPulsado) {

            puntoPulsado = false;
            escribiendoNum = false;
            try {
                // Se obtiene el número escrito en pantalla y se opera

                //Esto puede causar error si el número no está bien escrito
                double numero = Double.parseDouble(resultado.getText());

                //Calcular resultado
                numero = operacion.op(numero);

                //Se escribe el resultado diferente según si es decimal
                if (numero == Math.floor(numero)) {
                    DecimalFormat decimalFormateado = new DecimalFormat("#");
                    resultado.setText(decimalFormateado.format(numero));
                } else {
                    resultado.setText(numero + "");
                }
            } catch (Exception ex) {
                resultado.setText("err");
                seHaEjecutado = false;
            }

        } else {
            seHaEjecutado = false;
        }
        operadorPulsado = true;
        return seHaEjecutado;
    }

    private void escribir(char numOPunto) {
        if (escribiendoNum) {
            resultado.setText(resultado.getText() + numOPunto);
        } else {
            resultado.setText(numOPunto + "");
            escribiendoNum = true;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado = new javax.swing.JTextField();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bDivision = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bMultiplicacion = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        bResta = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bSuma = new javax.swing.JButton();
        bPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.green);
        setResizable(false);

        resultado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        resultado.setText("0");
        resultado.setFocusable(false);

        b8.setText("8");
        b8.setMaximumSize(new java.awt.Dimension(25, 25));
        b8.setMinimumSize(new java.awt.Dimension(100, 100));
        b8.setPreferredSize(new java.awt.Dimension(50, 50));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setText("7");
        b7.setMaximumSize(new java.awt.Dimension(25, 25));
        b7.setMinimumSize(new java.awt.Dimension(100, 100));
        b7.setPreferredSize(new java.awt.Dimension(50, 50));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.setMaximumSize(new java.awt.Dimension(25, 25));
        b9.setMinimumSize(new java.awt.Dimension(100, 100));
        b9.setPreferredSize(new java.awt.Dimension(50, 50));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bDivision.setText("/");
        bDivision.setMaximumSize(new java.awt.Dimension(25, 25));
        bDivision.setMinimumSize(new java.awt.Dimension(100, 100));
        bDivision.setPreferredSize(new java.awt.Dimension(50, 50));
        bDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivisionActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.setMaximumSize(new java.awt.Dimension(25, 25));
        b5.setMinimumSize(new java.awt.Dimension(100, 100));
        b5.setPreferredSize(new java.awt.Dimension(50, 50));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.setMaximumSize(new java.awt.Dimension(25, 25));
        b4.setMinimumSize(new java.awt.Dimension(100, 100));
        b4.setPreferredSize(new java.awt.Dimension(50, 50));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.setMaximumSize(new java.awt.Dimension(25, 25));
        b6.setMinimumSize(new java.awt.Dimension(100, 100));
        b6.setPreferredSize(new java.awt.Dimension(50, 50));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bMultiplicacion.setText("*");
        bMultiplicacion.setMaximumSize(new java.awt.Dimension(25, 25));
        bMultiplicacion.setMinimumSize(new java.awt.Dimension(100, 100));
        bMultiplicacion.setPreferredSize(new java.awt.Dimension(50, 50));
        bMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplicacionActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.setMaximumSize(new java.awt.Dimension(25, 25));
        b2.setMinimumSize(new java.awt.Dimension(100, 100));
        b2.setPreferredSize(new java.awt.Dimension(50, 50));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setText("1");
        b1.setMaximumSize(new java.awt.Dimension(25, 25));
        b1.setMinimumSize(new java.awt.Dimension(100, 100));
        b1.setPreferredSize(new java.awt.Dimension(50, 50));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bResta.setText("-");
        bResta.setMaximumSize(new java.awt.Dimension(25, 25));
        bResta.setMinimumSize(new java.awt.Dimension(100, 100));
        bResta.setPreferredSize(new java.awt.Dimension(50, 50));
        bResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestaActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.setMaximumSize(new java.awt.Dimension(25, 25));
        b3.setMinimumSize(new java.awt.Dimension(100, 100));
        b3.setPreferredSize(new java.awt.Dimension(50, 50));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b0.setText("0");
        b0.setMaximumSize(new java.awt.Dimension(25, 25));
        b0.setMinimumSize(new java.awt.Dimension(100, 100));
        b0.setPreferredSize(new java.awt.Dimension(50, 50));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bSuma.setText("+");
        bSuma.setMaximumSize(new java.awt.Dimension(25, 25));
        bSuma.setMinimumSize(new java.awt.Dimension(100, 100));
        bSuma.setPreferredSize(new java.awt.Dimension(50, 50));
        bSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumaActionPerformed(evt);
            }
        });

        bPunto.setText(".");
        bPunto.setMaximumSize(new java.awt.Dimension(25, 25));
        bPunto.setMinimumSize(new java.awt.Dimension(100, 100));
        bPunto.setPreferredSize(new java.awt.Dimension(50, 50));
        bPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultado)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        escribir('7');
    }//GEN-LAST:event_b7ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        escribir('1');
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        escribir('2');
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        escribir('3');
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        escribir('4');
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        escribir('5');
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        escribir('6');
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        escribir('8');
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        escribir('9');
    }//GEN-LAST:event_b9ActionPerformed

    private void bDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivisionActionPerformed
        operar();
        resultado.setText("0");
        operacion = modelo.division;
    }//GEN-LAST:event_bDivisionActionPerformed

    private void bMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiplicacionActionPerformed
        operar();
        operacion = modelo.multiplicacion;
    }//GEN-LAST:event_bMultiplicacionActionPerformed

    private void bRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestaActionPerformed
        operar();
        operacion = modelo.resta;
    }//GEN-LAST:event_bRestaActionPerformed

    private void bSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumaActionPerformed
        operar();
        operacion = modelo.suma;
    }//GEN-LAST:event_bSumaActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        escribir('0');
    }//GEN-LAST:event_b0ActionPerformed

    private void bPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPuntoActionPerformed
        escribir('.');
    }//GEN-LAST:event_bPuntoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bDivision;
    private javax.swing.JButton bMultiplicacion;
    private javax.swing.JButton bPunto;
    private javax.swing.JButton bResta;
    private javax.swing.JButton bSuma;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}

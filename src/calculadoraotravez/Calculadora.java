/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadoraotravez;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.InputEvent;
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
    EscuchadorAuxiliar esc;
    Modelo.Operacion operacion;

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        modelo = new Modelo();
        esc = new EscuchadorAuxiliar();
        operacion = modelo.inicial;
        operadorPulsado = primerNumero = puntoPulsado = escribiendoNum = false;
        initComponents();
        keyBindings();
        escuchadorComponentes();
        System.out.println("" + bPunto.getAccessibleContext());
    }

    private void keyBindings() {

        //Boton 0
        this.b0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0,
                        NORMAL), "0");
        this.b0.getActionMap().put("0", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b0.doClick();
            }
        });
        this.b0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_0,
                        NORMAL), "0");
        this.b0.getActionMap().put("0", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b0.doClick();
            }
        });
        //**********************************************************************
        //Boton 1
        this.b1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1,
                        NORMAL), "1");
        this.b1.getActionMap().put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b1.doClick();
            }
        });
        this.b1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_1,
                        NORMAL), "1");
        this.b1.getActionMap().put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b1.doClick();
            }
        });
        //**********************************************************************
        //Boton 2
        this.b2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2,
                        NORMAL), "2");
        this.b2.getActionMap().put("2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b2.doClick();
            }
        });
        this.b2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_2,
                        NORMAL), "2");
        this.b2.getActionMap().put("2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b2.doClick();
            }
        });
        //**********************************************************************
        //Boton 3
        this.b3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3,
                        NORMAL), "3");
        this.b3.getActionMap().put("3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b3.doClick();
            }
        });
        this.b3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_3,
                        NORMAL), "3");
        this.b3.getActionMap().put("3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b3.doClick();
            }
        });
        //**********************************************************************
        //Boton 4
        this.b4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4,
                        NORMAL), "4");
        this.b4.getActionMap().put("4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b4.doClick();
            }
        });
        this.b4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_4,
                        NORMAL), "4");
        this.b4.getActionMap().put("4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b4.doClick();
            }
        });
        //**********************************************************************
        //Boton 5
        this.b5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5,
                        NORMAL), "5");
        this.b5.getActionMap().put("5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b5.doClick();
            }
        });
        this.b5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_5,
                        NORMAL), "5");
        this.b5.getActionMap().put("5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b5.doClick();
            }
        });
        //**********************************************************************
        //Boton 6
        this.b6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6,
                        NORMAL), "6");
        this.b6.getActionMap().put("6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b6.doClick();
            }
        });
        this.b6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_6,
                        NORMAL), "6");
        this.b6.getActionMap().put("6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b6.doClick();
            }
        });
        //**********************************************************************
        //Boton 7
        this.b7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7,
                        NORMAL), "7");
        this.b7.getActionMap().put("7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b7.doClick();
            }
        });
        this.b7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_7,
                        NORMAL), "7");
        this.b7.getActionMap().put("7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b7.doClick();
            }
        });
        //**********************************************************************
        //Boton 8
        this.b8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8,
                        NORMAL), "8");
        this.b8.getActionMap().put("8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b8.doClick();
            }
        });
        this.b8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_8,
                        NORMAL), "8");
        this.b8.getActionMap().put("8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b8.doClick();
            }
        });
        //**********************************************************************
        //Boton 9
        this.b9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9,
                        NORMAL), "9");
        this.b9.getActionMap().put("9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b9.doClick();
            }
        });
        this.b9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_9,
                        NORMAL), "9");
        this.b9.getActionMap().put("9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b9.doClick();
            }
        });
        //**********************************************************************
        //Boton Division
        this.bDivision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE,
                        NORMAL), "/");
        this.bDivision.getActionMap().put("/", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bDivision.doClick();
            }
        });
        this.bDivision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_7,
                        InputEvent.SHIFT_DOWN_MASK), "/");
        this.bDivision.getActionMap().put("/", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bDivision.doClick();
            }
        });
        //**********************************************************************
        //Boton Multiplicacion
        this.bMultiplicacion.
                getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS,
                        InputEvent.SHIFT_DOWN_MASK), "*");
        this.bMultiplicacion.getActionMap().put("*", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bMultiplicacion.doClick();
            }
        });
        this.bMultiplicacion.
                getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY,
                        NORMAL), "*");
        this.bMultiplicacion.getActionMap().put("*", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bMultiplicacion.doClick();
            }
        });
        //**********************************************************************c
        //Boton Suma
        this.bSuma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD,
                        NORMAL), "+");
        this.bSuma.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bSuma.doClick();
            }
        });
        this.bSuma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS,
                        NORMAL), "+");
        this.bSuma.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bSuma.doClick();
            }
        });
        //**********************************************************************
        //Boton Resta
        this.bResta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT,
                        NORMAL), "-");
        this.bResta.getActionMap().put("-", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bResta.doClick();
            }
        });
        this.bResta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS,
                        NORMAL), "-");
        this.bResta.getActionMap().put("-", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bResta.doClick();
            }
        });
        //**********************************************************************
        //Boton Punto
        this.bPunto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL,
                        NORMAL), ".");
        this.bPunto.getActionMap().put(".", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bPunto.doClick();
            }
        });
        this.bPunto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD,
                        NORMAL), ".");
        this.bPunto.getActionMap().put(".", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bPunto.doClick();
            }
        });
    }

    private void escuchadorComponentes() {
        Font f;
        for (Component componente : this.jPanel1.getComponents()) {
            if (componente.getAccessibleContext() == bPunto.getAccessibleContext()) {
                f = new Font(componente.getFont().getFontName(),
                        componente.getFont().getStyle(),
                        componente.getHeight());
            } else {
                f = new Font(componente.getFont().getFontName(),
                        componente.getFont().getStyle(),
                        componente.getHeight() / 3);
            }

            componente.setFont(f);
            componente.addComponentListener(esc);
        }
        System.out.println("" + this.jPanel1.getComponents().length);
    }

    private boolean operar() {
        boolean seHaEjecutado = true;

        if (escribiendoNum) {

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

    private class EscuchadorAuxiliar implements ComponentListener {

        EscuchadorAuxiliar() {
        }

        @Override
        public void componentResized(ComponentEvent evento) {
            Font f;
            Component componente = evento.getComponent();
            componente.getFont().getAttributes();
            if (componente.getAccessibleContext() == bPunto.getAccessibleContext()) {
                f = new Font(componente.getFont().getFontName(),
                        componente.getFont().getStyle(),
                        componente.getHeight());
            } else {
                f = new Font(componente.getFont().getFontName(),
                        componente.getFont().getStyle(),
                        componente.getHeight() / 3);
            }
            componente.setFont(f);
        }

        @Override
        public void componentMoved(ComponentEvent e) {

        }

        @Override
        public void componentShown(ComponentEvent e) {

        }

        @Override
        public void componentHidden(ComponentEvent e) {

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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        resultado = new javax.swing.JTextField();
        b0 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bSuma = new javax.swing.JButton();
        bResta = new javax.swing.JButton();
        bMultiplicacion = new javax.swing.JButton();
        bDivision = new javax.swing.JButton();
        bPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.green);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.columnWeights = new double[] {1.0};
        jPanel1Layout.rowWeights = new double[] {1.0};
        jPanel1.setLayout(jPanel1Layout);

        resultado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        resultado.setText("0");
        resultado.setFocusable(false);
        resultado.setNextFocusableComponent(b7);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(resultado, gridBagConstraints);

        b0.setText("0");
        b0.setMaximumSize(new java.awt.Dimension(25, 25));
        b0.setMinimumSize(new java.awt.Dimension(100, 100));
        b0.setPreferredSize(new java.awt.Dimension(50, 50));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b0, gridBagConstraints);

        b1.setText("1");
        b1.setMaximumSize(new java.awt.Dimension(25, 25));
        b1.setMinimumSize(new java.awt.Dimension(100, 100));
        b1.setPreferredSize(new java.awt.Dimension(50, 50));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b1, gridBagConstraints);

        b2.setText("2");
        b2.setMaximumSize(new java.awt.Dimension(25, 25));
        b2.setMinimumSize(new java.awt.Dimension(100, 100));
        b2.setPreferredSize(new java.awt.Dimension(50, 50));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b2, gridBagConstraints);

        b3.setText("3");
        b3.setMaximumSize(new java.awt.Dimension(25, 25));
        b3.setMinimumSize(new java.awt.Dimension(100, 100));
        b3.setPreferredSize(new java.awt.Dimension(50, 50));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b3, gridBagConstraints);

        b4.setText("4");
        b4.setMaximumSize(new java.awt.Dimension(25, 25));
        b4.setMinimumSize(new java.awt.Dimension(100, 100));
        b4.setPreferredSize(new java.awt.Dimension(50, 50));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b4, gridBagConstraints);

        b5.setText("5");
        b5.setMaximumSize(new java.awt.Dimension(25, 25));
        b5.setMinimumSize(new java.awt.Dimension(100, 100));
        b5.setPreferredSize(new java.awt.Dimension(50, 50));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b5, gridBagConstraints);

        b6.setText("6");
        b6.setMaximumSize(new java.awt.Dimension(25, 25));
        b6.setMinimumSize(new java.awt.Dimension(100, 100));
        b6.setPreferredSize(new java.awt.Dimension(50, 50));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b6, gridBagConstraints);

        b7.setText("7");
        b7.setMaximumSize(new java.awt.Dimension(25, 25));
        b7.setMinimumSize(new java.awt.Dimension(100, 100));
        b7.setPreferredSize(new java.awt.Dimension(50, 50));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b7, gridBagConstraints);

        b8.setText("8");
        b8.setMaximumSize(new java.awt.Dimension(25, 25));
        b8.setMinimumSize(new java.awt.Dimension(100, 100));
        b8.setPreferredSize(new java.awt.Dimension(50, 50));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b8, gridBagConstraints);

        b9.setText("9");
        b9.setMaximumSize(new java.awt.Dimension(25, 25));
        b9.setMinimumSize(new java.awt.Dimension(100, 100));
        b9.setPreferredSize(new java.awt.Dimension(50, 50));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(b9, gridBagConstraints);

        bSuma.setText("+");
        bSuma.setMaximumSize(new java.awt.Dimension(25, 25));
        bSuma.setMinimumSize(new java.awt.Dimension(100, 100));
        bSuma.setPreferredSize(new java.awt.Dimension(50, 50));
        bSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(bSuma, gridBagConstraints);

        bResta.setText("-");
        bResta.setMaximumSize(new java.awt.Dimension(25, 25));
        bResta.setMinimumSize(new java.awt.Dimension(100, 100));
        bResta.setPreferredSize(new java.awt.Dimension(50, 50));
        bResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(bResta, gridBagConstraints);

        bMultiplicacion.setText("*");
        bMultiplicacion.setMaximumSize(new java.awt.Dimension(25, 25));
        bMultiplicacion.setMinimumSize(new java.awt.Dimension(100, 100));
        bMultiplicacion.setPreferredSize(new java.awt.Dimension(50, 50));
        bMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplicacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(bMultiplicacion, gridBagConstraints);

        bDivision.setText("/");
        bDivision.setMaximumSize(new java.awt.Dimension(25, 25));
        bDivision.setMinimumSize(new java.awt.Dimension(100, 100));
        bDivision.setPreferredSize(new java.awt.Dimension(50, 50));
        bDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(bDivision, gridBagConstraints);

        bPunto.setText(".");
        bPunto.setMaximumSize(new java.awt.Dimension(25, 25));
        bPunto.setMinimumSize(new java.awt.Dimension(100, 100));
        bPunto.setPreferredSize(new java.awt.Dimension(50, 50));
        bPunto.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        bPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(bPunto, gridBagConstraints);

        getContentPane().add(jPanel1);

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
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}

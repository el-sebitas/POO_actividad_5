package Ejercicio_3.Excepciones.UI;

import Ejercicio_3.Excepciones.CalculosNumericos;

import javax.swing.*;
import java.util.InputMismatchException;

public class Raiz extends javax.swing.JFrame {

    public Raiz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ResultadoLabel = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VariableText = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Raíz cuadrada");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Resultado:");

        ResultadoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ResultadoLabel.setText(" ");

        BtnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnIngresar.setText("Ingresar");
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
        });
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese valor:");

        jScrollPane1.setViewportView(VariableText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnIngresar)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ResultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(ResultadoLabel))
                                .addGap(18, 18, 18)
                                .addComponent(BtnIngresar)
                                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {
        Double resultado;

        try {
            double variable = Double.valueOf(VariableText.getText());
            resultado = CalculosNumericos.raiz(variable);
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Valor no valido");
            resultado = 0.0;
            JOptionPane.showMessageDialog(null,"Valor no valido");
        }
        ResultadoLabel.setText(Double.toString(resultado));
    }

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JButton BtnIngresar;
    private javax.swing.JLabel ResultadoLabel;
    private javax.swing.JTextPane VariableText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
}
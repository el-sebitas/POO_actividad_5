package Ejercicio_4.Excepciones.UI;

import Ejercicio_4.Excepciones.EquipoMaratonProgramacion;
import Ejercicio_4.Excepciones.Programador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProgramadorV extends JFrame {
    private EquipoMaratonProgramacion equipo;

    public ProgramadorV(EquipoMaratonProgramacion equipo) {
        initComponents();
        this.equipo = equipo;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jScrollPane1 = new JScrollPane();
        NombreText = new JTextPane();
        jLabel3 = new JLabel();
        jScrollPane2 = new JScrollPane();
        ApellidoText = new JTextPane();
        BtnIngresar = new JButton();
        jLabel4 = new JLabel();
        CuposLabel = new JLabel();
        BtnIntegrantes = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ProgramadorV");

        jLabel2.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jScrollPane1.setViewportView(NombreText);

        jLabel3.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jScrollPane2.setViewportView(ApellidoText);

        BtnIngresar.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        BtnIngresar.setText("Ingresar");
        BtnIngresar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
        });
        BtnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cupos restantes");

        CuposLabel.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        CuposLabel.setText("3");

        BtnIntegrantes.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        BtnIntegrantes.setText("Ver integrantes");
        BtnIntegrantes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                BtnIntegrantesMouseClicked(evt);
            }
        });
        BtnIntegrantes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BtnIntegrantesActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel3)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jScrollPane2))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(48, 48, 48)
                                                                        .addComponent(BtnIngresar)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(BtnIntegrantes))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel4)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(CuposLabel, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(CuposLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnIngresar)
                                        .addComponent(BtnIntegrantes))
                                .addGap(69, 69, 69))
        );

        pack();
    }

    private void BtnIngresarMouseClicked(MouseEvent evt) {
        // TODO add your handling code here:
        boolean ingresar = true;
        String nombre = ""; String apellido = "";
        try {
            nombre = NombreText.getText();
            EquipoMaratonProgramacion.validar(nombre);
            apellido = ApellidoText.getText();
            EquipoMaratonProgramacion.validar(apellido);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            ingresar = false;
        }

        if (ingresar) {
            Programador programador = new Programador(apellido, nombre);
            try {
                equipo.añadirProgramador(programador);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        String cupos = Integer.toString(3 - equipo.numEquipo);
        CuposLabel.setText(cupos);

    }

    private void BtnIngresarActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnIntegrantesMouseClicked(MouseEvent evt) {
        // TODO add your handling code here:
        String mensaje = "";

        if (equipo.programadores.size() != 0) {
            for (Programador p: equipo.programadores) {
                mensaje += p.nombre + " " + p.apellido + "\n";
            }
        } else {
            mensaje = "No hay integrantes";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    private void BtnIntegrantesActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private JTextPane ApellidoText;
    private JButton BtnIngresar;
    private JButton BtnIntegrantes;
    private JLabel CuposLabel;
    private JTextPane NombreText;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
}

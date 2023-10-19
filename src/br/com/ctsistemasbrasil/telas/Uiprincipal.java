/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ctsistemasbrasil.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author edmar
 */
public class Uiprincipal extends javax.swing.JFrame {

    

    public Uiprincipal() {
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

        desktop = new javax.swing.JDesktopPane();
        usuario = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menvisucli = new javax.swing.JMenu();
        mencadasofc = new javax.swing.JMenuItem();
        menfun = new javax.swing.JMenu();
        Funcionario = new javax.swing.JMenuItem();
        menoptions = new javax.swing.JMenu();
        ajudaofc = new javax.swing.JMenuItem();
        suporte = new javax.swing.JMenu();
        suporteofc = new javax.swing.JMenuItem();
        fecha = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Ótica");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuario.setText("Usuario");

        lbldata.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbldata.setText("Data:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ctsistemasbrasil/icones/ctsemfundo.png"))); // NOI18N

        menvisucli.setText("Clientes");

        mencadasofc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mencadasofc.setText("Cliente");
        mencadasofc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mencadasofcActionPerformed(evt);
            }
        });
        menvisucli.add(mencadasofc);

        menu.add(menvisucli);

        menfun.setText("Funcionarios");
        menfun.setEnabled(false);
        menfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menfunActionPerformed(evt);
            }
        });

        Funcionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Funcionario.setText("Funcionarios");
        Funcionario.setEnabled(false);
        Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioActionPerformed(evt);
            }
        });
        menfun.add(Funcionario);

        menu.add(menfun);

        menoptions.setText("Opções");

        ajudaofc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ajudaofc.setText("Preciso de Ajuda");
        menoptions.add(ajudaofc);

        suporte.setText("Suporte");

        suporteofc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        suporteofc.setText("Suporte");
        suporteofc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suporteofcActionPerformed(evt);
            }
        });
        suporte.add(suporteofc);

        menoptions.add(suporte);

        fecha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        fecha.setText("Sair");
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        menoptions.add(fecha);

        sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        menoptions.add(sobre);

        menu.add(menoptions);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbldata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(usuario)
                .addGap(4, 4, 4)
                .addComponent(lbldata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void suporteofcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suporteofcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suporteofcActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
     //exibir uma caixa de dialogo
     
     int sair = JOptionPane.showConfirmDialog(null, "Tem Certeza Que Deseja Sair?","Atenção",JOptionPane.YES_NO_OPTION);
     if(sair == JOptionPane.YES_OPTION){
         System.exit(0);
     }
    }//GEN-LAST:event_fechaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// subtitui a label data pela a data do sistema
Date data = new Date();
DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
lbldata.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        // chamando Uisobre
     Uisobre sobre = new Uisobre();
     sobre.setVisible(true);
    }//GEN-LAST:event_sobreActionPerformed

    private void FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionarioActionPerformed
           //abrir o form  uiusuario dentro do desktop
        
        Uifuncionario funcionario = new Uifuncionario();
        funcionario.setVisible(true);
        desktop.add(funcionario);
    }//GEN-LAST:event_FuncionarioActionPerformed

    private void menfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menfunActionPerformed
                    
    }//GEN-LAST:event_menfunActionPerformed

    private void mencadasofcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mencadasofcActionPerformed
        UiCliente cliente = new UiCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_mencadasofcActionPerformed

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
            java.util.logging.Logger.getLogger(Uiprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uiprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uiprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uiprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uiprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem Funcionario;
    private javax.swing.JMenuItem ajudaofc;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbldata;
    private javax.swing.JMenuItem mencadasofc;
    public static javax.swing.JMenu menfun;
    private javax.swing.JMenu menoptions;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menvisucli;
    private javax.swing.JMenuItem sobre;
    private javax.swing.JMenu suporte;
    private javax.swing.JMenuItem suporteofc;
    public static javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.ctsistemasbrasil.telas;

import java.sql.*;
import net.proteanit.sql.DbUtils;
import br.com.ctsistemasbrasil.dal.ModuloConexao;
import javax.swing.JOptionPane;

public class UiCliente extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public UiCliente() {
        initComponents();
        conexao = ModuloConexao.conector();
        
    }

    public void adicionar() {
        String sql = "insert into tbclientes(nomecli,telefone,odesferic,odcilindri,odeixo,oddp,oeesferic,oecilindri,oeeixo,oedp,ae,ac,aee,adp,data_de_nascimento,idade,juo,uv,endereco) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nomedocliente.getText());
            pst.setString(2, telefone.getText());
            pst.setString(3, ode.getText());
            pst.setString(4, odc.getText());
            pst.setString(5, odee.getText());
            pst.setString(6, oddp.getText());
            pst.setString(7, oee.getText());
            pst.setString(8, oec.getText());
            pst.setString(9, oeee.getText());
            pst.setString(10, oedp.getText());
            pst.setString(11, ade.getText());
            pst.setString(12, adc.getText());
            pst.setString(13, adee.getText());
            pst.setString(14, addp.getText());
            pst.setString(15, datadenas.getText());
            pst.setString(16, idade.getText());
            pst.setString(17, juo.getSelectedItem().toString());
            pst.setString(18, uv.getText());
            pst.setString(19, enderenco.getText());
            if (nomedocliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Precha Todos os Campos obrigatorios (*)");
            } else {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso😄");
                nomedocliente.setText(null);
                telefone.setText(null);
                ode.setText(null);
                odc.setText(null);
                odee.setText(null);
                oee.setText(null);
                oec.setText(null);
                oeee.setText(null);
                ade.setText(null);
                adee.setText(null);
                addp.setText(null);
                datadenas.setText(null);
                idade.setText(null);
                juo.setSelectedItem(null);
                uv.setText(null);
                enderenco.setText(null);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " erro ☹️");
        }
    }

    private void pesquisar() {
        String sql = "select * from tbclientes where nomecli like ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, pesquisa.getText() + "%");
            rs = pst.executeQuery();
            pesquisaform.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " erro ☹️");
        }
    }

    private void setcampos() {
        int set = pesquisaform.getSelectedRow();
        id.setText(pesquisaform.getModel().getValueAt(set, 0).toString());
        nomedocliente.setText(pesquisaform.getModel().getValueAt(set, 1).toString());
        telefone.setText(pesquisaform.getModel().getValueAt(set, 2).toString());
        ode.setText(pesquisaform.getModel().getValueAt(set, 3).toString());
        odc.setText(pesquisaform.getModel().getValueAt(set, 4).toString());
        odee.setText(pesquisaform.getModel().getValueAt(set, 5).toString());
        oddp.setText(pesquisaform.getModel().getValueAt(set, 6).toString());
        oee.setText(pesquisaform.getModel().getValueAt(set, 7).toString());
        oec.setText(pesquisaform.getModel().getValueAt(set, 8).toString());
        oeee.setText(pesquisaform.getModel().getValueAt(set, 9).toString());
        oedp.setText(pesquisaform.getModel().getValueAt(set, 10).toString());
        ade.setText(pesquisaform.getModel().getValueAt(set, 11).toString());
        adc.setText(pesquisaform.getModel().getValueAt(set, 12).toString());
        adee.setText(pesquisaform.getModel().getValueAt(set, 13).toString());
        addp.setText(pesquisaform.getModel().getValueAt(set, 14).toString());
        datadenas.setText(pesquisaform.getModel().getValueAt(set, 15).toString());
        idade.setText(pesquisaform.getModel().getValueAt(set, 16).toString());
        juo.setSelectedItem(pesquisaform.getModel().getValueAt(set ,17).toString());
        enderenco.setText(pesquisaform.getModel().getValueAt(set, 19).toString());

    }
    private void alterar(){
        String sql = "update tbclientes set telefone=?,odesferic=?,odcilindri=?,odeixo=?,oddp=?,oeesferic=?,oecilindri=?,oeeixo=?,oedp=?,ae=?,ac=?,aee=?,adp=?,data_de_nascimento=?,idade=?,juo=?,uv=?, endereco=? where idcli=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telefone.getText());
            pst.setString(2, ode.getText());
            pst.setString(3, odc.getText());
            pst.setString(4, odee.getText());
            pst.setString(5, oddp.getText());
            pst.setString(6, oee.getText());
            pst.setString(7, oec.getText());
            pst.setString(8, oeee.getText());
            pst.setString(9, oedp.getText());
            pst.setString(10, ade.getText());
            pst.setString(11, adc.getText());
            pst.setString(12, adee.getText());
            pst.setString(13, addp.getText());
            pst.setString(14, datadenas.getText());
            pst.setString(15, idade.getText());
            pst.setString(16, juo.getSelectedItem().toString());
            pst.setString(17, uv.getText());
            pst.setString(19, id.getText());
            pst.setString(18, enderenco.getText());
            pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente editado com sucesso😄");
           
            

        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e + " erro ☹️");
                        JOptionPane.showMessageDialog(rootPane, "Infelizmente um erro acaba de acontece consulte o suporte");
        }
    }
 private void deletar(){
     String sql = "delete from tbclientes where idcli=?";
     try {
         pst = conexao.prepareStatement(sql);
         pst.setString(1, id.getText());
         nomedocliente.setText(null);
         telefone.setText(null);
         datadenas.setText(null);
         idade.setText(null);
         uv.setText(null);
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e + " erro ☹️");
         JOptionPane.showMessageDialog(rootPane, "Infelizmente um erro acaba de acontece consulte o suporte");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomedocliente = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        datadenas = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        juo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        uv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 60), new java.awt.Dimension(0, 60), new java.awt.Dimension(32767, 60));
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ode = new javax.swing.JTextField();
        odc = new javax.swing.JTextField();
        odee = new javax.swing.JTextField();
        oddp = new javax.swing.JTextField();
        oee = new javax.swing.JTextField();
        oec = new javax.swing.JTextField();
        oeee = new javax.swing.JTextField();
        oedp = new javax.swing.JTextField();
        ade = new javax.swing.JTextField();
        adc = new javax.swing.JTextField();
        adee = new javax.swing.JTextField();
        addp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        pesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pesquisaform = new javax.swing.JTable();
        add = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        enderenco = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(877, 598));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Nome Do Cliente*");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Telefone");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Data de Nas.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Idade");

        nomedocliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        telefone.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        datadenas.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        idade.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Já Usa Óculos");

        juo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        juo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não", " " }));
        juo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Ultima Visita");

        uv.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setText("OD");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setText("OE");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel10.setText("ESFÉRICO");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel11.setText("AD");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel12.setText("CILINDRO");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel13.setText("EIXO");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel14.setText("DP");

        oee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oeeActionPerformed(evt);
            }
        });

        oec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oecActionPerformed(evt);
            }
        });

        adee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adeeActionPerformed(evt);
            }
        });

        pesquisa.setText("Pesquisa");
        pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisaMouseClicked(evt);
            }
        });
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });
        pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaKeyReleased(evt);
            }
        });

        pesquisaform.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nome"
            }
        ));
        pesquisaform.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisaformMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pesquisaform);

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ctsistemasbrasil/icones/add (2).png"))); // NOI18N
        add.setPreferredSize(new java.awt.Dimension(80, 80));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ctsistemasbrasil/icones/remove.png"))); // NOI18N
        deletar.setPreferredSize(new java.awt.Dimension(80, 80));
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ctsistemasbrasil/icones/edit.png"))); // NOI18N
        editar.setPreferredSize(new java.awt.Dimension(80, 80));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel16.setText("Descrição:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel17.setText("* Campo obrigatorio");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel18.setText("Avançado");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel19.setText("id do cliente");

        id.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        id.setText("00");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel21.setText("Enderenço");

        enderenco.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jMenu1.setText("opções");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("adicionar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("deletar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setText("alterar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(nomedocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addComponent(datadenas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(juo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(uv, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel10)
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addGap(74, 74, 74)
                .addComponent(jLabel14))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(ode, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(odc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(odee, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(oddp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel21))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(oee, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(oec, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(oeee, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(oedp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(enderenco, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(ade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(adc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adee, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(523, 523, 523)
                .addComponent(jLabel18)
                .addGap(61, 61, 61)
                .addComponent(jLabel16))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jLabel19)
                .addGap(12, 12, 12)
                .addComponent(id)
                .addGap(13, 13, 13)
                .addComponent(jLabel17))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomedocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(datadenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(juo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(uv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(odc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(odee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(oddp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(oee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(oec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(oeee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(oedp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(enderenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(id))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel17)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add.getAccessibleContext().setAccessibleDescription("Adicionar Cliente");
        deletar.getAccessibleContext().setAccessibleDescription("Remover Cliente");
        editar.getAccessibleContext().setAccessibleDescription("Editar Cliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oecActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void oeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oeeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        adicionar();
    }//GEN-LAST:event_addActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseClicked

    private void pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaKeyReleased
        pesquisar();

    }//GEN-LAST:event_pesquisaKeyReleased

    private void juoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juoActionPerformed

    private void pesquisaformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisaformMouseClicked
        setcampos();
    }//GEN-LAST:event_pesquisaformMouseClicked

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
alterar();
    }//GEN-LAST:event_editarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
deletar();
    }//GEN-LAST:event_deletarActionPerformed

    private void pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisaMouseClicked
    }//GEN-LAST:event_pesquisaMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       adicionar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        deletar();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        alterar();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void adeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adc;
    public javax.swing.JButton add;
    private javax.swing.JTextField addp;
    private javax.swing.JTextField ade;
    private javax.swing.JTextField adee;
    private javax.swing.JTextField datadenas;
    private javax.swing.JButton deletar;
    private javax.swing.JButton editar;
    private javax.swing.JTextField enderenco;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> juo;
    private javax.swing.JTextField nomedocliente;
    private javax.swing.JTextField odc;
    private javax.swing.JTextField oddp;
    private javax.swing.JTextField ode;
    private javax.swing.JTextField odee;
    private javax.swing.JTextField oec;
    private javax.swing.JTextField oedp;
    private javax.swing.JTextField oee;
    private javax.swing.JTextField oeee;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JTable pesquisaform;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField uv;
    // End of variables declaration//GEN-END:variables
}

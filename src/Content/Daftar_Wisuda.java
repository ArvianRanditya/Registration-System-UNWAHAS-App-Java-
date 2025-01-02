/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Content;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author Viann
 */
public class Daftar_Wisuda extends javax.swing.JPanel {
    int x=0;
    /**
     * Creates new form Daftar_KKN
     */
    public Daftar_Wisuda() {
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

        MainPanel = new javax.swing.JPanel();
        ForumPendaftaran = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFakultas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProdi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNomer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtKRS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSurat = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBdata = new javax.swing.JTable();
        Hapus = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new java.awt.CardLayout());

        ForumPendaftaran.setBackground(new java.awt.Color(255, 255, 255));

        Home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Home.setForeground(new java.awt.Color(0, 153, 153));
        Home.setText("Pendaftaran / Daftar Wisuda");

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("NIM");

        txtNIM.setBackground(new java.awt.Color(255, 255, 255));
        txtNIM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Fakultas");

        txtFakultas.setBackground(new java.awt.Color(255, 255, 255));
        txtFakultas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Program Studi");

        txtProdi.setBackground(new java.awt.Color(255, 255, 255));
        txtProdi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Alamat Lengkap");

        txtAlamat.setBackground(new java.awt.Color(255, 255, 255));
        txtAlamat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Nomer Telepon (WA Aktif)");

        txtNomer.setBackground(new java.awt.Color(255, 255, 255));
        txtNomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Kartu KRS (Link GDrive)");

        txtKRS.setBackground(new java.awt.Color(255, 255, 255));
        txtKRS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Surat Pengajuan Wisuda (Link GDrive)");

        txtSurat.setBackground(new java.awt.Color(255, 255, 255));
        txtSurat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));

        Submit.setBackground(new java.awt.Color(0, 102, 102));
        Submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("SUBMIT");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        TBdata.setBackground(new java.awt.Color(0, 102, 102));
        TBdata.setForeground(new java.awt.Color(255, 255, 255));
        TBdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Nim", "Fakultas", "Prodi", "Alamat", "No HP", "Kartu KRS", "Surat Pengajuan"
            }
        ));
        jScrollPane1.setViewportView(TBdata);

        Hapus.setBackground(new java.awt.Color(0, 102, 102));
        Hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Hapus.setText("BERSIHKAN");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ForumPendaftaranLayout = new javax.swing.GroupLayout(ForumPendaftaran);
        ForumPendaftaran.setLayout(ForumPendaftaranLayout);
        ForumPendaftaranLayout.setHorizontalGroup(
            ForumPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForumPendaftaranLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ForumPendaftaranLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ForumPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(ForumPendaftaranLayout.createSequentialGroup()
                        .addGroup(ForumPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(ForumPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtNomer, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtKRS, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ForumPendaftaranLayout.createSequentialGroup()
                                .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
        );
        ForumPendaftaranLayout.setVerticalGroup(
            ForumPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForumPendaftaranLayout.createSequentialGroup()
                .addComponent(Home)
                .addGap(24, 24, 24)
                .addGroup(ForumPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ForumPendaftaranLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ForumPendaftaranLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKRS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(ForumPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        MainPanel.add(ForumPendaftaran, "card2");

        add(MainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        TBdata.setValueAt(txtNama.getText(), x, 0);
        TBdata.setValueAt(txtNIM.getText(), x, 1);
        TBdata.setValueAt(txtFakultas.getText(), x, 2);
        TBdata.setValueAt(txtProdi.getText(), x, 3);
        TBdata.setValueAt(txtAlamat.getText(), x, 4);
        TBdata.setValueAt(txtNomer.getText(), x, 5);
        TBdata.setValueAt(txtKRS.getText(), x, 6);
        TBdata.setValueAt(txtSurat.getText(), x, 7);
        x = x+1;
    }//GEN-LAST:event_SubmitActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtNIM.setText("");
        txtFakultas.setText("");
        txtProdi.setText("");
        txtAlamat.setText("");
        txtNomer.setText("");
        txtKRS.setText("");
        txtSurat.setText("");     
    }//GEN-LAST:event_HapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ForumPendaftaran;
    private javax.swing.JButton Hapus;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Submit;
    private javax.swing.JTable TBdata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtFakultas;
    private javax.swing.JTextField txtKRS;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNomer;
    private javax.swing.JTextField txtProdi;
    private javax.swing.JTextField txtSurat;
    // End of variables declaration//GEN-END:variables
}

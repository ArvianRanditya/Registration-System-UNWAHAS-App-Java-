/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Content;

/**
 *
 * @author Viann
 */
public class Jadwal_PKL extends javax.swing.JPanel {

    /**
     * Creates new form Daftar_KKN
     */
    public Jadwal_PKL() {
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
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new java.awt.CardLayout());

        ForumPendaftaran.setBackground(new java.awt.Color(255, 255, 255));

        Home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Home.setForeground(new java.awt.Color(0, 153, 153));
        Home.setText("Tanggal Pelaksanaan / Jadwal PKL");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Jadwal_PKL.png"))); // NOI18N

        javax.swing.GroupLayout ForumPendaftaranLayout = new javax.swing.GroupLayout(ForumPendaftaran);
        ForumPendaftaran.setLayout(ForumPendaftaranLayout);
        ForumPendaftaranLayout.setHorizontalGroup(
            ForumPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForumPendaftaranLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ForumPendaftaranLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        ForumPendaftaranLayout.setVerticalGroup(
            ForumPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForumPendaftaranLayout.createSequentialGroup()
                .addComponent(Home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        MainPanel.add(ForumPendaftaran, "card2");

        add(MainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ForumPendaftaran;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

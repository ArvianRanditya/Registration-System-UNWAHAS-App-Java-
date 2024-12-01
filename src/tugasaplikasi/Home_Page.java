/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasaplikasi;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Viann
 */
public class Home_Page extends javax.swing.JFrame {

    /**
     * Creates new form Home_Page
     */
    public Home_Page() {
        initComponents();
        this.setExtendedState(Home_Page.MAXIMIZED_BOTH); //Agar fullscreen saat di run
        
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_navbar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pn_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_menu = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_navbar.setBackground(new java.awt.Color(0, 204, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo UNWAHAS.png"))); // NOI18N

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_navbarLayout.createSequentialGroup()
                .addContainerGap(624, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setBackground(new java.awt.Color(255, 255, 255));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(250, 330));

        jScrollPane1.setBorder(null);

        pn_menu.setBackground(new java.awt.Color(255, 255, 255));
        pn_menu.setLayout(new javax.swing.BoxLayout(pn_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_menu);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_content.setBackground(new java.awt.Color(0, 204, 153));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(888, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_utama.add(new Content_BG());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_sidebar;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void execute() {
       ImageIcon iconHome = new ImageIcon(getClass().getResource("/Icon/Home.png")); 
       ImageIcon iconUser = new ImageIcon(getClass().getResource("/Icon/User.png"));
       ImageIcon iconDate = new ImageIcon(getClass().getResource("/Icon/Calendar.png"));
       ImageIcon iconDaftar = new ImageIcon(getClass().getResource("/Icon/Form.png"));
       
       MenuItem KKN = new MenuItem(null, true, iconDaftar, "Daftar KKN", null);
       MenuItem PKL_PPL = new MenuItem(null, true, iconDaftar, "Daftar PKL/PPL", null);
       MenuItem Wisuda = new MenuItem(null, true, iconDaftar, "Daftar Wisuda", null);
       
       MenuItem TanggalKKN = new MenuItem(null, true, iconDate, "Jadwal KKN", null);
       MenuItem TanggalPKL_PPL = new MenuItem(null, true, iconDate, "Jadwal PKL/PPL", null);
       MenuItem TanggalWisuda = new MenuItem(null, true, iconDate, "Jadwal Wisuda", null);

       MenuItem menuHome  = new MenuItem(iconHome, false, null, "Home", null);
       MenuItem menuDaftar  = new MenuItem(iconDaftar, false, null, "Pendaftaran", null, KKN, PKL_PPL, Wisuda);
       MenuItem menuTanggal  = new MenuItem(iconDate, false, null, "Tanggal Pelaksanaan", null, TanggalKKN, TanggalPKL_PPL, TanggalWisuda);
       MenuItem menuProfile  = new MenuItem(iconUser, false, null, "Profile", null);
       
       addMenu(menuHome, menuDaftar, menuTanggal, menuProfile);
    }
    
    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            pn_menu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        pn_menu.revalidate();
    }
}

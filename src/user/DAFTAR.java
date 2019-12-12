/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author fajriyan nur
 */
public class DAFTAR extends javax.swing.JFrame {

    /**
     * Creates new form Produk
     */
    public DAFTAR() {
        initComponents();
        Koneksi_DB();
        combo_jurusan();
        closefrem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        MASUK = new javax.swing.JButton();
        DAFTAR = new javax.swing.JButton();
        NAMA_DEPAN = new javax.swing.JTextField();
        EMAIL = new javax.swing.JTextField();
        NAMA_BELAKANG = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        R_LAKI = new javax.swing.JRadioButton();
        R_PEREMPUAN = new javax.swing.JRadioButton();
        PASSWORD = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SUKA = new javax.swing.JComboBox<>();
        BIO = new javax.swing.JTextField();
        STATUS = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAFTAR");

        MASUK.setText("MASUK");
        MASUK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASUKActionPerformed(evt);
            }
        });

        DAFTAR.setText("DAFTAR");
        DAFTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAFTARActionPerformed(evt);
            }
        });

        NAMA_DEPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMA_DEPANActionPerformed(evt);
            }
        });

        EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMAILActionPerformed(evt);
            }
        });

        NAMA_BELAKANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMA_BELAKANGActionPerformed(evt);
            }
        });

        jLabel2.setText("NAMA DEPAN*");

        jLabel3.setText("NAMA BELAKANG*");

        jLabel4.setText("EMAIL*");

        jLabel5.setText("PASSWORD*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel6.setText("*Wajib Di Isi");

        jLabel7.setText("JENIS KELAMIN*");

        buttonGroup1.add(R_LAKI);
        R_LAKI.setText("LAKI-LAKI");
        R_LAKI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_LAKIActionPerformed(evt);
            }
        });

        buttonGroup1.add(R_PEREMPUAN);
        R_PEREMPUAN.setText("PEREMPUAN");

        jLabel8.setText("BIO*");

        jLabel9.setText("HAL YANG DISUKA*");

        SUKA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUKAActionPerformed(evt);
            }
        });

        STATUS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USER", "MODERATOR" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DAFTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MASUK, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NAMA_DEPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(NAMA_BELAKANG)))
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R_LAKI)
                                        .addGap(18, 18, 18)
                                        .addComponent(R_PEREMPUAN))
                                    .addComponent(PASSWORD)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(SUKA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BIO))))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NAMA_DEPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NAMA_BELAKANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_LAKI)
                    .addComponent(R_PEREMPUAN))
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SUKA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BIO, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(DAFTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MASUK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MASUKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASUKActionPerformed
        closefrem();
        LOGIN login = new LOGIN();
        login.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MASUKActionPerformed

    private void DAFTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DAFTARActionPerformed
        try {
            DAFTARIN();
        } catch (SQLException ex) {
            Logger.getLogger(DAFTAR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DAFTARActionPerformed

    private void NAMA_DEPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMA_DEPANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMA_DEPANActionPerformed

    private void EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMAILActionPerformed

    private void NAMA_BELAKANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMA_BELAKANGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMA_BELAKANGActionPerformed

    private void R_LAKIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_LAKIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_LAKIActionPerformed

    private void SUKAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUKAActionPerformed
        combo_jurusan();
    }//GEN-LAST:event_SUKAActionPerformed
    
    /**
     * @param args the command line arguments
     */
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String URL_DB = "jdbc:mysql://localhost/uap-java-web";
    static final String username_db = "root";
    static final String password_db = "";
    static String sql,us,aaa,idd;
    
   
    static Connection conn;
    static Statement stmt;
    public PreparedStatement ps;
    static ResultSet hasil;
    static Scanner in = new Scanner (System.in);
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
            java.util.logging.Logger.getLogger(DAFTAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DAFTAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DAFTAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DAFTAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DAFTAR().setVisible(true);
            }
        });
    }
     static void Koneksi_DB(){
        try {
            Class.forName(JDBC_DRIVER);
            conn = (Connection) DriverManager.getConnection(URL_DB,username_db,password_db);
            stmt = (Statement) conn.createStatement();
            System.out.println("--- KONEKSI BERHASIL ---");
        } catch (Exception e) {
            System.out.println("--- KONEKSI GAGAL ---\n"+e);
        }
    }
     public void login() {
        
    }
     
       public void closefrem (){
           super.dispose();
       }
       
       public void DAFTARIN() throws SQLException{
           try {
            if (NAMA_DEPAN.getText().equals("") || NAMA_BELAKANG.getText().equals("") || EMAIL.getText().equals("")
                    || PASSWORD.getText().equals("")||buttonGroup1.equals("")||SUKA.equals("-- Pilih --")||BIO.equals("")) {
            JOptionPane.showMessageDialog(null, "Semua Data harus diisi");
            }else{
                String profil = (String) STATUS.getSelectedItem();
                if (profil=="USER"){
                    String sql2 = "insert into login(user ,pass, status, last_login) value ('"+ EMAIL.getText() + "','" + PASSWORD.getText()+"',2"+",now()"+")";
                    stmt.executeUpdate(sql2);
                    
                    String namalengkap = NAMA_DEPAN.getText() +" "+ NAMA_BELAKANG.getText(); 
                    String jenis = "";
                        if (R_LAKI.isSelected()) {
                            jenis = R_LAKI.getActionCommand();
                        } else if (R_PEREMPUAN.isSelected()) {
                            jenis = R_PEREMPUAN.getActionCommand();
                        }
                    String sql3 = "insert into user(nama, email, password,jk,suka,bio,daftar_pada) values ('"+namalengkap+ "','" + EMAIL.getText() + "','" + PASSWORD.getText()+ "','" +jenis+
                            "','"+SUKA.getSelectedItem()+"','"+BIO.getText()+"',now()"+")";
                    stmt.executeUpdate(sql3);
                    JOptionPane.showMessageDialog(null, "PENYIMPANAN BERHASIL");
                    
                }else if (profil=="MODERATOR"){
                    String sql2 = "insert into login(user ,pass, status, last_login) value ('"+ EMAIL.getText() + "','" + PASSWORD.getText()+"',3"+",now()"+")";
                    stmt.executeUpdate(sql2);
                    
                    String namalengkap = NAMA_DEPAN.getText() +" "+ NAMA_BELAKANG.getText(); 
                    String jenis = "";
                        if (R_LAKI.isSelected()) {
                            jenis = R_LAKI.getActionCommand();
                        } else if (R_PEREMPUAN.isSelected()) {
                            jenis = R_PEREMPUAN.getActionCommand();
                        }
                    String sql3 = "insert into user(nama, email, password,jk,suka,bio,daftar_pada) values ('"+namalengkap+ "','" + EMAIL.getText() + "','" + PASSWORD.getText()+ "','" +jenis+
                            "','"+SUKA.getSelectedItem()+"','"+BIO.getText()+"',now()"+")";
                    stmt.executeUpdate(sql3);
                    JOptionPane.showMessageDialog(null, "PENYIMPANAN BERHASIL");
                }
            
            }
           } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EROR NIH"+e);
           }        
       }
       private void combo_jurusan() {
        try {
            sql = "select * from kategori";
            hasil = stmt.executeQuery(sql);
            SUKA.addItem("-- Pilih --");
            while (hasil.next()) {
                SUKA.addItem(hasil.getString("suka"));
            }
            System.out.println(SUKA.getSelectedItem().toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
       
       
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BIO;
    private javax.swing.JButton DAFTAR;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JButton MASUK;
    private javax.swing.JTextField NAMA_BELAKANG;
    private javax.swing.JTextField NAMA_DEPAN;
    private javax.swing.JPasswordField PASSWORD;
    private javax.swing.JRadioButton R_LAKI;
    private javax.swing.JRadioButton R_PEREMPUAN;
    private javax.swing.JComboBox<String> STATUS;
    private javax.swing.JComboBox<String> SUKA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

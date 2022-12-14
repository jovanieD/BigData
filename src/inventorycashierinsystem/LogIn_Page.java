/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorycashierinsystem;

import Admin.Admin_Home_Cashier;
import Admin.Admin_Home_User;
import Cashier.Cashier;
import Inventory.Inventory_Page;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author student.admin
 */
public class LogIn_Page extends javax.swing.JFrame {

    public LogIn_Page() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dd = new javax.swing.JLabel();
        jlogin = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setText("Password : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(510, 430, 154, 33);

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel5.setText("L O G   I N");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(630, 190, 220, 60);

        jj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorycashierinsystem/img/Untitled-1.png"))); // NOI18N
        jj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jjMouseClicked(evt);
            }
        });
        jPanel1.add(jj);
        jj.setBounds(150, 220, 230, 210);

        jLabel1.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        jLabel1.setText("Create your Account NOW!");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(590, 640, 270, 25);

        dd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorycashierinsystem/img/vanie.png"))); // NOI18N
        dd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ddMouseClicked(evt);
            }
        });
        jPanel1.add(dd);
        dd.setBounds(130, 460, 70, 210);

        jlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorycashierinsystem/img/btn.png"))); // NOI18N
        jlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jloginMouseClicked(evt);
            }
        });
        jPanel1.add(jlogin);
        jlogin.setBounds(530, 570, 396, 52);

        jpassword.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jpassword);
        jpassword.setBounds(550, 500, 374, 48);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setText("Email : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 290, 112, 33);

        jemail.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        jemail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jemail);
        jemail.setBounds(550, 360, 374, 49);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorycashierinsystem/img/page.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, -20, 1110, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordActionPerformed

    private void jjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jjMouseClicked

    }//GEN-LAST:event_jjMouseClicked

    private void jloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jloginMouseClicked
        if (jemail.getText().equals("") || jpassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please input the required information");
        } else {
            try {
                

                BasicDBObject identify = new BasicDBObject();
                identify.put("Email", jemail.getText());
                identify.put("Password", jpassword.getText());

                BasicDBObject type1 = new BasicDBObject();
                type1.put("Role", "Admin");
                
                BasicDBObject type2 = new BasicDBObject();
                type2.put("Role", "Staff");
                
                BasicDBObject type3 = new BasicDBObject();
                type3.put("Role", "Cashier");

                MongoCursor<Document> query = collection.find(identify).iterator();
                MongoCursor<Document> s = collection.find(type1).iterator();
                MongoCursor<Document> r = collection.find(type2).iterator();
                MongoCursor<Document> v = collection.find(type3).iterator();

                if (query.hasNext()) {
                    if (s.hasNext()) {
                        new Admin_Home_Cashier().setVisible(true);
                        setVisible(false);
                    }else if (r.hasNext()) {
                        new Inventory_Page().setVisible(true);
                        setVisible(false);
                    }else if (v.hasNext()) {
                        new Cashier().setVisible(true);
                        setVisible(false);
                    }
                    

                } else {
                    JOptionPane.showMessageDialog(null, "Please input Correct Value!");
                }

            } catch (Exception Ex) {
                JOptionPane.showMessageDialog(this, Ex);
            }
        }
    }//GEN-LAST:event_jloginMouseClicked

    private void ddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ddMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new SignUp().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public void van() {
        jemail.getText();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn_Page().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jemail;
    private javax.swing.JLabel jj;
    private javax.swing.JLabel jlogin;
    private javax.swing.JPasswordField jpassword;
    // End of variables declaration//GEN-END:variables
}

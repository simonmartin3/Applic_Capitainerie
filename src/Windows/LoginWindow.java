/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Exception.LoginException;
import Classes.*;
import Exception.SailorWithoutIdentificationException;
import Exception.ShipWithoutIdentificationException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Simon
 */
public class LoginWindow extends javax.swing.JFrame {

    /**
     * Creates new form LoginWindow
     */
    
    Hashtable<String, String> hmap = new Hashtable<>();
    
    public LoginWindow() {
        // Création de 2 user
        hmap.put("Simon","1234"); 
        hmap.put("root","root");
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        // Authentification auto
        TextField_User.setText("root");
        PasswordField_Password.setText("root");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titre = new javax.swing.JLabel();
        Label_User = new javax.swing.JLabel();
        Label_Password = new javax.swing.JLabel();
        PasswordField_Password = new javax.swing.JPasswordField();
        TextField_User = new javax.swing.JTextField();
        Button_Valider = new javax.swing.JButton();
        Button_Annuler = new javax.swing.JButton();
        Button_Quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Titre.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Label_Titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titre.setText("Bienvenue !");

        Label_User.setText("Nom d'utilisateur :");

        Label_Password.setText("Mot de passe :");

        Button_Valider.setText("Valider");
        Button_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ValiderActionPerformed(evt);
            }
        });

        Button_Annuler.setText("Annuler");
        Button_Annuler.setAlignmentY(0.0F);
        Button_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AnnulerActionPerformed(evt);
            }
        });

        Button_Quitter.setText("Quitter");
        Button_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_QuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Titre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_Valider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Annuler)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Quitter))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Label_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_User, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField_User)
                            .addComponent(PasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_User)
                    .addComponent(TextField_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Password)
                    .addComponent(PasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Valider)
                    .addComponent(Button_Quitter)
                    .addComponent(Button_Annuler))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ValiderActionPerformed
        // TODO add your handling code here:
        String user = TextField_User.getText();
        String pass = new String(PasswordField_Password.getPassword());
        
        if(isNullOrEmpty(user) || isNullOrEmpty(pass))
            return;
        else
        {
            //Vérification de l'authentification
            try
            {
                authentification(hmap, user, pass);
            }
            catch(LoginException tmp)
            {
                System.out.println("Login Exception");
                tmp.Affiche();
            } catch (ShipWithoutIdentificationException ex) {
                Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SailorWithoutIdentificationException ex) {
                Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Button_ValiderActionPerformed

    public void authentification(Hashtable<String,String> hmap,String user,String pass) throws LoginException, ShipWithoutIdentificationException, SailorWithoutIdentificationException
    {    

        Enumeration users;
        String key;
        users = hmap.keys(); //Liste des user de la HashTable
        
        while(users.hasMoreElements()) //On boucle tant qu'il y a des users
        {
            key = (String) users.nextElement();
            if(key.equals(user) == true) //user trouvé dans la liste
            {                       
                if(hmap.get(key).equals(pass) == true) //Vérification si user et pass correspondent
                {
                    System.out.println("Connexion réussie ! Lancement de l'application");
                    CapitainerieWindow CW;
                    CW = new CapitainerieWindow(this, hmap);
                    CW.setVisible(true);
                    this.dispose();//Fermeture de la fenetre de connexion
                    return;
                }
                else throw new LoginException("Connexion échoué (Erreur mot de passe) !");
            }
        }
        throw new LoginException("Connexion échoué (Utilisateur inconnu) !");
    }
    
    private void Button_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_QuitterActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Button_QuitterActionPerformed

    private void Button_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AnnulerActionPerformed
        // TODO add your handling code here:
        TextField_User.setText(null);
        PasswordField_Password.setText(null);
    }//GEN-LAST:event_Button_AnnulerActionPerformed

    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Annuler;
    private javax.swing.JButton Button_Quitter;
    private javax.swing.JButton Button_Valider;
    private javax.swing.JLabel Label_Password;
    private javax.swing.JLabel Label_Titre;
    private javax.swing.JLabel Label_User;
    private javax.swing.JPasswordField PasswordField_Password;
    private javax.swing.JTextField TextField_User;
    // End of variables declaration//GEN-END:variables
}

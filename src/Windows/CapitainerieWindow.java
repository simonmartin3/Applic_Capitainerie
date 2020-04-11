/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Classes.*;
import Exception.SailorWithoutIdentificationException;
import Exception.ShipWithoutIdentificationException;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
public class CapitainerieWindow extends javax.swing.JFrame {

    /**
     * Creates new form CapitainerieWindow
     */
    
    LoginWindow LW;
    Hashtable<String, String> hmap = new Hashtable<>();
    Vector <Bateau> vBateauAmarré = new Vector<>();
    Vector <Quai> vQuai = new Vector<>();
    Vector <Ponton> vPonton = new Vector<>();
    
    
    // Format current date
    private static int formatDate;
    private static int formatHeure;
    private static Locale formatPays;
    
    public static void setFormatDate(int tmp){formatDate = tmp;}
    public static void setFormatHeure(int tmp){formatHeure = tmp;}   
    public static void setFormatLocale(Locale tmp){formatPays = tmp;}
    
    public CapitainerieWindow(java.awt.Frame parent, Hashtable tmp) throws ShipWithoutIdentificationException, SailorWithoutIdentificationException {
        //Initialisation variables
        LW = (LoginWindow) parent;
        hmap = tmp;
        
        //Création du Quai 2 et des pontons P1 et P2
        Quai emplAmarrage1 = new Quai("Q2");
        Ponton emplAmarrage2 = new Ponton("P1");
        Ponton emplAmarrage3 = new Ponton("P2");
        emplAmarrage1.getListe().ensureCapacity(emplAmarrage1.getCapacite());
        
        for(int i = 0; i < emplAmarrage1.getCapacite(); i++)
        {
            emplAmarrage1.getListe().add(i, null);
            emplAmarrage2.getListe(1).add(i, null);
            emplAmarrage2.getListe(2).add(i, null);
            emplAmarrage2.getListe(1).add(i, null);
            emplAmarrage2.getListe(2).add(i, null);
        }
        
        vQuai.add(emplAmarrage1);
        vPonton.add(emplAmarrage2);
        vPonton.add(emplAmarrage3);
        
//        for(int i = 0; i < emplAmarrage1.getCapacite(); i++)
//            System.err.println(emplAmarrage1.getIdentifiant() + "*" + (i+1) + " : " + emplAmarrage1.getListe().get(i));
//        
//        for(int i = 0; i < emplAmarrage1.getCapacite(); i++)
//            System.err.println(emplAmarrage2.getIdentifiant() +"1*" + (i+1) + " : " + emplAmarrage2.getListe(1).get(i));
//        
//        for(int i = 0; i < emplAmarrage1.getCapacite(); i++)
//            System.err.println(emplAmarrage2.getIdentifiant() + "2*" + (i+1) + " : " + emplAmarrage2.getListe(2).get(i));
               
        //Création de 4 bateaux
        Bateau b1 = null, b2 = null, b3 = null, b4 = null;
        try{
            b1 = new BateauPeche("Marie Gueulante", "", 0, 0, "FR", "Q2*4", new Equipage(), "", "", 0, false); //Q2*4
            b2 = new BateauPlaisance("Aigle des mers", "", 0, 0, "FR", "P11*4", new Equipage(), "", "", 0, false);
            b3 = new BateauPlaisance("Victory", "", 0, 0, "UK", "P22*1", new Equipage(), "", "", 0, false);
            b4 = new BateauPlaisance("Schweinhund", "", 0, 0, "DE", "P21*1", new Equipage(), "", "", 0, false);
        }
        catch(ShipWithoutIdentificationException msg)
        {
            msg.Affiche();
        }

        
        vBateauAmarré.add(b1);
        vBateauAmarré.add(b2);
        vBateauAmarré.add(b3);
        vBateauAmarré.add(b4);
        //----------------------------------------------------------------------
        
        
        //Initialisation JFrame ------------------------------------------------
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Capitainerie d'Inpres-Harbour");
        
        //Insertion images
        ImageIcon image1 = new ImageIcon(new ImageIcon("images/image1.jpg").getImage().getScaledInstance(Image1.getWidth(), Image1.getHeight(), 20));
        Image1.setText(null);
        Image1.setIcon(image1);
        
        ImageIcon image2 = new ImageIcon(new ImageIcon("images/image2.jpg").getImage().getScaledInstance(Image2.getWidth(), Image2.getHeight(), 20));
        Image2.setText(null);
        Image2.setIcon(image2);
        
        //Login disable
        MenuItem_Login.setEnabled(false);
        
        //Display current date
        setFormatDate(DateFormat.SHORT);
        setFormatHeure(DateFormat.SHORT);
        setFormatLocale(Locale.FRANCE);
        displayDate();
        
        //Insertion vector dans JList
        insertListBateau();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_ServeurOn = new javax.swing.JButton();
        CheckBox_RequeteAttente = new javax.swing.JCheckBox();
        Button_Lire = new javax.swing.JButton();
        TextField_Requete = new javax.swing.JTextField();
        Label_AmarragePossible = new javax.swing.JLabel();
        Button_Choisir = new javax.swing.JButton();
        TextField_ChoixAmarage = new javax.swing.JTextField();
        Button_EnvoyerChoix = new javax.swing.JButton();
        TextField_Confirmation = new javax.swing.JTextField();
        Button_EnoyerConfirmation = new javax.swing.JButton();
        Label_BateauxEnEntree = new javax.swing.JLabel();
        Button_BatteauAmarre = new javax.swing.JButton();
        Button_ServeurOff = new javax.swing.JButton();
        Image2 = new javax.swing.JLabel();
        Image1 = new javax.swing.JLabel();
        Label_CurrentDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List_Bateau = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Utilisateurs = new javax.swing.JMenu();
        MenuItem_Login = new javax.swing.JMenuItem();
        MenuItem_Logout = new javax.swing.JMenuItem();
        MenuItem_Nouveau = new javax.swing.JMenuItem();
        Menu_Amarrages = new javax.swing.JMenu();
        MenuItem_Plaisance = new javax.swing.JMenuItem();
        MenuItem_Peche = new javax.swing.JMenuItem();
        Menu_Bateaux = new javax.swing.JMenu();
        MenuItem_Liste = new javax.swing.JMenuItem();
        MenuItem_RechercheBateau = new javax.swing.JMenuItem();
        Menu_Personnel = new javax.swing.JMenu();
        MenuItem_Equipage = new javax.swing.JMenuItem();
        MenuItem_RechecrheMarin = new javax.swing.JMenuItem();
        Menu_Parametres = new javax.swing.JMenu();
        MenuItem_FormatDate = new javax.swing.JMenuItem();
        MenuItem_Log = new javax.swing.JMenuItem();
        CheckBoxMenuItem_AffichageDate = new javax.swing.JCheckBoxMenuItem();
        Menu_APropos = new javax.swing.JMenu();
        MenuItem_Auteurs = new javax.swing.JMenuItem();
        MenuItem_Aide = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button_ServeurOn.setText("Démarrer le serveur");
        Button_ServeurOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ServeurOnActionPerformed(evt);
            }
        });

        CheckBox_RequeteAttente.setText("Requête en attente");

        Button_Lire.setText("Lire");

        TextField_Requete.setText("??");

        Label_AmarragePossible.setText("Amarrage possible :");

        Button_Choisir.setText("Choisir");

        TextField_ChoixAmarage.setText("??");

        Button_EnvoyerChoix.setText("Envoyer choix");

        TextField_Confirmation.setText("??");

        Button_EnoyerConfirmation.setText("Envoyer confirmation");

        Label_BateauxEnEntree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_BateauxEnEntree.setText("Bateaux en entrée");

        Button_BatteauAmarre.setText("Bateau amarré");
        Button_BatteauAmarre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BatteauAmarreActionPerformed(evt);
            }
        });

        Button_ServeurOff.setText("Arrêter le serveur");
        Button_ServeurOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ServeurOffActionPerformed(evt);
            }
        });

        Label_CurrentDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label_CurrentDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_CurrentDate.setText("/");

        jScrollPane2.setViewportView(List_Bateau);

        Menu_Utilisateurs.setText("Utilisateurs");

        MenuItem_Login.setText("Login");
        MenuItem_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LoginActionPerformed(evt);
            }
        });
        Menu_Utilisateurs.add(MenuItem_Login);

        MenuItem_Logout.setText("Logout");
        MenuItem_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LogoutActionPerformed(evt);
            }
        });
        Menu_Utilisateurs.add(MenuItem_Logout);

        MenuItem_Nouveau.setText("Nouveau");
        MenuItem_Nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_NouveauActionPerformed(evt);
            }
        });
        Menu_Utilisateurs.add(MenuItem_Nouveau);

        jMenuBar1.add(Menu_Utilisateurs);

        Menu_Amarrages.setText("Amarrages");

        MenuItem_Plaisance.setText("Plaisance");
        MenuItem_Plaisance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_PlaisanceActionPerformed(evt);
            }
        });
        Menu_Amarrages.add(MenuItem_Plaisance);

        MenuItem_Peche.setText("Pêche");
        Menu_Amarrages.add(MenuItem_Peche);

        jMenuBar1.add(Menu_Amarrages);

        Menu_Bateaux.setText("Bateaux");

        MenuItem_Liste.setText("Liste complète");
        Menu_Bateaux.add(MenuItem_Liste);

        MenuItem_RechercheBateau.setText("Rechercher un bateau");
        Menu_Bateaux.add(MenuItem_RechercheBateau);

        jMenuBar1.add(Menu_Bateaux);

        Menu_Personnel.setText("Personnel");

        MenuItem_Equipage.setText("Equipage d'un bateau");
        Menu_Personnel.add(MenuItem_Equipage);

        MenuItem_RechecrheMarin.setText("Rechercher un marin");
        Menu_Personnel.add(MenuItem_RechecrheMarin);

        jMenuBar1.add(Menu_Personnel);

        Menu_Parametres.setText("Paramètres");

        MenuItem_FormatDate.setText("Format date");
        MenuItem_FormatDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_FormatDateActionPerformed(evt);
            }
        });
        Menu_Parametres.add(MenuItem_FormatDate);

        MenuItem_Log.setText("Fichier Log");
        MenuItem_Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LogActionPerformed(evt);
            }
        });
        Menu_Parametres.add(MenuItem_Log);

        CheckBoxMenuItem_AffichageDate.setSelected(true);
        CheckBoxMenuItem_AffichageDate.setText("Affichage date-heure courante");
        CheckBoxMenuItem_AffichageDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxMenuItem_AffichageDateActionPerformed(evt);
            }
        });
        Menu_Parametres.add(CheckBoxMenuItem_AffichageDate);

        jMenuBar1.add(Menu_Parametres);

        Menu_APropos.setText("A Propos");

        MenuItem_Auteurs.setText("Auteurs");
        MenuItem_Auteurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_AuteursActionPerformed(evt);
            }
        });
        Menu_APropos.add(MenuItem_Auteurs);

        MenuItem_Aide.setText("Aide");
        MenuItem_Aide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_AideActionPerformed(evt);
            }
        });
        Menu_APropos.add(MenuItem_Aide);

        jMenuBar1.add(Menu_APropos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckBox_RequeteAttente)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Lire)
                        .addGap(18, 18, 18)
                        .addComponent(TextField_Requete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Image2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_BatteauAmarre, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                            .addComponent(Button_ServeurOff, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                            .addComponent(Label_BateauxEnEntree, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_ServeurOn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Label_CurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_AmarragePossible)
                                .addGap(18, 18, 18)
                                .addComponent(Button_Choisir)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_ChoixAmarage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_EnvoyerChoix)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_Confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_EnoyerConfirmation)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_ServeurOn)
                    .addComponent(Label_CurrentDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBox_RequeteAttente)
                    .addComponent(Button_Lire)
                    .addComponent(TextField_Requete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AmarragePossible)
                    .addComponent(Button_Choisir)
                    .addComponent(TextField_ChoixAmarage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EnvoyerChoix)
                    .addComponent(TextField_Confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EnoyerConfirmation))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_BateauxEnEntree)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_BatteauAmarre)
                        .addGap(18, 18, 18)
                        .addComponent(Button_ServeurOff))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LogoutActionPerformed
        // TODO add your handling code here:
        MenuItem_Login.setEnabled(true);
        IsEnable(false);
    }//GEN-LAST:event_MenuItem_LogoutActionPerformed

    private void MenuItem_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LoginActionPerformed
        // TODO add your handling code here:
        LW.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuItem_LoginActionPerformed

    private void MenuItem_AuteursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AuteursActionPerformed
        // TODO add your handling code here:
        String message = "Copyright 2020\nMARTIN Simon"; 
        JOptionPane.showMessageDialog(null,message, "A Propos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MenuItem_AuteursActionPerformed

    private void MenuItem_NouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_NouveauActionPerformed
        // TODO add your handling code here:
        NewLoginWindow nw = new NewLoginWindow(this, true);
        nw.setVisible(true);
    }//GEN-LAST:event_MenuItem_NouveauActionPerformed

    private void Button_ServeurOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ServeurOnActionPerformed
        // TODO add your handling code here:
        System.out.println("User + pass" + hmap.toString());
    }//GEN-LAST:event_Button_ServeurOnActionPerformed

    private void MenuItem_FormatDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_FormatDateActionPerformed
        // TODO add your handling code here:
        DateWindow dw = new DateWindow(this, true);
        dw.setVisible(true);
    }//GEN-LAST:event_MenuItem_FormatDateActionPerformed

    private void CheckBoxMenuItem_AffichageDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxMenuItem_AffichageDateActionPerformed
        // TODO add your handling code here:
        if(CheckBoxMenuItem_AffichageDate.isSelected())
        {
            Label_CurrentDate.setVisible(true);
        }
        else
        {
            Label_CurrentDate.setVisible(false);
        }
    }//GEN-LAST:event_CheckBoxMenuItem_AffichageDateActionPerformed

    private void MenuItem_AideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AideActionPerformed
        // TODO add your handling code here:
        HelpWindow hw = new HelpWindow(this, true);
        hw.setVisible(true);
    }//GEN-LAST:event_MenuItem_AideActionPerformed

    private void MenuItem_LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LogActionPerformed
        // TODO add your handling code here:
        LogWindow lw = new LogWindow(this, true);
        lw.setVisible(true);
    }//GEN-LAST:event_MenuItem_LogActionPerformed

    private void Button_BatteauAmarreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BatteauAmarreActionPerformed
        // TODO add your handling code here:
        if(List_Bateau.getSelectedValue() == null)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Pas de bateau sélectionné !", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            System.out.println("Traitement du bateau : " + List_Bateau.getSelectedValue());
            
//            InfoBateauWindow ifw = new InfoBateauWindow(this, List_Bateau.getSelectedValue());
            InfoBateauWindow ifw = new InfoBateauWindow(this, vBateauAmarré.get(List_Bateau.getSelectedIndex()), List_Bateau.getSelectedIndex());
            ifw.setVisible(true);
        }
    }//GEN-LAST:event_Button_BatteauAmarreActionPerformed

    private void Button_ServeurOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ServeurOffActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Button_ServeurOffActionPerformed

    private void MenuItem_PlaisanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_PlaisanceActionPerformed
        // TODO add your handling code here:
        PlaisanceWindow pw = new PlaisanceWindow(this, true, vQuai);
        pw.setVisible(true);
    }//GEN-LAST:event_MenuItem_PlaisanceActionPerformed

    public void IsEnable(boolean tmp)
    {
        MenuItem_Logout.setEnabled(tmp);
        MenuItem_Nouveau.setEnabled(tmp);
        Menu_APropos.setEnabled(tmp);
        Menu_Amarrages.setEnabled(tmp);
        Menu_Bateaux.setEnabled(tmp);
        Menu_Personnel.setEnabled(tmp);
        Menu_Parametres.setEnabled(tmp);
        Button_BatteauAmarre.setEnabled(tmp);
        Button_Choisir.setEnabled(tmp);
        Button_EnoyerConfirmation.setEnabled(tmp);
        Button_EnvoyerChoix.setEnabled(tmp);
        Button_Lire.setEnabled(tmp);
        Button_ServeurOff.setEnabled(tmp);
        Button_ServeurOn.setEnabled(tmp);
        CheckBox_RequeteAttente.setEnabled(tmp);
        List_Bateau.setEnabled(tmp);
        TextField_ChoixAmarage.setEnabled(tmp);
        TextField_Confirmation.setEnabled(tmp);
        TextField_Requete.setEnabled(tmp);
        Image1.setEnabled(tmp);
        Image2.setEnabled(tmp);
        Label_AmarragePossible.setEnabled(tmp);
        Label_BateauxEnEntree.setEnabled(tmp);
    }
    
    public static String getCurrentDate()
    {
        
        Date date = new Date();
        String currentDate = DateFormat.getDateTimeInstance(formatDate,formatHeure,formatPays).format(date);
        return currentDate;
    }
    
    private void displayDate()
    {
        Thread thread = new Thread()
        {
            public void run()
            {
               while(true)
               {
                   Label_CurrentDate.setText(getCurrentDate());
                   try 
                   {
                       sleep(1000);
                   } 
                   catch (InterruptedException ex) 
                   {
                       ex.getMessage();
                   }
               }     
            }
        };
        thread.start();
    }
    
    public void insertListBateau()
    {
        DefaultListModel model = new DefaultListModel();
        
        for(int i = 0; i < vBateauAmarré.size(); i++)
        {
            if(vBateauAmarré.get(i).getTonnage() == 0 || vBateauAmarré.get(i).getPortAttache() == "" || vBateauAmarré.get(i).getEquipage().getAUnEquipage() == false )
            {
                model.addElement(vBateauAmarré.get(i).display() + " - Non enregistré");
            }
            else
            {
                model.addElement(vBateauAmarré.get(i).display() + " - Enregistré");
            }
            
        }
        List_Bateau.setModel(model);
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
            java.util.logging.Logger.getLogger(CapitainerieWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapitainerieWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapitainerieWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapitainerieWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CapitainerieWindow(null, null).setVisible(true);
                } catch (ShipWithoutIdentificationException ex) {
                    Logger.getLogger(CapitainerieWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SailorWithoutIdentificationException ex) {
                    Logger.getLogger(CapitainerieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_BatteauAmarre;
    private javax.swing.JButton Button_Choisir;
    private javax.swing.JButton Button_EnoyerConfirmation;
    private javax.swing.JButton Button_EnvoyerChoix;
    private javax.swing.JButton Button_Lire;
    private javax.swing.JButton Button_ServeurOff;
    private javax.swing.JButton Button_ServeurOn;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItem_AffichageDate;
    private javax.swing.JCheckBox CheckBox_RequeteAttente;
    private javax.swing.JLabel Image1;
    private javax.swing.JLabel Image2;
    private javax.swing.JLabel Label_AmarragePossible;
    private javax.swing.JLabel Label_BateauxEnEntree;
    private javax.swing.JLabel Label_CurrentDate;
    private javax.swing.JList<String> List_Bateau;
    private javax.swing.JMenuItem MenuItem_Aide;
    private javax.swing.JMenuItem MenuItem_Auteurs;
    private javax.swing.JMenuItem MenuItem_Equipage;
    private javax.swing.JMenuItem MenuItem_FormatDate;
    private javax.swing.JMenuItem MenuItem_Liste;
    private javax.swing.JMenuItem MenuItem_Log;
    private javax.swing.JMenuItem MenuItem_Login;
    private javax.swing.JMenuItem MenuItem_Logout;
    private javax.swing.JMenuItem MenuItem_Nouveau;
    private javax.swing.JMenuItem MenuItem_Peche;
    private javax.swing.JMenuItem MenuItem_Plaisance;
    private javax.swing.JMenuItem MenuItem_RechecrheMarin;
    private javax.swing.JMenuItem MenuItem_RechercheBateau;
    private javax.swing.JMenu Menu_APropos;
    private javax.swing.JMenu Menu_Amarrages;
    private javax.swing.JMenu Menu_Bateaux;
    private javax.swing.JMenu Menu_Parametres;
    private javax.swing.JMenu Menu_Personnel;
    private javax.swing.JMenu Menu_Utilisateurs;
    private javax.swing.JTextField TextField_ChoixAmarage;
    private javax.swing.JTextField TextField_Confirmation;
    private javax.swing.JTextField TextField_Requete;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

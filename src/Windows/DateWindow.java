/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import java.text.DateFormat;
import java.util.Locale;

/**
 *
 * @author Simon
 */
public class DateWindow extends javax.swing.JDialog {

    /**
     * Creates new form DateWindow
     */
    
    CapitainerieWindow CW;
    
    public DateWindow(java.awt.Frame parent, boolean modal) {
        
        // Initialisation JFrame -----------------------------------------------
        
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        // ---------------------------------------------------------------------
        
        
        // Initialisation variables --------------------------------------------
        
        CW = (CapitainerieWindow) parent;
        
        // ---------------------------------------------------------------------
        
        // Display current date ------------------------------------------------
        
        CW.setFormatDate(DateFormat.SHORT);
        CW.setFormatHeure(DateFormat.SHORT);
        CW.setFormatLocale(Locale.FRANCE);
        
        displayDate();
        
        // ---------------------------------------------------------------------
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
        ComboBox_Pays = new javax.swing.JComboBox<>();
        ComboBox_Date = new javax.swing.JComboBox<>();
        ComboBox_Heure = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Label_CurrentDate = new javax.swing.JLabel();
        Button_Ok = new javax.swing.JButton();
        Button_Appliquer = new javax.swing.JButton();
        Button_Annuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Label_Titre.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Label_Titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titre.setText("Format date");

        ComboBox_Pays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FRANCE", "UK", "ALLEMAGNE", "ITALIE", "U.S.A." }));

        ComboBox_Date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SHORT", "MEDIUM", "FULL" }));

        ComboBox_Heure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SHORT", "MEDIUM", "FULL" }));

        jLabel2.setText("Choix pays :");

        jLabel3.setText("Choix format date :");

        jLabel4.setText("Choix format heure :");

        Label_CurrentDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label_CurrentDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_CurrentDate.setText("/");

        Button_Ok.setText("Ok");
        Button_Ok.setMaximumSize(new java.awt.Dimension(84, 32));
        Button_Ok.setMinimumSize(new java.awt.Dimension(84, 32));
        Button_Ok.setPreferredSize(new java.awt.Dimension(84, 32));
        Button_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_OkActionPerformed(evt);
            }
        });

        Button_Appliquer.setText("Appliquer");
        Button_Appliquer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AppliquerActionPerformed(evt);
            }
        });

        Button_Annuler.setText("Annuler");
        Button_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_CurrentDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_Titre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox_Date, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_Pays, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_Heure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Button_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Appliquer)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Annuler)
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Titre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_Pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_Heure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(Label_CurrentDate)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Appliquer)
                    .addComponent(Button_Annuler))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_OkActionPerformed
        // TODO add your handling code here:
        
        String formatpays = (String) ComboBox_Pays.getSelectedItem();
        switch(formatpays)
        {
            case "FRANCE" : CW.setFormatLocale(Locale.FRENCH);break;
            case "ROYAUME-UNIS" : CW.setFormatLocale(Locale.UK);break; 
            case "ITALIE" : CW.setFormatLocale(Locale.ITALY);break;
            case "AMERIQUE" : CW.setFormatLocale(Locale.US);break;
        }
        
        String formatheure = (String) ComboBox_Heure.getSelectedItem();
        switch(formatheure)
        {
            case "SHORT": CW.setFormatHeure(DateFormat.SHORT);break;
            case "MEDIUM": CW.setFormatHeure(DateFormat.MEDIUM);break;
            case "FULL": CW.setFormatHeure(DateFormat.FULL);break;
        }
        
        String formatdate = (String) ComboBox_Date.getSelectedItem();
        switch(formatdate)
        {
            case "SHORT": CW.setFormatDate(DateFormat.SHORT);break;
            case "MEDIUM": CW.setFormatDate(DateFormat.MEDIUM);break;
            case "FULL": CW.setFormatDate(DateFormat.FULL);break;
        }
        
        this.dispose();
    }//GEN-LAST:event_Button_OkActionPerformed

    private void Button_AppliquerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AppliquerActionPerformed
        // TODO add your handling code here:
        
        String formatpays = (String) ComboBox_Pays.getSelectedItem();
        switch(formatpays)
        {
            case "FRANCE" : CW.setFormatLocale(Locale.FRENCH);break;
            case "ROYAUME-UNIS" : CW.setFormatLocale(Locale.UK);break; 
            case "ITALIE" : CW.setFormatLocale(Locale.ITALY);break;
            case "AMERIQUE" : CW.setFormatLocale(Locale.US);break;
        }
        
        String formatheure = (String) ComboBox_Heure.getSelectedItem();
        switch(formatheure)
        {
            case "SHORT": CW.setFormatHeure(DateFormat.SHORT);break;
            case "MEDIUM": CW.setFormatHeure(DateFormat.MEDIUM);break;
            case "FULL": CW.setFormatHeure(DateFormat.FULL);break;
        }
        
        String formatdate = (String) ComboBox_Date.getSelectedItem();
        switch(formatdate)
        {
            case "SHORT": CW.setFormatDate(DateFormat.SHORT);break;
            case "MEDIUM": CW.setFormatDate(DateFormat.MEDIUM);break;
            case "FULL": CW.setFormatDate(DateFormat.FULL);break;
        }
    }//GEN-LAST:event_Button_AppliquerActionPerformed

    private void Button_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AnnulerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Button_AnnulerActionPerformed

    private void displayDate()
    {
        Thread thread = new Thread()
        {
            public void run()
            {
               while(true)
               {
                   Label_CurrentDate.setText(CW.getCurrentDate());
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
            java.util.logging.Logger.getLogger(DateWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DateWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DateWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DateWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DateWindow dialog = new DateWindow(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Annuler;
    private javax.swing.JButton Button_Appliquer;
    private javax.swing.JButton Button_Ok;
    private javax.swing.JComboBox<String> ComboBox_Date;
    private javax.swing.JComboBox<String> ComboBox_Heure;
    private javax.swing.JComboBox<String> ComboBox_Pays;
    private javax.swing.JLabel Label_CurrentDate;
    private javax.swing.JLabel Label_Titre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

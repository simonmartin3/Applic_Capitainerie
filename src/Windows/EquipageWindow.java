/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Classes.*;
import Exception.SailorWithoutIdentificationException;
import static Windows.LoginWindow.isNullOrEmpty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
public class EquipageWindow extends javax.swing.JDialog {

    /**
     * Creates new form EquipageWindow
     */
    InfoBateauWindow ifw;
    private Marin tmp = null;
    private Bateau tmpBateau;
    private Equipage tmpEquipage;
    Vector <Marin> vMarrin;
    DefaultListModel model = new DefaultListModel();
    ButtonGroup G;
    
    public EquipageWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ifw = (InfoBateauWindow) parent;
        vMarrin = new Vector<>();
        tmpBateau = ifw.tmpBateau;
        tmpEquipage = tmpBateau.getEquipage();
        
        List_Equipage.removeAll();
                
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Capitainerie - Enregistrement d'un équipage");
        
        
        Label_NomBateau.setText(tmpBateau.getNom() + "(" + tmpBateau.getPortAttache()+ ")");
        Label_NbrePassager.setText(Integer.toString(tmpBateau.getNombreHumains()));
        
        G = new ButtonGroup();
        G.add(RadioButton_Capitaine);
        G.add(RadioButton_Second);
        G.add(RadioButton_Bosco);
        G.add(RadioButton_Matelot);
        G.add(RadioButton_Passager);
        
        if(tmpBateau.getEquipage().getAUnEquipage())
        {
            model.addElement(tmpEquipage.getCapitainerie().getFonction() + " : " + tmpEquipage.getCapitainerie().getNom());
            
            if(tmpEquipage.getSecond().getFonction() != null)
            {
                model.addElement(tmpEquipage.getSecond().getFonction() + " : " + tmpEquipage.getSecond().getNom());
            }   
            
            if(tmpEquipage.getEquipage() != null)
            {
                for(int i = 0; i < tmpEquipage.getEquipage().size(); i++)
                    model.addElement(tmpEquipage.getEquipage().get(i).getFonction() + " : " + tmpEquipage.getEquipage().get(i).getNom());
            }
        
        List_Equipage.setModel(model);
        }
        
        isCapitaine();
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
        Label_NomBateau = new javax.swing.JLabel();
        TextField_Nom = new javax.swing.JTextField();
        TextField_Prenom = new javax.swing.JTextField();
        TextField_DateNaissance = new javax.swing.JTextField();
        RadioButton_Capitaine = new javax.swing.JRadioButton();
        RadioButton_Second = new javax.swing.JRadioButton();
        RadioButton_Bosco = new javax.swing.JRadioButton();
        RadioButton_Matelot = new javax.swing.JRadioButton();
        RadioButton_Passager = new javax.swing.JRadioButton();
        Button_Ok = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Button_Valider = new javax.swing.JButton();
        Button_Abandonner = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_Equipage = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        Label_NbrePassager = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Bateau  :");

        jLabel2.setText("Nom :");

        jLabel3.setText("Prénom :");

        jLabel4.setText("Date de naissance : ");

        Label_NomBateau.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label_NomBateau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_NomBateau.setText("/");
        Label_NomBateau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_NomBateauMouseClicked(evt);
            }
        });

        TextField_DateNaissance.setToolTipText("test");

        RadioButton_Capitaine.setText("Capitaine");

        RadioButton_Second.setText("Second");

        RadioButton_Bosco.setText("Bosco");

        RadioButton_Matelot.setText("Matelot");

        RadioButton_Passager.setText("Passager");

        Button_Ok.setText("Ok");
        Button_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_OkActionPerformed(evt);
            }
        });

        Button_Valider.setText("Valider équipage");
        Button_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ValiderActionPerformed(evt);
            }
        });

        Button_Abandonner.setText("Abandonner");
        Button_Abandonner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AbandonnerActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(List_Equipage);

        jLabel5.setText("Nombre de passager :");

        Label_NbrePassager.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RadioButton_Capitaine)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioButton_Second)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Label_NomBateau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TextField_Nom)
                                        .addComponent(TextField_Prenom)
                                        .addComponent(TextField_DateNaissance, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadioButton_Bosco)
                                .addGap(18, 18, 18)
                                .addComponent(RadioButton_Matelot)
                                .addGap(18, 18, 18)
                                .addComponent(RadioButton_Passager)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label_NbrePassager)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(Button_Valider)
                .addGap(86, 86, 86)
                .addComponent(Button_Abandonner, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Label_NomBateau))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextField_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextField_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextField_DateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButton_Capitaine)
                            .addComponent(RadioButton_Second))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButton_Bosco)
                            .addComponent(RadioButton_Matelot)
                            .addComponent(RadioButton_Passager)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Label_NbrePassager))
                .addGap(11, 11, 11)
                .addComponent(Button_Ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Valider)
                    .addComponent(Button_Abandonner))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_OkActionPerformed
        // TODO add your handling code here:
        int nbrePassager;
        try 
        {
            if(RadioButton_Capitaine.isSelected())
            {
                tmp = new Marin(TextField_Nom.getText(), TextField_Prenom.getText(), TextField_DateNaissance.getText(), "Capitaine");              
                tmpEquipage.setCapitainerie(tmp);
                tmpEquipage.setAUnEquipage(true);
            }
            else if (RadioButton_Second.isSelected())
            {
                tmp = new Marin(TextField_Nom.getText(), TextField_Prenom.getText(), TextField_DateNaissance.getText(), "Second");
                tmpEquipage.setSecond(tmp);    
            }
            else if (RadioButton_Bosco.isSelected())
            {
                tmp = new Marin(TextField_Nom.getText(), TextField_Prenom.getText(), TextField_DateNaissance.getText(), "Bosco");
                tmpEquipage.getEquipage().add(tmp);
            }
            else if (RadioButton_Matelot.isSelected())
            {
                tmp = new Marin(TextField_Nom.getText(), TextField_Prenom.getText(), TextField_DateNaissance.getText(), "Matelot");
                tmpEquipage.getEquipage().add(tmp);
            }
            else if (RadioButton_Passager.isSelected())
            {
                tmp = new Marin(TextField_Nom.getText(), TextField_Prenom.getText(), TextField_DateNaissance.getText(), "Passager");
                tmpEquipage.getEquipage().add(tmp);
            }
                
            //Insertion Marin dans JList
            vMarrin.add(tmp);
            model.addElement(tmp.getFonction() + " : " + tmp.getNom());

            //Vider Jlist
            List_Equipage.removeAll();
            List_Equipage.setModel(model);
            isCapitaine();
            
            // Incrémentation du nombre de passager + affichage
            nbrePassager = tmpBateau.getNombreHumains();
            nbrePassager++;
            tmpBateau.setNombreHumains(nbrePassager);

            Label_NbrePassager.setText(Integer.toString(tmpBateau.getNombreHumains()));
                
        } catch (SailorWithoutIdentificationException error) {
            error.Affiche();
        }      
    }//GEN-LAST:event_Button_OkActionPerformed

    private void Button_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ValiderActionPerformed
        // TODO add your handling code here:
        ifw.CW.vBateauAmarré.set(ifw.tmpIndex, tmpBateau); //On enregistre dans le vecteur
        ifw.autoComboBoxEquipage(); //On met à jour la comboBox
        
        this.dispose();
    }//GEN-LAST:event_Button_ValiderActionPerformed

    private void Button_AbandonnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AbandonnerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Button_AbandonnerActionPerformed

    private void Label_NomBateauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_NomBateauMouseClicked
        // TODO add your handling code here:
        TextField_Nom.setText("Test");
        TextField_Prenom.setText("Test");
        TextField_DateNaissance.setText("test");
    }//GEN-LAST:event_Label_NomBateauMouseClicked

    private void isCapitaine()
    {
        TextField_DateNaissance.setText("");
        TextField_Nom.setText("");
        TextField_Prenom.setText("");
        
        if(tmpEquipage.getAUnEquipage() == false)
        {
            RadioButton_Capitaine.setSelected(true);
            RadioButton_Second.setEnabled(false);
            RadioButton_Bosco.setEnabled(false);
            RadioButton_Matelot.setEnabled(false);
            RadioButton_Passager.setEnabled(false);
        }
        else if (tmpEquipage.getSecond() != null)
        {
            RadioButton_Bosco.setSelected(true);
            RadioButton_Capitaine.setEnabled(false);
            RadioButton_Second.setEnabled(false);
            RadioButton_Bosco.setEnabled(true);
            RadioButton_Matelot.setEnabled(true);
            RadioButton_Passager.setEnabled(true);
        }
        else if (tmpEquipage.getCapitainerie().getNom() != null)
        {
            RadioButton_Second.setSelected(true);
            RadioButton_Capitaine.setEnabled(false);
            RadioButton_Second.setEnabled(true);
            RadioButton_Bosco.setEnabled(true);
            RadioButton_Matelot.setEnabled(true);
            RadioButton_Passager.setEnabled(true);            
        }
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
            java.util.logging.Logger.getLogger(EquipageWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquipageWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquipageWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquipageWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EquipageWindow dialog = new EquipageWindow(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Button_Abandonner;
    private javax.swing.JButton Button_Ok;
    private javax.swing.JButton Button_Valider;
    private javax.swing.JLabel Label_NbrePassager;
    private javax.swing.JLabel Label_NomBateau;
    private javax.swing.JList<String> List_Equipage;
    private javax.swing.JRadioButton RadioButton_Bosco;
    private javax.swing.JRadioButton RadioButton_Capitaine;
    private javax.swing.JRadioButton RadioButton_Matelot;
    private javax.swing.JRadioButton RadioButton_Passager;
    private javax.swing.JRadioButton RadioButton_Second;
    private javax.swing.JTextField TextField_DateNaissance;
    private javax.swing.JTextField TextField_Nom;
    private javax.swing.JTextField TextField_Prenom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

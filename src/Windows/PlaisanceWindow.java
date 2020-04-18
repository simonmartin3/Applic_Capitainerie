/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Classes.Bateau;
import Classes.MoyenDeTransportSurEau;
import Classes.Ponton;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Simon
 */
public class PlaisanceWindow extends javax.swing.JDialog {

    /**
     * Creates new form PlaisanceWindow
     */
    CapitainerieWindow CW;
    Vector<Ponton> vTmp = new Vector<>();
    ArrayList <MoyenDeTransportSurEau> tmpList = new ArrayList<>();

    public PlaisanceWindow(java.awt.Frame parent, boolean modal, Vector v) {
        super(parent, modal);
        initComponents();
        vTmp = v;
        CW = (CapitainerieWindow) parent;
        
        this.setLocationRelativeTo(null);
        this.setLocation(CW.getX() + CW.getWidth(), CW.getY());
        this.setResizable(false);
        this.setTitle("Capitainerie - Liste Bateau plaisance");
        
        // Remplissage JTable
        DefaultTableModel model = new DefaultTableModel()
        {
            // Cellule non éditable
            public boolean isCellEditable(int row, int col) {
                return false;
            };
        };
        model.addColumn("Ponton");
        model.addColumn("Coté*Emplacement");
        model.addColumn("Nom");
        
        
        for(int i = 0; i < vTmp.size(); i++)
        {
            // coté 1
            for(int j = 0; j < vTmp.get(i).getCapacite();j++)
            {
                String nom;
                
                if(((Bateau)vTmp.get(i).getListe(1).get(j)).getNom() != null)
                    nom = ((Bateau)vTmp.get(i).getListe(1).get(j)).getNom();
                else    
                    nom = "/";
                
                // N'afficher que l'identifiant une seule fois
                if(j == 0)
                    model.addRow(new Object[]{vTmp.get(i).getIdentifiant(), 1 + "*" + (j+1), nom});
                else
                    model.addRow(new Object[]{"", 1 + "*" + (j+1), nom});
            }
            
            model.addRow(new Object[]{}); // Ligne vide
            
            // coté 2
            for(int j = 0; j < vTmp.get(i).getCapacite();j++)
            {
                String nom;
                
                if(((Bateau)vTmp.get(i).getListe(2).get(j)).getNom() != null)
                    nom = ((Bateau)vTmp.get(i).getListe(2).get(j)).getNom();
                else    
                    nom = "/";
                
                // N'afficher que l'identifiant une seule fois
                if(j == 0)
                    model.addRow(new Object[]{vTmp.get(i).getIdentifiant(), 2 + "*" + (j+1), nom});
                else
                    model.addRow(new Object[]{"", 2 + "*" + (j+1), nom});
            }
            
            model.addRow(new Object[]{}); // Ligne vide
                
        }
        
        jTable1.setModel(model);

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
        Button_Ok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plaisance");

        Button_Ok.setText("OK");
        Button_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_OkActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ponton", "Coté", "Emplacement"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(Button_Ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Button_Ok)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_OkActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Button_OkActionPerformed

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
            java.util.logging.Logger.getLogger(PlaisanceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaisanceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaisanceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaisanceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlaisanceWindow dialog = new PlaisanceWindow(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton Button_Ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

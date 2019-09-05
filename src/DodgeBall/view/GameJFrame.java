/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DodgeBall.view;

import DodgeBall.control.Control;
import DodgeBall.model.Model;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author GL552
 */
public class GameJFrame extends javax.swing.JFrame{

    private PanelDeJuego panelJuego;
    private Model modelo;
    private Control control;

    /**
     * Creates new form GameJFrame
     */
    public GameJFrame(Model model, Control control) {
        initComponents();
        this.control = control;
        modelo = model;
        Dimension dimencion = new Dimension(800, 800);
        this.setSize(dimencion);
        //this.setPreferredSize(dimencion);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        panelJuego = new PanelDeJuego(model);
        panelJuego.setSize(dimencion);
        this.add(panelJuego);
        this.addKeyListener(control);
    }
    
    public PanelDeJuego getPanelJuego() {
        return panelJuego;
    }

    public Model getModelo() {
        return modelo;
    }

    public Control getControl() {
        return control;
    }

    public void setPanelJuego(PanelDeJuego panelJuego) {
        this.panelJuego = panelJuego;
    }

    public void setModelo(Model modelo) {
        this.modelo = modelo;
    }

    public void setControl(Control control) {
        this.control = control;
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuJuego = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ItemConfiguracion = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();
        informacion = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        ItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ItemExit.setText("EXIT");
        ItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(ItemExit);

        jMenuJuego.add(jMenu1);

        jMenu2.setText("Edit");

        ItemConfiguracion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        ItemConfiguracion.setText("jMenuItem1");
        ItemConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConfiguracionActionPerformed(evt);
            }
        });
        jMenu2.add(ItemConfiguracion);

        jMenuJuego.add(jMenu2);

        About.setText("About");

        informacion.setText("Dodge Ball");
        informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionActionPerformed(evt);
            }
        });
        About.add(informacion);

        jMenuJuego.add(About);

        setJMenuBar(jMenuJuego);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ItemExitActionPerformed

    private void ItemConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConfiguracionActionPerformed
        // TODO add your handling code here:
        /*configuracion para el cambio de velocidad*/
    }//GEN-LAST:event_ItemConfiguracionActionPerformed

    private void informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Juego Dodge Ball\nUniversidad Nacional\nEscuela de Informática\n Etudiantes:\n Richard Vargas Vado 402380714\n"
                + "Cristopher Arce Diaz 702680366"+"\n2019", "ABOUT", 1);
    }//GEN-LAST:event_informacionActionPerformed

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
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenuItem ItemConfiguracion;
    private javax.swing.JMenuItem ItemExit;
    private javax.swing.JMenuItem informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar jMenuJuego;
    // End of variables declaration//GEN-END:variables
}

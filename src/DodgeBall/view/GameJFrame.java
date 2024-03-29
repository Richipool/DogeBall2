/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DodgeBall.view;

import DodgeBall.control.Control;
import DodgeBall.model.Model;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author GL552
 */
public class GameJFrame extends javax.swing.JFrame implements Observer {

    private PanelDeJuego panelJuego;
    private Model modelo;
    private Control control;
    private int cantidad;
    private int velocidad;
    private AudioClip sonido;
    private AudioClip sonido2;
    private AudioClip sonido3;

    /**
     * Creates new form GameJFrame
     */
    public GameJFrame(Model model, Control control) {
        initComponents();
        this.control = control;
        modelo = model;
//        AudioClip sonido;
        sonido3 = java.applet.Applet.newAudioClip(getClass().getResource("deathSound.wav"));
        sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("tu_tu_ru.wav"));
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("Nyan_cat2.wav"));
        sonido.play();
        sonido.loop();
        modelo.addObserver(this);
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
        //this.playMusic();
    }

    /**/
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

    private void Settings() {
        JPanel pane = new JPanel();//es solo un cuadrito donde se pueden meter cosas
        pane.setLayout(new GridLayout(1, 1, 1, 1));//parte el pane en cuadritos, en un grid, interesante (0 rows, 1 column, y el espacio entre cada objeto agregado
        //1 fila, mete todo seguido
        //JTextField field1 = new JTextField(5);//es un espacio para escribir, cantidad de columnas es el largo
        //JTextField field2 = new JTextField(5);
        SpinnerModel sm = new SpinnerNumberModel(1, 1, 5, 1);//muestra el 0, inicia en 0 y termina en 5,  y muetra 1 numero
        SpinnerModel sn = new SpinnerNumberModel(5, 5, 12, 1);//muestra el 0, inicia en 0 y termina en 5,  y muetra 1 numero
        JSpinner spin1 = new JSpinner(sm);
        JSpinner spin2 = new JSpinner(sn);

        JLabel label1 = new JLabel("Esferas");
        JLabel label2 = new JLabel("Velocidad");
        pane.add(label1);//como el grid solo tiene 1 columna, agrega este primero y todo 
        pane.add(spin1);//lo pone seguido del label
        pane.add(label2);//lo pone seguido del primer spin
        pane.add(spin2);//lo pone seguido del label 2
        int option = JOptionPane.showConfirmDialog(null, pane, "Settings", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (option == 0) {//dio click en aceptar
            cantidad = (int) spin1.getValue();//obtengo el valor de la cantidad de bolas
            velocidad = (int) spin2.getValue();//obtengo el valor de la velocidad
            modelo.agregarBolas(cantidad);
            modelo.cambiarVelocidad(velocidad);
        } else {
            cantidad = 0;
            velocidad = 0;
        }
        System.out.println(option);
        System.out.println(cantidad);
        System.out.println(velocidad);
    }

    public void sonarRebote() {
        if (modelo.isChocoSonido()) {
            sonido2.play();
        }
        if(modelo.isChocoSonido2()){
            sonido3.play();
        }
    }

    public void jugar() throws InterruptedException {
        while (true) {
            modelo.mover();
            modelo.cambiarMarcador();
            this.sonarRebote();
            Thread.sleep(10);

        }
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
        ItemConfiguracion.setText("Settings");
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
        modelo.pausa();
        this.Settings();

    }//GEN-LAST:event_ItemConfiguracionActionPerformed

    private void informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionActionPerformed

        JOptionPane.showMessageDialog(this, "Juego Dodge Ball\nUniversidad Nacional\nEscuela de Informática\n Etudiantes:\n Richard Vargas Vado 402380714\n"
                + "Cristopher Arce Diaz 702680366" + "\n2019", "ABOUT", 1);
    }//GEN-LAST:event_informacionActionPerformed


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

    @Override
    public void update(Observable o, Object arg) {
        panelJuego.repaint();
    }
}

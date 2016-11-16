/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;

/**
 *
 * @author Christian
 */
public class AyudaScramble extends javax.swing.JDialog {
    public String Scram = "<html><body>Un Scramble es una serie de Movimientos, los cuales sirven para mezclar de mejor manera el cubo a resolver <br><br> ¿Porque es Necesario? <br><br> En Competencias oficiales se utilizan los Scrambles para que, de una manera diferente, cada competidor tengo un Scramble diferente y por consecuencia nunca existira un Scramble igual en todos los Solves <br><br> Ayuda a la persona que  esta practicando a reconocer con cuales Scramble hize sus mejores tiempos <br><br> En competencias oficiales son Obligatorios <br> En practica ayuda a reconocer con cuales hizo sus mejores tiempos :-) </body></html>" ;
    public String carafr = "<html><body> Para realizar los movimientos se debe tener una cara del cubo SIEMPRE al frente de usuario<br>Por ejemplo al tener la cara ROJA indicada, se realiza los movimientos indicados  </body></html>" ;
    /**
     * Creates new form AyudaScramble
     */
    public AyudaScramble(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        info.setText(Scram);
        caraFront.setText(carafr);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movGraf = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caraFront = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("¿Que es un Scramble?");
        setFocusable(false);
        setIconImage(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movGraf.setForeground(new java.awt.Color(255, 255, 255));
        movGraf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.jpeg"))); // NOI18N
        movGraf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(movGraf, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 11, -1, 435));

        titulo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText(" SCRAMBLE");
        titulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), null));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, 321, 39));

        info.setForeground(new java.awt.Color(255, 255, 255));
        info.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "¿Que es un Scramble?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 329, 390));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mayusculas -> Movimiento Horario");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 412, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Minusculas -> Movimiento Antihorario");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 523, 412, 40));

        caraFront.setForeground(new java.awt.Color(255, 255, 255));
        caraFront.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayudaCara.jpeg"))); // NOI18N
        caraFront.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(caraFront, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 452, 329, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/movi4x4.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "4x4", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 11, 110, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AyudaScramble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyudaScramble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyudaScramble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyudaScramble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AyudaScramble dialog = new AyudaScramble(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel caraFront;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel movGraf;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
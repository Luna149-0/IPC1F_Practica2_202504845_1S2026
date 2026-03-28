//Esta es mi vista carrera
package practica2_Views;

//Importaciones
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static practica2_Controller.PersonajeController.personajes;
import practica2_Model.ObjetoJuego;
import practica2_Model.PersonajeModel;
import practica2_Model.ReportePartida;
import practica2_Controller.PartidaController;

//Vista carrera
public class VistaCarrera extends javax.swing.JFrame {
    //variables
    int penalizacionJugador = 0;
    int puntosJugador = 0;
    int puntosOponente = 0;
    int penalizacionOponente = 0;
    int ultimoXJugador = 0;
    int ultimoXOponente = 0;
    boolean juegoTerminado = false;
    ObjetoJuego[] objetosJugador = new ObjetoJuego[10];
    ObjetoJuego[] objetosOponente = new ObjetoJuego[10];
    ObjetoJuego[] objetos = new ObjetoJuego[10];
    int totalObjetos = 0;
    PersonajeModel jugador;
    PersonajeModel oponente;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaCarrera.class.getName());


public VistaCarrera(PersonajeModel jugador, PersonajeModel oponente) {
    initComponents();
    this.jugador = jugador;
    this.oponente = oponente;
    JOptionPane.showMessageDialog(this, 
    "Jugador: " + jugador.getNombre() + 
    "\nOponente: " + oponente.getNombre()
     );


}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        lblMagoRandom = new javax.swing.JLabel();
        lblMago1 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        Copa = new javax.swing.JLabel();
        Copa2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JugarAgain = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ptsJug = new javax.swing.JTextField();
        ptsOp = new javax.swing.JTextField();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CopaDo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(199, 199, 199));

        lblMagoRandom.setBackground(new java.awt.Color(255, 255, 255));
        lblMagoRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mago2.png"))); // NOI18N
        lblMagoRandom.setText("jLabel1");

        lblMago1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HrryF.png"))); // NOI18N
        lblMago1.setText("jLabel1");

        btnJugar.setText("Iniciar");
        btnJugar.addActionListener(this::btnJugarActionPerformed);

        btnReg.setText("Regresar");
        btnReg.addActionListener(this::btnRegActionPerformed);

        Copa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CopaDo.png"))); // NOI18N
        Copa.setText("jLabel2");

        Copa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CopaDo.png"))); // NOI18N
        Copa2.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel2.setText("Jugador");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel3.setText("Opnente");

        JugarAgain.setText("Jugar Otra Vez");
        JugarAgain.addActionListener(this::JugarAgainActionPerformed);

        jLabel4.setBackground(new java.awt.Color(165, 225, 255));
        jLabel4.setText("Puntos Jugador");

        jLabel5.setText("Puntos Oponente");

        ptsJug.addActionListener(this::ptsJugActionPerformed);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMago1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMagoRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ptsJug, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JugarAgain)
                                .addGap(108, 108, 108))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(btnReg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ptsOp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Copa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Copa2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMago1)
                    .addComponent(Copa)
                    .addComponent(jLabel2))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMagoRandom)
                            .addComponent(Copa2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JugarAgain)
                            .addComponent(btnJugar)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReg)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ptsOp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ptsJug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Regresar
    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed

    vista_MenuPrincipal menu = new vista_MenuPrincipal();
    menu.setVisible(true);
    menu.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_btnRegActionPerformed

   
    //Hilos para que se muevan los personajes
    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
      Thread hiloJugador = new Thread(() -> {
        int x = lblMago1.getX();
        while (x <= this.getWidth() - 100) {
            if (juegoTerminado) return;

            if (penalizacionJugador > 0) {
                penalizacionJugador--;
                try { Thread.sleep(100); } catch (Exception e) {}
                continue;
            }

            x += 10;
            final int nuevaX = x;
            SwingUtilities.invokeLater(() -> lblMago1.setLocation(nuevaX, lblMago1.getY()));

            if (nuevaX >= Copa.getX()) {
            juegoTerminado = true;

            //Se guarda en reporte
            ReportePartida r = new ReportePartida(
            jugador.getNombre(),
            oponente.getNombre(),
            jugador.getEscoba().getNombre(),
            oponente.getEscoba().getNombre(),
            puntosJugador,
            puntosOponente,
            "Jugador"
             );

            PartidaController.guardarReporte(r);
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null, "¡Ganaste!"));
            break;
      }
            if (Math.random() < 0.1) generarObjetoAleatorio(nuevaX, true);

            for (int i = 0; i < objetosJugador.length; i++) {
                ObjetoJuego obj = objetosJugador[i];
                if (obj != null && Math.abs(nuevaX - obj.x) < 20) {
                    
                    //Si encuentra una Snitch
                    if (obj.tipo.equals("S")) {
                        juegoTerminado = true;
                        SwingUtilities.invokeLater(() -> {
                        puntosJugador += 150;
                        lblMago1.setLocation(this.getWidth() - 100, lblMago1.getY());
                        ptsJug.setText(String.valueOf(puntosJugador));
                            
                    ReportePartida r = new ReportePartida(
                    jugador.getNombre(),
                    oponente.getNombre(),
                    jugador.getEscoba().getNombre(),
                    oponente.getEscoba().getNombre(),
                    puntosJugador,
                    puntosOponente,
                    "Jugador"
                    );

                    PartidaController.guardarReporte(r);

                            
                     JOptionPane.showMessageDialog(null, "¡Ganaste!");
                        });
                        
                    //Si encuentra una B
                    } else if (obj.tipo.equals("B")) {
                        penalizacionJugador = 20;
                    } else if (obj.tipo.equals("Q")) {
                        puntosJugador += 10;
                        SwingUtilities.invokeLater(() -> ptsJug.setText(String.valueOf(puntosJugador)));
                    }
                    panel1.remove(obj.label);
                    panel1.repaint();
                    objetosJugador[i] = null;
                    break;
                }
            }

            try {
                Thread.sleep(jugador.getEscoba().getDormirSegundos() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
      
      //Hilo del jugador 2 u oponente
    Thread hiloOponente = new Thread(() -> {
        int x = lblMagoRandom.getX();
        while (x <= this.getWidth() - 100) {
            if (juegoTerminado) return;

            if (penalizacionOponente > 0) {
                penalizacionOponente--;
                try { Thread.sleep(100); } catch (Exception e) {}
                continue;
            }

            x += 10;
            final int nuevaX = x;
            SwingUtilities.invokeLater(() -> lblMagoRandom.setLocation(nuevaX, lblMagoRandom.getY()));
            
              if (nuevaX >= Copa2.getX()) {
    juegoTerminado = true;

    ReportePartida r = new ReportePartida(
        jugador.getNombre(),
        oponente.getNombre(),
                oponente.getEscoba().getNombre(),
        jugador.getEscoba().getNombre(),
            
        puntosJugador,
        puntosOponente,
        "Oponente"
    );

PartidaController.guardarReporte(r);

    SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null, "¡El oponente ganó!"));
    break;
}

            if (Math.random() < 0.1) generarObjetoAleatorio(nuevaX, false);

            for (int i = 0; i < objetosOponente.length; i++) {
                ObjetoJuego obj = objetosOponente[i];
                if (obj != null && Math.abs(nuevaX - obj.x) < 20) {
                    if (obj.tipo.equals("S")) {
                        juegoTerminado = true;
                        SwingUtilities.invokeLater(() -> {
                            puntosOponente += 150;
                            lblMagoRandom.setLocation(this.getWidth() - 100, lblMagoRandom.getY());
                            ptsOp.setText(String.valueOf(puntosOponente));
                            
           ReportePartida r = new ReportePartida(
               jugador.getNombre(),
               oponente.getNombre(),
               oponente.getEscoba().getNombre(),
               jugador.getEscoba().getNombre(),
         
               puntosJugador,
               puntosOponente,
                "Oponente"
              );

              PartidaController.guardarReporte(r);
                            
                            JOptionPane.showMessageDialog(null, "¡El oponente ganó!");
                        });
                    } else if (obj.tipo.equals("B")) {
                        penalizacionOponente = 20;
                    } else if (obj.tipo.equals("Q")) {
                        puntosOponente += 10;
                        SwingUtilities.invokeLater(() -> ptsOp.setText(String.valueOf(puntosOponente)));
                    }
                    panel1.remove(obj.label);
                    panel1.repaint();
                    objetosOponente[i] = null;
                    break;
                }
            }

            try {
                Thread.sleep(oponente.getEscoba().getDormirSegundos() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    hiloJugador.start();
    hiloOponente.start();
}

    
    //Generando objeto aleatorio
public void generarObjetoAleatorio(int xBase, boolean esJugador) {
   int x = xBase + 200;
    int y = esJugador ? lblMago1.getY() : lblMagoRandom.getY();
    double r = Math.random();
    String tipo;

    if (r < 0.1) tipo = "S";
    else if (r < 0.6) tipo = "B";
    else tipo = "Q";

    JLabel lbl = new JLabel(tipo);
    lbl.setBounds(x, y, 20, 20);

    panel1.add(lbl);
    panel1.repaint();

    ObjetoJuego obj = new ObjetoJuego(x, y, tipo, lbl);
obj.esJugador = esJugador;
    ObjetoJuego[] arrayObjetos = esJugador ? objetosJugador : objetosOponente;

    for (int i = 0; i < arrayObjetos.length; i++) {
        if (arrayObjetos[i] == null) {
            arrayObjetos[i] = obj;
            break;
        }
    }



    }//GEN-LAST:event_btnJugarActionPerformed

//Jugar otra vez boton
    private void JugarAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarAgainActionPerformed

    juegoTerminado = false;
    // Regresar magos al inicio
    lblMago1.setLocation(42, lblMago1.getY());
    lblMagoRandom.setLocation(42, lblMagoRandom.getY());

    // borrar obstáculos del jugador
for (int i = 0; i < objetosJugador.length; i++) {
    if (objetosJugador[i] != null) {
        panel1.remove(objetosJugador[i].label);
        objetosJugador[i] = null;
    }
}

// borrar obstáculos del oponente
for (int i = 0; i < objetosOponente.length; i++) {
    if (objetosOponente[i] != null) {
        panel1.remove(objetosOponente[i].label);
        objetosOponente[i] = null;
    }
}

    panel1.repaint();

    //Resetaer distancia
    ultimoXJugador = 0;
    ultimoXOponente = 0;
    
    puntosJugador = 0;
    puntosOponente = 0;
    ptsJug.setText("0");
    ptsOp.setText("0");

    }//GEN-LAST:event_JugarAgainActionPerformed

    private void ptsJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptsJugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptsJugActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Copa;
    private javax.swing.JLabel Copa2;
    private javax.swing.JButton JugarAgain;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMago1;
    private javax.swing.JLabel lblMagoRandom;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField ptsJug;
    private javax.swing.JTextField ptsOp;
    // End of variables declaration//GEN-END:variables
}

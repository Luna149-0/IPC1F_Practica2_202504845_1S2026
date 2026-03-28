
package practica2_Views;

import javax.swing.JOptionPane;
import practica2_Controller.PartidaController;
import practica2_Controller.PersonajeController;
import practica2_Views.VistaCarrera;
/**
 *
 * @author ixche
 */
public class vista_MenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(vista_MenuPrincipal.class.getName());

    public vista_MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_Inicio = new javax.swing.JButton();
        btn_Personaje = new javax.swing.JButton();
        btn_Puntaje = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btnReportePartidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImFinal.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImFina2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(34, 88, 142));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 84, 210)));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 243, 243));
        jLabel3.setText("Bienvenido/a");

        btn_Inicio.setBackground(new java.awt.Color(169, 193, 243));
        btn_Inicio.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        btn_Inicio.setText("Iniciar juego");
        btn_Inicio.addActionListener(this::btn_InicioActionPerformed);

        btn_Personaje.setBackground(new java.awt.Color(169, 193, 243));
        btn_Personaje.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        btn_Personaje.setText("Crear Personaje");
        btn_Personaje.addActionListener(this::btn_PersonajeActionPerformed);

        btn_Puntaje.setBackground(new java.awt.Color(169, 193, 243));
        btn_Puntaje.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        btn_Puntaje.setText("Ver Top de Puntajes");
        btn_Puntaje.addActionListener(this::btn_PuntajeActionPerformed);

        btn_salir.setBackground(new java.awt.Color(90, 145, 255));
        btn_salir.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(this::btn_salirActionPerformed);

        btnReportePartidas.setBackground(new java.awt.Color(169, 193, 243));
        btnReportePartidas.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        btnReportePartidas.setText("Reporte de Partida");
        btnReportePartidas.addActionListener(this::btnReportePartidasActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btn_salir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Personaje)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Inicio))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReportePartidas)
                            .addComponent(btn_Puntaje))
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(btn_Inicio)
                .addGap(18, 18, 18)
                .addComponent(btn_Personaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportePartidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Puntaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //boton de crear personaje
    private void btn_PersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PersonajeActionPerformed
        VistaCrearPersonaje vista = new VistaCrearPersonaje();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);

         //cerrar menú
          this.dispose();
    }//GEN-LAST:event_btn_PersonajeActionPerformed
    
    //se sale del programa
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
     System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    //boton de inicio del juego
    private void btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InicioActionPerformed
        //validando que no inicie si no ha creado un personaje
        if (PersonajeController.contadorPersonajes == 0) {
        JOptionPane.showMessageDialog(this, "Debe crear un personaje primero");
        return; 
    }
    VistaElegirPersonaje v = new VistaElegirPersonaje();
    v.setVisible(true);
    v.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_btn_InicioActionPerformed

    //boton de reporte de partidas
    private void btnReportePartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportePartidasActionPerformed
    //Validando de que no habra si no hay partidas registradas
        if (PartidaController.obtenerCantidad() == 0) {
        JOptionPane.showMessageDialog(this, "No hay partidas registradas.");
        return;
    }
        
    VistaReportePartidas v = new VistaReportePartidas();
    v.setVisible(true);
    v.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReportePartidasActionPerformed

    
    //boton de mostrar grafica de puntajes
    private void btn_PuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PuntajeActionPerformed
// Crear ventana de gráfica
    VistaGrafica ventanaGrafica = new VistaGrafica();

    // Mostrar ventana
    ventanaGrafica.setVisible(true);

    // Crear la gráfica dentro del panel de la ventana
    new GraficaTopPuntajes(ventanaGrafica.getPanelGrafica());
         
    }//GEN-LAST:event_btn_PuntajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportePartidas;
    private javax.swing.JButton btn_Inicio;
    private javax.swing.JButton btn_Personaje;
    private javax.swing.JButton btn_Puntaje;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

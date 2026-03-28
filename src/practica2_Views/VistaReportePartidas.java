//Esta es mi vista de vista de reporte de partidas
package practica2_Views;

import javax.swing.table.DefaultTableModel;
import practica2_Controller.PartidaController;
import practica2_Model.ReportePartida;
import practica2_Views.VistaCarrera;

public class VistaReportePartidas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaReportePartidas.class.getName());

    public VistaReportePartidas() {
        initComponents();
        //llenar tabla con los datos de mis partidas
         cargarTabla();
    }
    
public void cargarTabla() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();

    // limpiar tabla
    modelo.setRowCount(0);

    ReportePartida[] lista = PartidaController.obtenerReportes();//pidiendo datos del controller de partidas
    int total = PartidaController.obtenerCantidad();

    //Recorriendo todas las partidas guardadas
    for (int i = 0; i < total; i++) {
    ReportePartida r = lista[i];

    //llenando tabla
    if (r != null) {
        modelo.addRow(new Object[]{
            i + 1,
            r.jugador,
            r.oponente,
            r.escoba,
            r.escobaOponente,
            r.puntosJugador,
            r.puntosOponente,
            r.ganador
        });
    }
}
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRegresaralMenuPrin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(177, 222, 200));

        jTable1.setBackground(new java.awt.Color(177, 222, 200));
        jTable1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Partida", "Jugador", "Oponente", "Escoba Jugador", "Escoba oponente", "Puntos jugador", "Puntos opoenente", "Ganador"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnRegresaralMenuPrin.setBackground(new java.awt.Color(215, 180, 250));
        btnRegresaralMenuPrin.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        btnRegresaralMenuPrin.setText("Regresar");
        btnRegresaralMenuPrin.addActionListener(this::btnRegresaralMenuPrinActionPerformed);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel1.setText("TUS PARTIDAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnRegresaralMenuPrin)
                .addGap(338, 338, 338))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresaralMenuPrin)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresaralMenuPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresaralMenuPrinActionPerformed
    vista_MenuPrincipal men = new vista_MenuPrincipal();
    men.setVisible(true);
    men.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_btnRegresaralMenuPrinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresaralMenuPrin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

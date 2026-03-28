//Esta es mi vista de elegir un personaje
package practica2_Views;
import javax.swing.JOptionPane;
import practica2_Controller.PersonajeController;
import practica2_Model.PersonajeModel;

public class VistaElegirPersonaje extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaElegirPersonaje.class.getName());


    public VistaElegirPersonaje() {
        initComponents();
        llenarCombo();//Esto llena las opciones dependiendo del personaje creado
    }
   
    //Metodo para llenas opciones de personajes
    public void llenarCombo() {
    cmbElegirPersonaje.removeAllItems();
    String[] nombres = PersonajeController.obtenerNombres();
    for (int i = 0; i < nombres.length; i++) {
        cmbElegirPersonaje.addItem(nombres[i]);
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbElegirPersonaje = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 227, 227));

        cmbElegirPersonaje.setBackground(new java.awt.Color(255, 102, 153));
        cmbElegirPersonaje.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        cmbElegirPersonaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbElegirPersonaje.addActionListener(this::cmbElegirPersonajeActionPerformed);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel1.setText("Eliga su personaje");

        btnJugar.setBackground(new java.awt.Color(255, 102, 153));
        btnJugar.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        btnJugar.setText("Ir a Jugar");
        btnJugar.addActionListener(this::btnJugarActionPerformed);

        btnRegresar.setBackground(new java.awt.Color(255, 102, 153));
        btnRegresar.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        btnRegresar.setText("Regresar al menu");
        btnRegresar.addActionListener(this::btnRegresarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJugar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbElegirPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnRegresar))
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbElegirPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnJugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbElegirPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbElegirPersonajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbElegirPersonajeActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    vista_MenuPrincipal menun = new vista_MenuPrincipal();
    menun.setVisible(true);
    menun.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    //Mi boton de ir a jugar 
    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        
    // validar que si haya seleccionado un personaje
    int index = cmbElegirPersonaje.getSelectedIndex();
    if (index == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un personaje");
        return;
    }

    // obtener jugador desde el controller de personaje
    PersonajeModel jugador = PersonajeController.obtenerPersonaje(index);

    // obtener oponente
    PersonajeModel oponente = PersonajeController.obtenerOponenteAleatorio(index);

    if (oponente == null) {
        JOptionPane.showMessageDialog(this, "Se necesita al menos 2 personajes");
        return;
    }

    // ir a la carrera
    //Aqui se llama a la vista carrera
    VistaCarrera carrera = new VistaCarrera(jugador, oponente);
    carrera.setVisible(true);
    carrera.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_btnJugarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbElegirPersonaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

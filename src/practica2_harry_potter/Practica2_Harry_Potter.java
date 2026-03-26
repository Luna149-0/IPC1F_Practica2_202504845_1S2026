
package practica2_harry_potter;

import practica2_Controller.PersonajeController;
import practica2_Views.vista_MenuPrincipal;

public class Practica2_Harry_Potter {

//Mostrando menu principal
    
    public static void main(String[] args) {
        
        PersonajeController control=new PersonajeController();
        
          vista_MenuPrincipal vista= new vista_MenuPrincipal();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);

    }
    
}

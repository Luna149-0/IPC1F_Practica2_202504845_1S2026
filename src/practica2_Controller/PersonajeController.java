
package practica2_Controller;

import practica2_Model.Casa;
import practica2_Model.EscobaModel;
import practica2_Model.PersonajeModel;

public class PersonajeController {
   public static PersonajeModel[] personajes= new PersonajeModel[100]; 
    public static int contadorPersonajes = 0;

   public void agregarPersonaje(PersonajeModel personaje) {
    personajes[contadorPersonajes] = personaje;
    contadorPersonajes++;
}

}
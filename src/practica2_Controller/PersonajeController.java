//Mi metodo de controlar personaje
package practica2_Controller;

import practica2_Model.Casa;
import practica2_Model.EscobaModel;
import practica2_Model.PersonajeModel;

public class PersonajeController {
   public static PersonajeModel[] personajes= new PersonajeModel[100];
   private static int siguienteId = 1;
   public static int contadorPersonajes = 0;

   public void agregarPersonaje(PersonajeModel personaje) {
    personajes[contadorPersonajes] = personaje;
    contadorPersonajes++;
}

   public static String[] obtenerNombres() {
    String[] nombres = new String[contadorPersonajes];

    for (int i = 0; i < contadorPersonajes; i++) {
        nombres[i] = personajes[i].getNombre();
    }

    return nombres;
}
   public static PersonajeModel obtenerPersonaje(int index) {
    return personajes[index];
}
   public static PersonajeModel obtenerOponenteAleatorio(int index) {
    if (contadorPersonajes <= 1) return null;

    int random;
    do {
        random = (int)(Math.random() * contadorPersonajes);
    } while (random == index);

    return personajes[random];
}
   
   
   public boolean crearPersonaje(String nombre, String casa, String tipoEscoba) {

    if (nombre == null || nombre.isEmpty()) {
        return false;
    }
    
     if (existePersonaje(nombre)) {
        return false;
    }

    // crear escoba
    EscobaModel escoba = new EscobaModel();

    if (tipoEscoba.equals("Nimbus 2000")) {
        escoba.setNombre("Nimbus 2000");
        escoba.setDormirSegundos(3);
    } else if (tipoEscoba.equals("Nimbus 2001")) {
        escoba.setNombre("Nimbus 2001");
        escoba.setDormirSegundos(2);
    } else {
        escoba.setNombre("Saeta de Fuego");
        escoba.setDormirSegundos(1);
    }

    // crear personaje
    
    PersonajeModel personaje = new PersonajeModel();
    personaje.setIdPersonaje(siguienteId); // asignar ID único
    siguienteId++;
    personaje.setNombre(nombre);
    personaje.setCasa(Casa.valueOf(casa));
    personaje.setEscoba(escoba);

    // guardar
    agregarPersonaje(personaje);

    return true;
    


}
   public boolean existePersonaje(String nombre) {
    for (int i = 0; i < contadorPersonajes; i++) {
        if (personajes[i].getNombre().equalsIgnoreCase(nombre)) {
            return true;
        }
    }
    return false;
}
   
   PersonajeModel personaje = new PersonajeModel();




}
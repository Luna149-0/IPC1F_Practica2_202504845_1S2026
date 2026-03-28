//Esta es mi clase de control de Partida
package practica2_Controller;

import practica2_Model.ReportePartida;

public class PartidaController {

    public static ReportePartida[] reportes = new ReportePartida[50];
    public static int contadorReportes = 0;

    public static void guardarReporte(ReportePartida r) {
        if (contadorReportes < reportes.length) {
            reportes[contadorReportes] = r;
            contadorReportes++;
        }
    }

    public static ReportePartida[] obtenerReportes() {
        return reportes;
    }

    public static int obtenerCantidad() {
        return contadorReportes;
    }
    
    //Metodo para crear grafica

   public static String[][] topPuntajes() {
    String[] nombres = new String[100];
    int[] puntajes = new int[100];
    int cantidadJugadores = 0;

    for (int i = 0; i < contadorReportes; i++) {
        ReportePartida r = reportes[i];
        if (r == null) continue;

        // Jugador 
        String nombre1 = r.jugador;
        int puntos1 = r.puntosJugador;
        int pos1 = -1;
        for (int j = 0; j < cantidadJugadores; j++) {
            if (nombres[j].equals(nombre1)) {
                pos1 = j;
                break;
            }
        }
        if (pos1 == -1) {
            nombres[cantidadJugadores] = nombre1;
            puntajes[cantidadJugadores] = puntos1;
            cantidadJugadores++;
        } else {
            puntajes[pos1] += puntos1;
        }

        // Oponente
        String nombre2 = r.oponente;
        int puntos2 = r.puntosOponente;
        int pos2 = -1;
        for (int j = 0; j < cantidadJugadores; j++) {
            if (nombres[j].equals(nombre2)) {
                pos2 = j;
                break;
            }
        }
        if (pos2 == -1) {
            nombres[cantidadJugadores] = nombre2;
            puntajes[cantidadJugadores] = puntos2;
            cantidadJugadores++;
        } else {
            puntajes[pos2] += puntos2;
        }
    }

    // Ordenamiento por selección
    for (int i = 0; i < cantidadJugadores - 1; i++) {
        int maxIdx = i;
        for (int j = i + 1; j < cantidadJugadores; j++) {
            if (puntajes[j] > puntajes[maxIdx]) {
                maxIdx = j;
            }
        }
        int tempPuntos = puntajes[i];
        puntajes[i] = puntajes[maxIdx];
        puntajes[maxIdx] = tempPuntos;

        String tempNombre = nombres[i];
        nombres[i] = nombres[maxIdx];
        nombres[maxIdx] = tempNombre;
    }

    // Crear matriz resultado
    String[][] resultado = new String[cantidadJugadores][2];
    for (int i = 0; i < cantidadJugadores; i++) {
        resultado[i][0] = nombres[i];
        resultado[i][1] = String.valueOf(puntajes[i]);
    }

    return resultado;
}
}
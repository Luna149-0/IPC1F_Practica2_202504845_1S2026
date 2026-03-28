/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2_Model;

/**
 *
 * @author ixche
 */
public class ReportePartida {


    public String jugador;
    public String oponente;
    public String escoba;
    public int puntosJugador;
    public int puntosOponente;
    public String ganador;
    public String escobaOponente;

  public ReportePartida(String jugador, String oponente,
                      String escobaJugador, String escobaOponente,
                      int puntosJugador, int puntosOponente,
                      String ganador) {

    this.jugador = jugador;
    this.oponente = oponente;
    this.escoba = escobaJugador;
    this.escobaOponente = escobaOponente;
    this.puntosJugador = puntosJugador;
    this.puntosOponente = puntosOponente;
    this.ganador = ganador;
}
}
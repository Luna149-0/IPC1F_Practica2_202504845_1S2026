/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2_Model;

import javax.swing.JLabel;

/**
 *
 * @author ixche
 */
public class ObjetoJuego {
    
    public int x;
    public int y;
    public String tipo;
    public JLabel label;

    public ObjetoJuego(int x, int y, String tipo, JLabel label) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
        this.label = label;
    }
    public boolean esJugador;
}




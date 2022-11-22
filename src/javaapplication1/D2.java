/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author sergio.lima
 */
abstract public class D2 extends Ponto {
    public Color corInterna;
    public boolean showArea = false;
    abstract public float area();
    abstract public float perimetro();
    public void desenhar(Graphics g) {
        if (showArea) {
            g.setColor(cor);
            g.drawString(Float.toString(area()), x-10, y-10);
       }      
    }
    
}

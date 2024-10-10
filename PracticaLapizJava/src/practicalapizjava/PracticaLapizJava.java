/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicalapizjava;

/**
 *
 * @author Alumno
 */
public class PracticaLapizJava {
    /**
     * @param args the command line arguments
     */
    double tamano;
    String color;
    String tipoPunta;
    String fabricante;
    public PracticaLapizJava (double tamano, String color, String tipoPunta, String fabricante) {
        this.tamano = tamano;
        this.color = color;
        this.tipoPunta = tipoPunta;
        this.fabricante = fabricante;
    }
    public void escribir () {
        System.out.println("Escribiendo...");
    }
    public String borrar () {
        return "Borrando...";
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String getColor () {
        return this.color;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PracticaLapizJava lapiz = new PracticaLapizJava(5.2, "Azul", "Gruesa", "Erick");
        lapiz.setColor("Amarillo");
        System.out.println("Color: "+ lapiz.color);
    }
}
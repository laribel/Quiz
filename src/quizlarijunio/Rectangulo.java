/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizlarijunio;

/**
 *
 * @author Laribel
 */
public class Rectangulo {
    int ancho; 
    int altura;

    public Rectangulo() {
        this.ancho=0;
        this.altura=0;
       
    }
   
    public Rectangulo(int ancho, int altura) throws NumeroExeption  {
        this.altura= altura;
        this.setAncho(ancho);
    }
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws NumeroExeption {
        
     if( ancho <= 0){
       throw new NumeroExeption("El numero debe ser mayor a cero");
     } 
     this.ancho = ancho;
        
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) throws NumeroExeption {
       
        if( altura <= 0){
               throw new NumeroExeption("El numero debe ser mayor a cero");
        }
        this.altura = altura;
    }
    
    public int calcArea(){
      
        return ancho*altura;
        
      
    }
    
}

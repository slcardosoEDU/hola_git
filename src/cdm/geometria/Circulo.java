/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdm.geometria;

/**
 *
 * @author Samu
 */
public class Circulo {
    
    double radio;
    boolean valido;
    
    double getArea(){
        double areaCuadrado = radio * radio * Math.PI;
        return areaCuadrado;
    }
    
    double getPerimetro(){
        double preimetroCuadrado = radio * 4;
        return preimetroCuadrado;
    }
    
    void setLado(double l){
        radio = l;
        if(l>0){
            valido = true; 
        }else{
            valido = false;
        }
    }
    
    public String toString(){
        return "C?rculo de radio "+radio+"\n\t?rea = "+getArea()+"\n\tPer?metro = "+getPerimetro();
    }
    
}

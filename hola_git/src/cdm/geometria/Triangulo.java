/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdm.geometria;

/**
 *
 * @author Samu
 */
public class Triangulo {
    
    double base;
    double altura;
    boolean valido;
    
    double getArea(){
        double areaCuadrado = base * altura / 2;
        return areaCuadrado;
    }
    
    double getPerimetro(){
        double preimetroCuadrado = base * 4;
        return preimetroCuadrado;
    }
    
    void setBase(double l){
        base = l;
        if(l>0){
            valido = true; 
        }else{
            valido = false;
        }
    }
    
    void setAltura(double l){
        altura = l;
        if(l>0){
            valido = true; 
        }else{
            valido = false;
        }
    }
    
    public String toString(){
        return "Triángulo de base "+base+" y altula "+altura+"\n\tÁrea = "+getArea()+"\n\tPerímetro = "+getPerimetro();
    }
    
}

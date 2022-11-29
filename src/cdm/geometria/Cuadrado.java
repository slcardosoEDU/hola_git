
package cdm.geometria;

public class Cuadrado {
    
    double lado;
    boolean valido;
    
    double getArea(){
        double areaCuadrado = lado * lado;
        return areaCuadrado;
    }
    
    double getPerimetro(){
        double preimetroCuadrado = lado * 4;
        return preimetroCuadrado;
    }
    
    void setLado(double l){
        lado = l;
        if(l>0){
            valido = true; 
        }else{
            valido = false;
        }
    }    
}


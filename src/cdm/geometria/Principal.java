package cdm.geometria;

public class Principal {
    
    public static void main(String[] args) {
        //Creamos el objeto
        Cuadrado miCuadrado = new Cuadrado();
        //Le damos valor a los atributos
        miCuadrado.setLado(5.5);
        //Calculamos área y perímetro
        double area = 0.0;
        double perimetro = 0.0;
        if(miCuadrado.valido){
            area = miCuadrado.getArea();
            perimetro = miCuadrado.getPerimetro();
        }
        //Imprimimos resultados
        System.out.println("Cuadrado de lado "+miCuadrado.lado);
        System.out.println("Área: "+area);
        System.out.println("Perímetro: "+perimetro);
    }    
}


/*
Proyecto caja:
Ejercicio 1 :Crear un proyecto según las especificaciones
mostradas a continuacion.
La formula es:volumen=ancho*alto*profundidad
*/
package caja;//Package

public class PruebaCaja {
    public static void main(String[] args) {//Metodo main
    //Variables locas 
    int medidaAncho=3;//Valores ingresados en código duro
    int medidaAlto=2;
    int medidaProf=6;
    
    Caja caja1=new Caja();//Instanciamos el objeto,contructor vacio
    caja1.ancho=medidaAncho;
    caja1.alto=medidaAlto;
    caja1.profundo=medidaProf;
    int resultado=caja1.calcularVolumen();//Llamamos al método
    //Primer resultado
        System.out.println("resultado volumen de caja 1: "+ resultado);
        
        Caja caja2=new Caja(2,4,6);//Llamamos al contructor 2 con nuevos argumentos
        //Llamamos con el nuevo objeto al metodo para un nuevo calculo
        System.out.println("resultado volumen de caja 2: "+caja2.calcularVolumen());
    }
    
}

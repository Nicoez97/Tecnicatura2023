
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //El constructor es un método especial
    public Aritmetica(){
        System.out.println("Se esta ejecutando este contructor número uno");
    }
    
    public Aritmetica(int a,int b){//Constructor2 
        this.a=a;
        this.b=b;
        System.out.println("Se esta ejecuntado este contructor número dos");
    }
    
    //Metodo
    public void sumarNumeros(){
        int resultado= a + b;
        System.out.println("resultado = " +resultado );
    
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return this.a + this.b;
    }
    public int sumarConArgumentos(int arg1,int arg2){
        this.a=arg1;//El argumento a se agigna al atributo this.a
        this.b=arg2;
        //return a + b;
        return this.sumarConRetorno();
    }
}

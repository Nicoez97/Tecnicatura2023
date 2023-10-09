/*
Ejercicio 4: Pedir número hasta que se teclee uno negativo,
y mostrar cuantos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane
*/
package Ciclos04;

import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero,conteo=0;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero >= 0){
            JOptionPane.showConfirmDialog(null,"El número "+numero+" el POSITIVO");
            conteo++;
            System.out.println("Digite otro número: ");
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));   
        }
        JOptionPane.showConfirmDialog(null,"A Ingresado "+conteo+" números que no son negativos");
        
    }
    
}

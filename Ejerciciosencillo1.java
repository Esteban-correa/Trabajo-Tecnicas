/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosencillo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author  Diana  Margot  López Herrera
 * Agosto  25 de  2015
 * Dado  un numero determinado  de   personas  halle  el promedio de la edad
 * Reuso del  metodo  Leer 
 */
public class ONi-chan {

    /**
     * @param args the command line arguments
     */
    //método  que  lee  datos desde  el teclado,  y devuelve  solo enteros.
    static int  leer(String mensaje) throws IOException{
        String ingreso;
        int numero;        
        System.out.println(mensaje);
        //capturar errores  falta
        BufferedReader stdin = new BufferedReader(
        new InputStreamReader(System.in));
        ingreso = stdin.readLine();    
        numero = Integer.parseInt(ingreso);   //linea  innecesaria     
        return numero;
    }
    
    //método que  calcula el promedio, dada la suma y  la  cantidad de datos
    static  double calcularPromedio(double suma, int cantidad){
        double  resultado;        
        resultado =  suma/cantidad;
        return resultado;
    }
      //método que  suma dos numeros double
    static  double sumar(double numero1, double numero2){
        double  resultado;        
        resultado =  numero1+numero2;
        return resultado;
    }
            
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int numeroinvitados;
        int edad;
        double suma=0;
        double dinero=0;
        double promedio;
        double  dineroRecaudado =0;
        //double nuevonumero;
        System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦");
        System.out.println("Bienvenidos a la fiesta de los que sobran ");
        System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦");
        numeroinvitados = leer("Ingrese la cantidad de invitados"); 
        System.out.println("La cantidad de invitados es = "+ numeroinvitados);
        //ciclo  que  lee  la  edad de  cada  uno de los  invitados  y la  suma
        for(int x=1;x<=numeroinvitados;x++){
            System.out.println("INVITADO "+x);
            edad=leer("La edad:");
            suma = suma+edad;
            dinero=leer("El valor del  regalo es: ");
            dineroRecaudado = sumar(dineroRecaudado,dinero);
        }
        //invocación al método que calcula la edad
        promedio = calcularPromedio(suma, numeroinvitados);
        
        System.out.println("La edad promedio de los invitados es = "+ promedio); 
        System.out.println("");
        System.out.println("el dinero recaudado es = "+ dineroRecaudado); 
        System.out.println("");
        System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦");
        System.out.println("Te  espero  en  una próxima ocasión ");
        System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦");
    }
    
}

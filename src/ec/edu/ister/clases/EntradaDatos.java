/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.clases;
import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

/**
 *
 * @author MARIA LOYA
 */
public class EntradaDatos {
    
    Scanner input= new Scanner(System.in);
    public void ingreso1(){
        System.out.println("\t COLADA MORADA ");
        System.out.println("\t Menu \n");
        System.out.println(" 1.- Colada Morada \n");
        System.out.println(" 2.- Guagua de Pan \n");
        
        System.out.println("Ingrese un item \n -");
        int x= input.nextInt();
        
        if(x==1){
          System.out.println("Ingrese los ingredientes de la Colada Morada: \n");
            System.out.println("Mora");
            System.out.println("Mortiño");
            System.out.println("Babaco");
            System.out.println("Piña");
            System.out.println("Frutilla \n");
          System.out.println("Preparacion de la Colada Morada: \n");
            System.out.println("Primero ponemos a hervir el agua");
            System.out.println("Luego ponemos a cocinar el mortiño y la mora aparte");
            System.out.println("De ahi se le pica las frutas y se le pone en almibar");
            System.out.println("Luego licuamos la mora y el mortiño");
            System.out.println("De ahi mesclamos todos los ingredientes");
            System.out.println("Y por ultimo le servimos al gusto del ciente");
        }
        
        if(x==2){
          System.out.println("Ingrese los ingredientes de la Guagua de Pan: \n");
           System.out.println("Levadura"); 
           System.out.println("Leche");
           System.out.println("Azucar");
           System.out.println("Harina");
           System.out.println("Sal");
           System.out.println("Huevos");
           System.out.println("Relleno: Chocolate, Mermelada o Dulce de Guayaba \n");
          System.out.println("Preparacion de la Guagua de Pan: \n");
            System.out.println("Primero diluimos la levadura en la leche");
            System.out.println("Anadir la harina y mezclar hasta que se haga masa levada");
            System.out.println("Luego agregar los otros ingredientes en la masa levada");
            System.out.println("De ahi amarsala bien a la masa");
            System.out.println("Luego hacer las figuras con la masa");
            System.out.println("De ahi poner el relleno en la figura");
            System.out.println("Despues poner a hornear las Guaguas de Pan");
            System.out.println("De ahi sacarlas del horno y decorarle");
            System.out.println("Y por ultima sirva la guaguas de pan acompañada con colada morada");
            
        }
      if(x >= 3){
          System.out.println("Este valor no es valido");
      }
    }
    
}

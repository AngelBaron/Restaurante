/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Calculo {
    private static double total;//variable privada y estatica para que los valores al momento de llamar y llamar la funcion no se alteren
    private static String datos;//variable igual para que no se altere
     private Restaurante restaurante;//es el objeto de la clase Restaurante

    public Calculo(Restaurante restaurante) {//Se crea constructor de la clase Calculo en el que almacena el objeto de la clase Restaurante
        this.restaurante = restaurante; //se va a ocupar la instancia actual, no se van a crear instancias distintas para mantener los valores
    }

    
    public void Suma(double x , String tipo){//metodo suma que recibe las variables x y tipo desde restaurante
        
        Scanner res = new Scanner(System.in);//se crea objeto scanner
        
        int n =1;//valor inicial de n para etrar en el while
        String comida = tipo;//la variable comida recibe la variable tipo
        total += x;//la variable global total recibe la variable x
        
        
        datos += comida + "*******" + x +"$" + '\n';//en datos se concatena comida y x
        Restaurante reinicio = new Restaurante();//se crea objeto de la clase Restaurante
        while(n==1|n==2){//Se crea el while
            System.out.println("Quieres agregar otro producto? \n 1 o 2= si \n 3= no");//Se pregunta al usuario
            n=res.nextInt();//recibe respuesta xd
            if(n==2|n==1){//se pregunta si es 1 o 2 , si es asi se vuelve a llamar el metodo actual menu
                restaurante.menu();
            }
            if(n==3){//si es 3 se llama al meotodo ticket
        Ticket();
            }
        }
    }
       
        
        
    
    public void Ticket(){//metodo 
        
        System.out.println("RESTAURANTE GARCIA");//estructura de ticket
        System.out.println("**********************");
        System.out.println("Lo que ha pedido es: \n" +datos);//se llama a la variable que almaceno la lista de datos
        System.out.println();
        System.out.println("El total de la suma es: "+total);//se llama a la avariable que es la suma de toda la comida
        System.out.println("ORDEN NUM 947287");
        System.out.println("\tMUCHAS GRACIAS");
        System.exit(0);
        
    }
}

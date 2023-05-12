/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Restaurante {
    int n;//recibe las respuestas
    Calculo cuenta;//definir el objeto de la instancia de la clase
    Scanner entr = new Scanner(System.in);//creo el objeto scanner
    double x;//es para los costos de cada producto
    String tipo="";//Es para los nombres de cada producto
    public static void main(String[] args) {//metodo main (inicial)
        Scanner respuesta = new Scanner (System.in);//se crea otro scanner estatico
       
        Restaurante in = new Restaurante();//se crea el objeto de la clase Restaurante
        
       in.menu();//Se llama al metodo menu
        
    }
    public Restaurante() {//se crea un constructor para especificar que instancia ocupar osea ocupar solo una
    this.cuenta = new Calculo(this);//la instancia es de la clase calculo
}
    public void menu(){//metodo menu que se llama desde main
        Restaurante cd = new Restaurante();//creacion de otro objeto de la clase
        System.out.printf("BIENVENIDO AL RESTAURANTE GARCIA" + '\n' + 
                "1) Platillos para el desaynuno" + '\n' + "2) Platillo spara la comida \n 3)Platillo para la cena \n 4) Bebidas \n 5) Postres");//Se muestra el menu
        n=entr.nextInt();//n recibe la respuesta del usuario
        switch(n){//segun la respuesta del usuario
            case 1: cd.Desayuno();//LLAMADA A CADA METODO
            break;
            case 2: cd.Comida();
            break;
            case 3: cd.Cena();
            break;
            case 4: cd.Bebidas();
            break;
            case 5: cd.Postres();
                    break;
            default: System.out.println("ERROR NO SE ENCUENTRA LA OPCION");//DEFAULT
        }
    }
    public void Desayuno(){//metodo del desayuno
        System.out.printf("1)Huevos \n 2)Chilaquiles \n "
                + "3)Tostadas \n 4)Hotcakes \n 5)Cereales \n 6)Crepas \n 7)Ensaladas \n 8)Atun \n 9)ENsalada de fresa \n 10)Ensalada de manzana" ); //Muestro menu
        
        n=entr.nextInt();//n recibe respuesta
        switch(n){//segun n hacer
            case 1: x=25;//x recibe el precio
            tipo = "huevos";//tipo recibe el nombre
            break;
            case 2: x=30;
            tipo = "Chilaquiles";
            break;
            case 3: x=20;
            tipo = "Tostadas";
            break;
            case 4: x=15;
            tipo = "Hotcakes";
            break;
            case 5: x=20;
            tipo = "Cereales";
            break;
            case 6: x=35;
            tipo = "Crepas";
            break;
            case 7: x=40;
            tipo = "Ensalada";
            break;
            case 8: x=25;
            tipo = "Atun";
            break;
            case 9: x=20;
            tipo = "Ensalada de fresa";
            break;
            case 10: x=25;
            tipo = "Ensalada de manzana";
            break;
            default: x=0;
            System.out.println("No se eligió comida");
            break;
        }
        cuenta.Suma(x, tipo);//se envian los parametros a la clase calculo al metodo suma
        
    }
    
    public void Comida(){//Lo mismo eque en el desayuho
        System.out.printf("1)Carne de res \n 2)Pozole \n 3)Tinga \n 4)Carnitas \n 5)Pollo \n 6)Hamburguesa \n 7)Ensaladas \n 8)Pescado \n 9)ENsalada de fresa \n 10)Ensalada de manzana" );
        n=entr.nextInt();
        switch(n){
            case 1: x=25;
            tipo = "Carne de res";
            break;
            case 2: x=30;
            tipo = "Pozole";
            break;
            case 3: x=60;
            tipo = "Tinga";
            break;
            case 4: x=40;
            tipo = "Carnitas";
            break;
            case 5: x=30;
            tipo = "Pollo";
            break;
            case 6: x=25;
            tipo = "Hamburguesa";
            break;
            case 7: x=28;
            tipo = "Ensalada";
            break;
            case 8: x=23.5;
            tipo = "Pescado";
            break;
            case 9: x=34;
            tipo = "Ensalada de fresa";
            break;
            case 10: x=25;
            tipo = "Ensalada de manzana";
            break;
            default: x=0;
            System.out.println("No se eligio comida");
            break;
        }
        cuenta.Suma(x,tipo);
    }
    public void Cena(){
        System.out.printf("1)Tacos al pastor \n 2)Hot dog \n 3)Tacos de perro \n 4)Consome \n 5)Cereales \n 6)Crepas \n 7)Ensaladas \n 8)Tamales \n 9)ENsalada de fresa \n 10)Ensalada de manzana" );
        n=entr.nextInt();
        switch(n){
            case 1: x=25;
            tipo = "tacos al pastor";
            break;
            case 2: x=45;
            tipo = "Hot dog";
            break;
            case 3: x=35;
            tipo = "Tacos de perro";
            break;
            case 4: x=22.8;
            tipo = "Consome";
            break;
            case 5: x=23;
            tipo = "Cereales";
            break;
            case 6: x=18;
            tipo = "Crepas";
            break;
            case 7: x=24;
            tipo = "Ensalada";
            break;
            case 8: x=30;
            tipo = "Tamales";
            break;
            case 9: x=32;
            tipo = "Ensalada de manzana";
            break;
            case 10: x=12;
            tipo = "Ensalada de fresa";
            break;
            default: x=0;
            System.out.println("No se eligio comida");
            break;
        }
        cuenta.Suma(x,tipo);
    }
    public void Postres(){
        System.out.printf("1)Pastel \n 2)Gelatina \n 3)Galletas \n 4)Hotcakes \n 5)Cereales \n 6)Helado \n 7)Frutra \n 8)fresas \n 9)pan \n 10)Papas" );
        n=entr.nextInt();
        switch(n){
            case 1: x=25;
            tipo = "Pastel";
            break;
            case 2: x=32;
            tipo = "Gelatina";
            break;
            case 3: x=23;
            tipo = "Galletas";
            break;
            case 4: x=24;
            tipo = "Hotcakes";
            break;
            case 5: x=29;
            tipo = "Cereales";
            break;
            case 6: x=31;
            tipo = "Helado";
            break;
            case 7: x=34;
            tipo = "Fruta";
            break;
            case 8: x=45;
            tipo = "fresas";
            break;
            case 9: x=23;
            tipo = "pan";
            break;
            case 10: x=20;
            tipo = "Papas";
            break;
            default: x=0;
            System.out.println("No se eligio comida");
            break;
        }
        cuenta.Suma(x,tipo);
    }
    public void Bebidas(){
        System.out.printf("1)Tewquila \n 2)Coca de piña \n 3)Agua \n 4)Mezcal \n 5)Michelada \n 6)Pitufo \n 7)Mula \n 8)Licuado \n 9)Tang \n 10)soda" );
        n=entr.nextInt();
        switch(n){
            case 1: x=12;
            tipo = "Tequila";
            break;
            case 2: x=23;
            tipo = "Coca de piña";
            break;
            case 3: x=18;
            tipo = "Agua";
            break;
            case 4: x=17.5;
            tipo = "Mezcal";
            break;
            case 5: x=14.5;
            tipo = "Michelada";
            break;
            case 6: x=12.4;
            tipo = "Pitufo";
            break;
            case 7: x=20;
            tipo = "Mula";
            break;
            case 8: x=23;
            tipo = "Licuado";
            break;
            case 9: x=12;
            tipo = "Tang";
            break;
            case 10: x=23;
            tipo = "Soda";
            break;
            default: x=0;
            System.out.println("No se eligio bebidas");
            break;
        }
        cuenta.Suma(x,tipo);
    }
    
}

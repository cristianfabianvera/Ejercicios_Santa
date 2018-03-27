//Escribir un programa que detecte si un numero introducido desde teclado es positivo o negativo 
package ejercicios;

import java.util.Scanner;
public class Ejercicios {
    
    public Scanner teclado;
    public int nume1,nume2,nume3;
    public int [] num1;
    public int Ejercicio;
    
    public void Ejercicio1(){
      teclado= new Scanner(System.in);
      num1= new int [4];
        for (int i = 0; i < 4; i++) {
        System.out.println("Ingrese un  numero: ");
        num1 [i]=teclado.nextInt();           
                      
        if (num1[i]<0) {
            System.out.println("El numero es negativo y es :"+num1[i]+"");
            
        } 
        else{
            System.out.println("El numero es positivo y es:"+num1[i]+"");
        }
        }        
    }  
    
 //    
    
    public void Ejercicio2(){
      teclado= new Scanner(System.in);
        System.out.println("Ingrese el primero numero: ");
        nume1=teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        nume2=teclado.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        nume3=teclado.nextInt();
        
        if (nume1<nume2 && nume1<nume3 && nume2<nume3 ) {            
          
                 System.out.println("Los numero van en orden creciente:\n"+nume1+""+nume2+""+nume3+"");            
                  }
        else{
            System.out.println("Los numeros no estan en orden creciente:\n"+nume1+""+nume2+""+nume3+"");
        }         
}
   //    
    
    public void Ejercicio3(){
    teclado= new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        nume1=teclado.nextInt();
        
        if (nume1%2==0) {
            System.out.println("El numero es par:\nY es:"+nume1+"");
            
        }
        else {
            System.out.println("El numero es impar:\nY es:"+nume1+"");
        }
    
    }
    
    public void Ejercicio4(){
    teclado= new Scanner(System.in);
        System.out.println("Ingrese un numero:");
         nume1=teclado.nextInt();
        
          if (nume1<100) {
              System.out.println("El numero es menor a 100 Y  es:"+nume1+"");
          }
        if (nume1==100) {
            System.out.println("El numero es igual a 100");
       
        }
            if (nume1>100) {
                System.out.println("El numero es mayor a 100 Y es: "+nume1+"");
                     }       
             
             
    }
    
    //
    
    public void Ejercicio5(){
    teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1-7 ");
        nume1=teclado.nextInt();
        switch(nume1){
            case 1:
                System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
                default:
                    System.out.println("La semana solo tiene 7 días");
        }
            
            
    }
    
    //
    
    public void Ejercicio6(){
    
    char letra;
        System.out.println("Ingrese un caracter:");
        teclado = new Scanner(System.in);
        letra=teclado.next().charAt(0);
        if (letra=='a' || letra=='A' || letra=='e'  || letra=='E' || letra=='i' || letra=='I' || letra=='o' || letra=='O' || letra=='u' || letra=='U') {
            System.out.println("El caracter es una vocal y es:"+letra+"");
        }
        else{
            System.out.println(""+letra+" No es una vocal");
        }
        }
    //
    
    public void Ejercicio7(){
    teclado= new Scanner(System.in);
    
        System.out.println("Ingrese el primer numero:");
        nume1=teclado.nextInt();
        System.out.println("\nIngrese el segundo numero:");
        nume2=teclado.nextInt();
        
        if (nume1>nume2) {
            System.out.println(""+nume2+""+nume1+"");
            
        } else {
            System.out.println(""+nume1+""+nume2+"");
            
        }
    
    }

    //
    
    public void Ejercicio8(){
    teclado= new Scanner(System.in);
    int contador = 0;
        System.out.println("Ingrese un numero:");
        nume1=teclado.nextInt();
        for (int i = 1; i <nume1; i++) {
            if (nume1 % i==0) {
                contador++;
                
            }
            
        }
        if (contador !=2) {
            System.out.println("No es primo");
            
        }
        else {
            System.out.println("Si es primo");
        }
        
    }
    
    public void Ejercicio9(){
    teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        nume1=teclado.nextInt();
        for (int i = -1; i <nume1; i++) {
            i=i+1;
            System.out.println(i);
        }
            
    
    }
    //
    
    public void Ejercicio10(){
    int temp,num1=0,num2=1;
    int limite=50000;
    
        System.out.print(num1);
        System.out.print(num2);
        
        while(num2+num1 <=limite){
        temp= num1;
        num1=num2;
        num2=temp + num1;
            System.out.print(num2);
        }
    }

    public static void main(String[] args) {
      Ejercicios  Ej= new Ejercicios();

        Scanner teclado;
         
         int Ejercicio=10;
        
          teclado= new Scanner(System.in);
          
    
      
        do {            
             System.out.println("Ingrese el numero de ejercicio recuerde es de 1 a 10 para finalizar oprima el  numero 0");
            Ejercicio=teclado.nextInt();
             switch(Ejercicio){
    
        case 1:
            System.out.println("\nEscribir un programa que detecte si un numero introducido desde teclado es positivo o negativo \n");
           Ej.Ejercicio1();    
    break;
            
        case 2:
            System.out.println("\nEscribir un programa que detecte si tres número introducidos por el usuario están en orden creciente");
                    
            Ej.Ejercicio2();
            break;
            
        case 3:
            System.out.println("\nEscribir un programa que detecte si un número leído desde teclado es pa o impar");
             Ej.Ejercicio3();
            break;
            
        case 4: 
            System.out.println("\nEscibir un programa que detecte si un número leído desde teclado es mayor,menor o igual a100");
            Ej.Ejercicio4();
            break;
            
        case 5:
            System.out.println("\nEscribir un programa que dado un número del 1 al 7 escriba el correspondiente día de la semana");
            Ej.Ejercicio5();
            break;
            
        case 6: 
            System.out.println("\nEscribir un  programa que lea un carácter e indique si es o no vocal");
            Ej.Ejercicio6();
            break;
            
        case 7:
            System.out.println("\nEscribir un programa que lea dos número desde el teclado y si \nel primero es mayor que el segundo intercambie sus valores en las variables e imprima el resultado");
           Ej.Ejercicio7();
            break;
            
        case 8:
            System.out.println("\nEscribir un programa  que lea un numero desde el teclado \ny diga si es primo o no");
            Ej.Ejercicio8();
            break;
            
        case 9: 
            System.out.println("\nEscribir un programa que ingrese un numero N y muestre los\n pares que hay entre 1 y N");
            Ej.Ejercicio9();
           break;
            
        case 10:
            System.out.println("\nEscribir un programa que realice la serie Fibonacci");
            Ej.Ejercicio10();
            
        default:
            System.out.println("\nEl numero del ejercicio solicitado no existe por ello se cierra el programa");
            }    
        } while (Ejercicio!=0);
    
       
       
       
       
    }
    
}

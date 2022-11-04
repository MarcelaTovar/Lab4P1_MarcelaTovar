
package lab4p1_marcelatovar;

import java.util.Scanner;
import java.util.Random;
public class Lab4P1_MarcelaTovar {
    public static void main(String[] args) {
        Scanner ObiWan = new Scanner (System.in);
        int opcion =0;
        System.out.println("¡Bienvenido a mi primera lab de Programación!");
            System.out.println("Me gustaría saber como llamarte");
            System.out.println("Porfavor ingresa tu nombre: ");
            String nombre = ObiWan.nextLine();
            System.out.println("¡Genial! Es un gusto conocerte "+nombre);
            System.out.println("A continuación veremos el menú de este programa.");
        do{
            
            System.out.println("---Menu---");
            System.out.println(" 1. Fallout Words. ");
            System.out.println(" 2. Rodatcripne. ");
            System.out.println( " 3. Alpha");
            System.out.println( " 4. Salir");
            System.out.println("Recuerde favor ingresar un numero válido.");
            System.out.println("Porfavor "+nombre+ " ingresa el numero que deseas realizar: ");
            opcion = ObiWan.nextInt();
            while (opcion!=3||opcion!=2||opcion!=1||opcion !=4){
                break;
            }
            switch(opcion){
                case 1:
                    FallOutWord();
                    break;
                case 2:
                    Rodatcripne();
                    break;
                case 3:
                    is_alpha();
                    break;
            }
            
        }while(opcion == 1|| opcion ==2 || opcion ==3 || opcion !=4);
    }
    public static void FallOutWord(){
        
        Scanner ObiWan = new Scanner (System.in);
        System.out.println("¡Bienvenido a Fallout Words!");
        System.out.println("Para jugar este juego tiene las siguientes palabras random.");
        System.out.println("Las palabras son: ");
        System.out.println("Comer, Jugar, Salta, Llora, Muere, Unida, Venti, Llama, Eevee, Local");
   
        int random_numero = new Random().nextInt((10 - 1) + 1) + 1;
        String nueva_palabra = Randomizador(random_numero);
        
        
        
        for(int i = 10; i > 0 ; i--){
            System.out.println("Favor ingrese la palabra: ");
        String numero_palabra = ObiWan.nextLine();
        boolean check = false;
        for (int e = 0; e < 10 ; e++){
            String palabra = Randomizador(e);
            if (numero_palabra.equalsIgnoreCase(palabra) ){
                check = true;
            }
        }
           if (check) {
            if (numero_palabra.equalsIgnoreCase(nueva_palabra)){
            System.out.println("¡Ganaste!");  
        }else{
            Check(numero_palabra,nueva_palabra);
        }
        
        System.out.println("Te quedan: " + i +" vidas"); }
        else{
                System.out.println("La palabra no funciona, ingrese otra.");
            }
 
                    }
        }
        
        
    
    public static String Randomizador(int numero_random){
        String PalabraRandom ="";
        String palabra1 = "Comer";
        String palabra2 = "Jugar";
        String palabra3 = "Salta";
        String palabra4 = "Llora";
        String palabra5 = "Muere";
        String palabra6 = "Unida";
        String palabra7 = "Venti";
        String palabra8 = "Llama";
        String palabra9 = "Eevee";
        String palabra10 = "Local";
        
        switch (numero_random){
            case 1:
                PalabraRandom = palabra1;
                break;
            case 2:
                PalabraRandom = palabra2;
                break;
            case 3:
                PalabraRandom = palabra3;
                break;
            case 4:
                PalabraRandom = palabra4;
                break;
            case 5:
                PalabraRandom = palabra5;
                break;
            case 6:
                PalabraRandom = palabra6;
                break;
            case 7:
                PalabraRandom = palabra7;
                break;
            case 8:
                PalabraRandom = palabra8;
                break;
            case 9:
                PalabraRandom = palabra9;
                break;
            case 10:
                PalabraRandom = palabra10;
                break;
            
        }
        return PalabraRandom;
    }
    public static boolean Check(String numero_pal, String nueva_pal){
        
        int tamaño = nueva_pal.length();
        int letra = 0;
        int posicion = 0;
        String nueva_palabra = "";
        String segunda_nueva = "";
        for (int contador = 0; contador < tamaño; contador+=1){
            char letra_nuevapal = nueva_pal.charAt(contador);
            char letra_numeropal = numero_pal.charAt(contador);
             
            nueva_palabra = Character.toString(letra_numeropal);
            segunda_nueva = Character.toString(letra_nuevapal);
            if (nueva_palabra.equalsIgnoreCase(segunda_nueva)){
                posicion +=1;
            }
                if (nueva_palabra.contains(segunda_nueva)){
                    letra += 1;
                        
            }
        }
            System.out.println("Posicion: "+posicion);
            System.out.println("Letras: "+letra);
                
            
            
        
    
        return true;
    }
    public static void Rodatcripne(){
        Scanner ObiWan = new Scanner (System.in);
        System.out.println("Favor ingrese la contraseña: ");
        String contraseña = ObiWan.nextLine();
        boolean verdad = false;
        for (int i = 0; i < contraseña.length(); i++){
            char contraseña5 = contraseña.charAt(0);
            if (Character.isUpperCase(contraseña5)){
            verdad = true;
        }
        }
        if (verdad){
            System.out.println("Favor ingresa una contraseña válida");
        }else{
        String contraseña2="";
        String reversa = "";
        String tamaño = "";
        String nueva_reversa ="";
        for (int contador2 = contraseña.length()-1; contador2 >= 0; contador2--){
            contraseña2+=contraseña.charAt(contador2);
            reversa=contraseña2;
            
            for (int contador3 = 0; contador3 < reversa.length(); contador3+=2 ){
                int random_numero = new Random().nextInt((9 - 0) + 0) + 0;
                String random = Integer.toString(random_numero);
                String letra_remplazo =Character.toString(reversa.charAt(contador3));
                reversa = reversa.replace(letra_remplazo, random);
            }
            
        }
        System.out.println(reversa);
        }
   
    }
    public static void is_alpha(){
        Scanner ObiWan = new Scanner (System.in);
        System.out.println("Ingrese palabra: ");
        String palabra = ObiWan.nextLine();
        boolean verdad = true;
        for (int i = 0; i < palabra.length();i++){
            char letra = palabra.charAt(i);
            int asciiValue= (int)letra;
            if (asciiValue < 65){
                verdad = false;
            }
            else if (asciiValue <90 || asciiValue>97){
                verdad = false;
            }
            else if(asciiValue > 122){
                verdad = false;
            }
        }
        if (verdad){
            System.out.println("Solo tiene letras");
        }else{
            System.out.println("No contiene solo letras");
        }
        
        
    }
    
    
    
}

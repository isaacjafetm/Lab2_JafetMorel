/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_jafetmorel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 24661
 */
public class Lab2_JafetMorel {
    static Scanner leer = new Scanner(System.in);
    static ArrayList lista= new ArrayList();
    static ArrayList premium= new ArrayList();
    
    public static void main(String[] args) {

        
        int opcion=0;
        String user;
        String password;
        System.out.println("Ingrese usuario:");
        user = leer.next();
        System.out.println("Ingrese contraseña");
        password = leer.next();
        boolean login=(user!="david"&(password!="99"));
        while(login=true){
            System.out.println("Usuario y/o contraseña incorrecta");
            System.out.println("Ingrese usuario:");
            user = leer.next();
            System.out.println("Ingrese contraseña");
            password = leer.next();
            login=(user=="david")&(password=="99");
        }
        while (opcion!=3){
            System.out.println("1. Reporte de restaurantes\n" +
                                    "   1. Reporte 1\n" +
                                    "   2. Reporte 2\n" +
                                    "   3. Reporte 3\n" +
                                    "2. Manejo de restaurantes\n" +
                                    "   1. Crear\n" +
                                    "   2. Listar\n" +
                                    "   3. Modificar\n" +
                                    "   4. Eliminar\n" +
                                    "3. Salir. ");
            opcion = leer.nextInt();
            if(opcion==1){
                System.out.println("Que opcion desea elegir?");
                int subopcion1= leer.nextInt();
                if(subopcion1==1){
                    System.out.println("Ingrse estado");
                    String estado= leer.next();
                    if(estado=="funcional"||estado=="Funcional"||estado=="FUNCIONAL"){
                        for (Object t : lista) {
                            if (t instanceof Restaurantes) {
                                System.out.println(lista.indexOf(t)+"-> "+t+"\n");
                            }
                        }
                    }else{
                        for (Object t : lista) {
                            if (t instanceof NoFuncionales) {
                                System.out.println(lista.indexOf(t)+"- "+t+"\n");
                            }
                        }   
                    }
                }else if(subopcion1==2){
                    for(Object i: premium){
                        System.out.println(premium.indexOf(i)+"-> "+i+"\n");
                    }
                } else if(subopcion1==3){
                    System.out.println("Ingrese franquicia");
                    String fran=leer.next();
                    ;
                }else{
                    System.out.println("Opción no válida");
                }
            }else if(opcion==2){
                System.out.println("Que opcion desea elegir?");
                int subopcion2= leer.nextInt();
                if(subopcion2==1){
                    crear();
                }else if(subopcion2==2){
                    listar();
                } else if(subopcion2==3){
                    
                }else if(subopcion2==4){
                    
                }
            }
        }
    }
    
    public static void crear(){
        System.out.println("Ingrese franquicia:");
        String fran=leer.nextLine();
        System.out.println("Ingrese nombre:");
        String nombre=leer.next();
        System.out.println("Ingrese ubicación:");
        String ubicacion=leer.next();
        System.out.println("Ingrese cantidad de empleados:");
        int emp= leer.nextInt();
        System.out.println("Hay parqueo?[s/n]:");
        char p = leer.next().charAt(0);
        System.out.println("Hay area de juegos?[s/n]:");
        char j = leer.next().charAt(0);
        System.out.println("Ingrese cantidad de cajeros:");
        int caj= leer.nextInt();
        System.out.println("Ingrese estado del restaurante (Remodelacion, Demolicion o Funcional");
        String estado = leer.next();
        boolean funcionamiento=(estado!="funcional")|(estado!="Funcional")|(estado!="FUNCIONAL");
        if(funcionamiento=true){
                        System.out.println("Ingrese nombre del gerente:");
            String ger = leer.next();
            System.out.println("Ingrese especialidad:");
            String especial = leer.next();
            System.out.println("Ingrese numero de mesas:");
            int mesa = leer.nextInt();
            lista.add(new Restaurantes(fran, nombre, ubicacion, p, j,ger,especial,estado,emp,mesa,caj));
            if((p=='s'&j=='s')||(p=='S'&j=='S')){
                premium.add(new Premium(nombre, ubicacion, especial));
            }
        }else{
           lista.add(new NoFuncionales(fran, nombre, ubicacion, p, j,estado,emp,caj));
        }
        
    }
    
    public static void listar(){
        for (Object t : lista) {
                    
                        System.out.println(lista.indexOf(t)+"- "+t+"\n");
                    
                }
        
    }
    public static void modificar(){
        System.out.println("Ingrese posicion que desea modificar");
        int pos= leer.nextInt();
        System.out.println("Que desea modificar?\n"
                + "1.	franquicia;\n" +
                "2.	nombre;\n" +
                "3.	ubicacion;\n" +
                "4.	parqueo;\n" +
                "5.	juegos;\n" +
                "6.	gerente;\n" +
                "7.	especialidad;\n" +
                "8.	empleados;\n" +
                "9.	mesas;\n" +
                "10.	cajeros;");
        int mod=leer.nextInt();
        switch(mod){
            case 1:{
                System.out.println("A que desea cambiarlo?");
                String a=leer.next();
                ((Restaurantes)lista.get(pos)).setFranquicia(a);
                break;
            }
            case 2:{
                System.out.println("A que desea cambiarlo?");
                String a=leer.next();
                ((Restaurantes)lista.get(pos)).setNombre(a);
                break;
            }
            case 3:{
                System.out.println("A que desea cambiarlo?");
                String a=leer.next();
                ((Restaurantes)lista.get(pos)).setUbicacion(a);
                break;
            }
            case 4:{
                System.out.println("A que desea cambiarlo?");
                char a=leer.next().charAt(0);
                ((Restaurantes)lista.get(pos)).setParque0(a);
                break;
            }
            case 5:{
                System.out.println("A que desea cambiarlo?");
                char a=leer.next().charAt(0);
                ((Restaurantes)lista.get(pos)).setJuegos(a);
                break;
            }
            case 6:{
                System.out.println("A que desea cambiarlo?");
                String a=leer.next();
                ((Restaurantes)lista.get(pos)).setGerente(a);
                break;
            }
            case 7:{
                System.out.println("A que desea cambiarlo?");
                String a=leer.next();
                ((Restaurantes)lista.get(pos)).setEspecialidad(a);
                break;
            }
            case 8:{
                System.out.println("A que desea cambiarlo?");
                int a=leer.nextInt();
                ((Restaurantes)lista.get(pos)).setEmpleados(a);
                break;
            }
            case 10:{
                System.out.println("A que desea cambiarlo?");
                int a=leer.nextInt();
                ((Restaurantes)lista.get(pos)).setCajeros(a);
                break;
            }
            case 9:{
                System.out.println("A que desea cambiarlo?");
                int a=leer.nextInt();
                ((Restaurantes)lista.get(pos)).setMesas(a);
                break;
            }
        }
    }
    
    public static void eliminar(){
        System.out.println("Ingrese que posicion desea eliminar");
        int pos = leer.nextInt();
        lista.remove(pos);
    }
    
    public static void reporte3(String f){
        String salida="";
        for(int i=0; i<lista.size(); i++){
            
        }
        
        
    }
    
}
//por alguna razon cuando pongo espacio se salta la siguiente linea
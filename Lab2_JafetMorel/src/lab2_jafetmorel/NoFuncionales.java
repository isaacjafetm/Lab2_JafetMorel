/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_jafetmorel;

/**
 *
 * @author 24661
 */
public class NoFuncionales {
    private String franquicia;
    private String nombre;
    private String ubicacion;
    private char parqueo;
    private char juegos;
    private String estado;
    private int empleados;
    private int cajeros;
    public NoFuncionales(String franch, String name, String location, char park, char games, String status, int employee, int cashiers){
        franquicia=franch;
        nombre=name;
        ubicacion=location;
        parqueo=park;
        juegos=games;
        estado=status;
        empleados=employee;
        cajeros=cashiers;
    }
    
    public String toString(){
        return "Nombre: "+nombre+". Franquicia: "+franquicia+". Ubicacion: "+ubicacion+". Hay parqueo?: "+parqueo+". Hay juegos?: "+juegos+". Cantidad de empleados: "+empleados+". Cantidad de cajeros. "+cajeros+". Estado: "+estado+".";
    }
    public String getNombre(){
        return nombre;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
}

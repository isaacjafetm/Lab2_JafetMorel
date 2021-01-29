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
public class Restaurantes {
    private String franquicia;
    private String nombre;
    private String ubicacion;
    private char parqueo;
    private char juegos;
    private String gerente;
    private String especialidad;
    private String estado;
    private int empleados;
    private int mesas;
    private int cajeros;
    
    public Restaurantes(String franch, String name, String location, char park, char games, String manager, String special, String status, int employee, int tables, int cashiers){
        franquicia=franch;
        nombre=name;
        ubicacion=location;
        parqueo=park;
        juegos=games;
        gerente=manager;
        especialidad=special;
        estado=status;
        empleados=employee;
        mesas=tables;
        cajeros=cashiers;
    }
    
    public String toString(){
        return "Nombre: "+nombre+". Franquicia: "+franquicia+". Ubicacion: "+ubicacion+". Hay parqueo?: "+parqueo+". Hay juegos?: "+juegos+". Cantidad de empleados: "+empleados+". Cantidad de cajeros. "+cajeros+". Estado: "+estado+". Nombre de gerente: "+gerente+". Cantidad de mesas: "+mesas+". Especialidad: "+especialidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setFranquicia(String nuevo){
        franquicia=nuevo;
    }
    
    public void setGerente(String nuevo){
        gerente=nuevo;
    }
    
    public void setNombre(String nuevo){
        nombre=nuevo;
    }
    
    public void setUbicacion(String nuevo){
        ubicacion=nuevo;
    }
    
    public void setEspecialidad(String nuevo){
        especialidad=nuevo;
    }

    public void setParque0(char nuevo){
        parqueo=nuevo;
    }
    
    public void setJuegos(char nuevo){
        juegos=nuevo;
    }
    
    public void setEmpleados(int nuevo){
        empleados=nuevo;
    }
    
    public void setMesas(int nuevo){
        mesas=nuevo;
    }
    
    public void setCajeros(int nuevo){
        cajeros=nuevo;
    }
    
}

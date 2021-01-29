/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_jafetmorel;


public class Premium {
    private String nombre;
    private String ubicacion;
    private String especialidad;
    
    public Premium(String name,String location, String special){
        this.nombre=name;
        this.ubicacion=location;
        this.especialidad=special;
    }
    
    public String toString(){
        return "Nombre: "+nombre+". Ubicacion: "+ubicacion+". Especialidad: "+especialidad;
    }
}

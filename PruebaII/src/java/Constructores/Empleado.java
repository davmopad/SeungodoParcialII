/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructores;

/**
 *
 * @author davmo
 */
public class Empleado {

    private int idempleado;
    private String cedula;
    private String nombre;
    private String apellido;

    public int getidempleado() {
        return idempleado;
    }

    public String getcedula() {
        return cedula;
    }

    public String getnombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setIdempleado(int idEmpleado) {
        this.idempleado = idEmpleado;
    }

    public void setcedula(String cedula) {
        this.cedula = cedula;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
}

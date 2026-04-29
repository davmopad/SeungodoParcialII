/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructores;

/**
 *
 * @author davmo
 */
public class Salario {

    private int idsalario;
    private int idempleado;
    private int anio;
    private int mes;
    private double salarioBruto;

    public int getanio() {
        return anio;
    }

    public int getmes() {
        return mes;
    }

    public double getsalariobruto() {
        return salarioBruto;
    }

    public void setanio(int anio) {
        this.anio = anio;
    }

    public void setmes(int mes) {
        this.mes = mes;
    }

    public void setsalariobruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}

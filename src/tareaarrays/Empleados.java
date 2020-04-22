/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarrays;


public class Empleados {

    static String size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String nombre;
    public String departamento;
    public int sueldoDiario;
    public int diasTrabajados;
    public int horasExtras;

    public Empleados() {
    }

    public Empleados(String nombre, String departamento, int sueldoDiario, int diasTrabajados, int horasExtras) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldoDiario = sueldoDiario;
        this.diasTrabajados = diasTrabajados;
        this.horasExtras = horasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(int sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    int getHorasExtra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

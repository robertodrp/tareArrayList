
package tareaarrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;



public class TareaArrays {
    private static Object empleados;

    
    
    public static void main(String[] args) {
        
       ArrayList<String> empeados = new ArrayList();
       ArrayList<Empleados> trabajadores = new ArrayList();
       trabajadores.add(new Empleados("José García Pérez", "sistemas", 670, 30, 5));
       trabajadores.add(new Empleados("Diana Herrera Pérez", "recursos humanos", 450, 25, 0));
       trabajadores.add(new Empleados("Jessica Juarez Días", "ventas", 400, 28, 0));
       trabajadores.add(new Empleados("Pedro Paz Orozco", "ventas", 410, 30, 0));
       trabajadores.add(new Empleados("José Marcel Pérez", "sistemas", 680, 29, 6));
       trabajadores.add(new Empleados("Jesús Días García", "recursos humanos", 455, 30, 0));
       trabajadores.add(new Empleados("Pedro Xotla Ramirez", "sistemas", 675, 27, 0));
       trabajadores.add(new Empleados("Javier Medina Blanco", "ventas", 400, 30, 4));
       trabajadores.add(new Empleados("Elizabeth Villa Sosa", "sistemas", 670, 30, 3));
    
   
        
      Iterator<Empleados> iter = trabajadores.iterator();
        int total = 0;
        while (iter.hasNext()) {
            Empleados empleado = iter.next();
            System.out.println("Sueldo mensual de " + empleado.getNombre() + ": " + (empleado.getSueldoDiario() * empleado.getDiasTrabajados()) + " pesos mexicanos.");
            total += empleado.getSueldoDiario() * empleado.getDiasTrabajados();
            System.out.println("Monto de horas extra de " + empleado.getNombre() + ": " + (empleado.getHorasExtra() * 85) + " pesos mexicanos.");
            total += empleado.getHorasExtra() * 85;
            System.out.println();

            System.out.println("Tam. del arreglo:"+ Empleados.size());
            }
        
        Iterator<Empleados> iter2 = trabajadores.iterator();
        int horasExtra = 0;
        String trabajadorConMasHoras = null;
        while (iter.hasNext()) {
      
        }
       
    
        System.out.println("El empleado que trabajó más horas extra es: " + trabajadorConMasHoras);
        
        }
      
}



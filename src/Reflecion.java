/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author Crist
 */
public class Reflecion {
    public static Paquetes paquete= new Paquetes();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final File archivo= new File("C:\\Users\\Crist\\Documents\\NetBeansProjects\\ReflexionFinal\\src");
        
        paquete.setNombres(archivo.getName());
        listaArchivos(archivo, paquete);
        
        VentanaPrincipal v=new VentanaPrincipal(paquete);
        v.setVisible(true);
    
}
    public static void listaArchivos(final File archivo, Paquetes paque){
        try {

            for (final File fichero : archivo.listFiles()) {

                if (fichero.isDirectory()) {
                    Paquetes pa = new Paquetes();
                    pa.setNombres(fichero.getName());
                    listaArchivos(fichero, pa);
                    paque.getPaquetes().add(pa);
                } else {
                    String nombre = fichero.getName();
                    String[] parts = nombre.split("\\.");
                    Class clazz;
                    if (paque.getNombres().equals("src")) {
                        clazz = Class.forName(parts[0]);
                    } else {
                        clazz = Class.forName(paque.getNombres() + "." + parts[0]);
                    }
                    Clases clase = new Clases();
                    clase.setNombre(parts[0]);
                    Method todosLosMetodos[] = clazz.getDeclaredMethods();

                    for (int i = 0; i < todosLosMetodos.length; i++) {
                        clase.getMetodo().add(todosLosMetodos[i].getName());
                    }

                    Field Variables[] = clazz.getDeclaredFields();

                    for (int i = 0; i < Variables.length; i++) {
                        clase.getAtributo().add(Variables[i].getName());
                    }
                    paque.getClases().add(clase);
                }

            }

        } catch (Exception e) {
            
        }
    }
}

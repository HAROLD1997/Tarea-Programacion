/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.Empresa1;

import Empresa.Empleados;
import javax.swing.JOptionPane;

/**
 *nombre,edad,direccion,telefono
 * @author Harold
 */
public class Aplicacion {
    public static void main(String[] args) {

       menu();
    }
    public static void menu() {
        int opc,opc2;
    
        Empleados empleado1 = new Empleados();
        Empleados empleado2 = new Empleados();
        Empleados empleado3 = new Empleados();
        Empleados empleado4 = new Empleados();
        Empleados empleado5 = new Empleados();          
        
        do {
            
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("\n\nMenú \n 1. ingresar datos de empleado1\n 2. ingresar datos de empleado2\n 3. ingresar datos de empleado3\n 4. ingresar datos de empleado4\n 5. ingresar datos de empleado5\n 6. Obtener los datos de un empleado\n 7. Salir\n    Ingrese una opcion:"));
        switch(opc){
            case 1:  
                     empleado1.setDireccion(JOptionPane.showInputDialog("digite su direccion"));
                     empleado1.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
                     empleado1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("digite su edad")));
                     empleado1.setTelefono(JOptionPane.showInputDialog("digite su telefono"));
                     JOptionPane.showMessageDialog(null,"Los datos fueron ingresados satisfactoriamente");
                break;
            case 2:  empleado2.setDireccion(JOptionPane.showInputDialog("digite su direccion"));
                     empleado2.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
                     empleado2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("digite su edad")));
                     empleado2.setTelefono(JOptionPane.showInputDialog("digite su telefono"));
                    JOptionPane.showMessageDialog(null,"Los datos fueron ingresados satisfactoriamente");
                    
                break;
            case 3:  empleado3.setDireccion(JOptionPane.showInputDialog("digite su direccion"));
                     empleado3.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
                     empleado3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("digite su edad")));
                     empleado3.setTelefono(JOptionPane.showInputDialog("digite su telefono"));
                    JOptionPane.showMessageDialog(null,"Los datos fueron ingresados satisfactoriamente");
                    
                break;
            case 4:  empleado4.setDireccion(JOptionPane.showInputDialog("digite su direccion"));
                     empleado4.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
                     empleado4.setEdad(Integer.parseInt(JOptionPane.showInputDialog("digite su edad")));
                     empleado4.setTelefono(JOptionPane.showInputDialog("digite su telefono"));
                    JOptionPane.showMessageDialog(null,"Los datos fueron ingresados satisfactoriamente");
                    
                break;
            case 5:  empleado5.setDireccion(JOptionPane.showInputDialog("digite su direccion"));
                     empleado5.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
                     empleado5.setEdad(Integer.parseInt(JOptionPane.showInputDialog("digite su edad")));
                     empleado5.setTelefono(JOptionPane.showInputDialog("digite su telefono"));
                    JOptionPane.showMessageDialog(null,"Los datos fueron ingresados satisfactoriamente");
                    menu();
                break;  
            case 6: 
                opc2=Integer.parseInt(JOptionPane.showInputDialog("\n\nMenú \n 1.datos del empleado1\n 2.datos del empleado2\n 3.datos del empleado3\n 4.datos del empleado4\n 5.datos del empleado5"));
                switch(opc2)
                {
                    case 1: 
                        JOptionPane.showMessageDialog(null,"Nombre:"+empleado1.getNombre());
                        JOptionPane.showMessageDialog(null,"Edad:"+empleado1.getEdad());
                        JOptionPane.showMessageDialog(null,"Telefono:"+empleado1.getTelefono());
                        JOptionPane.showMessageDialog(null,"Direccion:"+empleado1.getDireccion());
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Nombre:"+empleado2.getNombre());
                        JOptionPane.showMessageDialog(null,"Edad:"+empleado2.getEdad());
                        JOptionPane.showMessageDialog(null,"Telefono:"+empleado2.getTelefono());
                        JOptionPane.showMessageDialog(null,"Direccion:"+empleado2.getDireccion());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Nombre:"+empleado3.getNombre());
                        JOptionPane.showMessageDialog(null,"Edad:"+empleado3.getEdad());
                        JOptionPane.showMessageDialog(null,"Telefono:"+empleado3.getTelefono());
                        JOptionPane.showMessageDialog(null,"Direccion:"+empleado3.getDireccion());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"Nombre:"+empleado4.getNombre());
                        JOptionPane.showMessageDialog(null,"Edad:"+empleado4.getEdad());
                        JOptionPane.showMessageDialog(null,"Telefono:"+empleado4.getTelefono());
                        JOptionPane.showMessageDialog(null,"Direccion:"+empleado4.getDireccion());
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"Nombre:"+empleado5.getNombre());
                        JOptionPane.showMessageDialog(null,"Edad:"+empleado5.getEdad());
                        JOptionPane.showMessageDialog(null,"Telefono:"+empleado5.getTelefono());
                        JOptionPane.showMessageDialog(null,"Direccion:"+empleado5.getDireccion());
                        break;
            }
                break;   
        }
        } while (opc!=7);
        
    }
}

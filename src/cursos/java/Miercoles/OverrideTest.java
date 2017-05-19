/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Miercoles;

/*
    si una subclase tiene el mismo metodo que se declara e la clase padre, se conoce como redefinicion del metodo.
uso del override en java
    proporcionar implementaciones especificas a metodos heredadados
proporcionan los mecanismo que permiter al plomorfismos 
    reglas del overrride
 */
public class OverrideTest {
    public static void main(String[] args) {
        Bike bici = new Bike();
        bici.run();
    }
    
}
class Vehiculo{
    void run(){
        System.out.println("carro run");
    }      
}
class Bike extends Vehiculo{
    void run(){
        System.out.println("bici run");
    }      
}



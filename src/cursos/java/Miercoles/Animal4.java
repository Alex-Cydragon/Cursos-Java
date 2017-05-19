/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Miercoles;

/*
    la palabra reserbada super es una variable de referencia al objeto inmediato de la clase padre 
    siempre que se crea la instancia de la subclase, se crea unas instacia de la superclase implicita a la que se refiere por super-variable.
    
    uso de la plabra reservada super
    super refiere a la  variable de instacia dwe la clase padre 
    super invoca al metodo de la clase padre
    super() invoca al ocstructor de la clase padre 
*/
public class Animal4 {
    String color = "Blanco";
}

class Dog4 extends Animal4{
    String color = "negro";
    void imprimir (){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class pruevaAnimal{
    public static void main(String[] args) {
        Dog4 d = new Dog4();
        d.imprimir();;
    }
}


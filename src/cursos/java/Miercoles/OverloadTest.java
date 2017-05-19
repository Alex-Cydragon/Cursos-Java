/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Miercoles;

/*
    si una clase tiene varios metoos que tiene el mismo nomves pero diferentews en parametros, se conoce como sobrecarga.
si tenemos que realizar una sola operacion, tener el mismo nombre de los metodos aumenta la legibilidad del programa.
ventajas:
    aumenta la legibilidad del programa diferentes maneras de sobrecarga un metodo 
    formas de sobrecargar un metodo 
    cambiando el numero de argumentos 
    cambuando el tipo de dato
 */
public class OverloadTest {
    public static void main(String[] args) {
        System.out.println(AddArguments.add(11, 23));
        System.out.println(AddArguments.add(14,19));
        System.out.println(AddType.add(10, 20));
        System.out.println(AddType.add(10,20));
    }
    public static void main(String args) {
        System.out.println("main sin string[]");
    }
}

// sobrecargar por numero de parametros 
class AddArguments{
    static int add (int a, int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    
}
// sobrecargar por tipo de parametros 

class AddType{
    static int add (int a, int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Miercoles;

/**
 *
 * @author Alex_
 */

abstract class Shape {
    abstract void draw();
}
// en un esenario real, la implementacion la provee algo mas 
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing mini faces Rectangle 8D");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing mini faces Circles 8D");
    }
}
public class AbstractTest2 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        new Rectangle().draw();
        
    }
}

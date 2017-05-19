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
interface Drawable {
    void draw();
}
class Circle3 implements Drawable{
    @Override
    public void draw(){
        System.out.println("Circúlito");
    }
}

class Rectangle3 implements Drawable{
    @Override
    public void draw(){
        System.out.println("rectanguló");
    }
}

public class InterfaceTest2{
    public static void main(String[] args) {
        Drawable d = new Circle3();
        d.draw();
        
    }
}

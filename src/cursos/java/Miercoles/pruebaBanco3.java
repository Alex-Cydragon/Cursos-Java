/*
    avstract tiene metodoss abstractoass y no abstractos puede usar la palabra reservada abstract
    puede proveer la imprementcion de una interface
    no soporta la herencia multiple
    puede tener variables estaticas, finales , no finales y no estaticos
    interface
     olo puede contener metodos abstractos y js tiene metodos default y estaticos
    soporrta la herencia multiple
    solo tiene variables estticas y finales
    no puede proveer la implementacion de una claseabstracta
    usa la palabra reservada interface
 */
package cursos.java.Miercoles;

/**
 *
 * @author Alex_
 */

interface Banco3 {
    float  rangodeInteres();
}
class banCoppel3 implements Banco3{
    @Override
    public float rangodeInteres(){
    return 7f;
    }
}

class banComer3 implements Banco3{
    @Override
    public float rangodeInteres(){
    return 9f;
    }
}

class banHsbc3 implements Banco3{
     @Override
     public float rangodeInteres(){
    return 8f;
    }
}

public class pruebaBanco3{
    public static void main(String[] args) {
        Banco3 b3;
        b3 = new banCoppel3();
           System.out.println("cursos.java.Miercoles.pruebaBanco.main()" + b3.rangodeInteres());
        b3 = new banComer3();
                System.out.println("cursos.java.Miercoles.pruebaBanco.main()" +  b3.rangodeInteres());
        b3 = new banHsbc3();
               System.out.println("cursos.java.Miercoles.pruebaBanco.main()" +  b3.rangodeInteres());
    }
}

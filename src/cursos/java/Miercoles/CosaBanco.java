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



public class CosaBanco {
    float rangodeInteres(){
        return 0f;
    }
}
class banCoppel extends CosaBanco{
    float rangodeInteres(){
    return 7f;
    }
}

class banComer extends CosaBanco{
    float rangodeInteres(){
    return 9f;
    }
}

class banHsbc extends CosaBanco{
     float rangodeInteres(){
    return 8f;
    }
}

class pruebaBanco{
    public static void main(String[] args) {
        banCoppel b = new banCoppel();
        banComer bn = new banComer();
        banHsbc Hs = new banHsbc();
        
        System.out.println("cursos.java.Miercoles.pruebaBanco.main()" + b.rangodeInteres());
        System.out.println("cursos.java.Miercoles.pruebaBanco.main()" + bn.rangodeInteres());
        System.out.println("cursos.java.Miercoles.pruebaBanco.main()" + Hs.rangodeInteres());
    }
}
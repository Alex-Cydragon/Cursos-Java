/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

/**
 *
 * @author Alex_
 */

class vendedor extends licuado {
    void preparaLicuados(){
        System.out.println("el vendedor prepara el licuado de " + Nombre);// lo prepara con al fruta elejifdsa 
    }
    void preparaEnsaladas(){
        System.out.println("el vendedor prepara la ensalada de " + Nombre);// lo prepara con al fruta elejifdsa 
    }
    
     void Cobra(){
         System.out.println("le cobra al cliente");// el parametro de la cantidad 
    }
    String producto ; // añadir parte que trae los nombes 
    String NombreVendedor = "josefo";
   
}

class cliente extends vendedor{
    void llega(){
        System.out.println("el cliente entra a la tienda parece algo desorientado con antojo de un manjar");
    }
    
    String NombreCliente = "jose";
    String Dinero = "50";
    
    void come(){
        System.out.println("el cliente "+ NombreCliente+" se come todo el producto de " + NombreVendedor + " el vendedor "); // aladir el parametro que trae el nombew del la fruta y el licuado 
    }
    void pide(){
        System.out.println("pide un licuado de " + Nombre);
    }
} 

 class Frutas {
    String Nombre = "Platano";
    String Presio = "30 pesitos";
    
}

class licuado extends Frutas{
    String tipoLicuado1 = "mejicana"; 
    String tipoLicuado2 = "Italiana"; 
}

class ensalada extends Frutas{
    String tipoEnsalada1 = "mejicana"; 
    String tipoEnsalada2 = "Italiana"; 

     
     
}

class preparacion {
    public static void main(String[] args) {
       vendedor v = new vendedor();
       cliente c = new cliente();
       
       c.llega();
       c.pide();
       v.preparaLicuados();
       c.come();
        System.out.println("FIN");
        
    }
}

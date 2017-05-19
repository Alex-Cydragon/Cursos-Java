/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Jueves;

import com.sun.webkit.ThemeClient;

/*
    concurrencia es que dos o mas componenetes que se ayudan para llevar acavo una tareas y pueden conparitr el mismo procesador o no 
    aunque no tengan paralelismo(trbajando con distintos procesadores)
    paralelismo (dos o mas tareas ejecutandose en hilos diferentes al mismo tiempo)
    paralelismo: 2 o mas tareas simultanianas 
    multitarea: ejecutar dos o mas tareas simultaneas
    Theread extends -- es una clase
    RRunnable implements --es una interface
    
    // 
(paralelismo) miltihilos en java: es el proceso para ejecutar muchos hilos e manera simultanea
hilo: subproceso ligero, unidad muy pequeña de procesmiento.
(Concurrencia) multiprocesamiento y multihilo se utilizan a lograr la multitarea, en la concurrencia pueden o no ser multiprocesamiento
ventajas de usar hilos 
    no blokeamos al ususario por que son tareas independientes y se pueden realisar muchas tareas al mismo tiempo
    podemos realizar muchas tareas al mismo tiempo
    los hilos al ser independientes no se afectan entre si en caso de ocurrir una exepcion en un hilo los demas funcionan igual 
    
    multitarea: proceso de ejecucion de muchas tareas, usamos 

    multitarea basada en hilos (multihilos)
        los hilos comparten los mismos espacios en memoria para direciones 
        el hilo es ligero
        el costo de comunicacion entre hilos es bajo

un hilo es un subproseso lijero, es independente, si se prodece una exepcion en un hilo no afecta a los demas hilos y comparten area de memoria en comun.

ciclo de vida de un hilo
    1- new: el hilo esta eb este estado,  si se crea una instacia de la clase thread pero andes de la invocacion del metodo 
    start()
    2- runnable: el hiloe esta en este estado, despues de la invocacion del metodo statrt(), pero el thread scheduler
    (administrador de hilos) no lo ha seleccionado como el hilo en ejecucion.
    3- running: el hilo esta aqui cuando el thread scheduler lo ha seleccionado.
4. non-runnable (Blocked): es el estado cuando el hilo sigue sin embargo no es apto para ejecutarse.


hay 2 formas de crear un huilo:
1: al extender de la clase thread
2: al implementar la interface runnable.

clase thread
proporciona los constructores y los metodos para crear y finalisar operaciones en un hilo. la chase thread extiende de la clase object e implementa la interface runnable

    constrectores de la clase thread
        thread()
        thread(string name)
        thread(runnable r)
        thread(runnable r, string name)
    runnable
        la interfaz runnable debe ser implementada por cualquier clase cuyas instancias esten destinados a ser ejecutadas por un hilo la interfaz runnable tiene un solo metodo denominado
    run()
    public void run(): es usado para realizar las operaciones
    del hilo.

           

 */
public class HilosT extends Thread{ 
    public void run(){
        System.out.println("soy un hilo corriendo");
        
    }
    
    
    public static void main (String[] args) throws InterruptedException{
        //HilosT t1 = new HilosT();
        //t1.start();
        Hilos t = new Hilos();
        Thread thread = new Thread(t); // esta enviando la funcion modificada que quiere utilizar en el hilo
        thread.start(); // manda a llamar hilos o procesos y run() el cual trae el codigo que se ejecutara en el hilo
        Hilos t2 =  (Hilos)t.clone();
        Thread thread1 = new Thread(t2); 
        thread1.start();
        

        System.out.println("name "+ thread.getName());
        thread.setPriority(6);
        System.out.println("prioridad "+ thread.getPriority());
        thread1.setName("hilo 2");
        System.out.println("name hilo 2 "+ thread1.getName());
        System.out.println("currentThread "+ thread1.currentThread());
        System.out.println("getId "+ thread1.getId());
        System.out.println("getState "+ thread1.getState());
        System.out.println("isAlive "+ thread1.isAlive());
        thread1.stop();
        System.out.println("getState 2 "+ thread1.getState());
        System.out.println("isDaemon 2 "+ thread.isDaemon());
        thread1.setDaemon(true);
        System.out.println("setDaemon "+ thread1.isDaemon());
        thread1.interrupt();
        System.out.println("interrupt thread "+ thread1.getState());
        thread.suspend();
        System.out.println("suspend "+ thread.getState());
        System.out.println("interrupted "+ thread.interrupted());
        System.out.println("isInterrupted "+ thread.isInterrupted());
        thread.join();
        System.out.println("el join se ejecuto " +  thread.getState());
        
        
        
        
        
        //thread.isDaemon();// verifica que el hilo tenga permisos para modificar al hilo actual
        //thread.setDaemon(false);// cambia el estado del hilo actual 
        //thread.interrupt(); // interrunpe la ejecucion del hilo actual y reprtna true si se ejecuta dos beses false puest oque esta detenido y si no existe es icnorado   
        //thread.stop(); // el hilo es detenido y arroja una exepcion
        //thread.start();
    }
}


class Hilos implements Runnable,Cloneable{
    public void run(){
        System.out.println("Hilo esta corriendo RUN()");
         System.out.println("manda a llamar hilos o procesos y run() el cual trae el codigo que se ejecutara en el hilo");
         
    }

    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
            
        }
        catch(CloneNotSupportedException ex){
            System.out.println("no se puede clonar");
        }
        return obj;
    }
}


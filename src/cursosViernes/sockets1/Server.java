/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosViernes.sockets1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    netqorking es un consepto de conectividad entre 2 o mas dispositivos juntos, que comparten recursos 

    para conpartir datos entre diferentes disposivtivos
    
    ventahas de networking en java
        compartir recursos
        centralizar la gestion del software

conceptos:
    direccion ip: numero dinamico asignado a in nodo de una red compuesto por ocjetos que van del 0 al 255 es una direccion logica que puede ser
combinada

ptorocolo:conjunto de reglas que se estableen paa la comunicacion. ej FTP, TCP, Telnet, SMTP, POP, ETC.

MAC:(mediana access control) identificador unico de NIC (network Interface Controller). 

protocolo orientado a la comunicacion
    connection-less
el receptor no envia el acuse de recibo.
es rapido, sin embargo no es comfiable. EJ UDP

socket: punto final en una conexion bidireccional

    la programacion de sockets se utiliza para la comunicacion entre las aplicaciones que se ejecutan entre las diferentes aplicaciones JRE.
(Java Runtime enviroment

la programacion de sockets puede ser orientada a conexion o sin conexion.

las clases java socket y serversockt
son usadas para la programacion orientada a la comunicacion las clases java socket y serversocket
conection oriented

las clases datagramsocket y datagrampacket)
Connection Less

el cliente del socket nesesita saber :
    IP Addres del sever
    port number
    socket class
socket class 
metodos 
public inputstream get inputstream()
    regresa el is adjunto con el socket
public outputstream getoutputstream()
    regresa el os adjunto al socket 
public synchronized void close()
    cerrar el socket

    Server Socket
metodos 
    publicSocket accept()
        establece la conexion entrante
    oblic Synchronized void close()
cierra la conexion.
 */
public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream dis = 
                    new DataInputStream(s.getInputStream());
        String str = (String)dis.readUTF();
        System.out.println("Mesaje" + str);
        
        ss.close();
    }
}

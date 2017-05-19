/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosViernes;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;


/*
informacion que contiene una URL
protocol: en este caso http es el protocolo
server name o ip addresss: oracle y cf
port number: es un atributo opcional. si escribimos google.com:80, 80 es el puerto.
si el puerto no es mencionado en la url regresa -1
file name o directory name: /articulos/nombre
 */
public class Properties {
    public static void main(String[] args) throws IOException{
        InetAddress ip = InetAddress.getByName("www.oracle.com");
        System.out.println("el nombre: "+ip.getHostName());
         System.out.println("la ip: "+ip.getHostAddress());
          System.out.println("el protocolo: "+ip.getHostAddress());
          URL url = new URL("https://codigofacilito.com/");
          System.out.println("Protocol: "+url.getProtocol());
          //System.out.println("Protocol: "+url.getProtocol());
          //System.out.println("Protocol: "+url.getProtocol());
          //System.out.println("Protocol: "+url.getProtocol());

          HttpsURLConnection hus = (HttpsURLConnection) url.openConnection();
          
          for (int i = 1; i<= 8; i++){
              System.out.println(hus.getHeaderFieldKey(i)+" = "+hus.getHeaderField(i));
          }
          hus.disconnect();
    }
    
}

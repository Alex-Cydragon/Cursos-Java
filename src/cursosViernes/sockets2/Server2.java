/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosViernes.sockets2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Alex_
 */
public class Server2 {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        
        DataInputStream din = 
                    new DataInputStream(s.getInputStream());
         DataOutputStream dout = 
                    new DataOutputStream(s.getOutputStream());
         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         
        String str = "";
                 String str2 = "";
                 
        while (!str.equals("Stop")){
            str = din.readUTF();
            System.out.println("el cliente dise: "+str);
            
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
                         
       din.close();
       s.close();
       ss.close();
    }
}

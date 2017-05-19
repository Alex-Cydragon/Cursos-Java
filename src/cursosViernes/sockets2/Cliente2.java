/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosViernes.sockets2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Alex_
 */
public class Cliente2 {
        public static void main(String[] args) throws IOException {
        Socket s = new Socket("Localhost",6666);
        DataInputStream din =
                new DataInputStream(s.getInputStream());
        
        DataOutputStream dout =
                new DataOutputStream(s.getOutputStream());
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        String str = "", str2 = "";
        while (!str.equals("Stop")){
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            
            str2 = br.readLine();
            System.out.println("el servidor dise " + str2);
        }
        
        
        dout.writeUTF("Sola servidor");
        dout.flush();
        dout.close();
        s.close();
    }
}

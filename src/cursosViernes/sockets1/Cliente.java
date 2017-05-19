/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosViernes.sockets1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Alex_
 */
public class Cliente {
 public static void main(String[] args) throws IOException {
        Socket s = new Socket("Localhost",6666);
        DataOutputStream dout =
                new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Sola servidor");
        dout.flush();
        dout.close();
        s.close();
    }
}

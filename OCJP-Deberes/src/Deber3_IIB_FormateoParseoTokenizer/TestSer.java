/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber3_IIB_FormateoParseoTokenizer;

/**
 *
 * @author kfc0_
 */
import java.io.*;
public class TestSer {
    public static void main(String[] args) { 
        SpecialSerial s = new SpecialSerial();
        try {  
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("myFile"));
            os.writeObject(s);
            os.close();
            System.out.print(++s.z + " ");
            ObjectInputStream is = new ObjectInputStream(
                    new FileInputStream("myFile"));
            SpecialSerial s2 = (SpecialSerial)is.readObject();
            is.close();
            System.out.println(s2.y + " " + s2.z);
        } catch (Exception x) {System.out.println("exc"); }
    }
}

class SpecialSerial implements Serializable {
    transient int y = 7;  static int z = 9;
}

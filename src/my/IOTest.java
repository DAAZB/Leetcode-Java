package my;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class IOTest {
    public static void main(String[] args){
        try{
            // Integer a = 127;
            // Integer b = 127;
            // Integer c = 128;
            // Integer d = 128;
            // System.out.println(a == b);
            // System.out.println(c.equals(d));


            // ioTest1();


            // int a = 'A';
            // System.out.write(65);
            // System.out.write('\n');


            fileRWTest2();

        } catch(Exception ex){
            System.out.println(ex.toString());

        }
    }

    public static void ioTest1() throws IOException{
        String c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
            c = br.readLine();
            System.out.println(c);
        } while(!c.equals("quit"));
    }

    public static void fileRWTest() throws IOException{
        byte[] alp = {65, 66, 67, 68, 69};
        OutputStream os = new FileOutputStream("test.txt");
        os.write(alp);
        os.close();

        InputStream is = new FileInputStream("test.txt");
        byte[] bet = new byte[is.available()];
        is.read(bet);
        for (int i = 0; i < bet.length; i++) {
            System.out.print((char)bet[i] + "\t");
        }
        is.close();

    }

    public static void fileRWTest2() throws IOException{
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fop.close();


        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while(reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();
    }

}

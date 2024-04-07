import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

import my.ExceptionTest;

public class App {
    public static void main(String[] args) throws Exception {

        // String s1 = "hello";
        // String s2 = "he";
        // System.out.println(s1 == s2);
        // System.out.println(s1.equals(s2));

        // s2 += "llo";
        // System.out.println(s1 == s2);
        // System.out.println(s1.equals(s2));

        // // String s3 = String.format("名称{0}， 数量{1}， 价格{2}", "小龙虾", 23, 45.5);
        // String s3 = String.format("名称%s， 数量%d， 价格%f", "小龙虾", 23, 45.5);
        // System.out.println(s3);


        // String s1 = "hello";
        // String s2 = "hello";
        // String s3 = "he" + "llo";
        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // System.out.println(s1.equals(s3));

        // int[] a = new int[5];
        // for (int i : a)
        // {
            
        // }

        // MyFrame my_frame = new MyFrame();


        // ArrayList<String> list = new ArrayList<>();
        // list.add("hello");
        // list.add("arraylist");
        // list.add("world");
        // list.add("iterator");
        
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        // for (String string : list) {
        //     System.out.println(string);
        // }
        // Iterator<String> itr = list.iterator();
        // while(itr.hasNext()) //迭代器的循环处理效率最高
        // {
        //     var a = itr.next();
        //     if(a.length()>5)
        //     {
        //         itr.remove();
        //     }
        // }



        // Map<Integer, String> a = new HashMap<Integer, String>();
        // a.put(1, "Zz");


        // ExceptionTest ext = new ExceptionTest();
        // try
        // {
        //     ext.test1();
        //     ext.test2();
        //     ext.test3();
        // } 
        // catch (Exception e) 
        // {
        //     System.out.println("error");
        // }
        // try
        // {
        //     ext.checkNumber(-5);
        // }
        // catch(Exception e)
        // {
        //     e.printStackTrace();
        // }
        

        // File testfile = new File("test.txt");
        // System.out.println(testfile.getAbsolutePath()); //目录
        // System.out.println(testfile.exists());
        // System.out.println(testfile.lastModified());
        // File src_dir = new File("D:\\Users\\user\\Desktop\\Learn\\Java\\primer02");
        // File dst_dir = new File("D:\\Users\\user\\Desktop\\Learn\\Java\\primer02.bak");
        // FileUtils.copyDirectory(src_dir, dst_dir);


        // File file = new File("test");
        // // FileOutputStream fos = new FileOutputStream(file);
        // // byte[] byt = {1, 5, 9, -5};
        // // fos.write(byt);
        // // fos.close();

        // FileInputStream fis = new FileInputStream(file);
        // byte[] buffer = new byte[1000];
        // int n = fis.read(buffer);
        // for (int i = 0; i<n;i++) {
        //     System.out.println(buffer[i]);
        // }
        // fis.close();

        // System.out.println(Long.MAX_VALUE);
        // int[] a = new int[9];
        // TreeMap<Integer, Integer> map = new TreeMap<>();
        // Queue<Integer> q = new LinkedList<>();;
        // q.

        // ArrayList<Integer> a = new ArrayList<Integer>();
        // int[] b = new int[3];
        // b.le

        // HashMap<Integer, Integer> a = new HashMap<>();
        // String b = "asdad";
        // b.sub


        // System.out.println("a" + 'b');

        int a = 1;
        System.out.println(a);
        System.out.println(a<<2);
        System.out.println(a);

    }


    
    public class InternalClass
    {
        int parm1;
        int parm2;
    }

}

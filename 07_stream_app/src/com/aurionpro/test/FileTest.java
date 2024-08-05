package com.aurionpro.test;

import java.io.File;

public class FileTest {
	public static void main(String[] args)
    {

        File f = new File("D:\\Aurionpro_training\\07_stream_app\\src\\com\\aurionpro\\test\\test1");
 
        System.out.println("File name :" + f.getName());
        System.out.println("Absolute path:"+ f.getAbsolutePath());
        System.out.println("Parent:" + f.getParent());
        System.out.println("Exists :" + f.exists());
 
        if (f.exists()) {
            System.out.println("Is writable:"+ f.canWrite());
            System.out.println("Is readable" + f.canRead());
            System.out.println("File Size in bytes "+ f.length());
        }
    }

}

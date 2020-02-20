package com;

import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
             String s="Welcome to my world";
             byte b[]=s.getBytes();
             fout.write(56);    
             fout.write(b);
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  

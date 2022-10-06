/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author emilio
 */
public class backup {
    
   public static void copyFilesFrom(String rootDirectory, String destDirectory)throws IOException 
   {
       File root = new File(rootDirectory);
       File fileList[] = root.listFiles();
       int fileCount = 0;
       for (File fileObject : fileList) {
           fileCount ++;
           
           
           try {
               FileInputStream inputStream = new FileInputStream(fileObject);
               FileOutputStream outputStream = new FileOutputStream(destDirectory + fileObject.getName());
               
           } catch (IOException ex) {
           Logger.getLogger(backup.class.getName()).log(Level.SEVERE, null, ex);
       }
           
           
           
       }
       System.out.println(fileCount);
   }
   public static void main(String[] args)
   {
       String rootDirectory = "/Users/emilio/Downloads";
       String destDirectory = "/Users/emilio/Desktop/destino";
       
       try {
           copyFilesFrom(rootDirectory, destDirectory);
       } catch (IOException ex) {
           Logger.getLogger(backup.class.getName()).log(Level.SEVERE, null, ex);
       }
   }


    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author emilio
 */
public class actualizar {

   
    public static void actualizar(String llave, String valor, int index) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/emilio/Desktop/ejemplo.txt"));
        
        ArrayList<String> str = new ArrayList<>();
        String line = "";
        
        while ((line = reader.readLine()) != null)
        {
            
                String[] split = line.split("\\|");
                String prueba = split[1];
                
                if (prueba.equals(llave)) 
                {
                    split[index] = "";
                    split[index] = valor;
                    
                    String newLine = "";
                    for (int i=0; i<split.length; i++)
                    {
                        if (i == 9) {
                           newLine += split[i]; 
                        }
                        else
                        {
                           newLine += split[i] + "|" ;
                        }
                     
                        
                    }
                    str.add(newLine);
                }  
                else
                {
                    str.add(line);
                }    
                
        }
        reader.close();
        
        Collections.sort(str);
        
        FileWriter writer = new FileWriter("/Users/emilio/Desktop/ejemplo.txt");
        for (String s: str)
        {
            writer.write(s);
            writer.write("\r\n");
        }
        writer.close();
    }
    
}

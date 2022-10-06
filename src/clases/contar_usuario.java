package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class contar_usuario 
{
    
        public static void clear() throws FileNotFoundException
        {
            File file = new File("/Users/emilio/Desktop/contar.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close(); 
        }
        public static void contar() throws FileNotFoundException, IOException
        {
            int contador = 0;
            BufferedReader reader = new BufferedReader(new FileReader("/Users/emilio/Desktop/contar.txt"));

            ArrayList<String> str = new ArrayList<>();
            String line = "";

            while ((line = reader.readLine()) != null)
            {
                str.add(line);
                contador++;
            }
            reader.close();

            if (contador == 3) 
            {
                
                for (String s: str)
                {
                    reorganizar.reorganizar(s);
                    
                }
                
                
                clear();
                
                sort_log.reorganizar();
                                       
            }
            
            





        }
    

}

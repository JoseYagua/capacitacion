package capacitacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Archivos {

    public void crear(){
        File nombre = new File("Archivo.txt");
        try {
            FileWriter w = new FileWriter(nombre); 
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr= new PrintWriter(bw);
            
            wr.write("Hola");
            wr.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error al crear Archivo");
        }
        
        
    }
    
}



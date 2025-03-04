/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fitxersrelatius;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author thejo
 */
public class FitxersRelatius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Variables
        String rutaFitxer="f1_in.dat";
        int num=0;
        //Creació i inicialització dels Scanners
        
        Scanner sc = new Scanner(System.in);

        try(FileWriter fw = new FileWriter(rutaFitxer, true);
             PrintWriter entrada1 = new PrintWriter(fw)){
        do {
            
                System.out.println("Introdueix un numero, per terminar un -1: ");
                num = sc.nextInt();
                mostrarFitxer(rutaFitxer);
                if(num!=-1){
                    entrada1.println(num);
                    
                }
                mostrarFitxer(rutaFitxer);
            

        } while (num != -1);
        } catch (IOException e) {
            System.err.println("Error: No s'ha pogut obrir o escriure l'arxiu.");
            }
        sc.close();
        
        
        

    }

    public static void mostrarFitxer(String rutaFitxer) {
        // Leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(rutaFitxer))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) { // Leer línea por línea
                System.out.println(linea); // Mostrar la línea
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}

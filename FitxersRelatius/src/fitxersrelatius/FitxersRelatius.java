/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fitxersrelatius;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tisi
 */
public class FitxersRelatius {

    /**
     * @param args the command line arguments
     */
    /*
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
                    entrada1.flush();
                    
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
    }*/
    
    /*
    Aquest es el exercici 2
    Ho he fet aqui ja que aixi ho tinc tot mes centralitzat
    @autor Tisi
    */
    /*
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Variables
        String rutaFitxer="f1_in.dat";
        int numIndex=0;
        String numCambiar;
        
        //Inicialitzacio dels scanners
        Scanner sc= new Scanner(System.in);
        
            
           
            //Abans de poder modificar el fitxer el podem emmagatzemar en un arrayList
            //i així ho podem modificar sense problemes
            
            List <String> array1=new ArrayList<>();
            try(BufferedReader llegir= new BufferedReader(new FileReader(rutaFitxer))){
                String linia;
                
                while((linia=llegir.readLine())!=null){
                    array1.add(linia);
                }
            }catch(IOException e){
                System.out.println("Error al llegir el fitxer: "+ e.getMessage());
            }
        do{
            System.out.println("A quina posicio vols modificar?: (Es comença amb el 0)");
            numIndex=sc.nextInt();
            
            //Comprovem si el numero es valid o no
            if((!(numIndex>1 && numIndex<array1.size()))||numIndex==-1){
                System.out.println("No es un numero valid per poder cambiar ");
                if(numIndex==-1){
                    break;
                }
            }
            System.out.println(array1.get(numIndex));
            sc.nextLine();
            //Preguntem el nou numero que volem ficar pel vell
            System.out.println("Per quin numero vols cambiar? ");
            numCambiar=sc.nextLine();
            array1.set(numIndex, numCambiar);
            
            System.out.println(array1.get(numIndex));
            
        }while(numIndex!=-1);
        
        try(BufferedWriter modificar= new BufferedWriter(new FileWriter(rutaFitxer))){
            for(String linia:array1){
                modificar.write(linia);
                modificar.newLine();
            }
               
            }catch(IOException e){
                System.out.println("Error al escriure al fitxer: "+e.getMessage());
            }
        System.out.println(array1);
        
        }
    */
    //Exercici 3
    /*
    Aquest exercici ens demana llegir de un text en un .txt una paraula introduïda per l'usuari
    i cada vegada que el trobem dintre del text la cambiarem per la mateixa paraula però en majùscula
    */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Variables
        String rutaFitxer="text.txt";
        String paraula="";
        String paraulaEnMajuscula=paraula.toUpperCase();
        //Inicialitzem els scanners
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Quina paraula vols cambiar a tot majuscules?: ");
        paraula=sc.nextLine();
        
        StringBuilder contenido = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(rutaFitxer))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    contenido.append(linea).append("\n"); // Guardar cada línea
                }
            }

            // Reemplazar la palabra en el contenido
            String contenidoModificado = contenido.toString().replaceAll("\\b" + paraula + "\\b", paraulaEnMajuscula);

            // Sobrescribir el fichero con el contenido modificado
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaFitxer))) {
                bw.write(contenidoModificado);
            }

            System.out.println("Proces completat");

        
        
    }
    }



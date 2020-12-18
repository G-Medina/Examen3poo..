package Examenultimo;

import java.io.*;
import java.util.ArrayList;

public  class Archivos {
    public static void writeFileAppend(String Nombre, String texto)
    {
        try{
            FileWriter FW = new FileWriter(Nombre, true);
            FW.append(texto);
            FW.flush();
            FW.close();
        }catch (IOException reporte){
            reporte.printStackTrace();
        }
    }

    public static void writeFileTruncate(String Nombre, String texto)
    {
        try{
            FileWriter FW = new FileWriter(Nombre,false);
            FW.append(texto);
            FW.flush();
            FW.close();
        }catch (IOException reporte){
            reporte.printStackTrace();
        }
    }


    public static ArrayList<String> ReadFile(String file) {
        ArrayList<String> lines = new ArrayList<>();
        String line;
        try {
            File f1 = new File(file);
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            fr.close();
            br.close();

        }catch(Exception e){
            System.out.println(e.getMessage());


        }
        return lines;
    }


    public static Boolean Existe(String file) {
        try {
            File f1 = new File(file);
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            fr.close();
            br.close();
            return true;
        }catch(Exception e){
            return false;

        }
    }

}

//siombe

package Examenultimo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Calzado {
    private String tipo;
    private String marca;
    private double talla;
    private String color;
    private String material;

    public String getTipo() {
        return tipo;
    }
    public String getMarca() {
        return marca;
    }
    public double getTalla() {
        return talla;
    }
    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setTalla(double talla) {
        this.talla = talla;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void ImprimirTipo(){
        System.out.println("Tipo: "+getTipo());
        System.out.println("Marca: "+getMarca());
        System.out.println("Talla: "+getTalla());
        System.out.println("Color: "+getColor());
        System.out.println("Material: "+getMaterial());
    }
    public void tofile(){
            //me permite crear un archivo de txt a mi ruta local
        String ruta="E:/"+tipo+".txt";
        File archivo= new File(ruta);
        //String archivo_destino=ruta.getAbsolutePath();

        try {
            archivo.createNewFile();
        } catch (IOException e) {       //capturador de errores

            e.printStackTrace();
        }
        Escribiendo accede=new Escribiendo();
        accede.escribir(ruta);
    }
    class Escribiendo{
        public void escribir(String ruta_archivo){


            try{
                FileWriter escritura = new FileWriter(ruta_archivo);
                escritura.write("La marca es: ");
                for (int i=0; i<marca.length();i++){
                    escritura.write(marca.charAt(i));
                }
                escritura.write("\n");
                escritura.write("La talla es: ");
                for (int i=0; i<String.valueOf(talla).length();i++){

                    escritura.write(String.valueOf(talla).charAt(i));
                }
                escritura.write("\n");
                escritura.write("El color es: ");
                for (int i=0; i<color.length();i++){

                    escritura.write(color.charAt(i));
                }
                escritura.write("\n");
                escritura.write("El material es: ");
                for (int i=0; i<material.length();i++){

                    escritura.write(material.charAt(i));
                }
                escritura.write("\n");
                for (int i=0; i<calzar().length();i++){
                    escritura.write(calzar().charAt(i));
                }
                escritura.write("\n");

                escritura.close();
            }catch (IOException e){
            }
        }
    }

    public String calzar(){
        return "\nQue bien me quedan estos "+ tipo + " que son talla " + talla;
    }
}

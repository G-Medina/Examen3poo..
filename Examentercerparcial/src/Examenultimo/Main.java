package Examenultimo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String continuar ="";
        Scanner entrada = new Scanner(System.in);
        do {

           calzadosm(entrada);
            System.out.println("Presione S o s para continuar y cualquier tecla para salir: ");
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("s"));


        Calzado cal=new Calzado();
        System.out.println();
        cal.calzar();


    }

    public static void calzadosm(Scanner rs){
        String cadenatxt;
        System.out.println("\tSeleccione el calzado que desea agregar: \n"+
                              "\t\t1) para calzado formal\n"+
                                "\t\t2) para calzado casual\n"+
                                 "\t\t3) para calzado deportivo");


        int opcion = rs.nextInt();

        if (opcion==1){
            cadenatxt = "Calzado formal";
            System.out.println("Calzado formal");
        } else{
            if(opcion==2){
                cadenatxt = "Calzado casual";
                System.out.println("Calzado casual");
            }
            else {
                cadenatxt = "Calzado deportivo";
                System.out.println("Calzado deportivo");
            }
        }

        rs.nextLine();

        System.out.print("Ingrese la marca: ");
        String marca = rs.nextLine();

        System.out.print("Ingrese la talla: ");
        int talla = rs.nextInt();

        rs.nextLine();
        System.out.print("Ingrese el color: ");
        String color = rs.nextLine();

        System.out.print("Ingrese el material: ");
        String material = rs.nextLine();

        if (opcion==1){

            Calzado f = new calzadoformal(marca,talla,color,material);
            f.tofile();


        } else{
            if(opcion==2){
                Calzado c = new calzadocasual(marca,talla,color,material);
                c.tofile();

            }
            else {
                Calzado d = new calzadodeportivo(marca,talla,color,material);
                d.tofile();

            }
        }





    }



}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BAC
 */
public class Registro {
    public static ArrayList<Animal> listAnimal = new ArrayList();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println(" ***** M E N U *****");
        System.out.println("1. Registrar Animal");
        System.out.println("2. Editar Animal\n" +
                            "3. Eliminar animal\n" +
                            "4. Alimentat Animal\n"+
                            "5. Imprimir\n" +
                            "Ingrese la opcion: ");
        
    }
    public static void opciones(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1)
            registroAnimal();
        else if(opcion == 2)
            editarAnimal();
        else if(opcion == 3)
            crearAlumnos();
        else if(opcion == 4)
            editarAlumno();
        else if(opcion == 5)
            eliminarAlumno();
        else if(opcion == 6)
            listarAlumnos();
        else if(opcion == 7)
            miPerfil();
        else if(opcion == 8)
            adminRandom();
    }

public static void registroAnimal(){
        System.out.print("Nombre Cientifico: ");
        String nombreCient = sc.nextLine();
        nombreCient = sc.nextLine();
        System.out.print("Nombre Comun: ");
        String nombreComun = sc.next();
        System.out.print("Habitat: ");
        String habitat = sc.next();
        System.out.print("Alimento: ");
        String Alimento = sc.next();
        System.out.print("Rasgos: ");
        String rasgos = sc.next();
        System.out.print("Distribucion: ");
        String distribucion = sc.next();
        System.out.print("Vida: ");
        int vida = sc.nextInt();
        listAnimal.add(new Animal(nombreCient, nombreComun, habitat, Alimento, rasgos, distribucion, vida));
    }

public static void editarAnimal(){
        System.out.print("Ingrese la posicion: ");
        int pos = sc.nextInt();
        System.out.println("1. Un atributo");
        System.out.println("2. Todos los atributos");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1)
            editarUnAtributo(pos);
        else if(opcion == 2)
            editarAtributos(pos);
    }

public static void editarUnAtributo(int pos){
    
       System.out.println("1. Nombre Cientifico");
        System.out.println("2. Nombre Comun");
        System.out.println("3. Habitat ");
        System.out.println("4. Alimento");
        System.out.println("5. Rasgos");
        System.out.println("6. Distribucion");
        System.out.println("7. Vida");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1){
            System.out.print("Nombre Cientiefico : ");
            listAnimal.get(pos).setNombreCient(sc.next());
        }else if(opcion == 2){
            System.out.print("Nombre Comun: ");
            listAnimal.get(pos).setNombreComun(sc.next());
        }else if(opcion == 3){
            System.out.print("Habitat: ");
            listAnimal.get(pos).setHabitat(sc.next());
        }else if(opcion == 4){
            System.out.println("Alimento: ");
            listAnimal.get(pos).setAlimento(sc.next());
        }else if(opcion == 5){
            System.out.print("Rasgos: ");
            listAnimal.get(pos).setRasgos(sc.next());
        }else if(opcion == 6){
            System.out.print("Distribucion ");
            listAnimal.get(pos).setDistribucion(sc.next());
        }else if(opcion == 7){
            System.out.println("Vida: ");
            listAnimal.get(pos).setVida(sc.nextInt());
        }
    }
public static void editarAtributos(int pos){
        System.out.print("Nombre Cientiefico: ");
        listAnimal.get(pos).setNombreCient(sc.next());
        System.out.print("Nombre comun: ");
        listAnimal.get(pos).setNombreComun(sc.next());
        System.out.print("Habitat: ");
        listAnimal.get(pos).setHabitat(sc.next());
        System.out.println("Alimento: ");
        listAnimal.get(pos).setAlimento(sc.next());
        System.out.print("Rasgos: ");
        listAnimal.get(pos).setRasgos(sc.next());
        System.out.print("Distribucion: ");
        listAnimal.get(pos).setDistribucion(sc.next());
        System.out.println("Vida: ");
        listAnimal.get(pos).setVida(sc.nextInt());
    }
public static void eliminarAnimal(){
        System.out.print("Posicion: ");
        listAnimal.remove(sc.nextInt());
    }
public static void listarAnimales(){
        for (Animal animales : listAnimal) {
            System.out.println(animales.toString());
        }
    }
}
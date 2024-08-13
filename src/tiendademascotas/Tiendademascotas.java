package tiendademascotas;

import java.util.Scanner;

import java.util.Scanner;

public class Tiendademascotas {

    public static void main(String[] args) {
        //creando arreglo de mascotas 

        Scanner warriors = new Scanner(System.in);

        Scanner curry = new Scanner(System.in);

        Mascotas animales[] = new Mascotas[15];

        int op = 0;

        while (op != 5) {

            System.out.println("-----MENU-----");

            System.out.println("1.Guardar");

            System.out.println("2.Buscar individual");

            System.out.println("3.Ver todos");

            System.out.println("4.Modificar");

            System.out.println("5.Salir");

            System.out.println("Ingrese el numero de opcion");

            op = warriors.nextInt();

            System.out.println("----------------------------------");

            if (op == 1) {

                System.out.println("Ingresar ID");

                int ID = warriors.nextInt();

                System.out.println("Ingrese nombre");

                String nombre = curry.nextLine();

                System.out.println("Ingrese el tipo");

                String tipo = curry.nextLine();

                System.out.println(nuevaMascota(ID, nombre, tipo, animales));

            } else if (op == 2) {

                System.out.println("Ingrese ID");

                int ID = warriors.nextInt();

                System.out.println(buscarmascota(ID, animales));

            } else if (op == 3) {

                System.out.println(todaslasmascotas(animales));

            } else if (op == 4) {

                System.out.println("Ingrese ID");

                int ID = warriors.nextInt();

                if (modfanimalbooleano(ID, animales)) {

                    System.out.println("Ingrese nombre");

                    String nombre = curry.nextLine();

                    System.out.println("Ingrese el tipo");

                    String tipo = curry.nextLine();

                    System.out.println(modificarmascota(ID, nombre, tipo, animales));

                }

            }

        }

    }

    public static String nuevaMascota(int ID, String nombre, String tipo, Mascotas arreglo[]) {

        boolean lleno = true;

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == null) {

                arreglo[i] = new Mascotas(ID, nombre, tipo);

                lleno = false;

                break;

            } else if (arreglo[i].getID() == ID) {

                return "Ya existe el ID";

            }

        }

        if (!lleno) {

            return "Se guardo con existo";

        } else {

            return "Ya no hay espacio";

        }

    }

    public static String buscarmascota(int ID, Mascotas arreglo[]) {

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] != null && arreglo[i].getID() == ID) {

                return "La mascota tiene los siguientes datos:" + "\n nombre:" + arreglo[i].getNombre() + "\n" + "tipo:" + arreglo[i].getTipo();

            }

        }

        return "no valido en el sistema";

    }

    public static String todaslasmascotas(Mascotas arreglo[]) {

        String blanco = "";

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] != null) {

                blanco = blanco + arreglo[i].getID() + " " + arreglo[i].getNombre() + " " + arreglo[i].getTipo() + "\n";

            }

        }

        return blanco;

    }

    public static boolean modfanimalbooleano(int ID, Mascotas arreglo[]) {

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] != null && arreglo[i].getID() == ID) {

                return true;

            }

        }

        return false;

    }

    public static String modificarmascota(int ID, String nombre, String tipo, Mascotas arreglo[]) {

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] != null && arreglo[i].getID() == ID) {

                arreglo[i].setNombre(nombre);

                arreglo[i].setTipo(tipo);

                return "Se actualizo con exito";

            }

        }

        return "";

    }

}

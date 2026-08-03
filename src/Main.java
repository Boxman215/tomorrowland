import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        SistemaTickets sistema = new SistemaTickets();

        Comprador comprador = new Comprador();

        int opcion;

        do {

            System.out.println("\n===============================");
            System.out.println("      TOMORROWLAND TICKETS");
            System.out.println("===============================");
            System.out.println("1. Nuevo comprador");
            System.out.println("2. Nueva solicitud de boletos");
            System.out.println("3. Consultar disponibilidad total");
            System.out.println("4. Consultar disponibilidad individual");
            System.out.println("5. Reporte de caja");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\n--- NUEVO COMPRADOR ---");

                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Correo: ");
                    String correo = teclado.nextLine();

                    System.out.print("Cantidad de boletos: ");
                    int boletos = teclado.nextInt();

                    System.out.print("Presupuesto máximo: ");
                    double presupuesto = teclado.nextDouble();
                    teclado.nextLine();

                    comprador = new Comprador(nombre, correo, boletos, presupuesto);

                    System.out.println("\nComprador registrado correctamente.");

                    break;

                case 2:

                    if (comprador.getNombre().equals("")) {

                        System.out.println("Primero debe registrar un comprador.");

                    } else {

                        sistema.nuevaSolicitud(comprador);

                    }

                    break;

                case 3:

                    sistema.disponibilidadTotal();

                    break;

                case 4:

                    System.out.print("Ingrese la localidad (1, 5 o 10): ");

                    int localidad = teclado.nextInt();

                    sistema.disponibilidadIndividual(localidad);

                    break;

                case 5:

                    sistema.reporteCaja();

                    break;

                case 6:

                    System.out.println("\nGracias por utilizar el sistema.");
                    break;

                default:

                    System.out.println("Opción inválida.");

            }

        } while (opcion != 6);

        teclado.close();

    }

}
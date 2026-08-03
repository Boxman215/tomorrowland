import java.util.Random;

public class SistemaTickets {

    private Localidad localidad1;
    private Localidad localidad5;
    private Localidad localidad10;

    public SistemaTickets() {

        localidad1 = new Localidad(1, 100);
        localidad5 = new Localidad(5, 500);
        localidad10 = new Localidad(10, 1000);

    }

    // Nueva solicitud de compra

    public void nuevaSolicitud(Comprador comprador) {

        Ticket ticket = new Ticket();

        System.out.println("\n========== TICKET ==========");
        ticket.mostrarTicket();

        if (!ticket.esApto()) {

            System.out.println("\nEl ticket NO fue seleccionado para comprar.");
            return;

        }

        System.out.println("\nEl ticket SI fue seleccionado.");

        Random random = new Random();

        int opcion = random.nextInt(3);

        Localidad localidad;

        if (opcion == 0) {

            localidad = localidad1;

        } else if (opcion == 1) {

            localidad = localidad5;

        } else {

            localidad = localidad10;

        }

        System.out.println("Localidad asignada: " + localidad.getNumero());

        // Validar espacio

        if (!localidad.hayEspacio()) {

            System.out.println("La localidad está llena.");
            return;

        }

        int cantidad = comprador.getCantidadBoletos();

        if (cantidad > localidad.disponibles()) {

            cantidad = localidad.disponibles();

        }

        double total = cantidad * localidad.getPrecio();

        if (total > comprador.getPresupuesto()) {

            System.out.println("El presupuesto no alcanza.");
            return;

        }

        localidad.vender(cantidad);

        System.out.println("Compra realizada.");
        System.out.println("Boletos vendidos: " + cantidad);
        System.out.println("Total pagado: $" + total);

    }

    // Disponibilidad total

    public void disponibilidadTotal() {

        System.out.println("\n===== DISPONIBILIDAD =====");

        mostrarLocalidad(localidad1);
        mostrarLocalidad(localidad5);
        mostrarLocalidad(localidad10);

    }

    // Disponibilidad individual

    public void disponibilidadIndividual(int numero) {

        if (numero == 1) {

            mostrarLocalidad(localidad1);

        } else if (numero == 5) {

            mostrarLocalidad(localidad5);

        } else if (numero == 10) {

            mostrarLocalidad(localidad10);

        } else {

            System.out.println("Localidad inválida.");

        }

    }

    // Mostrar datos de una localidad

    private void mostrarLocalidad(Localidad localidad) {

        System.out.println("\nLocalidad " + localidad.getNumero());

        System.out.println("Vendidos: " + localidad.getVendidos());

        System.out.println("Disponibles: " + localidad.disponibles());

    }

    // Reporte de caja

    public void reporteCaja() {

        double total = localidad1.dineroGenerado()
                + localidad5.dineroGenerado()
                + localidad10.dineroGenerado();

        System.out.println("\n===== REPORTE DE CAJA =====");

        System.out.println("Localidad 1: $" + localidad1.dineroGenerado());

        System.out.println("Localidad 5: $" + localidad5.dineroGenerado());

        System.out.println("Localidad 10: $" + localidad10.dineroGenerado());

        System.out.println("---------------------------");

        System.out.println("TOTAL: $" + total);

    }

}

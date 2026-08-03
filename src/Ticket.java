import java.util.Random;

public class Ticket {

    private int numeroTicket;
    private int numeroA;
    private int numeroB;

    // Constructor vacío
    public Ticket() {
        generarTicket();
    }

    // Constructor con parámetro (Overloading)
    public Ticket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
        Random random = new Random();
        numeroA = random.nextInt(15000) + 1;
        numeroB = random.nextInt(15000) + 1;
    }

    // Genera todos los números aleatorios
    public void generarTicket() {
        Random random = new Random();

        numeroTicket = random.nextInt(15000) + 1;
        numeroA = random.nextInt(15000) + 1;
        numeroB = random.nextInt(15000) + 1;
    }

    // Verifica si el ticket puede comprar
    public boolean esApto() {

        int menor = Math.min(numeroA, numeroB);
        int mayor = Math.max(numeroA, numeroB);

        return numeroTicket >= menor && numeroTicket <= mayor;
    }

    // Getters

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public int getNumeroA() {
        return numeroA;
    }

    public int getNumeroB() {
        return numeroB;
    }

    // Mostrar información

    public void mostrarTicket() {
        System.out.println("Ticket: " + numeroTicket);
        System.out.println("Rango: " + numeroA + " - " + numeroB);
    }
}
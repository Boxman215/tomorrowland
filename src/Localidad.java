public class Localidad {

    private int numero;
    private double precio;
    private int capacidad;
    private int vendidos;

    // Constructor vacío
    public Localidad() {
        numero = 0;
        precio = 0;
        capacidad = 20;
        vendidos = 0;
    }

    // Constructor con parámetros (Overloading)
    public Localidad(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
        capacidad = 20;
        vendidos = 0;
    }

    // Getters

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getVendidos() {
        return vendidos;
    }

    // Setters

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    // Boletos disponibles

    public int disponibles() {
        return capacidad - vendidos;
    }

    // Verificar si hay espacio

    public boolean hayEspacio() {
        return vendidos < capacidad;
    }

    // Vender boletos

    public void vender(int cantidad) {
        vendidos = vendidos + cantidad;
    }

    // Dinero generado

    public double dineroGenerado() {
        return vendidos * precio;
    }
}

public class Comprador {

    private String nombre;
    private String correo;
    private int cantidadBoletos;
    private double presupuesto;

    // Constructor vacío
    public Comprador() {
        nombre = "";
        correo = "";
        cantidadBoletos = 0;
        presupuesto = 0;
    }

    // Constructor con parámetros (Overloading)
    public Comprador(String nombre, String correo, int cantidadBoletos, double presupuesto) {
        this.nombre = nombre;
        this.correo = correo;
        this.cantidadBoletos = cantidadBoletos;
        this.presupuesto = presupuesto;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    // Mostrar datos

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Cantidad de boletos: " + cantidadBoletos);
        System.out.println("Presupuesto: $" + presupuesto);
    }
}
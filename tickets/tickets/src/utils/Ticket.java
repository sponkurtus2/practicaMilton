package utils;

public abstract class Ticket {
    private int precio;
    private int numeroAsiento;
    private String funcion;

    public abstract String imprimirTicket();

    public Ticket() {
        
    }

    public Ticket(int precio, int numeroAsiento, String funcion) {
        this.precio = precio;
        this.numeroAsiento = numeroAsiento;
        this.funcion = funcion;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "El costo del ticket es de: " + this.getPrecio() + ", el numero de asiento: " + this.getNumeroAsiento() + ", y la funcion: " + this.getFuncion() + ", ";
    }

    
}

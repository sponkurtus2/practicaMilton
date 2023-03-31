package utils;

public class TicketNormal extends Ticket{
    
    public TicketNormal() {
        super.setPrecio(80);
    }

    public TicketNormal(String funcion) {
        super.setFuncion(funcion);
    }

    @Override
    public String imprimirTicket() {
        return super.toString();
    }
    
}

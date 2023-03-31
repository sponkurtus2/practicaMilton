package utils;

public class TicketVip extends Ticket {

    public TicketVip() {
        super.setPrecio(40);
    }

    public TicketVip(String funcion) {
        super.setFuncion(funcion);
    }

    @Override
    public String imprimirTicket() {
        return super.toString();
    }
    
}

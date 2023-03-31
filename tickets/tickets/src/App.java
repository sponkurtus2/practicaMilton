import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utils.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programa para calcular tickets");
        System.out.println("Ingrese cuantos tickets comprara...");
        System.out.println("(El numero de asientos es de 10)");
        boolean numero_tickets = true;

        StringBuffer resumenTickets = new StringBuffer(); 

        do {
            
            int respuestaTicket = Integer.parseInt(leer("Escoja la opcion del ticket: \n 1- normal \n 2- vip"));
            
            switch (respuestaTicket) {
                case 1:
                    TicketNormal tickernormal = new TicketNormal(leer("A que funcion ira?"));
                    ticketNormal(tickernormal);
                    precioNormal(tickernormal);
                      
                    resumenTickets.append(tickernormal);
                    break;
            
                case 2:
                    TicketVip tickervip = new TicketVip(leer("A que funcion ira: "));
                    ticketvip(tickervip);
                    preciovip(tickervip);

                    resumenTickets.append(tickervip);
                    break;

                default:
                    break;
            }

            String respuesta = leer("Desea comprar un ticket mas?");
              if (respuesta.equalsIgnoreCase("si")) {
              numero_tickets = true;  
            } else if (respuesta.equalsIgnoreCase("no")) {
                numero_tickets = false;
            } else {
                throw new IllegalArgumentException("Respuesta no valida");
            }
        } while (numero_tickets);

        String resumenes = resumenTickets.toString();
        System.out.println(resumenes);

    }

    public static String leer(String mensaje) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(mensaje);
        return br.readLine();
    }

    public static void ticketNormal(TicketNormal ticket) {
        StringBuffer asiento = new StringBuffer();
        try {
            int numAsiento = Integer.parseInt(leer("Ingrese el numero de asiento"));
            if (numAsiento <= 10) {
                asiento.append(numAsiento);
            } else {
                throw new IllegalArgumentException("Numero de asiento fuera del rango...");
            }
            String str = asiento.toString();
            int num = Integer.parseInt(str);
            ticket.setNumeroAsiento(num);
        } catch (Exception e) {
            System.out.println("numero de asiento fuera del rango...");
        }
    }

    public static void ticketvip(TicketVip ticket) {
        StringBuffer asiento = new StringBuffer();
        try {
            int numAsiento = Integer.parseInt(leer("Ingrese el numero de asiento"));
            if (numAsiento <= 10) {
                asiento.append(numAsiento);
            } else {
                throw new IllegalArgumentException("Numero de asiento fuera del rango...");
            }
            String str = asiento.toString();
            int num = Integer.parseInt(str);
            ticket.setNumeroAsiento(num);
        } catch (Exception e) {
            System.out.println("numero de asiento fuera del rango...");
        }
    }

    public static void precioNormal(TicketNormal ticket) {
        StringBuffer precio = new StringBuffer();
        int _precio = 80;
        precio.append(_precio);
        ticket.setPrecio(_precio);
    }

    public static void preciovip(TicketVip ticket) {
        StringBuffer precio = new StringBuffer();
        int _precio = 40;
        precio.append(_precio);
        ticket.setPrecio(_precio);
    }

}

package netology.ru.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {

    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

    Ticket ticket1 = new Ticket(1, "MSK", "JOK", 600, 100);
    Ticket ticket2 = new Ticket(10, "KZN", "MSK", 500, 120);
    Ticket ticket3 = new Ticket(7, "MSK", "JOK", 600, 105);
    Ticket ticket4 = new Ticket(4, "JOK", "MSK", 500, 93);
    Ticket ticket5 = new Ticket(8, "MSK", "JOK", 900, 89);
    Ticket ticket6 = new Ticket(3, "MSK", "GDX", 500, 200);
    Ticket ticket7 = new Ticket(6, "GDX", "JOK", 500, 40);
    Ticket ticket8 = new Ticket(5, "MSK", "JOK", 900, 90);
    Ticket ticket9 = new Ticket(9, "JOK", "KZN", 500, 60);
    Ticket ticket10 = new Ticket(2, "MSK", "JOK", 700, 95);



    @Test
    public void testSortTickets(){
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket [] actual = manager.findAll("MSK","JOK");
        Ticket [] expected = {ticket1, ticket3, ticket10, ticket5, ticket8};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchNotFound(){

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.findAll("GDX", "MSK");
        Ticket[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void searchOneProduct() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        Ticket[] actual = manager.findAll("MSK", "GDX");
        Ticket[] expected = {ticket6};
        assertArrayEquals(expected, actual);
    }




}
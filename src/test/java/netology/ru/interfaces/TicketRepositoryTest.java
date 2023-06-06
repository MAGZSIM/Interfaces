package netology.ru.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryTest {
    TicketRepository repo = new TicketRepository();

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
    void findAll() {
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
        repo.add(ticket8);
        repo.add(ticket9);
        repo.add(ticket10);
        Ticket[] actual = repo.findAll();
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8, ticket9, ticket10};
        assertArrayEquals(expected, actual);

    }

    @Test
    void add() {
        repo.add(ticket1);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket6);
        repo.add(ticket7);
        repo.add(ticket8);
        repo.add(ticket10);
        Ticket[] actual = repo.findAll();
        Ticket[] expected = {ticket1, ticket3, ticket4, ticket6, ticket7, ticket8, ticket10};
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeById() {
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
        repo.add(ticket8);
        repo.add(ticket9);
        repo.add(ticket10);
        repo.remove(9);
        Ticket[] actual = repo.findAll();
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8, ticket10};
        assertArrayEquals(expected, actual);

    }
}
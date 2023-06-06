package netology.ru.interfaces;

import java.util.Comparator;

public class TicketComparator implements Comparator<Ticket> {
        public int compare(Ticket o1, Ticket o2) {
            return o1.getDuration() - o2.getDuration();
        }
    }
import java.util.*;
import java.lang.*;

public class Test extends Customer {

    private static int ticketCounter = 1;
    static Hashtable<Integer, String> ticketList = new Hashtable<>();

    public static void assignTicket() {
        ticketList.put(ticketCounter, getName());
        if (ticketCounter > 100) {
            ticketCounter = 1;
        }
        else {
            ticketCounter++;
        }
    }

    public static void printOrderList() {
        for(Map.Entry m:ticketList.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static void clearOrder() {
        Integer nextOrder = 99999;
        for(Map.Entry m:ticketList.entrySet()) {
                Integer temp = (Integer) m.getKey();
                    if (temp <= nextOrder) {
                        nextOrder = temp;
                    }
            }
        ticketList.remove(nextOrder);
    }

    public static void main(String args[]) {
        assignTicket();
        assignTicket();
        assignTicket();
        printOrderList();
        System.out.println();
        clearOrder();
        printOrderList();
    }
}

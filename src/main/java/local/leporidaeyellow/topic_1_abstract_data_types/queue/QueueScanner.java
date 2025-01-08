package local.leporidaeyellow.topic_1_abstract_data_types.queue;

import java.util.Scanner;

public class QueueScanner {

    static int n = 1;
    static Queue queue;
    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        queue = new Queue();
        while (true) {
            in.hasNextLine();
            String theActions = in.nextLine();
            n = action(theActions);
            if ( everyoneHealthy(n) ) break;
            if (n == 0) break;
        }
        in.close();
    }

    static boolean everyoneHealthy(int n) {
        if (queue.isEmpty() && n != 0) {
            System.out.println("Все вылечены!");
            return true;
        }
        return false;
    }

    static int action(String theActions) {
        int nLocal = 1;
        switch (theActions) {
            case ("новичок:"):
                in.hasNextLine();
                queue.push(in.nextLine());
                break;
            case ("следующий"):
                // если массивы пустые
                System.out.println(queue.pop());
                break;
            case ("Смена закончилась!"):
                nLocal = 0;
                break;
        }
        return nLocal;
    }
}

package local.leporidaeyellow.topic_1_abstract_data_types.dynamic_array;

import java.util.Scanner;

public class DynamicArrayScanner {

    static int n;
    static Scanner in;
    static DynamicArray dynamicArray;
    static String number;

    public static void main(String[] args) {
        dynamicArray = new DynamicArray();
        in = new Scanner(System.in);
        n = Integer.parseInt( in.nextLine() );
        do {
            in.hasNextLine();
            String theActions = in.nextLine();
            if (nextGetNumber(theActions)) number = in.nextLine();
            action(theActions);
            n = n - 1;
        } while (n > 0);
        in.close();
    }

    static void action(String theActions) {
        switch (theActions) {
            case ("pop_back"):
                System.out.println(dynamicArray.popBack());
                break;
            case ("push_back"):
                dynamicArray.pushBack(number);
                break;
            case ("size"):
                System.out.println(dynamicArray.size());
                break;
            case ("index"):
                System.out.println(dynamicArray.getByIndex(number));
                break;
        }
    }

    static Boolean nextGetNumber(String action) {
        if (action.equals("push_back")) return true;
        if (action.equals("index")) return true;
        return false;
    }
}

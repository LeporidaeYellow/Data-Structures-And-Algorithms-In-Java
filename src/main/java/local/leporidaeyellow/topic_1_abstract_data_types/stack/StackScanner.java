package local.leporidaeyellow.topic_1_abstract_data_types.stack;

import java.util.Scanner;

public class StackScanner {
    static int n;
    static Stack stack;
    static Scanner in;
    static String number;

    public static void main(String[] args) {
        stack = new Stack();
        in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            in.hasNextLine();
            String theActions = in.nextLine();
            if (nextGetNumber(theActions)) number = in.nextLine();
            action(theActions);
        }
        in.close();
    }

    public static void action(String theActions) {
        switch (theActions) {
            case ("pop"):
                stack.pop();
                break;
            case ("top"):
                System.out.println(stack.top());
                break;
            case ("push"):
                stack.push(number);
                break;
            case ("is_empty"):
                System.out.println(isNotEmpty());
                break;
        }
    }

    static Boolean nextGetNumber(String action) {
        if (action.equals("push")) return true;
        return false;
    }

    public static String isNotEmpty() {
        if (stack.isEmpty()) {
            return "Пуст";
        } else {
            return "Не пуст";
        }
    }
}

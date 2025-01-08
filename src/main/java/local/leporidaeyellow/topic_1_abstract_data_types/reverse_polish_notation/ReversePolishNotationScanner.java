package local.leporidaeyellow.topic_1_abstract_data_types.reverse_polish_notation;

import java.util.Scanner;

public class ReversePolishNotationScanner {

    static int n;
    static ReversePolishNotation polishNotation;
    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        polishNotation = new ReversePolishNotation();
        n = Integer.parseInt( in.nextLine() );
        for (int i = 0; i < n; i++){
            in.hasNextLine();
            String theOperand = in.nextLine();
            polishNotation.addOperandOrNumber(theOperand);
        }
        System.out.println(polishNotation.pop());
        in.close();
    }
}

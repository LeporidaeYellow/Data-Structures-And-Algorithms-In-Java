package local.leporidaeyellow.topic_1_abstract_data_types.correct_bracket_sequences;

import java.util.Scanner;

public class CorrectBracketSequencesScanner {
    static CorrectBracketSequences bracketSequences;
    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        bracketSequences = new CorrectBracketSequences();
        in.hasNextLine();
        String expression = in.nextLine();
        System.out.println(bracketSequences.checkBracketSequence(expression));
        in.close();
    }
}

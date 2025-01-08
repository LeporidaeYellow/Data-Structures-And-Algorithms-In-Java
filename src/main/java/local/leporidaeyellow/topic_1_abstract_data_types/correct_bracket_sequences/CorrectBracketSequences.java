package local.leporidaeyellow.topic_1_abstract_data_types.correct_bracket_sequences;

import local.leporidaeyellow.topic_1_abstract_data_types.stack.Stack;

public class CorrectBracketSequences implements CorrectBracketSequencesMethod {

    private final Stack stack;

    public CorrectBracketSequences() {
        this.stack = new Stack();
    }

    @Override
    public String checkBracketSequence(String expression) {
        boolean correct = true;
        int len = expression.length();
        for (int i = 0; i < len; i++) {
            String substring = String.valueOf(expression.charAt(i));
            if ( checkLeftBracket(substring) ) {
                pushBack(substring);
            }
            if ( checkRightBracket(substring) ) {
                if ( !checkCorrectBracket(substring) ) {
                    correct = false;
                }
            }
        }
        if (!stack.isEmpty()) {
            correct = false;
        }
        if (correct) {
            return "CORRECT";
        } else {
            return "INCORRECT";
        }
    }

    private boolean checkCorrectBracket(String substring) {
        if (stack.isEmpty()) return false;
        String anotherSubstring = popBack();
        if (substring.equals("]") && anotherSubstring.equals("[")) return true;
        if (substring.equals(")") && anotherSubstring.equals("(")) return true;
        if (substring.equals("}") && anotherSubstring.equals("{")) return true;
        return false;
    }

    private boolean checkLeftBracket(String substring) {
        return (substring.equals("{") || substring.equals("[") || substring.equals("("));
    }

    private boolean checkRightBracket(String substring) {
        return (substring.equals("}") || substring.equals("]") || substring.equals(")"));
    }

    private String popBack() {
        return stack.pop();
    }

    private void pushBack(String substring) {
        stack.push(substring);
    }
}

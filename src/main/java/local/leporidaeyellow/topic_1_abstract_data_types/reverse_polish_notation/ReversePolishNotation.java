package local.leporidaeyellow.topic_1_abstract_data_types.reverse_polish_notation;

import local.leporidaeyellow.topic_1_abstract_data_types.stack.Stack;

public class ReversePolishNotation implements ReversePolishNotationMethod {

    private final Stack stack;

    public ReversePolishNotation() {
        this.stack = new Stack();
    }

    @Override
    public ReversePolishNotation addOperandOrNumber(String operandOrNumber) {
        if (checkOperand(operandOrNumber)) {
            if (operandOrNumber.equals("+") ) {
                sumOperation();
            }
            if (operandOrNumber.equals("-")) {
                minusOperation();
            }
            if (operandOrNumber.equals(":")) {
                divideOperation();
            }
            if (operandOrNumber.equals("*")) {
                multiplyOperation();
            }
        } else {
            pushIn(Integer.parseInt(operandOrNumber));
        }
        return this;
    }

    private boolean checkOperand(String substring) {
        return (substring.equals("+") || substring.equals("-") || substring.equals("*") || substring.equals(":"));
    }

    private void sumOperation() {
        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());
        pushIn(b + a);
    }

    private void minusOperation() {
        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());
        pushIn(b - a);
    }

    private void multiplyOperation() {
        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());
        pushIn(b * a);
    }

    private void divideOperation() {
        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());
        pushIn(b / a);
    }

    @Override
    public String pop() {
        return stack.pop();
    }

    private void pushIn(int theOperand) {
        stack.push(String.valueOf(theOperand));
    }
}

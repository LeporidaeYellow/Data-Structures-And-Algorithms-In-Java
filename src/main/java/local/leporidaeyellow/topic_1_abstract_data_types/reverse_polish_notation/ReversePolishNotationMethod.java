package local.leporidaeyellow.topic_1_abstract_data_types.reverse_polish_notation;

public interface ReversePolishNotationMethod {
    ReversePolishNotation addOperandOrNumber(String operandOrNumber);
    String pop();
}

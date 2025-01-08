package local.leporidaeyellow.topic_1_abstract_data_types.reverse_polish_notation;

import jdk.jfr.Description;
import local.leporidaeyellow.common.FunctionExecutable;
import local.leporidaeyellow.common.Utils;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationTest {

    @Test
    @Tag("simple")
    @Description("Simple test of Reverse Polish Notation")
    void simpleTest() {
        ReversePolishNotation polishNotation = new ReversePolishNotation();
        // 1 2 + 3 * 10 2 : +
        polishNotation
                .addOperandOrNumber("1")
                .addOperandOrNumber("2")
                .addOperandOrNumber("+")
                .addOperandOrNumber("3")
                .addOperandOrNumber("*")
                .addOperandOrNumber("10")
                .addOperandOrNumber("2")
                .addOperandOrNumber(":")
                .addOperandOrNumber("+");

        assertEquals("14", polishNotation.pop());
    }

    @Test
    @Tag("scanner")
    @Description("Scanner test of Reverse Polish Notation")
    void scannerTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException {

        String query = "9\n" +
                "1\n" +
                "2\n" +
                "+\n" +
                "3\n" +
                "*\n" +
                "10\n" +
                "2\n" +
                ":\n" +
                "+";
        String[] outputCheck = {"14"};

        FunctionExecutable function = () -> ReversePolishNotationScanner.main(new String[]{});
        Utils.scannerTest(query, outputCheck, function);
    }
}

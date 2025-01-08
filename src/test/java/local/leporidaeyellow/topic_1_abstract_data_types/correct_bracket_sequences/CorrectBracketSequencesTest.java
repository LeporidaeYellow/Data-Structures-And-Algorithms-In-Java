package local.leporidaeyellow.topic_1_abstract_data_types.correct_bracket_sequences;

import jdk.jfr.Description;
import local.leporidaeyellow.common.FunctionExecutable;
import local.leporidaeyellow.common.Utils;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorrectBracketSequencesTest {

    @Test
    @Tag("simple")
    @Description("Correct Bracket Sequences Test  - (()())()")
    void testOne() {
        CorrectBracketSequences bracketSequences = new CorrectBracketSequences();
        assertEquals("CORRECT", bracketSequences.checkBracketSequence("(()())()"));
    }


    @Test
    @Tag("simple")
    @Description("Correct Bracket Sequences Test  - ()[]{}(a)(())")
    void testTwo() {
        CorrectBracketSequences bracketSequences = new CorrectBracketSequences();
        assertEquals("CORRECT", bracketSequences.checkBracketSequence("()[]{}(a)(())"));
    }


    @Test
    @Tag("simple")
    @Description("Correct Bracket Sequences Test  - (()")
    void testThree() {
        CorrectBracketSequences bracketSequences = new CorrectBracketSequences();
        assertEquals("INCORRECT", bracketSequences.checkBracketSequence("(()"));

    }

    @Test
    @Tag("simple")
    @Description("Correct Bracket Sequences Test  - (()(())))")
    void testFour() {
        CorrectBracketSequences bracketSequences = new CorrectBracketSequences();
        assertEquals("INCORRECT", bracketSequences.checkBracketSequence("(()(())))"));
    }

    @Test
    @Tag("scanner")
    @Description("Correct Bracket Sequences Scanner Test - (()())()")
    void scannerOneTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException {
        String query = "(()())()\n";
        String[] outputCheck = {"CORRECT"};

        FunctionExecutable function = () -> CorrectBracketSequencesScanner.main(new String[]{});
        Utils.scannerTest(query, outputCheck, function);
    }

    @Test
    @Tag("scanner")
    @Description("Correct Bracket Sequences Scanner Test - ()[]{}(a)(())")
    void scannerTwoTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException {
        String query = "()[]{}(a)(())\n";
        String[] outputCheck = {"CORRECT"};

        FunctionExecutable function = () -> CorrectBracketSequencesScanner.main(new String[]{});
        Utils.scannerTest(query, outputCheck, function);
    }

    @Test
    @Tag("scanner")
    @Description("Correct Bracket Sequences Scanner Test - (()")
    void scannerThreeTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException {
        String query = "(()\n";
        String[] outputCheck = {"INCORRECT"};

        FunctionExecutable function = () -> CorrectBracketSequencesScanner.main(new String[]{});
        Utils.scannerTest(query, outputCheck, function);
    }

    @Test
    @Tag("scanner")
    @Description("Correct Bracket Sequences Scanner Test - (()(())))")
    void scannerFourTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException {
        String query = "(()(())))\n";
        String[] outputCheck = {"INCORRECT"};

        FunctionExecutable function = () -> CorrectBracketSequencesScanner.main(new String[]{});
        Utils.scannerTest(query, outputCheck, function);
    }
}
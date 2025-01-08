package local.leporidaeyellow.topic_1_abstract_data_types.stack;

import jdk.jfr.Description;
import local.leporidaeyellow.common.FunctionExecutable;
import local.leporidaeyellow.common.Utils;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    @Test
    @Tag("simple")
    @Description("Simple test of Stack")
    void simpleTest() {
        Stack stack = new Stack();

        stack.push("1");
        stack.push("2");

        assertEquals(false, stack.isEmpty());
        assertEquals("2", stack.top());
        assertEquals("2", stack.top());
        stack.pop();
        assertEquals("1", stack.top());
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    @Tag("scanner")
    @Description("Scanner test of Stack")
    void scannerTest() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {

        String query = "9\n" +
                "push\n" +
                "1\n" +
                "push\n" +
                "2\n" +
                "is_empty\n" +
                "top\n" +
                "top\n" +
                "pop\n" +
                "top\n" +
                "pop\n" +
                "is_empty\n";
        String[] outputCheck = {"Не пуст", "2", "2", "1", "Пуст"};

        FunctionExecutable function = () -> StackScanner.main(new String[]{});
        Utils.scannerTest(query, outputCheck, function);
    }
}

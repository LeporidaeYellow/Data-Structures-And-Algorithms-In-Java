package local.leporidaeyellow.topic_1_abstract_data_types.queue;

import jdk.jfr.Description;
import local.leporidaeyellow.common.FunctionExecutable;
import local.leporidaeyellow.common.Utils;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

    @Test
    @Tag("simple")
    @Description("Simple test of Queue")
    void simpleTest() {
        Queue queue = new Queue();

        queue.push("Ваня");
        queue.push("Петя");
        String result1 = queue.pop();
        queue.push("Вася");
        String result2 = queue.pop();
        String result3 = queue.pop();

        assertEquals("Ваня", result1);
        assertEquals("Петя", result2);
        assertEquals("Вася", result3);
    }

    @Test
    @Tag("scanner")
    @Description("Scanner test of Queue - One")
    void scannerOneTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException {

        String query = "новичок:\n" +
                "Ваня\n" +
                "новичок:\n" +
                "Петя\n" +
                "следующий\n" +
                "новичок:\n" +
                "Вася\n" +
                "следующий\n" +
                "следующий";
        String[] outputCheck = {"Ваня", "Петя", "Вася", "Все вылечены!"};

        FunctionExecutable function = () -> QueueScanner.main(new String[]{});
        Utils.scannerTest(query, outputCheck, function);
    }

    @Test
    @Tag("scanner")
    @Description("Scanner test of Queue - Two")
    void scannerTwoTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException {

        String query = "новичок:\n" +
                "Катя\n" +
                "новичок:\n" +
                "Дима\n" +
                "новичок:\n" +
                "Степа\n" +
                "следующий\n" +
                "следующий\n" +
                "новичок:\n" +
                "Лариса\n" +
                "Смена закончилась!";
        String[] outputCheck = {"Катя", "Дима"};

        FunctionExecutable function = () -> QueueScanner.main(new String[]{});
        Utils.scannerTest(query, outputCheck, function);
    }
}

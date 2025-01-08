package local.leporidaeyellow.topic_1_abstract_data_types.dynamic_array;

import jdk.jfr.Description;
import local.leporidaeyellow.common.FunctionExecutable;
import local.leporidaeyellow.common.Utils;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicArrayTest {

    @Test
    @Tag("simple")
    @Description("Simple test of Dynamic Array")
    void simpleTest() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.pushBack("4");
        dynamicArray.pushBack("56");
        dynamicArray.pushBack("7");
        dynamicArray.popBack();
        dynamicArray.pushBack("89");

        assertEquals("3", dynamicArray.size());
        assertEquals("3", dynamicArray.capacity());
        assertEquals("56", dynamicArray.getByIndex("1"));
    }

    @Test
    @Tag("scanner")
    @Description("Scanner test of Dynamic Array - Three")
    void scannerTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException {

        String query = "4\n" +
                "push_back\n" +
                "2\n" +
                "push_back\n" +
                "3\n" +
                "pop_back\n" +
                "size\n";

        String[] outputCheck = {"3", "1"};

        FunctionExecutable function = () -> DynamicArrayScanner.main(new String[]{});
        Utils.scannerTest(query, outputCheck, function);
    }

}

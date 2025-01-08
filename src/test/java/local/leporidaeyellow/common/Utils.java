package local.leporidaeyellow.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Utils {
    public static void scannerTest(String query, String[] outputCheck, FunctionExecutable functionExecutable) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(query.getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        functionExecutable.execute();

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();

        String output = outputText;
        String[] result = output.split("\n");
        for (int i = 0; i < result.length; i++) {
            assertEquals(outputCheck[i], result[i]);
        }
    }
}

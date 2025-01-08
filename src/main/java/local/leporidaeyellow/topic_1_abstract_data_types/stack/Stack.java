package local.leporidaeyellow.topic_1_abstract_data_types.stack;

public class Stack implements StackMethod {

    private int length = 0;
    private String[] arr;

    public Stack() {
        this.arr = new String[3];
    }

    @Override
    public String pop() {
        String result = top();
        length = length - 1;
        return result;
    }

    @Override
    public void push(String number) {
        if (length == arr.length) {
            arr = resize(arr);
        }
        length = length + 1;
        arr[length - 1] = number;
    }

    @Override
    public String top() {
        return arr[length - 1];
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    private String[] resize(String[] arr) {
        int len = arr.length * 2;
        String[] newArr = new String[len];
        for (int i=0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}

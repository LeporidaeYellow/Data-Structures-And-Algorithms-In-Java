package local.leporidaeyellow.topic_1_abstract_data_types.dynamic_array;

import java.util.Arrays;

public class DynamicArray implements DynamicArrayMethod {

    private int length;
    private int capacity;
    private String[] stringArray;

    public DynamicArray(int capacity) {
        this.length = 0;
        this.stringArray = new String[capacity];
        this.capacity = capacity;
    }

    public DynamicArray() {
        this(3);
    }

    @Override
    public String popBack() {
        String number = "";
        if (length != 0) {
            number = stringArray[length - 1];
            stringArray[length - 1] = null;
            length = length - 1;
            if (length < capacity / 4) stringArray = reduceSize(stringArray);
            return number;
        }
        return number;
    }

    @Override
    public void pushBack(String number) {
        if (length == capacity) stringArray = expandSize(stringArray);
        length = length + 1;
        stringArray[length - 1] = number;
    }

    @Override
    public String getByIndex(String position) {
        int index = Integer.parseInt(position);
        return stringArray[index];
    }

    @Override
    public void setByIndex(String positionAndElement) {
        String[] arr = positionAndElement.split(" ");
        int index = Integer.parseInt(arr[0]);
        stringArray[index] = arr[1];
    }

    @Override
    public String size() {
        return String.valueOf(length);
    }

    @Override
    public String capacity() {
        return String.valueOf(capacity);
    }

    private String[] expandSize(String[] arr) {
        int len = arr.length * 2;
        String[] newArr = new String[len];
        for (int i = 0; i < arr.length; i++) newArr[i] = arr[i];
        capacity = len;
        return newArr;
    }

    private String[] reduceSize(String[] arr) {
        int len = arr.length / 2;
        String[] newArr = new String[len];
        for (int i = 0; i < newArr.length; i++) newArr[i] = arr[i];
        capacity = len;
        return newArr;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "length=" + length +
                ", capacity=" + capacity +
                ", stringArray=" + Arrays.toString(stringArray) +
                '}';
    }
}

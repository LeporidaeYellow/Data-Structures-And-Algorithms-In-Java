package local.leporidaeyellow.topic_1_abstract_data_types.queue;

import local.leporidaeyellow.topic_1_abstract_data_types.stack.Stack;

public class Queue implements QueueMethod {

    private final Stack inStack;
    private final Stack outStack;

    public Queue() {
        this.inStack = new Stack();
        this.outStack = new Stack();
    }

    @Override
    public String pop() {
        return getOutOfQueue();
    }

    @Override
    public void push(String element) {
        getInQueue(element);
    }

    @Override
    public String top() {
        return outStack.top();
    }

    @Override
    public boolean isEmpty() {
        return outIsEmpty() && inIsEmpty();
    }

    private String getOutOfQueue() {
        String result = "";
        // если массивы пустые
        if ( outStack.isEmpty() && inStack.isEmpty() ) {
            return "";
            // если выходной массив пустой и входной массив НЕ пустой
        } else if ( outStack.isEmpty() && !inStack.isEmpty() ) {
            forwardElements();
            result = outStack.top();
            outStack.pop();
            return result;
        } else {
            result = outStack.top();
            outStack.pop();
            return result;
        }
    }

    private String getInQueue(String string) {
        inStack.push(string);
        return inStack.top();
    }

    private void forwardElements() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.top());
            inStack.pop();
        }
    }

    private Boolean outIsEmpty() {
        return outStack.isEmpty();
    }

    private Boolean inIsEmpty() {
        return inStack.isEmpty();
    }
}

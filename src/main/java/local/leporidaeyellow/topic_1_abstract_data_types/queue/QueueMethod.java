package local.leporidaeyellow.topic_1_abstract_data_types.queue;

public interface QueueMethod {
    String pop();
    void push(String element);
    String top();
    boolean isEmpty();
}

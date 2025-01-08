package local.leporidaeyellow.topic_1_abstract_data_types.dynamic_array;

public interface DynamicArrayMethod {
    String popBack();
    void pushBack(String element);
    String getByIndex(String position);
    // insert String value with White Space "<position> <element>"
    void setByIndex(String positionAndElement);
    String size();
    String capacity();
}

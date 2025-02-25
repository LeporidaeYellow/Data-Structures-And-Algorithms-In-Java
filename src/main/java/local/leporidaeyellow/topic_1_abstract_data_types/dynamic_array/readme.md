# Динамический массив.

### Реализуйте класс динамический массив, имеющий методы:

`push_back(element)` - Добавляет элемент в конец массива. Работает амортизировано за `O(1)`  <br>
`pop_back()` - Удаляет элемент, находящийся в конце массива, а также возвращающий значение удаленного элемента  <br>
`size()` - Возвращает количество элементов в массиве.  <br>
`capacity()` - Возвращает число элементов, которое массив может содержать без выделения дополнительного пространства.  <br>
Также должен быть реализован метод взятия и изменения элемента по `индексу` - по `[]` - как у стандартного массива.  <br>

# Напишите программу, реализующую класс для данной функциональности.

### Формат ввода и вывода

На первой строке вводится `число N` - количество запросов, которые должен будет обработать массив. <br>
На каждой из следующих N строк вводится запрос. Ниже приведены запросы и те ответы на них, которые должна дать программа.  <br>
Если вводится запрос `"push_back"`, тогда на следующей строке необходимо считать <целое число>, а затем вызвать метод добавления
этого числа в конец массива.  <br>
Если вводится запрос `"pop_back"`, программа должна вызвать метод удаления последнего элемента. А на экран программа должна
вывести значение удаленного элемента.  <br>
Если вводится запрос `"size"`, программа должна вызвать метод `size`. А на экран программа должна вывести количество элементов
массива.  <br>
Если вводится запрос `"index"`, тогда на следующей строчке должно вводится целое число, которе означает индекс интересуемого
элемента. В таком случае программа должна вывести значение интересуемого элемента.  <br>

### Примеры

|        | Пример 1                                                   | Пример 2                                                                    | Пример 3                                                                        |
|--------|------------------------------------------------------------|-----------------------------------------------------------------------------|---------------------------------------------------------------------------------|
| ВВОД   | 4<br>push_back<br>2<br>push_back<br>3<br>pop_back<br>size  | 5<br>push_back<br>9<br>push_back<br>6<br>index<br>0<br>index<br>1<br>size   | 5<br>push_back<br>-10<br>push_back<br>8<br>push_back<br>9<br>size<br>index<br>2 |
| ВЫВОД  | 3<br>1                                                     | 9<br>6<br>2                                                                 | 3<br>9                                                                          |


### Созданы классы

`DynamicArrayScanner` - класс использует java.util.Scanner для ввода и вывода. <br>
`DynamicArray` - класс с реализацией `динамического массива`.




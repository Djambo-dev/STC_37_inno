package homeWork12Lesson14;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMapImpl<>();

        map.put("Марсель", "Сидиков");
        map.put("Виктор", "Евлампьев"); // ok
        map.put("Айрат", "Мухутдинов"); // ok
        map.put("Даниил", "Вдовинов"); // OK
        map.put("Даниил", "Богомолов"); // ok
        map.put("Джамиль", "Садыков"); // ok
        map.put("Николай", "Пономарев"); // ok
        map.put("Siblings", "HELLO1");
        map.put("Teheran", "HELLO2"); // ok
        System.out.println(map.get("Марсель"));
    }
}

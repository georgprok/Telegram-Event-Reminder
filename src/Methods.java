public class Methods {
    // Метод без параметров и возвращаемого значения
    public static void sayHello(){
        System.out.println("Привет!");
    }
    // Метод с параметрами
    public static void greet(String name) {
        System.out.println("Привет, "  + name + "!");
    }
    // Метод с возвращаемым значением
    public static int add(int a, int b) {
        return a + b;
    }
    // Метод с несколькими параметрами
    public static String formatEvent(String title, String date){
        return "Событие: " + title + " / Дата: " + date;
    }

    public static void main (String[] args) {
        sayHello();
        greet("Иван");

        int sum = add(5,3);
        System.out.println("Сумма: " + sum);

        String event = formatEvent("Встреча", "2026-02-10");
        System.out.println(event);
    }
}

public class Person {
    // поля класса
    private String name;
    private int age;

    // конструктор
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // геттеры
    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    // Сеттеры


    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    // Методы поведения
    public void introduce(){
        System.out.println("Меня зовут "+name + ", мне " + age + " лет");
    }

    public boolean isAdult(){
        return age >= 18;
    }

    // главный метод для тестирования

    public static void main(String[] args){
        // Созданиве объектов
        Person person1 = new Person("Алексей", 23);
        Person person2 = new Person("Мария", 17);

        // использование методов
        person1.introduce();
        person2.introduce();

        System.out.println(person1.getName() + " совершеннолетний? "+ person1.isAdult());
        System.out.println(person2.getName() + " совершеннолетний? "+ person2.isAdult());

        // изменение данных
        person2.setAge(18);
        System.out.println("После дня рождения:");
        person2.introduce();
    }
}

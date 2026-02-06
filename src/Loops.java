public class Loops {
    public static void main(String[] args){
        // for
        System.out.println("Числа от 1 до 5:");
        for (int i =1; i <=5; i++){
            System.out.println(i);
        }

        // while
        System.out.println("\nОбратный отсчёт:");
        int count = 3;
        while (count>0){
            System.out.println(count);
            count--;
        }
        System.out.println("Все");
    }
}

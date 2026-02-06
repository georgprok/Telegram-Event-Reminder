public class EventReminder {
    public static void main(String[] args) {
        // данные события
        String eventTitle = "Встреча с командой";
        String eventData = "2026-02-18";
        String eventTime = "15:00";
        int daysUntilEvent = 0;

        // Вывод информации
        System.out.println("=== НАПОМИНАНИЕ ===");
        System.out.println("Событие: "+eventTitle);
        System.out.println("Дата: "+eventData);
        System.out.println("Время: "+eventTime);
        System.out.println();

        // Логика
        if (daysUntilEvent == 0){
            System.out.println("СЕГОДНЯ!");
        } else if (daysUntilEvent == 1) {
            System.out.println("ЗАВТРА");

        } else if (daysUntilEvent <= 7) {
            System.out.println("Осталось " + daysUntilEvent + "дней");

        }else {
            System.out.println("Событие через " + daysUntilEvent + "дней");
        }

        // статус
        boolean isUrgent = daysUntilEvent <= 3;
        System.out.println("Срочность: " + (isUrgent ? "Высокая":"Обычная"));
    }
}

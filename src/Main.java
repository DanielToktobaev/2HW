public class Main {

    // метод который решает можно ли идти гулят
    public static String permission(int vozrast, int temp) {
        // если возраст от 20 до 45 и температура от -20 до 30
        if (vozrast >= 20 && vozrast <= 45 && temp >= -20 && temp <= 30) {
            return "можно идти гулять";
        }
        // если возраст меньше 20 и температура от 0 до 28
        else if (vozrast < 20 && temp >= 0 && temp <= 28) {
            return "можно идти гулять";
        }
        // если возраст больше 45 и температура от -10 до 25
        else if (vozrast > 45 && temp >= -10 && temp <= 25) {
            return "можно идти гулять";
        }

        return null;
    }

    // метод который создает случайный возраст
    public static int sluchainiyVozrast() {
        // делаем возраст от 1 до 100
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        // вызываем метод 5 раз с разными температурой и случайным возрастом

        System.out.println("возраст: " + sluchainiyVozrast() + ", температура: 10 -> " + permission(sluchainiyVozrast(), 10));
        System.out.println("возраст: " + sluchainiyVozrast() + ", температура: 20 -> " + permission(sluchainiyVozrast(), 20));
        System.out.println("возраст: " + sluchainiyVozrast() + ", температура: -5 -> " + permission(sluchainiyVozrast(), -5));
        System.out.println("возраст: " + sluchainiyVozrast() + ", температура: 30 -> " + permission(sluchainiyVozrast(), 30));
        System.out.println("возраст: " + sluchainiyVozrast() + ", температура: -15 -> " + permission(sluchainiyVozrast(), -15));
    }
}

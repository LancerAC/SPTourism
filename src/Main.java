import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Все места
        Attraction attraction1 = new Attraction("Исаакиевский собор", 5.0, (byte) 10);
        Attraction attraction2 = new Attraction("Эрмитаж", 8.0, (byte) 11);
        Attraction attraction3 = new Attraction("Кунсткамера", 3.5, (byte) 4);
        Attraction attraction4 = new Attraction("Петропавловская крепость", 10.0, (byte) 7);
        Attraction attraction5 = new Attraction("Ленинградский зоопарк", 9.0, (byte) 15);
        Attraction attraction6 = new Attraction("Медный всадник", 1.0, (byte) 17);
        Attraction attraction7 = new Attraction("Казанский собор", 4.0, (byte) 3);
        Attraction attraction8 = new Attraction("Спас на Крови", 2.0, (byte) 9);
        Attraction attraction9 = new Attraction("Зимний дворец Петра I", 7.0, (byte) 12);
        Attraction attraction10 = new Attraction("Зоологический музей", 5.5, (byte) 6);
        Attraction attraction11 = new Attraction("Музей обороны и блокады Ленинграда", 2.0, (byte) 19);
        Attraction attraction12 = new Attraction("Русский музей", 5.0, (byte) 8);
        Attraction attraction13 = new Attraction("Навестить друзей", 12.0, (byte) 20);
        Attraction attraction14 = new Attraction("Музей восковых фигур", 2.0, (byte) 13);
        Attraction attraction15 = new Attraction("Литературно-мемориальный музей Ф.М. Достоевского", 4.0, (byte) 2);
        Attraction attraction16 = new Attraction("Екатерининский дворец", 1.5, (byte) 5);
        Attraction attraction17 = new Attraction("Петербургский музей кукол", 1.0, (byte) 14);
        Attraction attraction18 = new Attraction("Музей микроминиатюры «Русский Левша»", 3.0, (byte) 18);
        Attraction attraction19 = new Attraction("Всероссийский музей А.С. Пушкина и филиалы", 6.0, (byte) 1);
        Attraction attraction20 = new Attraction("Музей современного искусства Эрарта", 7.0, (byte) 16);

        List<Attraction> attractions = List.of(
                attraction1, attraction2, attraction3, attraction4, attraction5, attraction6, attraction7, attraction8, attraction9,
                attraction10, attraction11, attraction12, attraction13, attraction14, attraction15, attraction16, attraction17,
                attraction18, attraction19, attraction20);

        calculateOptimalRoute(attractions);
    }

    public static void calculateOptimalRoute(List<Attraction> attractions){

        //Время на просмотр достопримечательностей (взято из условия)
        int totalTime = 48 - 2 * 8;

        double[] timeSpent = {0};

         attractions.stream()
                .sorted(Comparator.comparingInt(Attraction::getPriority).reversed())
                .filter(a -> {
                    if (timeSpent[0] + a.getTime() <= totalTime) {
                        timeSpent[0] += a.getTime();
                        return true;
                    }
                    return false;
                })
                .forEach(System.out::println);

        System.out.printf("Времени затрачено: %s%n", timeSpent[0]);
    }
}


package enums;

import master_list_iterator_autoboxing_arraylist_linkedlist_enums.enums.DayOfTheWeek;
import master_list_iterator_autoboxing_arraylist_linkedlist_enums.enums.Topping;

import java.util.Random;

public class EnumSwitch {
    public static void main(String[] args) {
        master_list_iterator_autoboxing_arraylist_linkedlist_enums.enums.DayOfTheWeek weekDay = master_list_iterator_autoboxing_arraylist_linkedlist_enums.enums.DayOfTheWeek.MON;
        System.out.println(weekDay);
        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Original Value = %d%n",
                    weekDay.name(), weekDay.ordinal());
            if (weekDay == master_list_iterator_autoboxing_arraylist_linkedlist_enums.enums.DayOfTheWeek.FRI) {
                System.out.println("Found a Friday !!");
            }
            System.out.println("-".repeat(50));
            switchDayOfWeek(weekDay);
            System.out.println("-".repeat(50));

            for(master_list_iterator_autoboxing_arraylist_linkedlist_enums.enums.Topping topping : Topping.values()){
                System.out.println(topping.name() + ":" + topping.getPrice());
            }
            System.out.println("-".repeat(50));
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0)
                    + weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInteger);
        }
    }

    public static master_list_iterator_autoboxing_arraylist_linkedlist_enums.enums.DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}

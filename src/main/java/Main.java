import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPerson = 0;
        String dish = "";
        String answer = "";
        double price = 0;
        double allPrice = 0;
        String allDish = "";
        String rub = "";


        while (true) {
            boolean peopleForScan = false;
            while (!peopleForScan) {
                System.out.println("Привет! Сколько людей сегодня будут оплачивать счет?");
                try {
                    String line = scanner.nextLine();
                    numberOfPerson = Integer.parseInt(line);
                    peopleForScan = true;
                } catch (Exception Error) {
                    System.out.println("Используй циферки!!!!!!");
                }
            }
            if (numberOfPerson == 0) {
                System.out.println("Вы хотите сломать математику? подумайте еще");
            } else if (numberOfPerson < 0) {
                System.out.println("Вы где-то общителись. Подумайте еще");
            } else if (numberOfPerson == 1) {
                System.out.println("Одиночество сво..чь, одиночество с**а! Попробуйте еще");
            } else if (numberOfPerson > 1) {
                break;
            }
        }


        Calc clac = new Calc();


        while (true) {
            allDish = clac.CalculatorDish();
            allPrice = clac.CalculatorPrice();
            System.out.println("Товар успешно добавлен.\nЕсли на этом Вы наелись, то пишите \"завершить\", если нет, то тыкайте любой символ..");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("завершить")){
                break;
            }
        }



        double averageCost = allPrice/numberOfPerson;
        if ((int)((Math.floor(averageCost))%100) > 10 && ((int)(Math.floor(averageCost))%100) < 15) {
            rub = " рублей.";
        } else {
            int lastDigit = (int) ((Math.floor(averageCost)) % 10);
            switch (lastDigit) {
                case 1:
                    rub = " рубль.";
                    break;
                case 2:
                case 3:
                case 4:
                    rub = " рубля.";
                    break;
                default:
                    rub = " рублей.";
                    break;
            }
        }

        System.out.println("Добавленные товары:\n" + allDish + "Наконец-то Вы наелись! С каждого из вас " + String.format("%.2f", averageCost) + rub);

    }
}

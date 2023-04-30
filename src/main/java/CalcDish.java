import java.util.Scanner;

class Calc {

    Scanner scanner = new Scanner(System.in);
    String dish = "";
    String allDish = "";
    double price = 0;
    double allPrice = 0;
    String answer = "";

    String CalculatorDish() {
        System.out.println("Введите название блюда");
        dish = scanner.nextLine();
        allDish += dish + ";\n";

        return allDish;
    }
    Double CalculatorPrice() {
            boolean priceScan = false;
            while (!priceScan){
                System.out.println("Введите цену");
                try {
                    String line = scanner.nextLine();
                    price = Double.parseDouble(line);
                    priceScan = true;
                } catch (Exception Error){
                    System.out.println("Введите цену ЦИФРАМИ");
                }
            }
            while (true) {
                if (price < 0) {
                    System.out.println("Вы уверены, что ресторан за Вас платит? Попробуйте еще раз:");
                    price = scanner.nextDouble();
                } else if (price >= 0) {
                    allPrice += price;
                    break;
                }
            }
        return allPrice;
    }
}


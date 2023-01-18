import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double money = 0;// кол-во денег на счету у пользователя
        int bonus = 0;//сумма пополнения
        System.out.println("На вашем счету:" + money);
        double replenishmentAmount = 3540.40;
        System.out.println("Сумма пополнения:" + replenishmentAmount);
        if (replenishmentAmount > 1000) {
            bonus = (int) (money + replenishmentAmount) / 100;
            money = (money + replenishmentAmount + bonus);
        } else {
            money = money + replenishmentAmount;
        }
        System.out.println("Количество бонусов " + bonus);
        System.out.println("Количество денег на вашем счету " + money);

    }
}
}
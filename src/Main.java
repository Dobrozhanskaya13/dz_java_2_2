import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int o=1;// для диалогового окна
        double m = 0;// кол-во денег на счету у пользователя
        int bns = 0;//сумма пополнения
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //для считывания данных с клавиатуры
        System.out.println("На вашем счету:" +m);
        while (o==1)
        {   System.out.println("Введите сумму пополнения:");
            String c = reader.readLine();
            double summa = Double.parseDouble(c);
            if (summa>1000)
            {
                bns=(int)(m+summa)/100;
                m=(m+summa+bns);
            }
            else
            {
                   m=m+summa;
            }
           // m = (int) costs / cnt;
            System.out.println("Количество бонусов " + bns);
            System.out.println("Количество денег на вашем счету " + m);
            System.out.println("Хотите пополнить еще? Если да, то введите цифру 1, если нет - то любую другую цифру");
            String c1 = reader.readLine();
            o=Integer.parseInt(c1);

            if (o!=1)
            {
                System.out.println("Хотите завершить операцию? Нажмите q");
                String q = reader.readLine();
                if (q=="q")
                {
                    System.exit(0);
                }
            }

        }
    }
}
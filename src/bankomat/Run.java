package bankomat;
import java.io.IOException;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) throws IOException {
        int nomer=0;
        boolean flag=true;
        Bankomat card=new Bankomat();

        do {
        System.out.println("Выберите номер операции: (1,2,3)");
        System.out.println("1. Пополнить счет");
        System.out.println("2. Снять дениги");
        System.out.println("3. Возврат карты");
            do {
                Scanner scanner = new Scanner(System.in);
                nomer=scanner.nextInt();
            }
                while (nomer<0 || nomer>3);


            switch (nomer){
                case 1:
                    card.popolnenie();
                    card.getOstatok();
                    break;
                case 2:
                    card.sniatie();
                    card.getOstatok();
                    break;
                case 3:
                    card.exit();
                    card.getOstatok();
                    flag=false;
                    break;

            }
        }
        while (flag!=false);
    }
}

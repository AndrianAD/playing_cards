package bankomat;
import java.util.ArrayList;
import java.util.Scanner;

public class Bankomat {
    ArrayList ListCard=new ArrayList();
    public double ostatok=0;
    public double popolnenie() {
        System.out.println("Введите деньги:");
        Scanner scanner = new Scanner(System.in);
        double n=scanner.nextDouble();
        ostatok=ostatok+n;
        return ostatok;
    }

    public double sniatie() {
        System.out.println("Введите cумму которую хотите снять:");
        Scanner scanner = new Scanner(System.in);
        double n=scanner.nextDouble();
        ostatok=ostatok-n;
        return ostatok;
    }
    public void exit() {
        System.out.println("Заберите вашу карточку");
    }

    public void getOstatok() {
        System.out.println("На вашем счете: "+ ostatok);
    }


}

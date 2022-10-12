import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int elamanSayisi,n1=0,n2=1,n3,i;
        Scanner input = new Scanner(System.in);
        System.out.println("fibonacci eleman sayısı giriniz: ");
        elamanSayisi=input.nextInt();
        System.out.print(n1+" "+n2);
        for (i=2;i<=elamanSayisi;++i){

            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}
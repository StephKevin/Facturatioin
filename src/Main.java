//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char option = 'O';
        double montant;
        Scanner sc =new Scanner(System.in);
        while (option=='O'){
            System.out.println("Entrez le montant totale : ");
             montant =sc.nextDouble();
             sc.nextLine();
            Facturation facturation = new Facturation(montant);
            System.out.println(facturation.facture());
            System.out.println("\nVoulez vous entrez un nouveau montant(O/N)");
            String sr = sc.nextLine();
            option = sr.charAt(0);
            sc.nextLine();
        }



    }
}
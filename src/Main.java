//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Facturation facturation = new Facturation(300.0);
        System.out.println(facturation.facture());
        Facturation facturation1 = new Facturation(100.5);
        System.out.println("\n"+facturation1.facture());
    }
}
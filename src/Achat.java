import java.util.Scanner;

public class Achat {
    protected String[] articles = {"pomme", "fraise", "banane","mangue"};
    protected double[] prix ={19.0, 50.0, 20.0, 13.0};
    protected String[] acquisitions = new java.lang.String[0];
    protected static int instanceA;
    protected double totale;
    protected int taille;
    public Achat(int pTaille){//Création d'un tableau d'articles vide
        instanceA++;
        this.taille = pTaille;
        this.acquisitions = new String[pTaille];
    }
    public static int getInstanceA(){return instanceA;}
    public String[] getArticles(){return articles;}
    public double[] getPrix() {
        return prix;
    }

    public  double getTotale(){return totale;}

    public int getTaille() {
        return taille;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }
    public void acheter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Remplissez votre pannier ^-^ ");
        for (int i = 0; i < this.taille; i++){
            System.out.println("Articles "+i+" :");
            acquisitions[i] =sc.nextLine();
        }
    }
    public void rechercher() {
        double price = 0.0;
        int i = 0;
        int j = 0;
        while (i < this.taille) {
            while (j < 4) {
                if (this.acquisitions[i] == this.articles[j]) {
                    price = price + this.prix[j];
                }
                else {
                    j++;
                }
            }
            j = 0;
            i++;
        }
        System.out.println(price);
    }
}

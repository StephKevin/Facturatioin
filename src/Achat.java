import java.util.Scanner;

public class Achat {
    private String[] articles = {"pomme", "fraise", "banane","mangue"};
    private double[] prix ={19.0, 50.0, 20.0, 13.0};
    private String[] acquisitions = new java.lang.String[0];
    private static int instanceA;
    private double totale;
    protected int taille;
    private double montantAchat;
    private double montantTtc;
    private double reduction;
    private double TVA;
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
        rechercher();
    }
    public double rechercher() {
        double price = 0.0;
        int i = 0;
        int j = 0;
        while (i < this.taille) {
            while (j < 4) {
                if (acquisitions[i].equals(articles[j])) {
                    price += this.prix[j];
                    break;
                }
                else {
                    j++;
                }
            }
            j = 0;
            i++;
        }
        System.out.println(price);
        return price;
    }
    public double getMontantAchat() {
        return montantAchat;
    }

    public double getMontantTtc() {
        return montantTtc;
    }

    public double getReduction() {
        return reduction;
    }

    public double getTVA() {
        return TVA;
    }

    public void setMontantAchat(double montantAchat) {
        this.montantAchat = this.totale;
        this.setReduction();
        this.setTVA();
    }
    private void setReduction(){
        if(this.montantAchat<200.0){this.reduction =0.0;}
        else{
            this.reduction = (this.montantAchat * 15)/100;
        }
    }
    private void setTVA(){
        this.TVA= (this.montantAchat*20)/100;
    }
    public void setMontantTtc() {
        double monTtc;
        monTtc = this.montantAchat + this.TVA-this.reduction;
        this.montantTtc = monTtc;
        this.setReduction();
        this.setTVA();
    }
    public String facture(){
        return "\t\tFacture numero "+this.instanceA+"\nMontant HT: "+this.montantAchat+
                " Ar\nRéduction: "+this.reduction+" Ar\nTVA: "+this.TVA+" Ar\nTotale: "+this.montantTtc+" Ar TTC";

    }
}

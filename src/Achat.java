public class Achat {
    protected String[] articles = {"pomme", "fraise", "banane","mangue"};
    protected double[] prix ={19.0, 50.0, 20.0, 13.0};
    protected static int instanceA;
    protected double totale;
    protected int taille;
    public Achat(int pTaille){//Création d'un tableau d'articles vide
        instanceA++;
        this.taille = pTaille;
        this.articles = new String[pTaille];
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
}

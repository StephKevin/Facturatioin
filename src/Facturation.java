public class Facturation
{
    private double montantAchat;
    private double montantTtc;
    private double reduction;
    private double TVA;
    private static int nbrInstance = 0;

    public Facturation(){
        System.out.println("facture par défaut");
        nbrInstance++;
        montantAchat = 0.0;
    }
    public Facturation(double moA){

        nbrInstance++;
        montantAchat = moA;
        this.setReduction();
        this.setTVA();
        this.setMontantTtc();
    }
    public static int getNbrInstance(){
        return nbrInstance;
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
        this.montantAchat = montantAchat;
        this.setReduction();
        this.setTVA();
    }
    private void setReduction(){
        double red;
        if(this.montantAchat<200.0){red =0.0;}
        else{
            red = (this.montantAchat * 15)/100;
        }
        this.reduction = red;
    }
    private void setTVA(){
        double TV;
        TV= (this.montantAchat*20)/100;
        this.TVA = TV;
    }
    public void setMontantTtc() {
        double monTtc;
        monTtc = this.montantAchat + this.TVA-this.reduction;
        this.montantTtc = monTtc;
        this.setReduction();
        this.setTVA();
    }
    public String facture(){
        return "\t\tFacture numero "+this.nbrInstance+"\nMontant HT: "+this.montantAchat+
                " Ar\nRéduction: "+this.reduction+" Ar\nTVA: "+this.TVA+" Ar\nTotale: "+this.montantTtc+" Ar";

    }
}

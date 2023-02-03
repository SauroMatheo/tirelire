package fr.dampierre;

public class Tirelire {
    private double montant;

    Tirelire() {
        montant = 0;
    }

    Tirelire(double depart) {
        montant = depart;
    }

    public double getMontant() {
        return montant;
    }

    public void vider() {
        montant = 0;
    }

    public String getCaractéristiques() {
        if (montant == 0) {
            return "Vous êtes sans le sou...";
        }
        return "Vous avez " + montant + " euros dans la tirelire.";
    }

    public void secouer() {
        if (montant != 0) {
            System.out.println("gling gling !");
        }
    }

    public void ajouter(double ajout) {
        if (ajout > 0) {
            montant += ajout;
        }
    }

    public void sortir(double retrait) {
        if (retrait > 0) {
            montant -= retrait;
            if (montant < 0) {
                montant = 0;
            }
        }
    }

    public double soldeSiOnSort(double cout) {
        if (cout < 0) {
            cout = 0;
        }
        return montant - cout;
    }
}

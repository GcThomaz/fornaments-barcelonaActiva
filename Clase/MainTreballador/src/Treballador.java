import java.util.Date;
import java.util.GregorianCalendar;

public class Treballador implements Comparable {
    
    //ATRIBUTTES
    private String nom;
    private int sou;
    private Date alta;

    //CONSTRUCTOR
    public Treballador(String nom, int sou, int any, int mes, int dia) {
        this.nom = nom;
        this.sou = sou;
        GregorianCalendar calendari = new GregorianCalendar(any,(mes - 1), dia);
        this.alta = calendari.getTime();
    }

    //GETTERS & SETTERS
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(int any, int mes, int dia) {
        GregorianCalendar calendari = new GregorianCalendar(any, (mes - 1), dia);
        this.alta = calendari.getTime();
    }    

    //Mètode General
    public int compareTo(Object elMeuObjecte) {
        Treballador unAltreTreballador = (Treballador) elMeuObjecte;

        if (this.sou < unAltreTreballador.sou) {
            return -1;
        }
        if (this.sou > unAltreTreballador.sou) {
            return 1;
        }
        return 0;
    }

    //Mètode Propi
    public String toString() {
        return "Soc un treballador em dic " + this.nom + " amb un sou anual de " + this.sou + " euros i vaig iniciar el " + this.alta + ".";
    }
}

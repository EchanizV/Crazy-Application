package application;

import javafx.scene.image.Image;

public class Velo {

     private double prix;
     private int tailleOrigine;
     private String marque;
     private String couleur;
     private static Image image;
     private String type;
     
     
/////CONSTRUCTEURS/////     
     
     public Velo(double p, int to,String c, String m, String ty)
     {
	 this.prix = p;
	 this.tailleOrigine = to;
	 this.couleur = c;
	 this.marque = m;
	 this.type = ty;
     }
     
/////FONCTIONS ET METHODES/////
     
     
     
/////GETTER AND SETTER/////
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getTaille() {
        return tailleOrigine;
    }
    public void setTaille(int taille) {
        this.tailleOrigine = taille;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getTailleOrigine() {
        return tailleOrigine;
    }

    public void setTailleOrigine(int tailleOrigine) {
        this.tailleOrigine = tailleOrigine;
    }

    public static Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
     
     
     
    
}

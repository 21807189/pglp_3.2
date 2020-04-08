package mou;


public class Vendeur extends SalaireTotal {

  private int commission;
  
  public Vendeur(int commission) {

    this.commission=commission;
   
}
  
  public double salaire() {
   
    return salaire_base+commission;}
  }


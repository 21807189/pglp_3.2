package mou;

public class Vendeur extends SalaireTotal {

  private int commission;
  private int anc;
  
  public Vendeur(int commission, int anc) {

    this.commission=commission;
    this.anc=anc;
}
  @Override
  
  public double salaire() {
   
    return salaire_base+commission+20*anc;}
  }



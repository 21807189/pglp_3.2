package mou;

public class Manager extends SalaireTotal {
  
  private int nbrEmploye;
  private int anc;
  
  public Manager(int nbrEmploye, int anc) {
    
    this.nbrEmploye=nbrEmploye;
    this.anc=anc;
  }

  @Override
  
  public double salaire() {
    
    return salaire_base+(anc*20)+ (nbrEmploye*100);
  }
}


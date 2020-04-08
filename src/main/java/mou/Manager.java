package mou;


public class Manager extends SalaireTotal {
  
  private int nbrEmploye;
  
  public Manager(int nbrEmploye) {
    
    this.nbrEmploye=nbrEmploye;
   }
  
  public double salaire() {
    
    return salaire_base+ (nbrEmploye*100);
  }
}


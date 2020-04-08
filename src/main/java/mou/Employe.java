package mou;

public class Employe extends SalaireTotal {
 
  private int ancienneté;
  
  public Employe(int ancienneté) {
    this.ancienneté=ancienneté;
  }
  
   @Override
   public double salaire() {
     return salaire_base+ancienneté*20;
   }
}

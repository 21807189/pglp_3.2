package mou;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SalaireTotalTest {


 

    Employe e = new Employe(5);
    Vendeur v = new Vendeur(100,5);
    Manager m = new Manager(10,5);
    double salaireTotal;
    
    @Test
    public void salaireTotal() {
      salaireTotal = e.salaire()+v.salaire()+m.salaire();
     // System.out.println(salaireTotal);
      assertEquals(salaireTotal, 5900.0);
    }
    
   
  }



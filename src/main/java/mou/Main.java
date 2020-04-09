package mou;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    
    Employe e1 = new Employe(8);
    Employe e2 = new Employe(6);
               Vendeur v1 = new Vendeur(300);
              Vendeur v2 = new Vendeur(150);
              
               ArrayList<SalaireTotal> listEmploye= new ArrayList<SalaireTotal>();
               listEmploye.add(e1);
               listEmploye.add(e2);
               listEmploye.add(v1);
                listEmploye.add(v2);
               listEmploye.add(new Manager(10));
               double salaireTotal=0;
               for (int i = 0; i < listEmploye.size(); i++) {
             salaireTotal += listEmploye.get(i).salaire();
           }
               System.out.println("salaire total : " + salaireTotal);
              
           }
     }


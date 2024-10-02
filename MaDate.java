import java.time.LocalDate;

public class MaDate{
  private int jours;
  private int Mois;
  private int Annee;
  
  public MaDate(int jour,int mois,int annee){
    this.jours=jour;
    this.Annee=annee;
    this.Mois=mois;
  }
 public MaDate(int annee) {
        LocalDate currentDate = LocalDate.now();  // Obtient la date courante
        this.jours = currentDate.getDayOfMonth();
        this.Mois = currentDate.getMonthValue();
        this.Annee = annee;  // Utilise l'année passée en paramètre
    }
  public int getJour(){
    return jours;
  }
  public int getMois(){
    return Mois;
  }
  public int getAnnee(){
    return Annee;
  }
  public void setAnnee(int annee){
    this.Annee=annee;
  }
  public void setJour(int jour){
    this.jours=jour;
    
  }
  public void setMois(int mois){
    this.Mois=mois;
  }
  public String toString(){
    return jours+"/"+Mois+"/"+Annee;
  }
  public void AjouterUnJour(){
    int nbrdejour;
    switch (Mois) {
      case 1 :case 3:case 5:case 7:case 8:case 10:case 12:
      nbrdejour=31;
        break;
      case 4: case 6:case 9:case 11:
      nbrdejour=30;
         break;
         case 2:
         if((Annee %4==0 && Annee%100!=0)||(Annee%400==0)){
          nbrdejour=29;
         }else{
          nbrdejour=28;
         }
      default: 
       throw new IllegalArgumentException("mois invalide!:" +Mois);
                }
        if (jours<nbrdejour) {
          jours++;
          
        }else{
          jours=1;
             if(Mois==12){
            Mois=1;
            Annee++;

             }else{
            Mois++;
          }

        }
    }
    public void ajouterPlusieurJour(int n ){
      int i=0;
      while(i!=n){
        System.out.println("l'ajout du jour :"+i);
        AjouterUnJour();
        i++;

      }
    }
    public void ajouterUnMois(){
      if(Mois==12){
        Mois=1;
        Annee++;
      }else{
        Mois++;
      }

    }
  
  public void ajouterUnAn(){
    Annee++;
  }

  void affiche(){
    System.out.println(this.toString());
  }


}
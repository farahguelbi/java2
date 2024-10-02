import java.util.Scanner;
public class test_madate {
  public static void main(String[] args) {
  MaDate date1=new MaDate(2024) ;
  MaDate date2 = new MaDate(11, 12, 2023) ;
  MaDate date3 =  new MaDate(1,  9, 2022) ;

date1.setJour(12);
date1.setMois(12);

System.out.println("affiche des dates");
date1.affiche();

date2.affiche();
date3.affiche();
Scanner scanner = new Scanner(System.in);
System.err.println("Veuillez choisiser une operation a effectuer ");
System.out.println("1.ajouter un jour");
System.out.println("2. Ajouter plusieurs jours");
System.out.println("3. Ajouter un mois");
System.out.println("4. Ajouter une année");
int choix = scanner.nextInt();
switch (choix) {
  case 1:
  date1.AjouterUnJour();
  System.out.println("la date apres l'ajout du jour ");
  date1.affiche();
    break;
    case 2:
  date1.ajouterPlusieurJour(3);
  System.out.println("la date apres l'ajout de plusierus jours ");
  date1.affiche();
    break;
    case 3:
  date1.ajouterUnMois();
  System.out.println("la date apres l'ajout du mois");
  date1.affiche();
    break;
    case 4:
  date1.ajouterUnAn();
  System.out.println("la date apres l'ajout de l'annee");
  date1.affiche();
    break;


  default:
  System.out.println("choix invalide!, saisir une option entre 1et 4 s'il vous plait");
    
}
scanner.close();
}}
/**
*Esta clase proporciona la implantación de un Pangolin,
*El cual es un mamífero pequeño de Asia y de Africa parecido
*A una alcachofa con para al revés. Extendido por una cola
*A la vista de la cual nos pone a pone a pensar que, en efecto,
*Lo ridiculo ya no mata
*@author Julian Villamizar Peña
*@version 1.0
*/


public class Pangolin{
  /** la coordenada x del pangolin. */
  private double x;
  /**La coordenada y del Pangolin. */
  private double y;
  /**El nombre del Pangolin (tradicionalmente llamado Gerard o Toto)*/
  private String name;
  /**El número de escamas del pangolin (Este debe ser estrictamente positivo)*/
  private int nbEcailles;

  /**
  *Trasladar un pangolin
  *
  *@param dx es la coordenada x de traslado
  *@param dy es la coordenada y de traslado
  */

  public void trasladar(double dx, double dy) {
    this.x+=dx;
    this.y+=dy;
  }

  /**
  *Este método emite el grito característico de un pangolin
  *y lo muestra sobre la salida estandar
  */

  public void crier() {
    System.out.println("Gwwark Rhââgn Bwwikk");
  }

  //Here the rest of the Pangolin Class (Como se muestra a continuación)
  //[..]
  //On les appellent en Francais comme Accesseurs et mutateurs mais en Anglais
  //On les appelent Getters and Setters

  //A getter
  public int get getNbEcailles(){
    return this.nbEcailles;
  }

  //A Setter
  public void setNbEcailles(int nb){
    if (nb<=0){
      throw new IllegalArgumentException("Le nombre d'écailles doit être strictement positif !");
    }
    else{
      this.nbEcailles=nb;
    }
  }

  /**
  *Un constructeur est une « méthode » spécifique d'une classe, portant le nom de cette
  *classe, sans type de retour, et qui exécute du code au moment de la création de
  *l'objet. Voici un exemple.
  */

  //Here the rest of the Pangolin class (Come se muestra a continuación)
  public Pangolin(String nom, double xInit, double yInit, int nbEcailles){
    this.nom=nom;
    this.x=xInit;
    this.y=yInit;
    this.setNbEcailles(nbEcailles);
  }

  //Une classe peut contenir plusieurs constructeurs. Ces constructeurs peuvent 
  //même faire appel l'un à l'autre.
  public Pangolin(String nom, int nbEcailles) {
        //Lorsque on utilise this sans un méthode precedé ou objet, c'est parce
        //que on est en train de lancer cette info au constructeur
        this(nom, 0, 0, nbEcailles); // Appel au constructeur à quatre paramètres
  }

}

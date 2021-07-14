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
}

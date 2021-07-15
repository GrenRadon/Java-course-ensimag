public class Tablas{

  //1. Declaración e incialización de una tabla de enteros
  int[] tab;            //Estamos en la declaración, tab aún no ha sido iniciada
  tab=new int [5];      //=>Los indices van desde 0 hasta tab.lenght -1, siendo para este caso 4
                        //=>Sus valores son iniciados en 0
  tab[0]=2;             //Acceso por medio del operador

  //2. tabla de una dimension de objetos
  int n=42;

  Pangolin[] pangolins=new Pangolin[n];  //Atención, recuerde que por ahora no hay más que referencias
  //A null

  for (int i=0; i<pnagolins.length; i++){
    pangolins[i]=new Pangolins(/**..Aquí van los argumentos..*/);//Allocación de objetos por objetos.
  }

  //Otro recorrido, de tipo "for each"
  //(para aplicar el tratamiento a todos los elementos)

  for(Pangolin p: pangolins){
    System.out.println(p.toString());
  }

  //3. Tabla 2D
  int[][] tab2D;
  tab2D=new int[5][]; //tab de 5 referencias null
  for(int i=0; i<tab2D.length; i++){
    //Alocación caso por caso. Dimensiones no necesariamente identicas
    tab2D[i]=new int[i+1];
  }

  //Y ahora, es simplemente hacer:
  tab2D[1][0]=45;
}

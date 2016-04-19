public class TestVector{

  public static void visualizaVector(Vector v){
    int ne = v.obtenerLongitud();
    for(int i=0; i< ne;i++){
      System.out.print(v.obtenerValorEn(i) + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Vector v1 = new Vector();

    visualizaVector(v1);

    Vector v2 = new Vector();
    for(int i=0; i<v2.obtenerLongitud(); i++){
      v2.ponerValorEn(i, i *10);
    }

    visualizaVector(v2);

      /*double[] init= {5,6,5,6,5};

    Vector v3 = new Vector(init);
    visualizaVector(v3);
*/
  }
}

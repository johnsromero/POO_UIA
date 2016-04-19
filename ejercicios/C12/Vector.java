public class Vector{
  private double [] vector;
  private int nElementos;

  public Vector(){
    nElementos = 10;
    vector = new double [nElementos];
  }

  public Vector(int inElementos){
    if(inElementos< 1){
      System.out.println("El numero de elementos no es valido");
      System.out.println("Se asignan 10 elementos");
      nElementos = 10;
    }else{
    nElementos = inElementos;
    }
    vector = new double[nElementos];
  }

  public void vector(double[] ivector){
    nElementos = ivector.length;
    vector = new double[nElementos];
    for(int i=0; i< nElementos;i++){
      vector[i] = ivector[i];
    }
  }

  public void ponerValorEn(int i, double valor){
    if(i>=0 && i <nElementos){
      vector[i] = valor;
    }else{
      System.out.println("El indice esta fuera de los limites");
    }
  }

    public double obtenerValorEn(int i){
      if(i>=0 && i <nElementos){
        return vector[i];
      }else{
        System.out.println("El indice esta fuera de los limites");
        return Double.NaN;
      }
    }

  public int obtenerLongitud(){
    return nElementos;
  }
}

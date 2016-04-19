class Punto{
  private double x,y;

  public Punto(double cx, double cy){ //Constructor, aqui se inician los atributos
    x = cx; y = cy;
  }
}

class Circulo{
  private Punto centro;
  private double radio;

  public Circulo(){}

  protected void msgEsNegativo(){
    System.out.println("El radio es negativo. Se convierte a positivo");
  }
  public Circulo(double cx, double cy, double cr){
    centro =  new Punto(cx, cy);

    if( cr < 0){
      msgEsNegativo();
      cr = -cr;
    }
    radio = cr;
  }

  public double longCircunferencia(){
    return 2 * Math.PI * radio;
  }

  public double areaCirculo(){
    return Math.PI * radio * radio;
  }
}

class Test{
  public static void main(String[] args){
    Circulo obj1 = new Circulo();//Se crea un objeto
    System.out.println(obj1.longCircunferencia());//se imprime la longitud de la circunferencia
    System.out.println(obj1.areaCirculo());


    Circulo obj2 = new Circulo(10,10,10);//Se crea un objeto
    System.out.println(obj2.longCircunferencia());//se imprime la longitud de la circunferencia
    System.out.println(obj2.areaCirculo());


  }
}

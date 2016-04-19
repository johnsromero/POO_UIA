public class TestRefresco{
  public static void main(String[] args){

    Refresco refresco1 = new Refresco();
    Refresco refresco2 = new Refresco("Manzana","Pepsi", 1500);

    System.out.println(refresco1.getMarca());
    System.out.println(refresco1.getSabor());
    System.out.println(refresco1.getCapacidad());
    System.out.println(" ");
    //refresco2.setSabor("Manzana");
    System.out.println(refresco2.getMarca());
    System.out.println(refresco2.getSabor());
    System.out.println(refresco2.getCapacidad());
  }
}

public class Refresco{
  private String sabor;
  private String marca;
  private int capacidad;

  public Refresco(){
    marca = "Coca-cola";
    sabor = "cola";
    capacidad = 600;
  }

  public Refresco(String isabor, String imarca, int icapacidad){
    marca = imarca;
      sabor = isabor;

      capacidad = icapacidad;

  }

  public void setSabor(String isabor){
    sabor = isabor;
  }

  public String getSabor(){
    return sabor;
  }

  public void setMarca(String imarca){
    marca = imarca;
  }

  public String getMarca(){
    return marca;
  }

  public void setCapacidad(int icapacidad){
    capacidad = icapacidad;
  }

  public int getCapacidad(){
    return capacidad;
  }



}

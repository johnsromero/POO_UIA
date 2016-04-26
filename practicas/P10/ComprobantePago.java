class ComprobantePago extends Usuario{

  private int apuesta;
  private int cantidadPartidos;
  private int total;

  public ComprobantePago(String nombre, String direccion, int telefono, int icantidadPartidos){
    super(nombre, direccion, telefono);

    cantidadPartidos = icantidadPartidos;
    apuesta = 5;
  }

  public double getApuesta(){
    return apuesta;
  }

  public void setcantidadPartidos(int icantidadPartidos){
    cantidadPartidos = icantidadPartidos;
  }

  public int getCantidadPartidos(){
    return cantidadPartidos;
  }

  public int getTotal(){
    total = cantidadPartidos * apuesta;
    return total;
    }


  public void mostrarComprobante(){
    System.out.println("Nombre: " + getNombre() +"\nDireccion: " +
    getDireccion() + "\nTelefono: " + getTelefono() + "\nPartidos jugados: " + getCantidadPartidos() +
    "\nApuesta por partido: $" + getApuesta() + "\nMonto total por pagar: " + getTotal());
  }


}

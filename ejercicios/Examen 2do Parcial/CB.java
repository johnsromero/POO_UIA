class CB extends CA{

  private int z;

  public CB(int cx, int cy, int cz){
    super(cx,cy);
    z = cz;
  }

  public int suma(){
      return super.suma() + z;
  }

}

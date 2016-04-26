class Boleto{
  private String jugador;
  private int jornada;
  private int partidos;

  public Boleto(String ijugador, int ijornada, int ipartidos){
    jugador = ijugador;
    jornada = ijornada;
    partidos = ipartidos;

  }

  public void setJugador(String ijugador){
    jugador = ijugador;
  }

  public String getJugador(){
    return jugador;
  }

  public void setJornada(int ijornada){
    jornada = ijornada;
  }

  public int getJornada(){
    return jornada;
  }

  public void setPartidos(int ipartidos){
    partidos = ipartidos;
  }

  public int getPartidos(){
    return partidos;
  }



}

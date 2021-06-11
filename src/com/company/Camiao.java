package com.company;

public class Camiao {
  private String marca;
  private String matricula;
  private double cargaMax;
  private double cargaKG;
  private double horasNoCais;

  public Camiao(String marca, String matricula, double cargaMax, double cargaKG) {
    this.marca = marca;
    this.matricula = matricula;
    this.cargaMax = cargaMax;
    this.cargaKG = cargaKG;
    this.horasNoCais =  Math.random() * 48;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double getCargaMax() {
    return cargaMax;
  }

  public void setCargaMax(double cargaMax) {
    this.cargaMax = cargaMax;
  }

  public double getHorasNoCais() {
    return horasNoCais;
  }

  public void setHorasNoCais(double horasNoCais) {
    this.horasNoCais = horasNoCais;
  }

  public double getCargaKG() {
    return this.cargaKG;
  }

  public void setCargaKG(double cargaKG) {
    this.cargaKG = cargaKG;
  }

  @Override
  public String toString() {
    return "Camiao{" + "marca='" + marca + '\'' + ", matricula='" + matricula + '\'' + ", cargaMax=" + cargaMax + ", cargaKG=" + cargaKG + ", horasNoCais=" + horasNoCais + '}';
  }
}

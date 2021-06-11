package com.company.Armazem;

import com.company.Camiao;
import com.company.CircularQueue.CircularQueue;
import com.company.LinkedList.Cais;
import com.company.LinkedList.Node;

import java.util.LinkedList;
import java.util.Scanner;

public class Armazem {
  private String nome;
  private String localizacao;
  private Cais<Camiao> cais = new Cais<>();
  private CircularQueue<Camiao> filaEspera = new CircularQueue<>();
  static Scanner scanner = new Scanner(System.in);

  public Armazem(String nome, String localizacao) {
    this.nome = nome;
    this.localizacao = localizacao;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLocalizacao() {
    return this.localizacao;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public Cais<Camiao> getCais() {
    return this.cais;
  }

  public void inserirCamiao() {
    String marca;
    String matricula;
    double cargaMax;
    double cargaKG;

    System.out.print("Insira a marca do Camião: ");
    marca = scanner.next();
    System.out.print("Insira a matrícula do Camião: ");
    matricula = scanner.next();
    System.out.print("Insira a carga máxima do Camião (Kg): ");
    cargaMax = scanner.nextDouble();
    System.out.print("Insira a carga que o camião tem neste momento (Kg): ");
    cargaKG = scanner.nextDouble();

    Camiao newCamiao = new Camiao(marca, matricula, cargaMax, cargaKG);
    System.out.println(newCamiao);
/*
    if(filaEspera.enqueue(newCamiao)) {
      cais.add(filaEspera.dequeue());
    };
*/
    //System.out.println(cais.toString());
  }

  public void removerCamiao() {
    String remover;
    System.out.println("Qual o camião a remover?");
    remover = scanner.next();

  }

  public void listarPosicaoCais() {
    System.out.println("listarPosicaoCais");
  }

  public LinkedList<Camiao> listarCamioesASair() {
    LinkedList<Camiao> camioesASair = new LinkedList<>();

    Node<Camiao> current = cais.getHead();
    boolean found = false;

    while(current != null && !found) {
      if(current.getCamiao().getHorasNoCais() > 24) {
        camioesASair.add(current.getCamiao());
      } else {
        current = current.getNext();
      }
    }

    if(camioesASair.isEmpty()) {
      current = cais.getHead();
      found = false;


      while(current != null && !found) {
        if(current.getCamiao().getHorasNoCais() > 24) {
          camioesASair.add(current.getCamiao());
        } else {
          current = current.getNext();
        }
      }
    }

    return camioesASair;
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", localizacao='" + getLocalizacao() + "'" + ", cais='" + getCais() + "'" + "}";
  }
}

package com.company.CircularQueue;

public class Node<Camiao> {
  private Camiao camiao;
  private Node<Camiao> next;

  public Node(Camiao camiao) {
    this.camiao = camiao;
    this.next = null;
  }

  public Camiao getCamiao() {
    return camiao;
  }

  public void setCamiao(Camiao camiao) {
    this.camiao = camiao;
  }

  public Node<Camiao> getNext() {
    return next;
  }

  public void setNext(Node<Camiao> next) {
    this.next = next;
  }
}

package com.company.LinkedList;

public class Node<Camiao> {
  private Camiao camiao;
  private Node<Camiao> next;

  public Node(Camiao camiao) {
    this.camiao = camiao;
    this.next = null;
  }

  public Node() {

  }

  public Camiao getCamiao() {
    return this.camiao;
  }

  public void setCamiao(Camiao camiao) { // se nao estiver nenhum camiao vai adicionar um camiao
    if (this.camiao == null) {
      this.camiao = camiao;
    }
  }

  public Node<Camiao> getNext() {
    return next;
  }

  public void setNext(Node<Camiao> next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Node{" + "camiao=" + camiao + ", next=" + next + '}';
  }
}

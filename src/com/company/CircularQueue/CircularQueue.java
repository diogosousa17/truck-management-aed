package com.company.CircularQueue;

import com.company.Camiao;

public class CircularQueue<Camiao> {
  private Camiao[] arrayQueue;
  private int size, front, back;
  private static final int CAPACITY = 50;

  public CircularQueue() {
    arrayQueue = (Camiao[]) new Object[CAPACITY];
    size = front = back = 0;
  }

  public boolean enqueue(Camiao camiao) {
    if (isFull()) {
      throw new IllegalStateException("Fila cheia");
    } else {
      arrayQueue[back] = camiao;
      back = (back + 1) % CAPACITY;
      size++;
      return true;
    }
  }

  public Camiao dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Fila vazia");
    } else {
      Camiao toReturn = arrayQueue[(front % CAPACITY)];
      arrayQueue[front] = null;
      front = (front + 1) % CAPACITY;
      size--;
      return toReturn;
    }
  }

  public Camiao first() {
    return arrayQueue[front];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == CAPACITY;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    String text = "";

    if (isEmpty()) {
      throw new IllegalStateException("Fila vazia");
    }

    for (int i = 0; i < size; i++) {
      text += arrayQueue[(front + i) % CAPACITY] + " ";
    }

    return text;
  }
}

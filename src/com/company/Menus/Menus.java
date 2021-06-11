package com.company.Menus;

import java.util.Scanner;

public class Menus {

  static Scanner scanner = new Scanner(System.in);

  private Menus() {
  }

  public static int inicio() {
    System.out.println("\n");
    System.out.println("\tBem vindo ao Truck Manager");
    System.out.println("1. Escolha de armazem");
    System.out.println("0. Sair");
    System.out.print("Opção: ");

    return scanner.nextInt();

  }

  public static int escolhaDeArmazem() {
    System.out.println("\n");
    System.out.println("\tGestor de armazens");
    System.out.println("1. Listar Armazém");
    System.out.println("2. Verificar armazens vazios");
    System.out.println("0. Sair");
    System.out.print("Opção: ");

    return scanner.nextInt();
  }

  public static int gestaoArmazem() {
    System.out.println("\n");
    System.out.println("\tGestor de armazens");
    System.out.println("1 - Inserir Camião");
    System.out.println("2 - Remover Camião");
    System.out.println("3 - Listar posições do Cais");
    System.out.println("0 - Sair");
    System.out.print("Opção: ");

    return scanner.nextInt();
  }
}

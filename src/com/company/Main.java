package com.company;

import java.util.Scanner;

import com.company.Armazem.Armazem;
import com.company.Menus.Menus;

public class Main {

  static Scanner scanner = new Scanner(System.in);
  public static Armazem[] armazens = new Armazem[5];

  public static void main(String[] args) {
    Armazem armazem1 = new Armazem("P1", "Portugal");
    armazens[0] = armazem1;

    int opcao = 0;

    do {
      opcao = Menus.inicio();
      switch (opcao) {
        case 0:
          break;
        case 1:
          listarArmazens();
          System.out.print("Nome do armazem: ");
          String armazemEscolhido = scanner.next();
          for (Armazem armazem : armazens) {
            if (armazem != null) {
              if (armazem.getNome().equals(armazemEscolhido)) {
                do {
                  opcao = Menus.gestaoArmazem();
                  switch (opcao) {
                    case 1:
                      armazem.inserirCamiao();
                      break;
                    case 2:
                      armazem.removerCamiao();
                      break;
                    case 3:
                      armazem.listarPosicaoCais();
                      break;
                    case 0:
                      break;
                    default:
                      System.out.println("Opção Inválida.");
                  }
                } while (opcao != 0);
              }
            }
          }
        default:
          System.out.println("Opção Inválida.");
          break;
      }
    } while (opcao != 0);
    scanner.close();
  }

  public static void listarArmazens() {
    for (Armazem armazem : armazens) {
      if (armazem != null) {
        System.out.println("Nome - " + armazem.getNome());
        System.out.println("Localidade - " + armazem.getLocalizacao());
        System.out.println("-----------------------------------------");
      }
    }
  }

  private static void verificarArmazem() {
    System.out.println("verificarArmazens");
  }
}

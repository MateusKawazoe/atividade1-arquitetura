/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade1.arquitetura;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        int opcao = 0;
        Set<String> alunos = new HashSet();
        Scanner read = new Scanner(System.in);

        while (opcao != 3) {
            System.out.println("Bem vindo ao sistema de ...");
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Listar alunos cadastrados");
            System.out.println("[3] Sair");
            System.out.print("Opção: ");

            opcao = Integer.parseInt(read.nextLine());

            switch (opcao) {
                case 1:
                    inserirAluno(read, alunos);
                    break;
                case 2:
                    imprimeLista(alunos);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }
        }
    }

    private static void inserirAluno(Scanner r, Set<String> listaAlunos) {
        System.out.print("\nInsira o nome do aluno: ");
        listaAlunos.add(r.nextLine());
        System.out.println("\n");
    }
    
    private static void imprimeLista(Set<String> listaAlunos) {
        System.out.println("\nLista de alunos:\n");
        for(String alunos : listaAlunos) {
            System.out.println(alunos);
        }
        System.out.println("\n");
    }
}

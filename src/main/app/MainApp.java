package main.app;

import FileManagement.Create;

import java.util.Scanner;

public class MainApp {
    String nome;
    public MainApp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de seu arquivo: ");
        nome = scanner.nextLine();
        Create arquivos = new Create(nome);
        Create log = new Create("Log");
    }
}

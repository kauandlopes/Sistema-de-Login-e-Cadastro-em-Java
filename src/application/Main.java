package application;

import java.util.Scanner;
import entities.App;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static List<App> contas = new ArrayList<>(); //criando lista para guardar anexar as contas sem usar set
	private static Scanner sc = new Scanner(System.in); //não precisa abrir em todos metodos
	
	public static void main(String[] args) {
		
		
		System.out.println("Para fazer o login aperte (y)");
		System.out.println("Para fazer o cadastro aperte (n)");
		char validacao = sc.next().charAt(0);
		sc.nextLine();

		if (validacao == 'y') {
			login();
		}
		else if(validacao == 'n') {
			cadastro();
			login();
			
		}
		else {
			System.out.println("Comando inválido!");
		}
		
		sc.close();
	}
	
	public static void login() {
		
		 while (true) {	
	        System.out.print("Digite seu login: ");
	        String loginConta = sc.nextLine();
	
	        System.out.print("Digite sua senha: ");
	        String loginSenha = sc.nextLine();
	        System.out.println("========================================");
	
	        for (App conta : contas) {
	            if (conta.validarLogin(loginConta, loginSenha)) {
	                System.out.println("Login Correto, Seja bem-vindo " + loginConta + "!");
	                System.out.println("========================================");
	                return;
	                
	            }
	        }
	
	        System.out.println("Login incorreto! Tente novamente.");
	        System.out.println("========================================");
	    }
	}
	

	public static void cadastro() {
		
		System.out.print("Digite seu login: ");
		String loginConta = sc.nextLine();
		
		System.out.print("Digite sua senha: ");
		String loginSenha = sc.nextLine();
		
		App conta = new App(loginConta,loginSenha); 
		contas.add(conta);
		
		System.out.println("========================================");
		System.out.println("Cadastro confirmado!");
		System.out.println("========================================");
	
	
	}


}

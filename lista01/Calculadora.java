package lista01;

import java.util.Scanner;

public class Calculadora {
    
    public double somar(double num1, double num2) {
        return num1 + num2;
    }   // Ok
    
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }   // Ok
    
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }   // OK
    
    public double dividir(double num1, double num2) {
        return num1 / num2; 
    }   // Ok
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        double num1;
        double num2;
        String op;
        
        System.out.println("--------------------");
        System.out.println("---- Questão 01 ----");
        System.out.println("--------------------\n");
        
        System.out.print("Digite o primeiro número da operação: ");
        num1 = sc.nextDouble();
        System.out.print("Digite a operação desejada (+, -, *, /): ");
        op = sc.next();        
        System.out.print("Digite o segundo número da operação: ");
        num2 = sc.nextDouble();
        System.out.println("-----------------------------------------");
        
        sc.close();

        switch(op) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + calc.somar(num1, num2));
                break;

            case "-":
                System.out.println(num1 + " - " + num2 + " = " + calc.subtrair(num1, num2));
                break;

            case "*":
                System.out.println(num1 + " * " + num2 + " = " + calc.multiplicar(num1, num2));
                break;

            case "/":
                System.out.println(num1 + " / " + num2 + " = " + calc.dividir(num1, num2));
                break;

            default:
                System.out.println("Operador inválido.");
                
        }
    }
    
}


    
    


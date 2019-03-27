package lista01;

import java.util.Scanner;

public class Comparador {
 
    private int val1;
    private int val2;
    private int val3;
    

    // Getters & Setters

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int getVal3() {
        return val3;
    }

    public void setVal3(int val3) {
        this.val3 = val3;
    }
    
    // Metodos
    
    public int getMaior(int[] valor) {
        
        int maior = valor[0];
        
        for(int i = 1; i < valor.length; i++) {
            
            if(valor[i] > maior) {
                
                maior = valor[i];
                
            }
        }
        
        return maior;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Comparador comp = new Comparador();
        
        System.out.println("--------------------");
        System.out.println("---- Questão 02 ----");
        System.out.println("--------------------\n");
        
        int[] valores = new int[3];
        
        
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            valores[i] = sc.nextInt();
            
            switch(i) {
                
                case 0:
                    comp.setVal1(valores[i]);
                    break;
                    
                case 1:
                    comp.setVal2(valores[i]);
                    break;
                
                case 2:
                    comp.setVal3(valores[i]);
                    break;
            }
        }
       
        
        System.out.println("\nMaior valor digitado: " + comp.getMaior(valores));
        System.out.println("--------------------------------");

        sc.close(); 
        
    }
    
}

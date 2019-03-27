package lista01;

import java.util.Scanner;

public class ComparadorDeStrings {
    
    
    public void isReverse(String s1, String s2) {
        
        String reverse = "";
        
        for (int i = s1.length() - 1; i >= 0; i--) reverse += s1.charAt(i);
              
        if (s2.equalsIgnoreCase(reverse)) System.out.println("true");
        else System.out.println("false");        

    }  
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ComparadorDeStrings comparador = new ComparadorDeStrings();
        
        String s1;
        String s2;
        
        System.out.println("--------------------");
        System.out.println("---- Questão 05 ----");
        System.out.println("--------------------\n");
        
        System.out.print("Digite a primeira string: ");
        s1 = sc.nextLine();
        System.out.print("Digite a segunda string: ");
        s2 = sc.nextLine();
        
        sc.close();
        
        comparador.isReverse(s1, s2); 
        
    }
    
}

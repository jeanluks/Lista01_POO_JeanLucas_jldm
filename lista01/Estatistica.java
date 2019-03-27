package lista01;

import java.util.Scanner;

public final class Estatistica {
    
    private int maiorValor;

    public Estatistica(int maiorValor) {
        
        
        if(maiorValor >= 0) {
            setMaiorValor(maiorValor);
        } else {
            System.out.println("O valor precisa ser positivo");
            System.exit(0);
        }
        
    }

    public int getMaiorValor() {
        return maiorValor;
    }

    public void setMaiorValor(int maiorValor) {
        
        this.maiorValor = maiorValor;
        
    }
    
    public void status() {
        int sum = this.sumNum(maiorValor);
        float avg = this.avgNum(maiorValor);
        double variance = this.varianceNum(maiorValor);
        
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Soma: " + sum);
        System.out.println("Media: " + avg);
        System.out.println("Variância (Desvio padrão): " + variance);
        this.printOddsOrEvens(maiorValor);
        
    }
    
    // Metodo para retornar o somatorio de zero ate o maior valor
    public int sumNum(int maiorValor) {    // Ok
        
        int sum = maiorValor;
        for(int i = 0; i < maiorValor; i++) sum += i;
        
        return sum;
    }
    
    // Metodo para retornar a media dos numeros de zero ate o maior valor
    public float avgNum(int maiorValor) {   // Ok
        
        float avg;
        float qtdNum = 0;
        float returnSum = this.sumNum(maiorValor);
        
        do {
            qtdNum++;
            maiorValor--;      
        } while (maiorValor >= 0);
        
        avg = returnSum / qtdNum;
        
        return avg;
    }
    
    // Metodo para retornar a variancia de zero ate o maior valor
    public double varianceNum(int maiorValor) {
        
        double qtdVal = 0;
        int aux = maiorValor;
        double returnAvg = this.avgNum(maiorValor);
        
        while(aux>=0) {
            qtdVal++;
            aux--;
        }
        
        double alpha = 0;   // representa o numerador na funcao de variancia (desvio padrao)
        
        for(int i = 0; i <= maiorValor; i++) {
            alpha = alpha + Math.pow((i - returnAvg), 2);
        }    

//        double r;
//        System.out.println("Variância (Desvio padrão): " + Math.sqrt(alpha/qtdVal));
        return Math.sqrt(alpha/qtdVal);
    }
    
    // Metodo para printar os valores de zero ate maior valor, impar e par
    public void printOddsOrEvens(int maiorValor) {
     
        System.out.println("---------------------------------------");
        for (int i = 0; i <= maiorValor; i++) {
            
            if(i%2==0) System.out.println("O valor " + i + " é par");
            else System.out.println("O valor " + i + " é ímpar");
            
        }
        System.out.println("---------------------------------------");
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------");
        System.out.println("---- Questão 04 ----");
        System.out.println("--------------------\n");
        
        System.out.print("Digite um valor: ");
        int val = sc.nextInt();
        
        Estatistica est = new Estatistica(val);
        est.setMaiorValor(val);  
        est.status();
        
        sc.close();

    }

}

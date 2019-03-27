package lista01;
//import lista01.Medidas;

public class ConversorDeMedidas {
        
    // OK
    public void converterMassa(Medidas val1, Medidas val2) {
        
        double newKg;
        double newLb;
        double aux;
        
        // Convertendo de kg para lb
        if(val1.getUnidadeMassa().equalsIgnoreCase("kg") && 
                val2.getUnidadeMassa().equalsIgnoreCase("lb")) {
            
            aux = val1.getMassa();
            newLb = aux * 2.2046;   // Formula para conversao => lb = kg * 2.2046
            
            System.out.printf("%.2f lb\n", newLb);
            
            
        // Convertendo de lb para kg
        } else if(val1.getUnidadeMassa().equalsIgnoreCase("lb") && 
                val2.getUnidadeMassa().equalsIgnoreCase("kg")) {
            
            aux = val1.getMassa();
            newKg = aux / 2.2046;   // Formula para conversao => kg = lb / 2.2046
            
            System.out.printf("%.2f kg\n", newKg);
            
            
        // Retornando erro quando as duas medidas forem iguais     
        } else {
            System.out.println("Não é possível realizar a conversão pois as duas medidas já estão na" +
"mesma unidade.");
        }
            
    }
    
    
    // OK
    public void converterDistancia(Medidas val1, Medidas val2) {
        
//        mi = km/1,609
//        km = mi*1,609

        double newMi;
        double newKm;
        double aux;
        
        // Convertendo de km para mi
        if(val1.getUnidadeDistancia().equalsIgnoreCase("km") && 
                val2.getUnidadeDistancia().equalsIgnoreCase("mi")) {
            
            aux = val1.getDistancia();
            newMi = aux / 1.609;   // Formula para conversao => mi = km/1,609
            
            System.out.printf("%.2f mi\n", newMi);
            
            
        // Convertendo de mi para km
        } else if(val1.getUnidadeDistancia().equalsIgnoreCase("mi") && 
                val2.getUnidadeDistancia().equalsIgnoreCase("km")) {
            
            aux = val1.getDistancia();
            newKm = aux * 1.609;   // Formula para conversao => km = mi*1,609
            
            System.out.printf("%.2f km\n", newKm);
            
            
        // Retornando erro quando as duas medidas forem iguais     
        } else {
            System.out.println("Não é possível realizar a conversão pois as duas medidas já estão na" +
"mesma unidade.");
        }
        
    }
    
    
    public void converterTemperatura(Medidas val1, Medidas val2) {
   
        double newC;
        double newF;
        double aux;
        
        // Convertendo de km para mi
        if(val1.getUnidadeTemperatura().equalsIgnoreCase("C") && 
                val2.getUnidadeTemperatura().equalsIgnoreCase("F")) {
            
            aux = val1.getTemperatura();
            newF = aux * 1.8 + 32;   // Formula para conversao => °F = °C × 1,8 + 32
            
            System.out.printf("%.2f °F\n", newF);
            
            
        // Convertendo de mi para km
        } else if(val1.getUnidadeTemperatura().equalsIgnoreCase("F") && 
                val2.getUnidadeTemperatura().equalsIgnoreCase("C")) {
            
            aux = val1.getTemperatura();
            newC = (aux - 32) / 1.8;   // Formula para conversao => °C = (°F - 32)/1,8
            
            System.out.printf("%.2f °C\n", newC);
            
            
        // Retornando erro quando as duas medidas forem iguais     
        } else {
            System.out.println("Não é possível realizar a conversão pois as duas medidas já estão na" +
"mesma unidade.");
        }
        
    }
    
}

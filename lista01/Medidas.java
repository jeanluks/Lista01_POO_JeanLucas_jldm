package lista01;

public class Medidas {
    
    private String unidadeDistancia;
    private double distancia;
    private String unidadeMassa;
    private double massa;
    private String unidadeTemperatura;
    public int temperatura;
   
    // Constructors
    public Medidas(){}

    public Medidas(String unidadeDistancia, 
            double distancia, String unidadeMassa, 
            double massa, String unidadeTemperatura, 
            int temperatura) {
        
        this.unidadeDistancia = unidadeDistancia;
        this.distancia = distancia;
        this.unidadeMassa = unidadeMassa;
        this.massa = massa;
        this.unidadeTemperatura = unidadeTemperatura;
        this.temperatura = temperatura;
        
    }
    
    // Getters & Setters

    public String getUnidadeDistancia() {
        return unidadeDistancia;
    }

    public void setUnidadeDistancia(String unidadeDistancia) {
        this.unidadeDistancia = unidadeDistancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getUnidadeMassa() {
        return unidadeMassa;
    }

    public void setUnidadeMassa(String unidadeMassa) {
        this.unidadeMassa = unidadeMassa;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public String getUnidadeTemperatura() {
        return unidadeTemperatura;
    }

    public void setUnidadeTemperatura(String unidadeTemperatura) {
        this.unidadeTemperatura = unidadeTemperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
  
    public static void main(String[] args) {
        
        System.out.println("--------------------");
        System.out.println("---- Questão 03 ----");
        System.out.println("--------------------\n");
        
        Medidas obj1 = new Medidas("km", 115, "kg", 80, "C", 27);       // Objeto 1
        Medidas obj2 = new Medidas("mi", 50.95, "lb", 120, "F", 49);    // Objeto 2
        
        ConversorDeMedidas conv = new ConversorDeMedidas();

        
        conv.converterMassa(obj1, obj2);
        conv.converterMassa(obj2, obj1);
        conv.converterMassa(obj1, obj1);
        conv.converterMassa(obj2, obj2);
        
        System.out.println("");
        
        conv.converterDistancia(obj1, obj2);
        conv.converterDistancia(obj2, obj1);
        conv.converterDistancia(obj1, obj1);
        conv.converterDistancia(obj2, obj2);
        
        System.out.println("");
        
        conv.converterTemperatura(obj1, obj2);
        conv.converterTemperatura(obj2, obj1);
        conv.converterTemperatura(obj1, obj1);
        conv.converterTemperatura(obj2, obj2);
        
        System.out.println("");
        
    }
    

    
    
}

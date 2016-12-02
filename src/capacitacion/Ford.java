package capacitacion;
public class Ford extends Carro {
String marca;
    String caballos;
    
    public Ford(){
    this.marca="Ford";
    this.caballos="4000 Caballos de Fuerza";
    }
    
    public String Marca(){
    return this.marca;
    }
    
    public String Potencia(){
    return this.caballos;
    }    
    
}

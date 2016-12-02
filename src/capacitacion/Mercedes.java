package capacitacion;

public class Mercedes extends Carro{
    
    String marca;
    String caballos;
    
    public Mercedes(){
    this.marca="Mercedes Benz";
    this.caballos="5000 Caballos de Fuerza";
    }
    
    public String Marca(){
    return this.marca;
    }
    
    public String Potencia(){
    return this.caballos;
    }
}

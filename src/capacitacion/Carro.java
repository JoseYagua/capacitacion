package capacitacion;
public class Carro {
String motor;
double altura;
double peso;

public Carro(){
this.motor="1.8";
this.altura=1.5;
this.peso=1000;
}

public String QueMotor(){
return this.motor;
}

public double Altura(){
return this.altura;
}

public double CuantoPesa(){
return this.peso;
}
}

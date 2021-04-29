package app;

public class Rectangulo extends Figura {
    
    public Rectangulo() {
        super();
    }
    public void cargarDatos(Float altura, Float base){
        //cargar los datos en la superclase Figura{}
        this.SetBase(base);
        this.SetAltura(altura);
    }
    public float calcular(){
        float resultado =(getAltura() * getBase());
        this.setResultado(resultado);
        return resultado;
    }
    
}

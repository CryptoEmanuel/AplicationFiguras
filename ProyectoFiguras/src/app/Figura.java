package app;

public class Figura {
    
    private Float altura = null;
    private Float base = null;
    private Float resultado = null;
    
    public Figura() {
        super();
    }
    public void SetAltura(Float altura){
        this.altura = altura;
    }
    public void SetBase(Float base){
        this.base = base;
    }
    public void setResultado(Float resultado){
        this.resultado = resultado;
    }

    public Float getResultado() {
        return resultado;
    }
    public Float getAltura() {
        return altura;
    }

    public Float getBase() {
        return base;
    }
    public boolean requerimiento004(Float esMayor){
        int si = 0;
        si = resultado.compareTo(esMayor);
        if(si==1){
            return true;
        }else{
            return false;
        }
    }
}

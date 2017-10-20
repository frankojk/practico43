package telefonia;
public class Fijo extends Telefono
{
    private String tipoDeLinea;

    public String getTipoDeLinea()
    {
        return tipoDeLinea;
    }
    public void setTipoDeLinea(String tipoDeLinea)
    {
        this.tipoDeLinea = tipoDeLinea;
    }
    public Fijo(long numero, String modelo, String marca, String tipoDeLinea)
    {
        super(numero, modelo, marca);
        this.tipoDeLinea = tipoDeLinea;
    }
    
    public boolean llamar(long nroDestino)
    {
        System.out.println("Estoy llamando al numero: " + nroDestino + "...(Desde un fijo)");
        return true;
    }
}

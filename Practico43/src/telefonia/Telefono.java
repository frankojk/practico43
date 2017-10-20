package telefonia;
public abstract class Telefono
{
    private long numero;
    private String modelo;
    private String marca;

    public long getNumero()
    {
        return numero;
    }
    public void setNumero(long numero)
    {
        this.numero = numero;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    public Telefono(long numero, String modelo, String marca)
    {
        this.numero = numero;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public abstract boolean llamar(long nroDestino);
}

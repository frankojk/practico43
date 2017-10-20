package telefonia;
public class Celular extends Telefono
{
    private String empresa;

    public String getEmpresa()
    {
        return empresa;
    }
    public void setEmpresa(String empresa)
    {
        this.empresa = empresa;
    }
    public Celular(long numero, String modelo, String marca, String empresa)
    {
        super(numero, modelo, marca);
        this.empresa = empresa;
    }
    
    public boolean llamar(long nroDestino)
    {
        System.out.println("Estoy llamando al numero: " + nroDestino + "...(Desde un celular)");
        return true;
    }
    
    public boolean enviarMensaje(long nroDestino, String mensaje)
    {
        System.out.println("\tMensaje de texto: ");
        System.out.println(mensaje);
        System.out.println("\tDestinatario");
        System.out.println(nroDestino);
        return true;
    }
}
package prueba;
import telefonia.*;
public class Test
{
    public static void main (String [] args)
    {
        Persona p = new Persona(36539917, "Franco");
        Celular c = new Celular(154971698, "P9 Lite", "Huawei", "Personal");
        Fijo f = new Fijo(154545435, "KP231", "Samsung", "Fija");
        
        p.llamarMensajear(f, 154557892);
        System.out.println("_______________________________________");
        p.llamarMensajear(c, 154851526, "¿Hola, como estás?");
        System.out.println("_______________________________________");
    }
    
    
    
}

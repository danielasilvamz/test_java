package ivafinal;

public class CalculoIva {
    static double porcentajeIva = 0.19; 
    static double precioconIva;
    
    public double calculoIva(double precio)
    {
            precioconIva= precio*porcentajeIva + precio;
            return precioconIva;
            
    }
    
}

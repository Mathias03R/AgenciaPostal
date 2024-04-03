package agenciapostal;

public class Paquete extends Correo{
    private double precioVenta, volumen;
    
    public Paquete(int peso, boolean esExpress, String direccion) {
        super(peso, esExpress, direccion);
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public double calculateImporteTotal() {
        return precioVenta;
    }

    @Override
    public void verDetalle() {
        System.out.println("Paquete{" + "precioVenta=" + precioVenta + ", volumen=" + volumen + '}');
    }
}

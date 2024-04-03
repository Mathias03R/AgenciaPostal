package agenciapostal;

public class Anuncio extends Correo{
    private double precioVenta;

    public Anuncio(int peso, boolean esExpress, String direccion) {
        super(peso, esExpress, direccion);
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public double calculateImporteTotal() {
        return precioVenta;
    }

    @Override
    public void verDetalle() {
        System.out.println("Anuncio{" + "precioVenta=" + precioVenta + '}');
    }
}

package agenciapostal;

class Carta extends Correo {
    private String formato;
    private double precioVenta;

    public Carta(int peso, boolean esExpress, String direccion) {
        super(peso, esExpress, direccion);
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
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
        System.out.println("Carta{" + "formato=" + formato + ", precioVenta=" + precioVenta + '}');
    }
}

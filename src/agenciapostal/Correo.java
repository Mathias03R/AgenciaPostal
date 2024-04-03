package agenciapostal;

abstract class Correo{
    private int peso;
    private String direccion;
    private boolean esExpress, esNoValido;

    public Correo(int peso,  boolean esExpress, String direccion) {
        this.peso = peso;
        this.direccion = direccion;
        this.esExpress = esExpress;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEsExpress() {
        return esExpress;
    }

    public void setEsExpress(boolean esExpress) {
        this.esExpress = esExpress;
    }

    public boolean isEsNoValido() {
        return esNoValido;
    }

    public void setEsNoValido(boolean esNoValido) {
        this.esNoValido = esNoValido;
    }

    public abstract double calculateImporteTotal();
    
    public abstract void verDetalle();
}

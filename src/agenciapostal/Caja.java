package agenciapostal;

public class Caja {
    Correo[] correos = new Correo[10];

    public Caja() {
    }
    
    public void agregarCorreo(Correo correo){
        for (int i = 0; i < correos.length; i++) {
            if (correos[i] == null) {
                correos[i] = correo;
                return;
            }
        }
        System.out.println("La caja está llena, no se puede agregar más correos.");
    }
    
    public double calculateImporteTotalCorreos(){
        double importeTotal = 0;
        for (Correo correo : correos) {
            importeTotal = importeTotal + correo.calculateImporteTotal();
        }
        return importeTotal;
    }
    
    public void verDetalleCorreos(){
        for (Correo correo : correos) {
            correo.verDetalle();
        }
    }
    
    public int obtenerCorreosInvalidos (){
        int cantidadCorreosInvalidos = 0;
        for (Correo correo : correos) {
            if (correo.isEsNoValido() == true) {
                cantidadCorreosInvalidos++;
            }
        }
        return cantidadCorreosInvalidos;
    }
}

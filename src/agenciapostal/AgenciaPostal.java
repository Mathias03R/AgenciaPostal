package agenciapostal;

public class AgenciaPostal {

    public static void main(String[] args) {
        Caja c1 = new Caja();
        
        Paquete p1 = new Paquete(10, true, "direccion1");
        
        c1.agregarCorreo(p1);
    }
}

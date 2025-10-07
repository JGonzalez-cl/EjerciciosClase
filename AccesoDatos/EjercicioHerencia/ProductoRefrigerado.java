package AccesoDatos.EjercicioHerencia;

public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoOrganismo) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public String mostrarInfo() {
        // TODO Auto-generated method stub
        return super.mostrarInfo() + 
            ", Codigo organismo: " + codigoOrganismo;
    }

    
}

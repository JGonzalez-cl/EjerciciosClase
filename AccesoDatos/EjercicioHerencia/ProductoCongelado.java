package AccesoDatos.EjercicioHerencia;

public class ProductoCongelado extends Producto {
    private double temperaturaCongelacion;

    public ProductoCongelado(String fechaCaducidad, String numeroLote, double temperaturaCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public String mostrarInfo() {
        // TODO Auto-generated method stub
        return super.mostrarInfo() + 
            ", Temperatura congelacion: " + temperaturaCongelacion + "C";
    }

    
}

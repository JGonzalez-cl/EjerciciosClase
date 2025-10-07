package AccesoDatos.EjercicioHerencia;

public class CongeladoNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion;
    
    public CongeladoNitrogeno(String fechaCaducidad, String numeroLote, double temperaturaCongelacion,
            String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, temperaturaCongelacion);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public String mostrarInfo() {
        // TODO Auto-generated method stub
        return super.mostrarInfo() + 
            ", Metodo: " + metodoCongelacion +
            ", Tiempo exposicion: " + tiempoExposicion + "seg";
    }

    
}

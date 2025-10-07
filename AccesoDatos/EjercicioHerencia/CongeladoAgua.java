package AccesoDatos.EjercicioHerencia;

public class CongeladoAgua extends ProductoCongelado {
    private double salinidad;

    public CongeladoAgua(String fechaCaducidad, String numeroLote, double temperaturaCongelacion, double salinidad) {
        super(fechaCaducidad, numeroLote, temperaturaCongelacion);
        this.salinidad = salinidad;
    }

    @Override
    public String mostrarInfo() {
        // TODO Auto-generated method stub
        return super.mostrarInfo() + 
            ", Salinidad: " + salinidad + " g/l";
    }

}

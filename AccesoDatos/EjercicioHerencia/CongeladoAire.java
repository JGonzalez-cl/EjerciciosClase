package AccesoDatos.EjercicioHerencia;

public class CongeladoAire extends ProductoCongelado{
    private double nitrogeno;
    private double oxigeno;
    private double dioxidoCarbono;
    private double vaporAgua;
    
    public CongeladoAire(String fechaCaducidad, String numeroLote, double temperaturaCongelacion, double nitrogeno,
            double oxigeno, double dioxidoCarbono, double vaporAgua) {
        super(fechaCaducidad, numeroLote, temperaturaCongelacion);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;
    }

    @Override
    public String mostrarInfo() {
        // TODO Auto-generated method stub
        return super.mostrarInfo() + 
            ", Aire(Nitrogeno: " + nitrogeno + "%, Oxigeno: " + oxigeno + 
            "%, Dioxido de carbono: " + dioxidoCarbono + "%, Vapor de agua: " + vaporAgua + "%)";
    }

    
}

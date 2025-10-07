public class Pelicula extends Multimedia {
    
    private String actorPrincipal;
    private String actrizPrincipal;
    
    public Pelicula(String titulo, String autor, Formato formato, double duracion, String actorPrincipal,
            String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;

        if (actorPrincipal == null && actrizPrincipal == null) {
            System.out.println("Tiene que haber al menos un actor/actriz");
        }
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + 
        " ACTOR PRINCIPAL: " + actorPrincipal + ", ACTRIZ PRINCIPAL: " + actrizPrincipal;
    }
}

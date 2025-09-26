public class AppPeliculas {
    
    public static void main(String[] args) {
        
        ListaMultimedia lista = new ListaMultimedia(10);

        Pelicula p1 = new Pelicula("Interstellar", "Christopher Nolan", Formato.MOV, 169, "Matthew McConaughey", "Jessica Chastain");
        Pelicula p2 = new Pelicula("Good Will Hunting", "Gus Van Sant", Formato.DVD, 86, "Matt Damon", "Minnie Driver");
        Pelicula p3 = new Pelicula("Blade Runner", "Ridley Scott", Formato.DVD, 117, "Harrison Ford", "Sean Young");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println("Lista de peliculas");
        System.out.println(lista);
    }
}

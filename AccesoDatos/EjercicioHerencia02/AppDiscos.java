public class AppDiscos {
    
    public static void main(String[] args) {
        
        ListaMultimedia lista = new ListaMultimedia(20);

        Disco d1 = new Disco("The Best of Sade", "Sade", Formato.MP3, 74, Genero.POP);
        Disco d2 = new Disco("Kind of Blue", "Miles Davis", Formato.CDAUDIO, 45, Genero.JAZZ);
        Disco d3 = new Disco("Led Zeppelin IV", "Led Zeppelin", Formato.MP3, 42 , Genero.ROCK);

        lista.add(d1);
        lista.add(d2);
        lista.add(d3);

        System.out.println("Lista de Discos");
        System.out.println(lista);

        Disco discoBusqueda = new Disco("Led Zeppelin IV", "Led Zeppelin", null, 0, null);
        for (int i = 0; i < lista.size(); i++) {
            Multimedia m = lista.get(i);
            if (m.equals(discoBusqueda)) {
                System.out.println("Disco encontrado: " + m);
            }
        }
    }
}

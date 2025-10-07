public class ListaMultimedia {
    
    private Multimedia[] lista;
    private int contador;
    
    public ListaMultimedia(int MaxElementos) {
        lista = new Multimedia[MaxElementos];
        contador = 0;
    }

    public int size() {
        return contador;
    }

    public boolean add(Multimedia m) {
        if (listaLlena()) {
            return false;
        }
        lista[contador++] = m;
        return true;
    }

    public Multimedia get(int posicion) {
        if (posicion < 0 || posicion >= contador) {
            System.out.println("Posicion invalida");
        }
        return lista[posicion];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            sb.append(lista[i].toString()).append("\n");
        }
        return sb.toString();
    }

    private boolean listaLlena() {
        return contador >= lista.length;
    }
}

package modelo;

public class OperacionesPila {

    public static <T extends Base> Pila<T> duplicarPila(Pila<T> pilaOriginal) {
        Pila<T> pilaAux = new Pila<>();
        Pila<T> pilaDuplicada = new Pila<>();

        while (!pilaOriginal.estaVacia()) {
            T elem = pilaOriginal.desapilar();
            pilaAux.apilar(elem);
        }
        while (!pilaAux.estaVacia()) {
            T elemOriginal = pilaAux.desapilar();
            T elemCopiado = (T) elemOriginal.copy();
            pilaOriginal.apilar(elemOriginal);
            pilaDuplicada.apilar(elemCopiado);
        }

        return pilaDuplicada;
    }

    public static <T extends Base> Pila<T> pilaresultado(Pila<T> pilaOriginal) {
        Pila<T> pilaDuplicada = duplicarPila(pilaOriginal);
        Pila<T> pilaResultado = new Pila<>();
        int index = 0;
        while (!pilaDuplicada.estaVacia()) {
            T elem = pilaDuplicada.desapilar();
            if (index % 2 == 0) {
                pilaResultado.apilar(elem);
            }
            index++;

        }
        return pilaResultado;
    }

}

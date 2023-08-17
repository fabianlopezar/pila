//* @author fabian_esteban.lopez
package modelo;
//LIFO

import java.util.LinkedList;

/*
last in
first out
 */
public class Pila<T extends Base> {

    LinkedList<T> elems;

    public Pila() {
        elems = new LinkedList<>();

    }

    public void apilar(T elem) {
        elems.addLast(elem);
    }

    public T desapilar() {
        return elems.removeLast();
    }

    public boolean estaVacia() {
        return elems.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (T elem : elems) {
            sb.append("").append(elem.toString());
        }
        sb.append("}");
        return sb.toString();
    }

}

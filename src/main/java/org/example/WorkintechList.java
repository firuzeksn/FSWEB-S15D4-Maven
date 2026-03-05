package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E extends Comparable<E>> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        // Tekrar eden veriyi engelle
        if (this.contains(e)) {
            return false;
        }
        return super.add(e);
    }

    public void sort() {
        // Listeyi her zaman sıralı tut
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        // Eleman silindiyse listeyi otomatik sırala
        boolean removed = super.remove(o);
        if (removed) {
            this.sort();
        }
        return removed;
    }
}
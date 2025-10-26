package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int qtyInStore;

    public Store() {
        itemsInStore = new DigitalVideoDisc[100];
        qtyInStore = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore >= itemsInStore.length) {
            DigitalVideoDisc[] newArr = new DigitalVideoDisc[itemsInStore.length + 50];
            System.arraycopy(itemsInStore, 0, newArr, 0, itemsInStore.length);
            itemsInStore = newArr;
        }
        itemsInStore[qtyInStore++] = dvd;
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(dvd)) {
                for (int j = i; j < qtyInStore - 1; j++) itemsInStore[j] = itemsInStore[j+1];
                itemsInStore[--qtyInStore] = null;
                return;
            }
        }
    }

    public void printStore() {
        System.out.println("Store items:");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i+1) + ". " + itemsInStore[i]);
        }
    }
}

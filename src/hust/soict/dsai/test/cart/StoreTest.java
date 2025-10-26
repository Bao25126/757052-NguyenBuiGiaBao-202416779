package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc d1 = new DigitalVideoDisc("S1", "Cat", "Dir", 100, 5.0f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("S2", "Cat", "Dir", 110, 6.0f);

        store.addDVD(d1);
        store.addDVD(d2);
        store.printStore();

        store.removeDVD(d1);
        store.printStore();
    }
}

package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc d1 = new DigitalVideoDisc("A", "Action", "Dir1", 120, 10.0f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("B", "Comedy", "Dir2", 90, 8.5f);
        DigitalVideoDisc d3 = new DigitalVideoDisc("C", "Drama", "Dir3", 150, 12.0f);

        cart.addDigitalVideoDisc(d1);
        cart.addDigitalVideoDisc(new DigitalVideoDisc[]{d2, d3});
        cart.addDigitalVideoDisc(d1, d2);
        cart.addDigitalVideoDisc(d1, d2, d3);
        cart.printCart();

        
        cart.searchByTitle("B");
        
        cart.searchById(2); 
    }
}

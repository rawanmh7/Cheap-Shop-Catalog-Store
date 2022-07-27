/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;


/**
 *
 * @author Rawan
 */
public class Homework2 {

    public static void main(String[] args) {    
    }
}

class Item {

    private String number;
    private double price;

    public Item(String number, double price) {
        this.number = number;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }
}

class Order {

    private String ordernumber;
    private int quantity;
    private String total;

    public Order() {
    }

    public Order(String ordernumber, String total, int quantity) {
        this.ordernumber = ordernumber;
        this.total = total;
        this.quantity = quantity;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public String getTotal() {
        return total;
    }

    public int getQuantity() {
        return quantity;
    }
}

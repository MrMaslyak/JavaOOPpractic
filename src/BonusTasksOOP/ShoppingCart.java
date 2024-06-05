package BonusTasksOOP;

import java.util.ArrayList;

public class ShoppingCart extends Shop {
    protected ArrayList<Product> products = new ArrayList<>();
    protected double totalPrice;

    public ShoppingCart() {
        this.totalPrice = 0;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addProductFromShop(Shop shop, String productName, int count) {
        Product product = shop.getProductFromShop(productName);
        if (product != null && product.getCount() >= count) {
            addProduct(product, count);
            updateShopInventory(product, count);
        } else {
            System.out.println("Not enough " + productName + " in stock.");
        }
    }
    public void addProduct(Product product, int count) {
        if (count > 0) {
            products.add(product);
            product.setUserCount(product.getUserCount() + count);
            System.out.println("Added " + count + " " + product.getName() + " to your cart.");
            updateTotalPrice();
        } else {
            System.out.println("This product end in shop");
        }
    }

    public void removeProduct(String nameProduct) {
        for (Product product : products) {
            if (product.getName().equals(nameProduct)) {
                updateShopInventoryRemove(product, product.getUserCount());
                products.remove(product);
                System.out.println("We remove this " + nameProduct + " from your cart");
                updateTotalPrice();
                break;
            }
        }
    }
    private void updateTotalPrice() {
        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }
    public void updateShopInventory(Product product, int count) {
        product.setCount(product.getCount() - count);
    }
    public void updateShopInventoryRemove(Product product, int count) {
        product.setCount(product.getCount() + count);
    }

    public void totalPrice() {
        System.out.println("Total price in your cart: " + totalPrice);
    }

    public void fullListProducts(){
        System.out.println("---------------");
        System.out.println("Full list of products in your cart: ");
        for (Product product : products) {
            System.out.println(product.getDescriptionPrint() + " " + product.getPricePrint() + " User count: " + product.getUserCount());
        }
        System.out.println("---------------");
    }
    public void applyDiscount(){
        double discount = 0.25;
        double discountPrice = totalPrice * discount;
        totalPrice -= discountPrice;
        System.out.println("Total price after discount: " + totalPrice);
    }

}

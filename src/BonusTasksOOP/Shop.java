package BonusTasksOOP;

import java.util.ArrayList;

public class Shop extends  Product{
    protected ArrayList <Product> productsAll = new ArrayList<>();
    protected ArrayList<String> reviews = new ArrayList<String>();
    public Shop(String name, int price, int count) {
        super(name, price, count);
    }

    public Shop() {
        super();
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<String> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<Product> getProductsAll() {
        return productsAll;
    }

    public void setProductsAll(ArrayList<Product> productsAll) {
        this.productsAll = productsAll;
    }

    public void addProduct(Product product){
        productsAll.add(product);
        System.out.println("Product " + product.getName()+ " Count: " + product.count + " added to shop.");
    }
    public Product getProductFromShop(String productName) {
        for (Product product : productsAll) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        System.out.println("Product " + productName + " not found in shop.");
        return null;
    }

    public void allListProductsShop(){
        System.out.println("---------------");
        System.out.println("All products in shop: ");
        for (Product product : productsAll) {
            System.out.println(product.getDescriptionPrint() + " " + product.getPricePrint() + " Count: " + product.getCount() );
        }
        System.out.println("---------------");
    }
    public void allShopRevies(){
        System.out.println("---------------");
        System.out.println("All reviews in shop: ");
        for (String review : reviews) {
            System.out.println(review);
        }
        System.out.println("---------------");
    }

}

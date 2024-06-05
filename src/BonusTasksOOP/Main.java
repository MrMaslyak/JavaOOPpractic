package BonusTasksOOP;
public class Main {
    public static void main(String[] args) {
        HotelCompany company  = new HotelCompany();
        BookingOptions bookingOptions = new BookingOptions();
     PremiumRoom premiumRoom100  = new PremiumRoom(1000,100,true, 4);
     PremiumRoom premiumRoom101  = new PremiumRoom(1000,101,true, 2);
     LuxRoom luxRoom200 = new LuxRoom(2000, 200, true, 5);
     LuxRoom luxRoom201 = new LuxRoom(2000, 201, true, 3);
     company.addRoom(premiumRoom100);
     company.addRoom(premiumRoom101);
    company.addRoom(luxRoom200);
    company.addRoom(luxRoom201);
        System.out.println("******************************************************");
        premiumRoom101.armorRoom("Ilya", 7, bookingOptions);
       luxRoom201.armorRoom("Alex", 7, bookingOptions);
        System.out.println("******************************************************");
        premiumRoom101.armorRoom("Andrew", 10, bookingOptions);
        luxRoom201.armorRoom("Igor", 5, bookingOptions);
        System.out.println("******************************************************");
        premiumRoom101.clearningRoomService("Ilya", 17.30);
        System.out.println("--------");
        luxRoom201.clearningRoomService("Alex", 12.23, "clean floor");
        System.out.println("******************************************************");
        company.extraEquipment("ExtraMiniBed", bookingOptions);
        premiumRoom101.getDetails();
        luxRoom201.getDetails();
        company.listRooms();
        System.out.println("======================================================");
        ShoppingCart shoppingCart  = new ShoppingCart();
        Shop shop = new Shop();
        UserShop userShop = new UserShop();
        shop.addProduct(new Electronics("Fridge", 5000,20));
        shop.addProduct(new Electronics("TV", 10000,20));
        shop.addProduct(new Clothing("Shirt", 100, 20));
        shop.addProduct(new Clothing("Pants", 200, 20));
        shop.addProduct(new Food("Bread", 10,20));
        shop.addProduct(new Food("Milk", 20,20));
        shop.addProduct(new Kitchenware("Frying pan", 500, 5,20 ));
        shop.addProduct(new Kitchenware("Pot", 600, 10,20));
     System.out.println("------------------------------------------");
        shop.allListProductsShop();
        System.out.println("******************************************");
        shoppingCart.addProductFromShop(shop, "Fridge", 2);
        shoppingCart.addProductFromShop(shop, "Shirt", 5);
        shoppingCart.addProductFromShop(shop, "Bread", 5);
        shop.allListProductsShop();
        shoppingCart.fullListProducts();
        shoppingCart.removeProduct("Fridge");
        shop.allListProductsShop();
        shoppingCart.fullListProducts();
        shoppingCart.applyDiscount();
        System.out.println("*******************************************");
        userShop.getCustomerReviews(shop, "Nice shop, like");
        userShop.getCustomerReviews(shop, "Normal shop thanks");
        userShop.getCustomerReviews(shop, "Very bad shop, dislike ");
        shop.allShopRevies();




    }
}

package BonusTasksOOP;

public class UserShop {
    public void getCustomerReviews(Shop shop, String customerReview) {
        shop.getReviews().add(customerReview);
        System.out.println("Your review added to shop");
    }
}

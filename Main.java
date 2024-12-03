public class Main {
    public static void main(String[] args) {
        Farmer farmer = new Farmer("farmer1", "pass123");
        Retailer retailer = new Retailer("retailer1", "pass456");

        farmer.login("farmer1", "pass123");
        farmer.uploadCropDetails("Wheat", 100, "Area1");
        farmer.uploadCropDetails("Rice", 200, "Area2");
        farmer.viewCropDetails();

        retailer.login("retailer1", "pass456");
        retailer.searchCrop("Wheat", "Area1");
        retailer.purchaseCrop("Wheat", 50);
    }
}

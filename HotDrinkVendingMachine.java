import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrinkWithTemperature> products = new ArrayList<>();

    public void addProduct(HotDrinkWithTemperature product) {
        products.add(product);
    }

    @Override
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemperature product : products) {
            if (product.getName().equalsIgnoreCase(name) &&
                product.getVolume() == volume &&
                product.getTemperature() == temperature) {
                return product;
            }
        }
        System.out.println("Product not found!");
        return null;
    }
}

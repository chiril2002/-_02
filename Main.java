public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры горячих напитков
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Tea", 250, 80);
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Coffee", 300, 85);
        HotDrinkWithTemperature hotChocolate = new HotDrinkWithTemperature("Hot Chocolate", 200, 70);

        // Создаем автомат и добавляем напитки
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.addProduct(tea);
        vendingMachine.addProduct(coffee);
        vendingMachine.addProduct(hotChocolate);

        // Получаем напиток
        HotDrinkWithTemperature selectedDrink = vendingMachine.getProduct("Coffee", 300, 85);
        if (selectedDrink != null) {
            System.out.println("Dispensed: " + selectedDrink);
        }
    }
}

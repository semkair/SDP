public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .setDough("Thin crust")
                .setSauce("Tomato")
                .setTopping("Pepperoni")
                .addCheese(true)
                .build();

        System.out.println(pizza);
    }
}
public class IceCreamFactory {
    private static IceCreamFactory instance;

    public static IceCreamFactory getInstance() {
        if (instance == null) {
            instance = new IceCreamFactory();
        }
        return instance;
    }

    public IceCreamFlavourFactory makeIceCream(String flavour) {
        return switch (flavour) {
            case "vanilla" -> new VanillaIceCreamFlavour();
            case "chocolate" -> new ChocolateIceCreamFlavour();
            case "strawberry" -> new StrawberryIceCreamFlavour();
            default -> throw new IllegalArgumentException("Flavour " + flavour + " not available.");
        };
    }
}

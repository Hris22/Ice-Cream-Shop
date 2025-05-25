public class ChocolateSprinklesTopping extends ToppingsDecorator{

    public ChocolateSprinklesTopping(IceCreamFlavourFactory iceCreamFlavourFactory) {
        super(iceCreamFlavourFactory);
    }

    @Override
    public String IceCreamDecription() {
        return decoratedIceCream.IceCreamDecription()+" + Sprinkles";
    }
}

public class ChocolateTopping extends ToppingsDecorator{
    public ChocolateTopping(IceCreamFlavourFactory decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public String IceCreamDecription() {
        return decoratedIceCream.IceCreamDecription() + " + Chocolate";
    }
}

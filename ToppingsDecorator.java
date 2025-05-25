public abstract class ToppingsDecorator implements IceCreamFlavourFactory {
    protected IceCreamFlavourFactory decoratedIceCream;

    public ToppingsDecorator(IceCreamFlavourFactory decoratedIceCream) {
        this.decoratedIceCream = decoratedIceCream;
    }

    @Override
    public String IceCreamDecription() {
        return decoratedIceCream.IceCreamDecription();
    }
}

public class IceCreamShop {
    public static void main(String[] args) {
        IceCreamFactory iceCreamFactory = IceCreamFactory.getInstance();

        IceCreamFlavourFactory firstCustomerIceCream = iceCreamFactory.makeIceCream("vanilla");
        firstCustomerIceCream = new ChocolateTopping(firstCustomerIceCream);
        firstCustomerIceCream = new ChocolateTopping(firstCustomerIceCream);
        System.out.println("Hris's ice cream: "+firstCustomerIceCream.IceCreamDecription());

        IceCreamFlavourFactory secondCustomerIceCream = iceCreamFactory.makeIceCream("strawberry");
        secondCustomerIceCream = new ChocolateTopping(secondCustomerIceCream);
        System.out.println("Stella's ice cream: "+secondCustomerIceCream.IceCreamDecription());

        IceCreamFlavourFactory thirdCustomerIceCream = iceCreamFactory.makeIceCream("chocolate");
        thirdCustomerIceCream = new ChocolateTopping(thirdCustomerIceCream);
        thirdCustomerIceCream = new ChocolateSprinklesTopping(thirdCustomerIceCream);
        System.out.println("George's ice cream: "+thirdCustomerIceCream.IceCreamDecription());

        IceCreamFlavourFactory fourthIceCream = iceCreamFactory.makeIceCream("blueberry");
        fourthIceCream = new ChocolateTopping(fourthIceCream);
        System.out.println("Aslan's ice cream order: "+fourthIceCream.IceCreamDecription());

    }
}

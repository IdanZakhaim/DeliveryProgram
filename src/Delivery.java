public class Delivery extends Address {

    private int price;

    private final int deliveriesToCity;
    private String orderCustomerName;

    public Delivery(String streetName, int houseNumber, String cityName, int deliveriesToCity, int price, String orderCustomerName) {
        super(streetName, houseNumber, cityName);
        this.price = price;
        this.deliveriesToCity = deliveriesToCity;
        this.orderCustomerName = orderCustomerName;
    }


    public int getPrice() {
        return price;
    }

    public int getDeliveriesToCity() {
        return deliveriesToCity;
    }

    public  String getOrderCustomerName() {
        return orderCustomerName;
    }

    protected static float costCalculation(int deliveriesToCity, float COST_PER_KILOMETE, int distance) {
        return (COST_PER_KILOMETE * distance) / deliveriesToCity;
    }

}

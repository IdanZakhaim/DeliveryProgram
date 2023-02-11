import java.util.Locale;

public class Store extends CityDelivery {

    private static final float COST_PER_KILOMETE = 4.5F;

    private Delivery[] deliveries;
    public CityDelivery[] cityDeliveries;


    public Store(String streetName, int houseNumber, String cityName, int deliveriesToCity, int price, String orderCustomerName, int distance, Delivery[] deliveries, CityDelivery[] cityDeliveries) {
        super(streetName, houseNumber, cityName, deliveriesToCity, price, orderCustomerName, distance);
        this.deliveries = deliveries;
        this.cityDeliveries = cityDeliveries;
    }

    protected static String cityMostExpensiveDelivery(Delivery[] deliveries, CityDelivery[] cityDeliveries) {
        float cost = 0;
        float maximumCost = 0;
        String mostExpensive = null;
        for (int i = 0; i < deliveries.length; i++) {
            for (int j = 0; j < cityDeliveries.length; j++) {
                if (deliveries[i].getCityName().equals(cityDeliveries[j].getCityName())) {
                    cost = costCalculation(deliveries[i].getDeliveriesToCity(), COST_PER_KILOMETE, cityDeliveries[j].getDistance());
                    if (cost > maximumCost) {
                        mostExpensive = deliveries[i].getCityName();
                        maximumCost = cost;
                    }
                }
            }
        }
        return mostExpensive;
    }


    @Override
    protected String[] clientsWithExpensiveDelivery(int price) {
        return super.clientsWithExpensiveDelivery(price);
    }
}

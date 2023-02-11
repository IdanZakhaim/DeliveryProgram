public class CityDelivery extends Delivery {
    private int distance;
    public CityDelivery(String streetName, int houseNumber, String cityName, int deliveriesToCity, int price, String orderCustomerName, int distance) {
        super(streetName, houseNumber, cityName, deliveriesToCity, price, orderCustomerName);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    protected String [] clientsWithExpensiveDelivery(int price){
        int counter = 0;
        String [] initials = new String[1];
        String name;
        char space = ' ';
        String initial = "";
        name=getOrderCustomerName();
        for (int i = 0; i < name.length(); i++) {
            if (i==0 && name.charAt(i) != space){
                initial = initial +name.charAt(i);
            }
            if (name.charAt(i) == space && i != name.length()){
                initial = initial + name.charAt(i+1);
            }
        }
        initials [0] = initial;
        return initials;
    }
    }


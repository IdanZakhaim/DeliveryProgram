public abstract class Address {
    private String streetName;
    private int houseNumber;
    private String cityName;

    public Address(String streetName, int houseNumber, String cityName) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public String toString (){
        return this.getStreetName()+" "+this.getHouseNumber()+", "+this.getCityName();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    private final float COST_PER_KILOMETE = 4.5F;

    public void program (){
        Delivery delivery1 = new Delivery("Begin",5,"Ashkelon",5,1000,"Idan Zakhaim");
        System.out.println(delivery1.toString());
        System.out.println(delivery1.getCityName());

        Delivery [] deliveries= new Delivery[4];
        CityDelivery [] cityDeliveries = new CityDelivery[4];

        deliveries [0] = delivery1;
        deliveries [1] = new Delivery("Kugel", 3,"Holon", 3,50,"Avi Levi");
        deliveries [2] = new Delivery("Herzog", 4,"Haifa", 2,100,"Roee Ron");
        deliveries [3] = new Delivery("Rabin", 4,"Tel Aviv", 1,20,"Eli Cohen");


        cityDeliveries [0] = new CityDelivery("Herzog",4,"Haifa", 2,100,"Avi Levi" , 250);
        cityDeliveries [1] = new CityDelivery("Begin",5,"Ashkelon",5,1000,"Lavi Davi",5);
        cityDeliveries [2] = new CityDelivery("Kugel", 3,"Holon", 3,50,"Coco Jamboi", 20);
        cityDeliveries [3] = new CityDelivery("Rabin", 4,"Tel Aviv", 1,20,"Eli Cohen",40);


            System.out.println(Store.cityMostExpensiveDelivery(deliveries,cityDeliveries));

            int price = 20;

        for (int i = 0; i < cityDeliveries.length; i++) {
            if (CityDelivery.costCalculation(cityDeliveries [i].getDeliveriesToCity(),COST_PER_KILOMETE,cityDeliveries [i].getDistance())> price){
                System.out.print((Arrays.toString(cityDeliveries[i].clientsWithExpensiveDelivery(price))));
            }
        }
    }
}

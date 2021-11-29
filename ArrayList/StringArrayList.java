package JavaOOP.ArrayList;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList <String> cityList = new ArrayList<String>();
        System.out.println(cityList.size());
        System.out.println(cityList.isEmpty());
        System.out.println(cityList.indexOf("Islamabad"));
        cityList.add("Islamabad");
        cityList.add("Rwp");
        cityList.add("Islamabad");
        System.out.println(cityList.contains("Islamabad"));
        System.out.println(cityList.contains("Sialkot"));
        cityList.add("Sialkot");
        cityList.add(1, "Peshawar");
        System.out.println(cityList.get(2));
        cityList.set(1, "Karachi");
        System.out.println(cityList.remove("Islamabad"));
        System.out.println(cityList.remove(0));
    }    
}

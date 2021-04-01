import java.util.LinkedList;
import java.util.List;
 class City {
    public static void main(String[] args) {
        List<String> city=new LinkedList<String>();
        city.add("Kanpur");
        city.add("Lucknow");
        city.add("New Delhi");
        city.add("Agra");
        city.add("Varanasi");
        System.out.println(city);
        city.remove("New Delhi");
        System.out.println(city);
        city.add(3, "Ayodhya");
        System.out.println(city);
    }
}

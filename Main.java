import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> evennumbers;
        evennumbers = getEvenNumbers(1, 20);
        System.out.println(evennumbers);
        ArrayList<Integer> fours;
        fours = getMultiples(4, 1, 20);
        System.out.println(fours);
        fours= getMultiples(4, evennumbers);
        System.out.println(fours);
        Iterator<Integer> it = evennumbers.iterator();
        while (it.hasNext()){
            int x = it.next();
            if (fours.contains(x)){
                it.remove();
            }
        }
        System.out.println(evennumbers);
    }
    public static ArrayList<Integer> getEvenNumbers(int startrange, int endrange) {
        ArrayList<Integer> evennumbers= new ArrayList<>();
        for(int i=startrange; i<=endrange; i++){
            if(i%2==0){
                evennumbers.add(i);
            }
        }
        return evennumbers;
    }
    public static ArrayList<Integer> getMultiples(int base, int startrange, int endrange) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for(int i=startrange; i<=endrange; i++){
            if(i%base==0){
                multiples.add(i);
            }
        }
        return multiples;
    }
    public static ArrayList<Integer> getMultiples(int base, ArrayList<Integer> range) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for (int i : range){
            if(i%base==0){
                multiples.add(i);
            }
        }
        return multiples;
    }
}

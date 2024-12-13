import java.util.HashMap;

public class Main{
    public static void main(String args[]){
        int test = RomanToInt("XLII");
        System.out.println(String.valueOf(test));
    }
    public static int RomanToInt(String roman){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int total = 0;
        for (int i = 0; i < roman.length(); i++){
            int cv = map.get(roman.charAt(i));
            if (i + 1 < roman.length()){
                int nv = map.get(roman.charAt(i+1));
                if (cv<nv){
                    total -= cv;
                }
                else {
                    total += cv;
                }
            }
            else {
                total += cv;
            }
        }
        return total;
    }
}

public class app {
    
    public static String mimificator(String s){
        s = s.toLowerCase();
        char[] splitedArray = s.toCharArray();

        for (int i = 0; i < splitedArray.length; i+=2){
            int asciiChar = (int) splitedArray[i] - 32;
            splitedArray[i] = (char) asciiChar;
        }
        
        s = new String(splitedArray);

        return s;
    }
    
    public static void main(String[] args) {
        String s = mimificator("ai pq eu estudo e");
        System.out.println(s);
    }
}

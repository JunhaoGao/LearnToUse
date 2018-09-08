import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    static int index = 0;

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println();
        String str = "hello,world";
        testRandom();
        testMath();
        testString();
        testList();
        testSet();
        testMap();
        testDate();
    }

    public static void print(Object obj) {
        System.out.println(String.format("{%d}, %s", index++, obj.toString()));
    }

    public static void testRandom() {
        Random r = new Random();
        r.setSeed(123);
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt();
            print(num);
        }
    }

    public static void testMath() {
        int i = 3;
        byte b = 127;
        short s = 6;
        float f = 1.0f;
        double d = 2.0d;
        print(Math.abs(b));
        print(Math.min(b, s));
        print(Math.max(f, d));
    }

    public static void testString() {
        String str = "hello, world";
        for (char c : str.toCharArray()) {
            print(c);
        }
        String str2 = str.replaceAll("o|w", "a");
        print(str2);
        String str3 = str.replace("o", "a");
        print(str3);
        print(str.concat("!!"));
    }

    public static void testList() {
        List<String> strs = new ArrayList<>();
        strs.add("1123");
        strs.add("sadas");
        strs.add(1 + 2 + 3 + "" + 4 + 5);
        strs.add(String.valueOf(121312));
        strs.addAll(Arrays.asList(new String[]{"a", "b", "D", "F"}));
        for (String str : strs)
            print(str);
    }

    public static void testSet() {
        Set<String> set = new HashSet<>();
        for(int i =0;i<6;i++){
            set.add(Integer.toString(i));
        }
        set.add("1");
        print(set.contains(4));
        for(String str: set){
            print(str);
        }
    }

    public static void testMap(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"123421");
        map.put(2,"sadasd");
        print(map.containsKey(1));
        print(map.containsValue("123421"));
        for(Map.Entry e: map.entrySet()){
            print(e.getKey()+":"+e.getValue());
        }
    }

    public static void testDate(){
        Date date = new Date();
        print(date);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy--dd--MM--HH--mm--ss");
        print(formatter.format(date));
    }
}

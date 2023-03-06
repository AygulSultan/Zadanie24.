import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        Random ran = new Random(1);
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = ran.nextInt();

        }



        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList0 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random ran1 = new Random();
            int a= ran1.nextInt(2);
            arrayList.add(a);
        }
        System.out.println(arrayList);

        for (int i=0;i<10;i++){
            if (arrayList.get(i)==0){
                arrayList0.add(arrayList.get(i));

            }
            else {arrayList1.add(arrayList.get(i));
            }

        }
        System.out.println((arrayList0);
        System.out.println(arrayList1);


    }

}
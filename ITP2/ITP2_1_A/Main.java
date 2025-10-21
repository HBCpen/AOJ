package ITP2.ITP2_1_A;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 0; i < args.length / 2; i++){
            int operation = Integer.parseInt(args[i * 2]);
            int num = Integer.parseInt(args[i * 2 + 1]);

            if(operation == 0){
                array.add(array.size(), num);
            }
            else if(operation == 1){
                System.out.println(array.get(num));
            }
            else if(operation == 2){
                array.remove(num);
            }
            else{
                System.err.println("unexpected operation input. usage : <int operation> <int number>");
            }
        }
    }
}
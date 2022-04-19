import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(2, 3, 5, 6, 7);
        fun();
        multiple(2, 3, "Swangi");

    }
    static void multiple( int a, int b, String ...v){

    }

    static void fun( int ...v){
        System.out.println(Arrays.toString(v));
    }
}

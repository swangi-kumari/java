public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
// loop scope
        {

        }
        //scoping in for loop
        for (int i = 0; i < 4; i++){
            System.out.println(i);
        }
        //System.out.println(i); // can't print i
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

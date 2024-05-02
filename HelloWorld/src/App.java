public class App {
    public static void main(String[] args) throws Exception {
        double x = 1000;
        System.out.println(x);
        while(x>1){
            x = x * 0.9;
            System.out.println(x);
        }
    }
}
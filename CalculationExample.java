import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap x: ");
        int x = scanner.nextInt();
        System.out.println("Hay nhap y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
    private  void  calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x+y = :" + a);
            System.out.println("Tong x-y = :" + b);
            System.out.println("Tong x*y = :" + c);
            System.out.println("Tong x/y = :" + d);
        }catch (Exception e) {
            System.out.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}

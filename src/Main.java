
public class Main {

    public static void main(String[] args) {
        System.out.println(testTriangle(1, 2, 3));
    }
    public static String testTriangle(int a, int b, int c){
        if(a < 0 || b < 0 || c < 0)
            return "illegal input";
        else if (a + b <= c || a + c <= b || b + c <= a)
            return "illegal input";
        else if (a == b && b == c)
            return "equilateral";
        else if (a == b || b == c)
            return "isosceles";
        else
            return "scalene";
    }
}

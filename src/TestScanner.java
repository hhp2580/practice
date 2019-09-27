import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入名字：");
        String name=scanner.nextLine();
        System.out.println("请输入爱好：");
        String favor=scanner.nextLine();
        System.out.println("请输入年龄：");
        int age=scanner.nextInt();

        System.out.println("********************");

        System.out.println(name);
        System.out.println(favor);
        System.out.println(age);
        System.out.println("你已经来到地球"+age*365+"天");
        System.out.println("离从地球上消失还剩"+(72-age)*365+"天");

    }
}

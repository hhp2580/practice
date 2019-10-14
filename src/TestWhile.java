/**
 * @author 黄华平
 * @date 2019.10.11
 */

        //九九乘法表
public class TestWhile {
    public static void main(String[] args){
        for(int m=1;m<=9;m++) {
            for (int n=1;n<=m;n++) {
                System.out.print(n+"*" + m + "=" + n * m + "\t");
            }System.out.println();
        }

        System.out.println("**********我是分割线");

        //100以内能被5整除的数，5个一行输出
        int h=0;
        for(int i=1;i<=100;i++){
            if(i%5==0){
                System.out.print(i+"\t");
                h++;
            }
            if(h%5==0){
                System.out.println();
                h=0;
                }

        }
    }
}


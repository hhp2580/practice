public class ifTest {
    public static void main(String[] args){
        double d=Math.random(); //返回【0，1】之间的随机数
        System.out.println(d);

        int a=(int)(d*6+1);
        System.out.println("点数是："+a);
        if(a<=3){
            System.out.println("小");
        }else {
            System.out.println("大");
        }
        System.out.println("#################");
        //通过掷三个骰子来看今天运气咋样
        int i=(int)(d*6+1);
        int j=(int)(d*6+1);
        int k=(int)(d*6+1);
        int count=i+j+k;
        System.out.println("点数是"+count);
        if(count>15){
            System.out.println("今天手气不错哟！");
        }
        if(count>=10&&count<=15){
            System.out.println("今天手气一般啊");
        }else {
            System.out.println("今天手气很差");
        }
    }
}

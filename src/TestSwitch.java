public class TestSwitch{
    public static void main(String[] args){
        int month=(int)(1+12*Math.random());
        System.out.println("月份："+month);

        switch (month){
            case 1:
                System.out.println("我是1月份，要放寒假啦！");
                break;
            case 2:
                System.out.println("我是二月份，要过年啦！");
                break;
            default:
                System.out.println("我是其他月份");
                break;
        }
    }

}
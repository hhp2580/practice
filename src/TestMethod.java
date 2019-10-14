/**
 * 测试方法的使用
 *
 * @author 黄华平
 * @date 2019.10.13
 */
public class TestMethod {
    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        tm.Printhhp();
        System.out.println(tm.add(222, 222, 222));
    }

    void Printhhp() {
        System.out.println("黄华平最帅！");
    }

    int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
}


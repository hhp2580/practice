/**
 * @author 黄华平
 * @date 2019.10.11
 */
public class Stu {
    int id;
    String name;
    int age;

    public static void main(String[] args){
        Stu student=new Stu();
        student.Study();
        student.Play();
    }
    void Study(){
        System.out.println("我在认真学习");
    }

    void Play(){
        System.out.println("我在打王者");
    }

}

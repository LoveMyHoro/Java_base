public class 面向对象进阶_3_继承 {
    //1.子类到底能继承父类中的哪些内容
    //（1）构造方法不能被继承
    //    不管私有还是非私有
    //（2）成员变量都能被继承，但private的不能直接使用。
    //    可以通过Set和Get方法进行修改和查询
    //（3）成员方法：非私有的可以继承，private(私有的)不行
    //    在调用父类的方法时会查询虚方法表，找到方法所在的位置后进行调用
    // 方法进入虚方法表条件：非private,非static，非final;

    //2.继承中成员变量的访问特点：就近原则：谁离我近，我就用谁（先本类，再父类，逐级往上）
    //  可以用super.访问父类的（类似this.访问本类的）

    //3.继承中成员方法的访问特点
    //（1）直接调用（this调用）：满足就近原则：谁离我近，我就用谁
    //（2）super调用：直接访问父类

    //4.方法的重写：（当父类的方法不能满足子类的需求）
    //当父类的方法不能满足子类现在的需求时，需要进行方法的重写
    //（1）书写格式
    //在继承体系中，子类出现了和父类一摸一样的方法声明，我们称这个子类是重写的方法。
    //（2）重写注解（告诉虚拟机这个是重写方法）：@Override
    //@Override是放在重写后的方法上，校验子类重写时语法是否正确。
    //（3）方法重写的本质：重写的方法覆盖了虚方法表中与父类（或爷爷类~）同名的的方法
    //（4）子类重写父类方法时，访问权限必须大于等于父类，返回值类型必须小于等于父类（因为父类的范围大于子类）
    //（5）只有被添加到虚方法表中的方法才能重写
    //举例如下

    public static void main(String[] args) {
        OverseasStudent s1=new OverseasStudent();
        s1.Lunch();
    }
}
    class  Stu{
        public  Stu(){

        }
        public void Drink(){
            System.out.println("喝水");
        }
        public void Eat(){
            System.out.println("吃米饭");
        }
    }

    class OverseasStudent extends Stu{
        public OverseasStudent(){
            super();
        }
        @Override//代表方法的重写
        public void Eat(){
            System.out.println("和咖啡");
        }
        @Override
        public void Drink(){
            System.out.println("吃披萨");
        }
        public void Lunch(){
            this.Drink();//子类
            this.Eat();//子类

            super.Drink();//父类
            super.Eat();//父类
        }
    }

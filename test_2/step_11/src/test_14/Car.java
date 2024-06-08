package test_14;

import java.sql.SQLOutput;

//外部类：车
public class Car {
    private String carName;
    private int carAge;
    private String carColor;

    public void show(){
        //访问内部类必须先创建对象
        Engine e=new Engine();
        System.out.println(e.engineName);
    }


    //内部类：引擎
    class Engine{
        private String engineName;
        private int engineAge;

        public void show(){
            System.out.println(engineName);
            //内部类可直接\访问外部类成员
            System.out.println(carName);
        }
    }

}

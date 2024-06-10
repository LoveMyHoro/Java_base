package test_控制流;
//这个是动作监听
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener{
    JButton jtb1=new JButton("请点我");
    JButton jtb2=new JButton("请不要点我");
    public MyJFrame(){
                //设置窗口大小
        this.setSize(603,680);
        //设置窗口名
        this.setTitle("赫萝的拼图小游戏");
        //设置窗口处于上层
        this.setAlwaysOnTop(true);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置叉掉窗口后程序结束运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照xy轴的形式添加组件
        this.setLayout(null);
        this.setVisible(true);

        //添加按钮
        jtb1.setBounds(0,0,100,50);
        //添加实现类对象
        //方法1.匿名函数实现
        jtb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("哒绵~");
            }
        });


        jtb2.setBounds(100,0,100,50);
        //方法2.接口多态实现：引入ActionListener接口，重写方法
        jtb1.addActionListener(this);
        jtb2.addActionListener(this);
        this.add(jtb1);
        this.add(jtb2);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前的按钮进行判断

        //获取当前被操作的那个按钮对象
        Object source=e.getSource();
        if(source==jtb1){
            jtb1.setSize(200,200);
        }
        else if(source==jtb2){
            Random r=new Random();
            jtb2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}

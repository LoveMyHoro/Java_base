package test_控制流;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//这个是键盘监听
public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3(){
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



        this.addKeyListener(this);




        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //这个不用管
    }

    //细节1
    //如果我们按住按键不松，会一直执行keyPressed方法
    //细节2
    //键盘里每个按键都有其对应的编号，可通过.getKeyCode()获取
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==65){
            System.out.println("你按的是A键");
        }
        else if(code==66){
            System.out.println("你按的是B键");
        }
        System.out.println("松开按键");
    }
}

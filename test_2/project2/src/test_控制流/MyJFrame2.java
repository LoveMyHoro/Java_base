package test_控制流;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//这个是鼠标监听
public class MyJFrame2 extends JFrame implements MouseListener {
        JButton jbt1=new JButton("点我");
    public MyJFrame2(){
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
        jbt1.setBounds(0,0,100,50);
        jbt1.addMouseListener(this);
        this.add(jbt1);



    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}

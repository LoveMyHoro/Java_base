package ui;

import Main.CodeUtil;
import Main.User;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class RegisterJfram extends JFrame implements MouseListener {
    JButton register=new JButton();
    JButton Reset=new JButton();
    //三个输入框
    User user=new User();
    ArrayList <User>list=new ArrayList<>();
    JTextField Username=new JTextField();
    JTextField PassWord=new JTextField();
    JTextField RePassword=new JTextField();
    public RegisterJfram(){
        //初始化窗口
        initJFrame();
        initView();
        //保持窗口可视化
        this.setVisible(true);
    }
    public RegisterJfram(ArrayList<User> list1,User u1){
        this.list=list1;
        this.user=u1;
        //初始化窗口
        initJFrame();
        //初始化组件
        initView();
        //保持窗口可视化
        this.setVisible(true);
    }

    private void initJFrame() {
        //设置窗口大小
        this.setSize(488,430);
        //设置窗口名
        this.setTitle("赫萝的拼图小游戏");
        //设置窗口处于上层
        this.setAlwaysOnTop(true);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置叉掉窗口后程序结束运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void initView(){
        //用户名
        JLabel UsernameText=new JLabel(new ImageIcon("project2\\image\\register\\注册用户名.png"));
        UsernameText.setBounds(116,135,79,17);
        this.getContentPane().add(UsernameText);
        //用户名输入框
        Username.setBounds(220, 134, 190, 30);
        this.add(Username);
        //密码
        JLabel PasswordText=new JLabel(new ImageIcon("project2\\image\\register\\注册密码.png"));
        PasswordText.setBounds(130, 195, 64, 16);
        this.getContentPane().add(PasswordText);
        //密码输入框
        PassWord.setBounds(220, 195, 190, 30);
        this.add(PassWord);
        //再次输入密码
        JLabel CodeText=new JLabel(new ImageIcon("project2\\image\\register\\再次输入密码.png"));
        CodeText.setBounds(116, 256, 96, 17);
        this.getContentPane().add(CodeText);
        //再次输入密码输入框
        RePassword.setBounds(220, 256, 190, 30);
        this.add(RePassword);

        //注册按钮
        register.setBounds(123, 310, 128, 47);
        register.setIcon(new ImageIcon("project2\\image\\register\\注册按钮.png"));
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);
        register.addMouseListener(this);
        //重置按钮
        Reset.setBounds(256,310, 128, 47);
        Reset.setIcon(new ImageIcon("project2\\image\\register\\重置按钮.png"));
        Reset.setBorderPainted(false);
        Reset.setContentAreaFilled(false);
        this.getContentPane().add(Reset);
        Reset.addMouseListener(this);

        //背景图片
        JLabel background=new JLabel(new ImageIcon("project2\\\\image\\\\login\\\\background.png"));
        background.setBounds(0,0,470,390);
        this.getContentPane().add(background);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source=e.getSource();
        if(source==register){
            System.out.println("注册");
            register.setIcon(new ImageIcon("project2\\image\\register\\注册按下.png"));
        }
        else if(source==Reset){
            System.out.println("重置");
            Reset.setIcon(new ImageIcon("project2\\image\\register\\重置按下.png"));
            Username.setText("");
            PassWord.setText("");
            RePassword.setText("");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source=e.getSource();
        if(source==register){
            register.setIcon(new ImageIcon("project2\\image\\register\\注册按钮.png"));
            System.out.println("注册");
            UserRegister();

        }
        else if(source==Reset){
            Reset.setIcon(new ImageIcon("project2\\image\\register\\重置按钮.png"));
            initJFrame();
        }

    }

    public void UserRegister() {
        String s1=Username.getText();
        String s2=PassWord.getText();
        String s3=RePassword.getText();
        if(s1.length()==0||s2.length()==0){
            ShowRegister("用户名或密码不能为空！请重新输入");
        }
        else if(s3.length()==0||!s2.equals(s3)){
            ShowRegister("两次密码输入不一致！请重新输入");
        }
        else if(s2.equals(s3)){
            for (int i = 0; i < list.size(); i++) {
            }
            this.user.setName(s1);
            this.user.setPassword(s2);
            this.setVisible(false);
            new LoginJfram();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void ShowRegister(String Content){
        JDialog jDialog=new JDialog();
        jDialog.setSize(200,150);

        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel Show=new JLabel(Content);
        Show.setBounds(0,0,250,100);
        jDialog.getContentPane().add(Show);

        jDialog.setVisible(true);
    }
}

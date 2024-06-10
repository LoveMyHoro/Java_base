package ui;
import Main.CodeUtil;
import Main.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJfram extends JFrame implements MouseListener {
    JButton login=new JButton();
    JButton register=new JButton();
    //验证码
    String CodeStr= CodeUtil.GetCode();
    //三个输入框
    JTextField Username=new JTextField();
    JTextField PassWord=new JTextField();
    JTextField Code=new JTextField();
    static ArrayList<User> list=new ArrayList<>();
    static {
        list.add(new User("明日香","123"));
        list.add(new User("赫萝","1234"));
    }
    public LoginJfram(){
        //初始化窗口
        initJFrame();
        //在这个界面中添加内容
        initView();
        //报持窗口可视化
        this.setVisible(true);
    }

    private void initView() {
        //用户名
        JLabel UsernameText=new JLabel(new ImageIcon("project2\\image\\login\\用户名.png"));
        UsernameText.setBounds(116,135,47,17);
        this.getContentPane().add(UsernameText);
        //用户名输入框
        Username.setBounds(195, 134, 200, 30);
        this.add(Username);
        //密码
        JLabel PasswordText=new JLabel(new ImageIcon("project2\\image\\login\\密码.png"));
        PasswordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(PasswordText);
        //密码输入框
        PassWord.setBounds(195, 195, 200, 30);
        this.add(PassWord);
        //验证码
        JLabel CodeText=new JLabel(new ImageIcon("project2\\image\\login\\验证码.png"));
        CodeText.setBounds(116, 256, 50, 30);
        this.getContentPane().add(CodeText);
        //验证码输入框
        Code.setBounds(195, 256, 100, 30);
        this.add(Code);
        //添加验证码
        JLabel RightCode=new JLabel();
        RightCode.setText(CodeStr);
        RightCode.setBounds(300, 256, 50, 30);
        this.getContentPane().add(RightCode);
        //登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("project2\\image\\login\\登录按钮.png"));
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);
        login.addMouseListener(this);

        //注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("project2\\image\\login\\注册按钮.png"));
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);
        register.addMouseListener(this);

        //背景图片
        JLabel background=new JLabel(new ImageIcon("project2\\\\image\\\\login\\\\background.png"));
        background.setBounds(0,0,470,390);
        this.getContentPane().add(background);
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


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source=e.getSource();
        if(source==login){
            System.out.println("登录");
            login.setIcon(new ImageIcon("project2\\image\\login\\登录按下.png"));
        }
        else if(source==register){
            System.out.println("注册");
            register.setIcon(new ImageIcon("project2\\image\\login\\注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source=e.getSource();
        if(source==login){
            login.setIcon(new ImageIcon("project2\\image\\login\\登录按钮.png"));
            UserLogin();
        }
        else if(source==register){
            register.setIcon(new ImageIcon("project2\\image\\login\\注册按钮.png"));
            User u1=new User();
            this.setVisible(false);
            new RegisterJfram(list,u1);
            list.add(u1);
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void UserLogin() {
        String s1=Username.getText();
        String s2=PassWord.getText();
        String s3=Code.getText();
        //System.out.println(s1+","+s2+","+s3);
        if(s1.length()==0||s2.length()==0){
            ShowResult("用户名或密码为空！请重新输入");
        }
        else if(s3.length()==0||!s3.equalsIgnoreCase(CodeStr)){
            ShowResult("验证码有误！请重新输入");
        }
        else{
            for (int i = 0; i < list.size(); i++) {
                if(list.size()==0){
                    System.out.println("列表中用户信息为空！请先注册");
                    break;
                }
                User u1=list.get(i);
                if(u1.getName().equals(s1)){
                    if(u1.getPassword().equals(s2)){
                        ShowResult("登录成功！");
                        new GameJfram();
                        this.setVisible(false);
                        return;
                    }
                    else {
                        ShowResult("密码错误！请重新输入");
                        return;
                    }
                    }
                }
            ShowResult("请先注册！");
            }
        }
        public void ShowResult(String Content){
            JDialog jDialog=new JDialog();
            jDialog.setSize(200,150);
            //置顶
            jDialog.setAlwaysOnTop(true);
            //居中
            jDialog.setLocationRelativeTo(null);
            //不关闭无法操作下面
            jDialog.setModal(true);

            JLabel show=new JLabel(Content);
            show.setBounds(0,0,250,100);
            jDialog.getContentPane().add(show);

            jDialog.setVisible(true);
        }
    }


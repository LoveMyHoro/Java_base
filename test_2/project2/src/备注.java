/*
写在前面
（1）相对路径是项目名之后的路径（不包括项目名）
 */



/*
1.窗口制作
（1）利用子类继承JFrame构造界面
（2）用到的方法
        //设置窗口大小
        this.setSize(600,700);
        //设置窗口名
        this.setTitle("赫萝的拼图小游戏");
        //设置窗口处于上层
        this.setAlwaysOnTop(true);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置叉掉窗口后程序结束运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //让窗口保持可视化
        this.setVisible(true);
        //取消默认的居中放置，只有取消了才会按照xy轴的形式添加组件
        //因为放置图片的界面是一个自动创建好的容器
        this.setLayout(null);
2.菜单制作
（1）JMenuBar:整个菜单
    JMenu:相关选项（注意：JMenu里面可以添加其他JMenu）
    JMenuItem:条目
    利用.add把JMenuItem放到JMenu里，把JMenu放到JMenuBar里，再利用.setJMenuBar把JMenuBar放到JFrame中

 3.导入图片
 （1）创建ImageIcon的对象
 （2）创建JLabel的对象（管理容器）
 （3）创建一个打乱的序列数组，用于打乱图片
 （4）控制图片位置JLabel.setBounds(x,y,width,height)
 （5）将管理容器添加到界面

 4.事件
（1）事件源：按钮，图片，窗体...
按钮：JButton,设置位置：.setBounds()
（2）事件：如鼠标单击，鼠标划入...
（3）绑定监听：当事件源上发生了某个事情，则执行某段代码。包含以下几种监听方式
事件源.addKeyListener(实现类对象):添加键盘监听
事件源.addMouseListener(实现类对象):添加鼠标监听
事件源.addActionListener(实现类对象):添加动作监听
之后执行实现类

5.美化界面
（1）小细节：先加载的图片放在上面面，后加载的图片放在下面

6.移动图片
（1）清空本容器所有图片：this.getContentPane().removeAll();
（2）更新界面：this.getContentPane().repaint();
用于界面更新
















 */

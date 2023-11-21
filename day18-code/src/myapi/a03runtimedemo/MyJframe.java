package myapi.a03runtimedemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJframe extends JFrame implements ActionListener {
    //创建主界面
    //JFrame jFrame = new JFrame();

    JButton yesBut = new JButton("帅爆了！");
    JButton midBut = new JButton("一般般！");
    JButton notBut = new JButton("不帅，很普通！");
    JButton dadBut = new JButton("放我一马");


    boolean flag = false;

    public MyJframe(){
        //初始化界面
        initJFrame();

        initView();

        //显示
        this.setVisible(true);

    }

    public void initView()  {

        this.getContentPane().removeAll();

        if (flag){
            //展示按钮
            dadBut.setBounds(50,20,100,30);
            dadBut.addActionListener(this);
            this.getContentPane().add(dadBut);
        }

        JLabel text = new JLabel("你觉得自己帅吗");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(130,150,300,50);

        yesBut.setBounds(200,220,100,30);
        midBut.setBounds(200,290,100,30);
        notBut.setBounds(170,370,180,30);

        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(notBut);

        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        notBut.addActionListener(this);

        this.getContentPane().repaint();
    }

    private void initJFrame() {
        //设置宽高
        this.setSize(500,600);
        //设置标题
        this.setTitle("恶搞好基友");
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //取消内部默认布局
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == yesBut){
            System.out.println("该玩家点击了帅爆了");

            showDialog("你寄了，让我放你一马");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 600");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            flag = true;
            initView();
        }else if (obj == midBut){
            System.out.println("该玩家点击了一般般");

            showDialog("你寄了，让我放你一马");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3000");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            flag = true;
            initView();

        }else if (obj == notBut){
            System.out.println("该玩家点击了不帅，很普通");

            showDialog("你寄了，让我放你一马");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 6000");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            flag = true;
            initView();

        }else if (obj == dadBut){
            System.out.println("该玩家求饶");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    //弹框
    public void showDialog(String content){
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(150,200);

        //让弹框置顶
        jDialog.setAlwaysOnTop(true);

        //让弹框居中
        jDialog.setLocationRelativeTo(null);

        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel text = new JLabel(content);
        text.setBounds(0,0,200,150);
        jDialog.getContentPane().add(text);


        //让弹框显示出来
        jDialog.setVisible(true);
    }
}

package com.valicode.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/valicode")
public class ValicodeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建一张图片
        //单位px
        BufferedImage bufferedImage = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);
        //创建画板
        Graphics2D graphics2D = bufferedImage.createGraphics();
        //设置画笔
        graphics2D.setColor(Color.WHITE);
        //开始填充
        graphics2D.fillRect(0, 0, 200, 100);
        //绘制图像
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            list.add(random.nextInt(10));
        }


        Font font = new Font("宋体",Font.BOLD|Font.ITALIC,30);
        Color [] colors=new Color[]{Color.BLACK,Color.BLUE,Color.GREEN,Color.PINK,Color.CYAN};
        for (int i = 0; i < list.size(); i++) {
            //颜色随机
            graphics2D.setColor(colors[random.nextInt(colors.length)]);
            //设置画笔样式
            graphics2D.setFont(font);
            //验证码上下浮动10px
            graphics2D.drawString("" + list.get(i), i * 40, 50+(random.nextInt(21)-10));
        }
        //生成数据流
        ServletOutputStream outputStream = resp.getOutputStream();
        //转发到前台
        ImageIO.write(bufferedImage, "jpg", outputStream);
    }
}

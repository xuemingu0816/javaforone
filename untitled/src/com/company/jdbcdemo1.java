package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

import javax.xml.soap.SOAPPart;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcdemo1 {
    public static void main(String[] args) throws Exception {
         //        1、导入驱动jar包, 建立libs文件夹， 右键 add as library

         //        2、 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
         //        3、获取数据库连接对象
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","root");
         //        4、定义sql
        String sql="update account set balance=1000 where id=1";
         //        5、获取数据库连接对象statement
        Statement stmt=conn.createStatement();
         //        6、执行sql
        int i=stmt.executeUpdate(sql);
         //        7、处理结果
        if (i==1){
            System.out.println("更新成功");
        }
        else{
            System.out.println("更新失败");
        }
         //        8、释放资源
        conn.close();
        stmt.close();
     }
}

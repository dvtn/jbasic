package cn.dvtn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用基本输入输出流拷贝图片
 * 数据源：/data/cat.jpg --读取数据 --FileInputStream
 *
 * 目的地：/data/猫.jpg  --写出数据 --FileOutputStream
 *
 *
 */

public class CopyImageWithFileInputStreamAndFileOutputStream {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("./data/cat.jpg");
        //封装目的的
        FileOutputStream fos = new FileOutputStream("./data/猫.jpg");

        //复制数据
        int b = 0;
        while((b=fis.read())!=-1){
            fos.write(b);
        }

        //释放资源
        fos.close();
        fis.close();


    }
}

package cn.dvtn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用基本字节输入输出流复制文本文件
 *
 * 数据源：从哪里来
 * a.txt           --读取数据      --FileInputStream
 *
 * 目的地：到哪时去
 * b.txt           --写数据       --FileOutputStream
 *
 *
 * 注意：读取文件时文件一定要存在
 */

public class CopyFileWithFileInputStreamAndFileOutputStream {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("./data/a.txt");
        FileOutputStream fos = new FileOutputStream("./data/b.txt");

        int b = 0;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}

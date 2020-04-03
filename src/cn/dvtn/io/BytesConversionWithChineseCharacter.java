package cn.dvtn.io;

import java.util.Arrays;

/**
 * 计算机是如何识别什么时候该把两个字字转换为一个中文的呢？
 * 在计算机中，中文的存储分两个字节：
 *      第一个字节肯定是负数。
 *      第二个字节常见的是负数，可能有正数。但是在拼接时只要第一个字节是负数就拼接。
 */

public class BytesConversionWithChineseCharacter {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        byte[] bytes = s1.getBytes();
        //[97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122]
        System.out.println(Arrays.toString(bytes));

        String s2="全国统一抗击新型冠状病毒";
        byte[] chBytes = s2.getBytes();
        //[-27, -123, -88, -27, -101, -67, -25, -69, -97, -28, -72, -128, -26, -118, -105, -27, -121, -69, -26, -106, -80, -27, -98, -117, -27, -122, -96, -25, -118, -74, -25, -105, -123, -26, -81, -110]
        System.out.println(Arrays.toString(chBytes));
    }
}

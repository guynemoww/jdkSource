package common.util.jwt;

import cn.hutool.crypto.digest.MD5;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package common.util.jwt
 * @date 2019/4/29 9:58
 * @Description:
 */
public class Md5UtilTest {

    public static void main(String[] args) {
        System.out.println(getMd5String("teamsun_wangwei"));


    }

    public static String getMd5String(String str){
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
//            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            //一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
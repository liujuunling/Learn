package utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IpUtil {



    public static void main(String [] args){
//        String ip = IpUtils.getHostIp();
//        System.out.println("电脑的IP ==== "+ ip);
//        System.out.println(IpUtils.getHostName());
//        System.out.println("操作系统的名称 = "+System.getProperty("os.name"));
//        System.out.println("操作系统的架构 = "+System.getProperty("os.arch"));
//        System.out.println("操作系统的版本 = "+System.getProperty("os.version"));
        System.out.println(initDateByDay().toString());
    }



    private static String getMACAddress() throws Exception {
        InetAddress ia = InetAddress.getLocalHost(); // 获得网络接口对象（即网卡），并得到mac地址，mac地址存在于一个byte数组中。
        byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress(); // 下面代码是把mac地址拼装成String
        StringBuffer sb = new StringBuffer(); for (int i = 0; i < mac.length; i++) { if (i != 0) { sb.append("-"); } // mac[i] & 0xFF 是为了把byte转化为正整数
            String s = Integer.toHexString(mac[i] & 0xFF); sb.append(s.length() == 1 ? 0 + s : s); } // 把字符串所有小写字母改为大写成为正规的mac地址并返回
        return sb.toString().toUpperCase().replaceAll("-", ""); }
    /**
     * 获得当天零时零分零秒
     * @return
     */
    public static String initDateByDay(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        SimpleDateFormat temp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return temp.format(calendar.getTime());
    }











}

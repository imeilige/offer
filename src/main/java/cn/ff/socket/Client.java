package cn.ff.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author zhangguoli.cn
 * @date 2019/3/12
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("127.0.0.1",1204);
        OutputStream output = client.getOutputStream();
        InputStream input = client.getInputStream();
        output.write(new String("hello socket").getBytes());
        int ch = 0;
        byte[] buffer = new byte[1024];
        ch = input.read(buffer);
        String content = new String(buffer,0,ch);
        System.out.println(content);
        input.close();
        output.close();
        client.close();
    }
}

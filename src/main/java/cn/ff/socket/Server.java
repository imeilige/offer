package cn.ff.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhangguoli.cn
 * @date 2019/3/12
 */
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(1204);
        while (true){
            Socket socket =  server.accept();
            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();
            int ch = 0;
            byte[] buff = new byte[1024];
            ch = input.read(buff);
            String content = new String(buff,0,ch);
            System.out.println(content);

            output.write((int) System.currentTimeMillis());
//            input.close();
//            output.close();
//            socket.close();
        }
    }
}

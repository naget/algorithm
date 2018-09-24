package practice.praseHttp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * created by tianfeng on 2018/6/14
 */
public class PraseHttp {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket =null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        Request request =null;
        try {
            serverSocket = new ServerSocket(8080,1,InetAddress.getByName("127.0.0.1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true){
            try {
                socket = serverSocket.accept();
                inputStream = socket.getInputStream();
                request = new Request(inputStream);
                request.parse();
                outputStream = socket.getOutputStream();
                String errorMessage = "HTTP/1.1 404 File Not Found\r\n" +
                        "Content-Type: text/html\r\n" +
                        "Content-Length: 23\r\n" +
                        "\r\n" +
                        "<h1>File Not Found</h1>";
                outputStream.write(errorMessage.getBytes());
//                outputStream.write("ddd".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

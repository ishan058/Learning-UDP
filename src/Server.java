import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String message = "Hello world";
        InetAddress address = InetAddress.getByName("localhost"); //used to address
        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address, 12345);

        //sending message
        socket.send(packet);
        socket.close();
    }
}
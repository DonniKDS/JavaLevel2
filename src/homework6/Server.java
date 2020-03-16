package homework6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

    private final String NAME = "Client: ";
    private final String END_COMMAND = "/end";
    private Socket socket;
    private BufferedReader reader;
    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {
        new Server();
    }

    public Server(){
        runServer();
    }

    public void runServer(){
        socket = null;
        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket(9999);
            System.out.println("Сервер запущен, ожидаем подключения клиента...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            reader = new BufferedReader(new InputStreamReader(System.in));
            serverMessage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void serverMessage() {
        new Thread(() -> {
            try {
                String message = "";
                out = new DataOutputStream(socket.getOutputStream());
                while (true) {
                    String m = reader.readLine();
                    if (m.equalsIgnoreCase(END_COMMAND)) {
                        break;
                    }
                    message = NAME + m;
                    try {
                        out.writeUTF(message);
                    }catch (SocketException e){
                        break;
                    }
                }
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                closeReader();
            }
        }).start();

        new Thread(() -> {
            try {
                in = new DataInputStream(socket.getInputStream());
                while (true){
                    String message = in.readUTF();
                    System.out.println(message);
                }
            } catch (IOException e) {
                System.out.println("Connection has been closed!");
            }
        }).start();
    }

    public void closeReader() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package homework6;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class Client {
    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 9999;
    private final String NAME = "Client: ";
    private final String END_COMMAND = "/end";
    private Socket socket;
    private BufferedReader reader;
    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {
        new Client();
    }

    public Client(){
        runClient();
    }

    public void runClient(){
        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT);
            reader = new BufferedReader(new InputStreamReader(System.in));
            clientMessage();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void clientMessage() {
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


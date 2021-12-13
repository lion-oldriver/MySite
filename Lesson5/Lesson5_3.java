import java.io.*;
import java.net.*;

public class Lesson5_3{
  public static void main(String[] args) throws IOException{
    URL url = new URL("http://dokojava.jp/favicon.ico");
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream("dj.ico");
    int i = is.read();
    while(i != -1){
      os.write((byte)i);
      i = is.read();
    }
    os.flush();
    os.close();
    is.close();

    Socket sock = new Socket("smtp.example.com", 60025);
    OutputStream out = sock.getOutputStream();
    out.write("HELO example.com\r\n".getBytes());
    out.write("MAIL FROM asaka@example.com\r\n".getBytes());
    out.write("RCPT TO: minato@exsample.com\r\n".getBytes());
    out.write("DATA\r\n".getBytes());
    out.write("FROM: asaka@example.com\r\n".getBytes());
    out.write("Subject: Please send me your RPG".getBytes());
    out.write("Hello minato. I would like to play your RPG".getBytes());
    out.write("Could you please send it to me ?".getBytes());
    out.write(".".getBytes());
    out.write("QUIT".getBytes());
    out.flush();
    sock.close();
  }
}
import java.net*;
import java.io.*;

public class Server{

	public static void main(String args[]) throws IOException
	{
		ServerSockt ss = new ServerSockt(499);
		Socket s  = ss.acept();
		System.out.println("cliente conectado!");
	}
}




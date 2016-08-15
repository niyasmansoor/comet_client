package websocket_client;

import java.io.IOException;
import websocket4j.client.WebSocket;

public class WebSocketMessageClient {

	public static void main(String[] args) throws IOException {

		if (args.length > 1) {
			System.out.println("Invalid request format ! Only single parameter or no parameters accepted");
			return;
		}

		final String HOST = "localhost";
		final int PORT = 9000;
		final int TIMEOUT_INTERVAL = 30000;

		String input = "guest";
		if (args.length == 1)
			input = args[0];

		WebSocket ws = new WebSocket(HOST, PORT, "", TIMEOUT_INTERVAL);

		while (true) {
			ws.sendMessage(input);
			String message = ws.getMessage();
			System.out.println("Message from Server > " + message);
			if (input.equals("exit"))
				break;
		}
		ws.close();
	}
}

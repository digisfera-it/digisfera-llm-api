package it.digisfera.llm.api;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

public interface Connection {

	String CONNECTION_TIMEOUT = "jllmc.connectionTimeout";
	String PASSWORD = "jllmc.password";
	String SOCKET_TIMEOUT = "jllmc.socketTimeout";
	String USERNAME = "jllmc.username";

	Chat chat(String model, List<Message> history, Consumer<String> contentConsumer, Consumer<Message> messageConsumer) throws IOException;

}

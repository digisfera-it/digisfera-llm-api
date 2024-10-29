package it.digisfera.llm.api;

import java.io.IOException;
import java.util.List;

public interface Chat {

	List<Message> getMessages();

	String getModel();

	void sendMessage(String message) throws IOException;

}

package it.digisfera.llm.api;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public interface Chat extends Serializable {

	List<Message> getMessages();

	String getModel();

	void sendMessage(String message) throws IOException;

}

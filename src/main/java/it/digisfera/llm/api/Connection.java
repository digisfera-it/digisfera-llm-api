package it.digisfera.llm.api;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

public interface Connection {

	Chat chat(String model, List<Message> history, Consumer<String> contentConsumer, Consumer<Message> messageConsumer) throws IOException;

}

package it.digisfera.llm.api;

import java.io.IOException;

public interface Driver {

	boolean acceptsURL(String url);

	Connection connect(String url, String username, String password) throws IOException;

}

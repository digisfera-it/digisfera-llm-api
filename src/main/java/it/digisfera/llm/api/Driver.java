package it.digisfera.llm.api;

import java.io.IOException;
import java.util.Properties;

public interface Driver {
	
	String URL_PREFIX = "jllmc:";

	boolean acceptsURL(String url);

	Connection connect(String url, Properties properties) throws IOException;

}

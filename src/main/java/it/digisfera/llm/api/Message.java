package it.digisfera.llm.api;

public class Message {

	private String content;

	private final Role role;

	public Message(Role role, String content) {
		super();
		this.role = role;
		this.content = content;
	}

	public String getContent() {
		return content;
	}
	public Role getRole() {
		return role;
	}

	public void setContent(String content) {
		this.content = content;
	}

}

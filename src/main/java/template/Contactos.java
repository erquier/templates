package template;

public class Contactos {
	private String Name;
	private String Email;
	private String Message;
	public String getName() {
		return Name;
		
	}
	public Contactos(String name, String email, String message) {
		super();
		Name = name;
		Email = email;
		Message = message;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	

}

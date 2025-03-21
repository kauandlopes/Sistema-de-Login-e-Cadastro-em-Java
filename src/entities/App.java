package entities;

public class App {
	
private String login;
private String senha;

public App(String login, String senha) {
	this.login = login;
	this.senha = senha;
}

public App() {
}

public void setLogin(String login) {
	this.login = login;
}

public String getLogin() {
	return login;
}

public boolean validarLogin(String login, String senha) {
	return this.login.equals(login) && this.senha.equals(senha);
}





}

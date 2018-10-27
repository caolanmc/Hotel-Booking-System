package Managers;


//import view and model.
public class LoginManager{
	private LoginView view;
	private LoginModel model;

	public LoginManager(LoginView view)
	{
		this.view = view;
		model = new LoginModel();
	}

	public void checkCredentials(String username,String password){
		model.setUsername(username);
		model.gerCredentials();
		if(password.equals(model.getPassword())){
			//do stuff
		}else{
			view.setErrorMessage("Login Failed! Try Again.");
		}
	}
}

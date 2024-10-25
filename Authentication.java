package bank;

public class Authentication {

  private String username;
  private String password;

  // Method to set the username and password
  public void signUp(String username, String password) {
      this.username = username;
      this.password = password;
      System.out.println("Sign-up successful. Please sign in to access your bank.");
  }

  // Method to validate user credentials during sign-in
  public boolean signIn(String inputUsername, String inputPassword) {
      return username.equals(inputUsername) && password.equals(inputPassword);
  }
}

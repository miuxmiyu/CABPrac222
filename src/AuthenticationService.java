public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // Constructor to initialize the users list with the default user
    public AuthenticationService() {
        users = new ArrayList<>();
        // Add a default user, for example: username "defaultUser", password "password"
        users.add(new User("defaultUser", "password"));
    }

    // Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return null; // Username is taken
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser; // User successfully added
    }

    // Implement the logIn method to return the user if the username and password match, and null otherwise
    public User logIn(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // Username and password match
            }
        }
        return null; // Username or password is incorrect
    }
}

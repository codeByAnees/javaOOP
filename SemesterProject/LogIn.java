package JavaOOP.SemesterProject;

public abstract class LogIn {
    protected String id;
    protected String password;
    public abstract boolean validation(String id, String password, String type);
}

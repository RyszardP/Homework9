import java.util.StringJoiner;

public class User {
    String userName;
    String userLastName;
    private int userAge;
    private int userHeight;

    public String getUserName(){
        return userName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userLastName + '\'' +
                ", userAge=" + userAge +
                ", userVeight=" + userHeight +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(int userHeight) {
        this.userHeight = userHeight;
    }

    public User(String userName, String userLastName, int userAge, int userHeight) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.userAge = userAge;
        this.userHeight = userHeight;
    }


}

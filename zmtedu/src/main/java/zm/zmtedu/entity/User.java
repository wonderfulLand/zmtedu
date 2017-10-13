package zm.zmtedu.entity;

public class User {

    private String userName;
    private String gender;
    private String pwd;
    private int phoneNum;
    private String homeAddress;

    public User(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getPhoneNum() != user.getPhoneNum()) return false;
        if (getUserName() != null ? !getUserName().equals(user.getUserName()) : user.getUserName() != null)
            return false;
        if (getGender() != null ? !getGender().equals(user.getGender()) : user.getGender() != null) return false;
        if (getPwd() != null ? !getPwd().equals(user.getPwd()) : user.getPwd() != null) return false;
        return getHomeAddress() != null ? getHomeAddress().equals(user.getHomeAddress()) : user.getHomeAddress() == null;
    }

    @Override
    public int hashCode() {
        int result = getUserName() != null ? getUserName().hashCode() : 0;
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + (getPwd() != null ? getPwd().hashCode() : 0);
        result = 31 * result + getPhoneNum();
        result = 31 * result + (getHomeAddress() != null ? getHomeAddress().hashCode() : 0);
        return result;
    }
}

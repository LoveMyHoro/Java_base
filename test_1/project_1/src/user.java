public class user {
    private String UserName;
    private String Password;
    private String CardId;
    private String PhoneNumber;

    public user() {
    }

    public user(String userName, String password, String cardId, String phoneNumber) {
        UserName = userName;
        Password = password;
        CardId = cardId;
        PhoneNumber = phoneNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCardId() {
        return CardId;
    }

    public void setCardId(String cardId) {
        CardId = cardId;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}

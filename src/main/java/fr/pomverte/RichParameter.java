package fr.pomverte;

public class RichParameter {
    private String user;
    private String password;
    private String adress;
    private String language;

    public RichParameter(String user, String password, String adress, String language) {
        super();
        this.user = user;
        this.password = password;
        this.adress = adress;
        this.language = language;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}

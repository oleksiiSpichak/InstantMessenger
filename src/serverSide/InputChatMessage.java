package serverSide;

/**
 * Created by Zver on 05.03.2018.
 */
public class InputChatMessage {


    private String mail, login, password, chatMessage, messageAll;
    private int idCat,idUsers;

    public InputChatMessage (String mail, String login, String password) {
        this.mail = mail;
        this.login = login;
        this.password = password;
    }

    public InputChatMessage(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public InputChatMessage (int idUsers,String chatMessage, String messageAll) {
        this.chatMessage = chatMessage;
        this.idUsers = idUsers;
        this.messageAll = messageAll;
    }

    public String getMessageAll() {
        return messageAll;
    }

    public void setMessageAll(String messageAll) {
        this.messageAll = messageAll;
    }

    public String getMail() {
        return mail;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getChatMessage() {
        return chatMessage;
    }

    public int getIdCat() {
        return idCat;
    }

    public int getIdUsers() {
        return idUsers;
    }
}



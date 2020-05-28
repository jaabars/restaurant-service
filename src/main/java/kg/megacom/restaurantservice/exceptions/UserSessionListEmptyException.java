package kg.megacom.restaurantservice.exceptions;

public class UserSessionListEmptyException extends RuntimeException {
    public UserSessionListEmptyException(String  message){
        super(message);
    }
}

package Domain.Model.User.Exception;

public class EmailNotValidException extends Exception
{
    EmailNotValidException(String email)
    {
        super("E-mail address is not valid: " + email);
    }
}

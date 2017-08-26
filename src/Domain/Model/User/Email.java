package Domain.Model.User;

import Domain.Common.ValueObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email extends ValueObject
{
    private String email;

    Email(String email) throws Exception
    {
        if (!isValidEmail(email)) {
            throw new Exception("Not valid e-mail address.");
        }

        this.email = email;
    }

    public String email()
    {
        return email;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

    private static boolean isValidEmail(String email)
    {
        String  EMAIL_REGIX = "^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern     = Pattern.compile(EMAIL_REGIX);
        Matcher matcher     = pattern.matcher(email);

        return (!email.isEmpty()) && (email != null) && (matcher.matches());
    }
}

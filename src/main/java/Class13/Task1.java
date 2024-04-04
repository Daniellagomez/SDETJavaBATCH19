package Class13;
/*
create a method createEmail(). based on values of Users firstName,
lastName and email type, your method should return complete email address
example: createEmail(John,Snow,gmail) johnsnow@gmail.com
 */
public class Task1 {
    String createEmail(String firstName,String lastName,String emailType){

        String email=firstName+lastName+"@"+emailType+".com";
        return email;
    }

}

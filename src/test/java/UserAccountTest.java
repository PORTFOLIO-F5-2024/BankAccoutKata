import org.junit.jupiter.api.DisplayName;
import org.BAK.UserAccount;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserAccountTest {
    @Test
    @DisplayName("acces acout user ok")
    void test_whenUserAndPassIsOk_thenReturnId(){
        //  GIVEN DADO
        UserAccount user1 = new UserAccount(1,"cervezaConDonuts@gmail.com", "contraseña123");
        UserAccount user2 = new UserAccount(2,"cervezaConDonuts@gmail.com", "contraseña123");
        UserAccount user3 = new UserAccount(3,"cervezaConDonuts@gmail.com", "contraseña123");
        UserAccount user4 = new UserAccount(4,"cervezaConDonuts@gmail.com", "contraseña123");
        UserAccount idUserTrue = new UserAccount(5,"corre.platano_wiggum@gmail.com", "Ralph1Gato0");
        UserAccount user6 = new UserAccount(6,"cervezaConDonuts@gmail.com", "contraseña123");
        UserAccount user7 = new UserAccount(7,"cervezaConDonuts@gmail.com", "contraseña123");
        UserAccount user8 = new UserAccount(8,"cervezaConDonuts@gmail.com", "contraseña123");
        UserAccount user9 = new UserAccount(9,"cervezaConDonuts@gmail.com", "contraseña123");
        UserAccount user10 = new UserAccount(10,"cervezaConDonuts@gmail.com", "contraseña123");
        ArrayList<UserAccount> arrayOfUsersLog = new ArrayList<>(Arrays.asList(
                user1,user2, user3, user4, idUserTrue, user6, user7, user8, user9, user10
        ));
        //  WHEN CUANDO
        UserAccount newUserBase = new UserAccount(-1,"", "");
        UserAccount idUserInput = newUserBase.inputUserAccount(arrayOfUsersLog);
        //  THEN PUES
        assertEquals(5,idUserInput);



    }
}

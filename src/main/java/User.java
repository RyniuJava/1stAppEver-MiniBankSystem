import lombok.Data;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;
@Value
public class User extends Users{

    public User(String name, String surname, LocalDate dayOfBirth, Long id, String login, String password, BigDecimal balance, String bankNameAccess) {
        super(name, surname, dayOfBirth, id, login, password, balance, bankNameAccess);
    }
}

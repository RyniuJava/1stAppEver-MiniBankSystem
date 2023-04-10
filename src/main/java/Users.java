import lombok.Data;
import lombok.extern.java.Log;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
public class Users {

    private final String name;
    private final String surname;
    private final LocalDate dayOfBirth;
    private final Long id;
    private final String login;
    private final String password;
    private final BigDecimal balance;
    private final String bankNameAccess;




}

import java.math.BigDecimal;

public class consumerBank extends Banks{
    public consumerBank(String name, Integer postCode, String city, String street, String description, BigDecimal balance) {
        super(name, postCode, city, street, description, balance);
    }
}

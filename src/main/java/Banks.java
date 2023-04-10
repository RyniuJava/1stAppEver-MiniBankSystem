import javax.security.auth.callback.Callback;
import java.math.BigDecimal;

public class Banks implements Callback {

    private final String name;
    private final Integer postCode;
    private final String city;
    private final String street;
    private final String description;
    private final BigDecimal balance;

    public Banks(String name, Integer postCode, String city, String street, String description, BigDecimal balance) {
        this.name = name;
        this.postCode = postCode;
        this.city = city;
        this.street = street;
        this.description = description;
        this.balance = balance;
    }


    public String getName() {
        return this.name;
    }

    public Integer getPostCode() {
        return this.postCode;
    }

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Banks)) return false;
        final Banks other = (Banks) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$postCode = this.getPostCode();
        final Object other$postCode = other.getPostCode();
        if (this$postCode == null ? other$postCode != null : !this$postCode.equals(other$postCode)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$street = this.getStreet();
        final Object other$street = other.getStreet();
        if (this$street == null ? other$street != null : !this$street.equals(other$street)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$balance = this.getBalance();
        final Object other$balance = other.getBalance();
        if (this$balance == null ? other$balance != null : !this$balance.equals(other$balance)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Banks;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $postCode = this.getPostCode();
        result = result * PRIME + ($postCode == null ? 43 : $postCode.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $street = this.getStreet();
        result = result * PRIME + ($street == null ? 43 : $street.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $balance = this.getBalance();
        result = result * PRIME + ($balance == null ? 43 : $balance.hashCode());
        return result;
    }

    public String toString() {
        return "" +
                "Welcome in: "  + this.getName().toUpperCase()
                + " our place of bisnes is in: "
                + this.getCity() + "\n"
                + this.getDescription();
    }
}

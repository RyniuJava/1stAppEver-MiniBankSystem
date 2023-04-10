import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banks mBank = new consumerBank(
                "mBank",
                66440,
                "Gorzów Wielkopolski",
                "Wawrzyniaka",
                "This is the best bank ever mBank welcome!",
                BigDecimal.valueOf(5000));
        Banks aliorBank = new consumerBank(
                "Alior Bank",
                66400,
                "Rokietnica",
                "Madrycka",
                "This is the 2nd best bank Alior Bank is welcoming you!",
                BigDecimal.valueOf(4000));

        Banks santanderBank = new consumerBank(
                "Santander Bank",
                33120,
                "Warszawa",
                "Wojska Polskiego",
                "This is the 3th best bank Santander Bank Hello!",
                BigDecimal.valueOf(2000));

        Users user1 = new User(
                "Michał",
                "Rynkiewicz",
                LocalDate.of(1987, 5, 11),
                1L,
                "mrynkiewicz",
                "1234",
                BigDecimal.valueOf(3500),
                "mBank");
        Users user2 = new User(
                "Adrian",
                "Wisniewiski",
                LocalDate.of(1986, 6, 12),
                2L,
                "awisniewski",
                "4321",
                BigDecimal.valueOf(7500),
                "Alior Bank");
        Users user3 = new User(
                "Jan",
                "Nowak",
                LocalDate.of(1974, 11, 29),
                3L,
                "jnowak",
                "5678",
                BigDecimal.valueOf(7500),
                "Santander Bank");

        List<Banks> banks = new ArrayList<>();
        List<Users> users = new ArrayList<>();
        banks.add(mBank);
        banks.add(aliorBank);
        banks.add(santanderBank);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        greetings(banks);
        String nameOfBank = enteringANameOfBankByUser(banks);
        inputLoginAndPassword(users, nameOfBank);
//        transferMoney();


    }

//    private static void transferMoney(User user) {
//        System.out.println("You balance is: ");
//        BigDecimal balance = user.getBalance();
//        System.out.println(balance);
//    }

    public static void greetings(List<Banks> banks) {
        System.out.println("Good morning Sir!");
        System.out.println("We are cooperate with:");
        showAvailableBanksNames(banks);
        System.out.println("To witch Bank you wont to log in: ");
    }

    public static void showAvailableBanksNames(List<Banks> banks) {
        for (Banks bank : banks) {
            System.out.println(bank.getName());
        }
    }

    private static String enteringANameOfBankByUser(List<Banks> banks) {
        String input = inputFromUser();
        showDescriptionAboutBank(banks, input);
        return input;
    }

    public static void showDescriptionAboutBank(List<Banks> banks, String nameOfBank) {
        for (Banks bank : banks) {
            if (bank.getName().equalsIgnoreCase(nameOfBank)) {
                System.out.println("Welcome in: " + bank.getName().toUpperCase()
                        + " our place of business is in: "
                        + bank.getCity() + "\n"
                        + bank.getDescription());
                return;
            }
        }
        validationInCaseOfWrongTypingNameBankByUser(banks, nameOfBank);
    }

    private static void validationInCaseOfWrongTypingNameBankByUser(List<Banks> banks, String nameOfBank) {
        System.out.println("I do not recognize " + nameOfBank + " bank are you sure u type in right one?!");
        System.out.println("You can select one of this banks:");
        showAvailableBanksNames(banks);
        System.out.println("To witch Bank you wont to log in: ");
        enteringANameOfBankByUser(banks);
    }


    private static void inputLoginAndPassword(List<Users> users, String bankAccess) {
        System.out.println("Pleas enter your Login | BANK currently u choose: " + bankAccess);
        String input1 = inputFromUser();
        System.out.println("Pleas enter your Password: ");
        String input2 = inputFromUser();
        checkingParametersOfLogging(users, input1, input2, bankAccess);
    }


    public static void checkingParametersOfLogging(List<Users> users, String login, String password, String bankAccess) {
        for (Users user : users) {
            if (user.getLogin().equalsIgnoreCase(login)
                    && user.getPassword().equals(password)
                    && user.getBankNameAccess().equalsIgnoreCase(bankAccess)) {
                System.out.println("Welcome : " + user.getName().toUpperCase()
                        + " your current balance is : "
                        + user.getBalance() + "zł");
//                    transferMoney((User) user);
                return;
            }
        }
        validationInCaseOfWrongTypingLoginOrPasswordByUser(users, bankAccess);
    }

    private static void validationInCaseOfWrongTypingLoginOrPasswordByUser(List<Users> users, String bankAccess) {
        System.out.println("Wrong Login or Password");
        inputLoginAndPassword(users, bankAccess);
    }

    public static String inputFromUser() {
        String input;
        Scanner myObj = new Scanner(System.in);
        return input = myObj.nextLine();
    }
}

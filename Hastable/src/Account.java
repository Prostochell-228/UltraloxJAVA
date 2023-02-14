import java.util.Date;

public class Account {
    public  String email;
    public int accesLevel;
    public Date registrationDate;

    public Account(String email, int accesLevel, Date registrationDate) {
        this.email = email;
        this.accesLevel = accesLevel;
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (accesLevel != account.accesLevel) return false;
        if (!email.equals(account.email)) return false;
        return registrationDate.equals(account.registrationDate);
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + accesLevel;
        result = 31 * result + registrationDate.hashCode();
        return result;
    }
}

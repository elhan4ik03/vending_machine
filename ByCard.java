public class ByCard {
    double balance;

    public ByCard(double balance, String password) {
        this.balance = balance;
        this.password = password;
    }

    public static boolean byCard(int price, String password) {
        final String cardPassword = "elhan4ik";
        if (password.equals(cardPassword)) {
            System.out.println("Оплата картой успешно проведена. Списано: " + price + " руб.");
            balance -= price;
            return true;
        }  System.out.println("Неверный пароль карты. Попробуйте снова.");
        return false;
        }
    }

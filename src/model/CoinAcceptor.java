package model;

public class CoinAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean byCard(int price, String password) {
        final String cardPassword = "elhan4ik";
        if (!password.equals(cardPassword)) {
            System.out.println("Неверный пароль карты. Попробуйте снова.");
            return false;
        }
        System.out.println("Оплата картой успешно проведена. Списано: " + price + " руб.");
        return true;
    }
}

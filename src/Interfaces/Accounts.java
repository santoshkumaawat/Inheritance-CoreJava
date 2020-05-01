package Interfaces;

public interface Accounts {

    void openAccounts();

    void closeAccounts();

    void deposit();

    void withdraw();

    void interest();

    default void info() {
        System.out.println("Hello");
    }

    default void display() {
        System.out.println("Welcome");
    }
}

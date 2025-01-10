package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(new ThreadAccountTest01(), "Hestia");
        Thread t2 = new Thread(new ThreadAccountTest01(), "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(20);
            if (account.getBalance() < 0) {
                System.out.println("Fodeo");
            }
        }
    }

    private void withdrawal(int amount) { //synchronized: a partir do momento que entrar nesse metodo o sistema não devera adotar paralelismo
        System.out.println(getThreadName() + " ##### fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + " *** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar o dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta: " + account.getBalance());
            } else {
                System.out.println("Saldo insuficiente para" + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

}

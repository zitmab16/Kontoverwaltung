
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vizug
 */
public class AccountUser extends Thread {

    private Random rand = new Random();
    private Account konto;
    private String username;
    private KontoGUI gui;
    private boolean withordep;
    private int value;
    private int time;

    public AccountUser(Account konto, String username, KontoGUI gui) {
        this.konto = konto;
        this.username = username;
        this.gui = gui;
    }

    @Override
    public void run() {
        while (true) {
            withordep = rand.nextBoolean();
            value = rand.nextInt(50 - 10 + 1) + 10;
            time = rand.nextInt(1000 - 1 + 1) + 1;

            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {

            }

            if (withordep) {
                if (value > konto.getBalance()) {
                    continue;
                }
                konto.withdraw(value);
                gui.updateBalance(konto.getBalance());
                gui.updateTextArea(String.format("%s makes withdrawel: %d \n",username,value));
            } else {
                konto.deposit(value);
                gui.updateBalance(konto.getBalance());
                gui.updateTextArea(String.format("%s makes deposit: %d \n",username,value));
            }
        }

    }

    @Override
    public String toString() {
        return String.format("%s",username);
    }
    

}

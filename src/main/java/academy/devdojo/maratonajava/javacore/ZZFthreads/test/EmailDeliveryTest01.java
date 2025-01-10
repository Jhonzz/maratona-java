package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Members;
import academy.devdojo.maratonajava.javacore.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;
import java.lang.reflect.Member;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        Thread itachi = new Thread(new EmailDeliveryService(members), "Itachi");

        kakashi.start();
        itachi.start();

        while (true){
            String email = JOptionPane.showInputDialog("Entre com o seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }


}

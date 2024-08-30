package Model;

import View.SetUp_GUI;
import View.Splash_GUI;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash_DAO {

    public void run() {
        for (int i = 0; i < 101; i++) {
            try {
                sleep(60);

                View.Splash_GUI.progressBar.setValue(i);

                if (View.Splash_GUI.progressBar.getValue() == 10) {

                    View.Splash_GUI.message_lbl.setText("Fazendo a conexao com o banco de dados");
                    sleep(2000);

                } else if (View.Splash_GUI.progressBar.getValue() <= 30) {
                    View.Splash_GUI.message_lbl.setText("Carregando o sistema");
                    sleep(100);
                } else if (View.Splash_GUI.progressBar.getValue() <= 99) {
                    View.Splash_GUI.message_lbl.setText("Carregamento quase completo");

                } else {
                    View.Splash_GUI.message_lbl.setText("Carregamento completo. Seu programa sera iniciado.");

                    sleep(3000);

                    new SetUp_GUI().setVisible(true);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

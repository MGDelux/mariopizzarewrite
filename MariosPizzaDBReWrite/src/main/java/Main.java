import View.MainController;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
	//Starting MainController og vores MainMenu
        MainController mainmenu = new MainController();
        mainmenu.printMainMenu();
    }
}

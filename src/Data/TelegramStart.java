package Data;

import Bot.Bot;
import Bot.QuizBot;
import Game.TelegramBot;
import User.UserManager;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.util.HashMap;

public class TelegramStart {

    public static void main(String[] args) throws IOException {
        String link = "https://www.kinopoisk.ru/user/13956769/movies/list/type/363730/#list";
        HashMap<String, String> data = new MoviesGetter(link).getData();
         QuizBot quizBot = new QuizBot(data);
         UserManager userManager = UserManager.getInstance();
         Bot bot = new Bot(quizBot, userManager);

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new TelegramBot(bot));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

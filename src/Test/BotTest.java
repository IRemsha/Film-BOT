//package Test;
//import Bot.*;
//import User.*;
//import Data.MoviesGetter;
//import org.testng.annotations.Test;
//
//
//import java.io.IOException;
//import java.util.HashMap;
//
//import static org.testng.AssertJUnit.assertEquals;
//
//public class BotTest {
//    private HashMap<String, String> data = new MoviesGetter().getData();
//
//    public HashMap<Integer, Session> sessions = new HashMap<>();
//    public static Bot instance;
//
//    private QuizBot quizBot = new QuizBot(data);
//    private UserManager userManager = UserManager.getInstance();
//    private Bot bot = Bot.getInstance(quizBot, userManager);
//
//    public BotTest() throws IOException {
//    }
//
//    @Test
//    public void isCommandTestFalse() throws IOException {
//        assertEquals(false, bot.isCommand("command"));
//    }
//    @Test
//    public void isCommandTrue() {
//        assertEquals(true,bot.isCommand("/"));
//    }
//    @Test
//    public void isCommandTrueCommands() {
//        assertEquals(true,bot.isCommand("/play"));
//    }
//    @Test
//    public void isCommandFalseCommands() {
//        assertEquals(false,bot.isCommand("play/"));
//    }
//    @Test
//    public void getInstance() {
//        assertEquals(null,bot.getInstance(quizBot, userManager));
//    }
//
//    @Test
//    public void processCommandStart() throws IOException {
//        assertEquals(instruction, bot.processCommand("/play", "", 10 ));
//    }
//
//    @Test
//    public void processCommandLoginNoEmpty() {
//        assertEquals("No users with this login. Try again",bot.processCommandLogin("Player", new Session()));
//    }
//    @Test
//    public void processCommandLoginEmpty() {
//        assertEquals("Empty login",bot.processCommandLogin("", new Session()));
//    }  //+ещё один тест
//    @Test
//    public void processCommandAddFriendEmpty() {
//        assertEquals("Need login after command",bot.processCommandAddFriend("", new Session()));
//    } //+ещё три тест
//
//    @Test
//    public void J() {
//        assertEquals("Need login after command",bot.processCommandAddFriend("", new Session()));
//    }
//}
//
//
//   @Test
//     public void getStartMessage() {
//         assertEquals(botInstruction, bot.getStartMessage());
//     }
//
//     @Test
//     public void getNextMessage() {
//         assertTrue(data.containsKey(quizBot.getQuestionToOffer(elmo)));    }
//
//     @Test
//        public void processInputHelp() {
//         assertEquals(bot.processCommand("\\help", elmo), bot.processInput("","\\help", elmo));
//     }
//
//     @Test
//     public void processInputStop() {
//         assertEquals(bot.processCommand("\\stop", elmo), bot.processInput("", "\\stop", elmo));
//    }
//
//    @Test
//     public void processInputStart() {
//         assertEquals(bot.processCommand("\\start", elmo), bot.processInput("", "\\start", elmo));
//     }
//
//     @Test
//     public void processInputScore() {
//         assertEquals(bot.processCommand("\\score", elmo), bot.processInput("", "\\score", elmo));
//     }
//
//     @Test
//     public void processInputNoCommand() {
//         assertEquals(quizBot.analyzeUserAnswer("", "Elmo", elmo), bot.processInput("", "Elmo", elmo));
//     }
//
//   @Test
//     public void processInputNotFoundCommand() {
//         assertEquals("Incorrect command", bot.processInput("", "\\PAMAGITE", elmo));
//     }
//
//
//     @Test
//     public void processCommandStart() {
//         assertEquals(botInstruction, bot.processCommand("\\start", elmo));
//     }
//
//     @Test
//    public void processCommandHelp() {
//        assertEquals(botHelp, bot.processCommand("\\help", elmo));
//     }
//
//     @Test
//     public void processCommandScore() {
//         assertEquals(String.valueOf(elmo.score), bot.processCommand("\\score", elmo));
//     }
//
//     @Test
//     public void processCommandStop() {
//        assertEquals("", bot.processCommand("\\stop", elmo));
//     }
//
//     @Test
//     public void isCommand() {
//         assertTrue(bot.isCommand("\\"));
//     }
// }
//

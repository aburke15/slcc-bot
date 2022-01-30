import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingPongListener extends ListenerAdapter {
    // Bot Listener Class
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        try {
            if (event.getAuthor().isBot())
                return;

            String content = event.getMessage()
                    .getContentRaw();

            if (content.equalsIgnoreCase("!ping")) {
                event.getChannel()
                        .sendMessage("Pong!")
                        .queue();
            }
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);

            event.getChannel()
                    .sendMessage("Error: " + message)
                    .queue();
        }
    }
}

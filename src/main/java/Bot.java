import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Bot {
    // Bot Runner Class
    public static void main(String[] args) throws LoginException {
        try {
            String token = "your bot token";
            System.out.println("Token: " + token);
            String activity = "Bot, in SLCC's programming club.";

            JDABuilder builder = JDABuilder
                    .createDefault(token)
                    .setStatus(OnlineStatus.ONLINE)
                    .setActivity(Activity.playing(activity));

            builder.addEventListeners(new PingPongListener());
            builder.build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

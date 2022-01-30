import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Bot {
    // Bot Runner Class
    public static void main(String[] args) throws LoginException {
        try {
            String token = args[0];
            System.out.println("Token: " + token);

            JDABuilder builer = JDABuilder
                    .createDefault(token)
                    .setStatus(OnlineStatus.ONLINE)
                    .setActivity(Activity.playing("Bot in SLCC's programming club!"));

            builer.build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

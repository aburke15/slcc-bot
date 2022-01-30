# SLCC's Discord Bot


## Installation

You can clone this repo to your local machine. Then run the following commands.

<br></br>
In the root of the project run the following command to create the runnable jar.
```bash
gradle clean shadow
```
Then run this command.
```
java -jar build/libs/*.jar "your-discord-token"
```
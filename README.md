# SLCC's Discord Bot
## Installation
You can clone this repository to your local machine. Then run the following commands.
<br></br>
### IntelliJ IDEA install
In the root of the project run the following command to create the runnable jar.
```bash
gradle clean shadow
```
Then run this command.
```bash
java -jar build/libs/*.jar "your-discord-token"
```
<br></br>
### Eclipse IDE install
In the root of the project run the following command in the terminal.
```bash
gradle eclipse
```
<br></br>
### GUI Install IntelliJ
Build the shadow jar by double clicked shadowJar.
![shadow jar](../slcc-bot/images/shadow.png)
<br></br>
### GUI Eclipse Install
Create the Eclipse project file by double clicking eclipse under ide.
![eclipse build](../slcc-bot/images/eclipse.png)
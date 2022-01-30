# SLCC's Discord Bot
## Installation
You can clone this repo to your local machine. Then run the following commands.
<br></br>
### IntelliJ IDEA install
In the root of the project run the following command to create the runnable jar.
```bash
gradle clean shadow
```
Then run this command.
```
java -jar build/libs/*.jar "your-discord-token"
```
<br></br>
### Eclipse IDE install
In the root of the project run the following command in the terminal.
```
gradle eclipse
```
<br></br>

### GUI Install IntelliJ
1. Build the shadow jar by double clicked shadowJar.
![](../slcc-bot/images/shadow.png)

### GUI Eclipse Install
1. Create the Eclipse project file by double clicking eclipse under ide. 
![](../slcc-bot/images/eclipse.png)
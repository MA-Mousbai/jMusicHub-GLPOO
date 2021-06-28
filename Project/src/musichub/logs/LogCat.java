package musichub.logs;

public enum LogCat {
	
	INFO("\u001B[36m","INFO"),
    WARN("\u001B[33m","WARN"),
    ERROR("\u001B[31m","ERROR");

    String consoleColor;
    String name;

    LogCat(String consoleColor,String name) {
        this.consoleColor = consoleColor;
        this.name = name;
    }

    public String getConsoleColor() {
        return consoleColor;
    }

    public String getName() {
        return name;
    }

}

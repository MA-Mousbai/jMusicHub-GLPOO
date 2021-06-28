package musichub.logs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Logs {
	
	private File file;
	private final String colorReset = "\u001B[0m";
    private final List<String> consoleLogs;
    private final List<String> logs;
	
	public Logs() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        initLogsFile(dtf.format(now));
        consoleLogs = new ArrayList<>();
        logs = new ArrayList<>();

    }
	
	  public void log(String message, LogCat type) {

	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
	        LocalDateTime now = LocalDateTime.now();
	        consoleLogs.add("[" + dtf.format(now) + " " + type.getConsoleColor() + type.getName() + colorReset + "] " + type.getConsoleColor() + message);
	        logs.add("[" + dtf.format(now) + " " + type.getName() + "] " + message);
	        write();
	    }
	
	  private void write(){
	        FileWriter fileWriter = null;
	        try {
	            fileWriter = new FileWriter(file);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        PrintWriter printWriter = new PrintWriter(fileWriter);
	        for (String log : logs)
	            printWriter.println(log);

	        printWriter.close();
	    }
	  
	private void initLogsFile(String date) {
        String currentDir = System.getProperty("user.dir");
        File folder = new File(currentDir + File.separator + "logs");

        if (!folder.exists())
            folder.mkdir();
        File file = new File(folder.getPath() + File.separator + date + ".txt");

        int count = 1;

        while (file.exists()) {
            file = new File(folder.getPath() + File.separator + date + "-" + count + ".txt");
            count++;
        }
        this.file = file;
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

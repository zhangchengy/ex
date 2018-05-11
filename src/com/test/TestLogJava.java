package com.test;

import java.io.IOException;  
import java.util.Date;  
import java.util.logging.FileHandler;  
import java.util.logging.Formatter;  
import java.util.logging.Level;  
import java.util.logging.LogRecord;  
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;  

public class TestLogJava {  

    public static void main(String[] args) throws IOException{  
        Logger log = Logger.getLogger("tesglog");  
        log.setLevel(Level.ALL);  
        FileHandler fileHandler = new FileHandler("d:\\test.log",true);  
        fileHandler.setLevel(Level.ALL); 
   
        SimpleFormatter sf = new SimpleFormatter();
        fileHandler.setFormatter(sf);
 
        log.addHandler(fileHandler);  
        log.info("This is test java util log");     
    }  
}  

class LogFormatter extends Formatter {  
    @Override  
    public String format(LogRecord record) {  
        Date date = new Date();  
        String sDate = date.toString();  
        return "[" + sDate + "]" + "[" + record.getLevel() + "]"  
                + record.getClass() + record.getMessage() + "\n";  
    }  
} 
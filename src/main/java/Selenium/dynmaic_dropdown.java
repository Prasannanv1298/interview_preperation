package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class dynmaic_dropdown {

	
	public void pressDownArrow(int noOftime) throws AWTException {
        Robot robot = new Robot();
        for(int i=0; i<noOftime; i++){
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        }
    }

    public void pressEnterkey() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }


    @Test
    public void Test2(String value) throws AWTException {

        switch (value){
            case "NCR":
                pressEnterkey();
                break;
            case "Uttar Pradesh":
                pressDownArrow(1);
                pressEnterkey();
                break;
            case "Hariyana":
                pressDownArrow(2);
                pressEnterkey();
                break;
            case "Rajasthan":
                pressDownArrow(3);
                pressEnterkey();
                break;
            default :
            	System.out.println("Option not found ");
            	break;
        }

    }
}

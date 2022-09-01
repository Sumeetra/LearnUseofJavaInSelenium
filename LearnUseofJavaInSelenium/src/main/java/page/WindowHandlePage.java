package page;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlePage extends Basepage{	
	public WindowHandlePage() {		
	}
	
public static void windowHandle() {
	String Parent = driver.getWindowHandle();	
	Set<String> Handle = driver.getWindowHandles();
	System.out.println(Handle);
	Iterator<String> Window = Handle.iterator();	
	String Child = Window.next();
	
	while (Window.hasNext()) {			
		if (!Parent.equals(Child)) {
			driver.switchTo().window(Child);
			System.out.println(driver.switchTo().window(Child).getTitle());
			driver.close();
		}
		}
		}
		}

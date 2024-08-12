package StringReverse;

import java.time.Duration;
import java.util.List;

import org.apache.commons.math3.analysis.function.Min;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RevSuStr {

	public static void main(String[] args)
	{
		/*RevSuStr r=new RevSuStr();
		r.recurssionRev("Akshay");

	}

	public void recurssionRev(String s)
	{

		if (s.length()>0)
		{
System.out.print(s.charAt(s.length()-1));		
recurssionRev(s.substring(0,s.length()-1));

		}*/



		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		WebElement ele = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select sel=new Select(ele);
		sel.selectByIndex(4);	

		List<WebElement> webEle = sel.getAllSelectedOptions();

		for(WebElement e:webEle)
		{
			System.out.println(e.getText());
		}*/
		/*int a[]= {1000,32,992,5,7,1,2,6,7,8,9,-1,100};
		int max=Integer.MIN_VALUE;
		int secM=Integer.MIN_VALUE;
		int tMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				tMax=secM;
				secM=max;
				max=a[i];

			}
			else if(a[i]!=max && a[i]>secM)
			{
				tMax=secM;
				secM=a[i];
			}
			else if(a[i]!=max && a[i]!=secM && a[i]>tMax)
			{
				tMax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(secM);
		System.out.println(tMax);*/
		
		
		


	}
}



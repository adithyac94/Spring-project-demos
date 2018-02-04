import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCchallengeApp1 {
	
	public static void main(String arg[]){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		City city = (City) ctx.getBean("mycity");
		
		city.cityName();
		
		 ((ClassPathXmlApplicationContext) ctx).close();
		
	}

}

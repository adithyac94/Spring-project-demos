import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class IOCChallengeApp2 {
	
	public static void main(String args[]){
		//create the application context
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		//create the bean
		City organ = (City) ctx.getBean("mycity");
		organ.cityName();;
		
		((FileSystemXmlApplicationContext) ctx).close();
		
		}
		

}


import javax.annotation.Resource;

import org.apache.naming.factory.BeanFactory;



public class Test {  
    public static void main(String[] args) {  
    	
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee s=(Employee)factory.getBean("e");  
        s.show();  
          
    }  
}  

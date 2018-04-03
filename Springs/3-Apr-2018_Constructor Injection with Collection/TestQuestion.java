

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class TestQuestion {

	public static void main(String[] args) {
		
		Resource rs=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Question question=(Question) factory.getBean("questionbean");
		question.display();
	}

}

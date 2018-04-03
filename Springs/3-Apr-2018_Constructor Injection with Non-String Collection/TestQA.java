import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestQA {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("ApplicationContext.xml");
		BeanFactory bean=new XmlBeanFactory(rs);
		Question question= (Question) bean.getBean("questionbean");
		question.display();
	}

}

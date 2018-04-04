package com.indus;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestEmp {
public static void main(String[] args) {
	Resource rs=new ClassPathResource("ApplicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(rs);
	Employee employee=(Employee)factory.getBean("employeebean");
	employee.display();
}
}

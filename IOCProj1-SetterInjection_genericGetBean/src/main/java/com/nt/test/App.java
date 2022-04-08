package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class App 
{
    public static void main( String[] args )
    {
       
        FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
        XmlBeanFactory factory=new XmlBeanFactory(res);
        
//        Object obj=factory.getBean("wmg");  
//        WishMessageGenerator generator=(WishMessageGenerator) obj;
  
        
 //Using Generics [ No Type casting ]
  //      public <T>  getBean(String beanId, Class<T> clazz);

        WishMessageGenerator generator=factory.getBean("wmg", WishMessageGenerator.class);
        String msg=generator.generateMessage("Anjali");
        
        
        System.out.println("Message : "+msg);
                
    }
}

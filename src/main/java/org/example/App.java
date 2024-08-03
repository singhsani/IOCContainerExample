package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The IoC container is accountable to instantiate, configure and construct the objects.
 * It gets pieces of information from the XML file and performs accordingly.
 * The main tasks that be executed by the IoC containers are:
 * to set and instantiate the application class.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        System.out.println(context);
        Student st=context.getBean("stu",Student.class);
        st.eat();
        st.sleep();
        Ram ram=context.getBean("ram",Ram.class);
        ram.eat();
        ram.sleep();
    }
}

import com.spring.feizuo.Car;
import com.spring.feizuo.MyBeanPostProcessor;
import com.spring.feizuo.MyInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Bllss {

    public static void main(String[] args){
        Resource resource = new ClassPathResource("com/spring/feizuo/Car.xml");
        BeanFactory bf = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory)bf);
        reader.loadBeanDefinitions(resource);
        BeanDefinition bd = ((ConfigurableBeanFactory)bf).getMergedBeanDefinition("Car");

        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());

        Car car = (Car)bf.getBean("Car");

        ((DefaultListableBeanFactory)bf).destroySingletons();

    }
}

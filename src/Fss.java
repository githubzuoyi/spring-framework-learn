import com.spring.feizuo.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Fss {




    public static void main(String[] args) throws Throwable {

        //<bean id="Car" class="com.spring.feizuo.Car">
        //    <property name="color" value="yellow" />
        //    <property name="speed" value="15ms" />
        //</bean>

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.spring.feizuo.Car");

        Constructor constructor = clazz.getDeclaredConstructor((Class[])null);
        Car obj = (Car) constructor.newInstance();

        Field setcolor = clazz.getDeclaredField("color");
        setcolor.setAccessible(true);
        setcolor.set(obj,"yellow");

        Field setspeed = clazz.getDeclaredField("speed");
        setspeed.setAccessible(true);
        setspeed.set(obj,"15ms");

        Method driveMth = clazz.getDeclaredMethod("drive");
        driveMth.setAccessible(true);
        driveMth.invoke(obj,(Class[])null);

        obj.drive();

    }

}

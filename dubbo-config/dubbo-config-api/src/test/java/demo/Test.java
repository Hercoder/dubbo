package demo;

import org.apache.dubbo.config.annotation.DubboService;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: hkai
 * @date: 2022/4/10 9:05 PM
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        boolean present = Loc1.class.isAnnotationPresent(DubboService.class);
        DubboService annotation = Loc1.class.getAnnotation(DubboService.class);
        System.out.println(annotation.validation());
        System.out.println(annotation);
        System.out.println(present);
        try {
            Constructor<Loc1> constructor = Loc1.class.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

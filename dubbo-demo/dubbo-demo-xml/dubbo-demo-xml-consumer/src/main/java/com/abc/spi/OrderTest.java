package com.abc.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class OrderTest {
    public static void main(String[] args) {
        ExtensionLoader<Order> loader = ExtensionLoader.getExtensionLoader(Order.class);
        Order order = loader.getAdaptiveExtension();
        URL url = URL.valueOf("xxx://localhost:8080/ooo/jjj?order=alipay");
        System.out.println(order.pay(url));
    }

    private static void m1() {
        ExtensionLoader<Order> loader = ExtensionLoader.getExtensionLoader(Order.class);
        Order order = loader.getExtension("alipay");
//        URL url = URL.valueOf("xxx://localhost:8080/ooo/jjj?order=alipay");
        System.out.println(order.way());
    }
}

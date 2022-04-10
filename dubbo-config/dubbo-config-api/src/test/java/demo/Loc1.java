package demo;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @description:
 * @author: hkai
 * @date: 2022/4/10 9:06 PM
 * @version: 1.0
 */
@DubboService(validation = "xxxx")
public class Loc1 {

    private int ss;

    public Loc1(int ss) {
        this.ss = ss;
    }

    public void hah() {

    }
}

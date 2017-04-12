package org.zhenchao.flyweight.composite;

/**
 * fourth result handler implementation
 *
 * @author zhenchao.wang 2017-4-12 23:50:11
 * @version 1.0.0
 */
public class FourthResultHandler extends AbstractResultHandler {

    @Override
    public void handle(Object obj) {
        System.out.println("fourth handle");
    }

    @Override
    public int getPriority() {
        return BASE_PRIORITY + 10;
    }

}

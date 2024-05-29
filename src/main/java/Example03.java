import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Example03 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Example03.class);

        MDC.put("IP", "123.123.123.123");
        logger.info("Hello {}", "World");
        logger.info("Hello {} {}", "World");
        logger.info("Hello {} \\{}", "World");
        logger.info("Hello {} \\{} {}", "World");
        logger.info("Hello {} \\{} {}", "World", "HI");
    }

    //我们把info的第一个参数称为format字符串，剩下的参数叫做参数列表。 可以总结下：
    //
    //如果format字符串中的{}，在参数列表找不到对应的参数。那么{}会被打印出来。
    //如果format字符串中\\{}在两个{}之间，如果这两个{}能在参数列表中找到对应的参数，则\\{}会被输出为{}。
}

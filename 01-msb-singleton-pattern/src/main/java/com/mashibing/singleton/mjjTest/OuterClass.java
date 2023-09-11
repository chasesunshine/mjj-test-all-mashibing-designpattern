package com.mashibing.singleton.mjjTest;

import lombok.SneakyThrows;

/**
 * https://blog.csdn.net/qq_38807606/article/details/114166910
 */
public class OuterClass {
    public static String OUTER_DATE = "外部类静态变量加载时间 "+System.currentTimeMillis();
    static {
        System.out.println("外部类静态块加载时间：" + System.currentTimeMillis());
    }
    public OuterClass() {
        System.out.println("外部类构造函数时间：" + System.currentTimeMillis());
    }

    static class InnerStaticClass{
        public static String INNER_STATIC_DATE = "静态内部类静态变量加载时间 "+System.currentTimeMillis();
        static {
            System.out.println("静态内部类静态代码块加载时间：" + System.currentTimeMillis());
        }
    }
    class InnerClass {
        public String INNER_DATE = "";
        public InnerClass() {
            INNER_DATE = "非静态内部类构造器加载时间"+System.currentTimeMillis();
        }
    }


    @SneakyThrows
    public static void main(String[] args) {
        //①main方法里没有任何代码运行结果
        //  外部类静态块加载时间：1614393999819

        //  说明：外部类静态变量的加载时间和外部类静态代码块的加载时间一样

        // ②
        //OuterClass outer = new OuterClass();
        //外部类静态块加载时间：1614394114095
        //外部类构造函数时间：1614394114095

        // 说明加载外部类的时候并没有加载静态内部类，外部类静态变量的加载时间和外部类静态代码块的加载时间一样


        // ③
//        OuterClass outer = new OuterClass();
//        Thread.sleep(10000L);
//        System.out.println("外部类静态变量加载时间：" + OUTER_DATE);

        //外部类静态块加载时间：1614394454245
        //外部类构造函数时间：1614394454245
        //外部类静态变量加载时间：外部类静态变量加载时间 1614394454245

        // 说明：加载外部类和加载静态内部类没有什么关系，外部类是程序调用外部类的的时候会加载



        //④
//        OuterClass outer = new OuterClass();
//        Thread.sleep(10000L);
//        System.out.println("非静态内部类加载时间: "+outer.new InnerClass().INNER_DATE);
        //外部类静态块加载时间：1614394800484
        //外部类构造函数时间：1614394800484
        //非静态内部类加载时间: 非静态内部类构造器加载时间614394810501



        // ⑤（ps） 内部静态类可以直接用，不需要new
//        System.out.println("静态内部类加载时间____："+InnerStaticClass.INNER_STATIC_DATE);
        //外部类静态块加载时间：1614395200427
        //静态内部类静态代码块加载时间：1614395200430
        //静态内部类加载时间____：静态内部类静态变量加载时间 1614395200430

        //说明：静态内部类的加载是代码中需要静态内部类的时候才加载，而不是和外部类一起加载的
        // 加载静态内部类之前，先把外部类的静态变量和静态代码块先执行完
        // 执行完外部类的代码后，再执行静态内部类的 静态变量和静态代码块
        // 静态内部类的 静态变量和静态代码块执行完后，然后执行业务代码（⑤ 中的打印语句）


        //⑥ 验证如果加载过了外部类，调用静态内部类不需要重新加载外部类
//        OuterClass outer = new OuterClass();
//        Thread.sleep(10000L);
//        System.out.println("静态内部类加载时间____："+InnerStaticClass.INNER_STATIC_DATE);
        // 外部类静态块加载时间：1614395065015
        //外部类构造函数时间：1614395065015
        //静态内部类静态代码块加载时间：1614395075029
        //静态内部类加载时间____：静态内部类静态变量加载时间 1614395075029

        // 说明：new  外部类的时候 。外部类的静态代码块和静态变量先执行，外部类构造函数后执行



    }

}
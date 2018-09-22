package com.magy.java.method;
/**
 * @author maguoying@188.com
 *
 *
  *在使用Java局部内部类或者匿名内部类时，若该类调用了所在方法的局部变量，则该局部变量必须使用final关键字来修饰，
  *否则将会出现编译错误“Cannot refer to a non-final variable * inside an inner class defined in a different method” 
  *
  *
  *jdk8优化了，智能判断变量的值是不是真的改了，只要没有修改，final去掉也可以。如果你放开第9行，在第9行后再加一行，
  *修改一下str2的值，14行就会报错："Local variable str2 defined in an enclosing scope must be final or effectively final"
 */
public class InnerFinal {
    public static void main(String args[]) {  
        doSomething();  
    }  
  
    private static void doSomething() {  
        final String str1 = "Hello";  
        String str2 = "World!";
//        str2 = "aa";
        // 创建一个方法里的局部内部类  
        class Test {  
            public void out() {  
                System.out.println(str1);  
                System.out.println(str2);  
            }  
        }  
        Test test = new Test();  
        test.out();  
  
    }  
  
}
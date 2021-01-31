public class HelloWorld {
    public native void sayHelloWorld(); //申明一个native方法

    static{
        System.loadLibrary("HelloWorldImpl"); //装入动态链接库,"HelloWorldImpl"是装入动态链接库的名称
    }

    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHelloWorld();
    }
}

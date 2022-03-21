package QuestJavaGenerics;

public class MyClassIntegers<T extends Number> {
    T object;

    MyClassIntegers(T object){
        this.object= object;
    }

    void showType(){
        System.out.println(object.getClass().getName());
    }
}
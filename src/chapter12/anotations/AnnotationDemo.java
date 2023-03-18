package chapter12.anotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class AnnotationDemo {
    @ExampleAnnotation(str = "some string")
    public void myMeth() {

    }

    @ExampleAnnotation(str = "some string")
    public void print(String str) {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        AnnotationDemo annotationDemo = new AnnotationDemo();
        Method[] declaredMethods = annotationDemo.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declared methods: " + declaredMethod.getName());
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof ExampleAnnotation) {
                    System.out.println("BY");
                }
            }
        }
    }
}

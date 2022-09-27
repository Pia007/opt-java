import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Object is the super class of Integer
    // but List of objects is not the super class of List of Integers
    // List<Object> list
    // need to use wildcard: ?
    // List<?> list, an it will work
    public static void print(List<?> list) {
        for (Object o : list)
            System.out.println(o);
    }

    // test if can handle multiple shapes
    // will cause a compile error
    // because the method is not generic
    // Why?
    // Shape is the parent class of Circle and Rectangle
    // but List of Shapes is not the parent class of List of Circles and Rectangles
    // public static void drawAll(List<Shape> shapes) {
    //     for (Shape shape : shapes)
    //         shape.draw();
    // }

    // fix 1: use unbounded wildcard, ?
    // then use Object class in the loop
    // but bc shape is an object, there is no guarantee that it will have a draw method
    // compiler will not know that it is a shape
    // public static void drawAll(List<?> shapes) {
    //     for (Object shape : shapes)
    //         shape.draw();
    // }

    // fix 2: use bounded type parameters, T
    // then use Shape class in the loop
    // but bc shape is an object, there is no guarantee that it will have a draw method
    // compiler will not know that it is a shape
    public static <T extends Shape>void drawAll(List<T> shapes) {
        for (T shape : shapes)
            shape.draw();
    }

    public static void main(String[] args) throws Exception {

        // Integer is a subtype of Object
        // List of integers is not the subtype of List of objects
        // needed to use ? wildcard
        List<Integer> nums = Arrays.asList(1,2,3);
        List<String> names = Arrays.asList("John", "Mary", "Mark");
        print(nums);
        print(names);


        // initialize a list of shapes
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        // causes a compile error
        // the drawAll method is not compatible with the list of rectangles
        // Shape is the parent class of Rectangle
        // but List of shapes is not the parent class of List of rectangles
        // Fix 1 did not work
        // Fix 2 works
        drawAll(rectangles);
    }
}

// Unbound Wildcards & Bounded Type Parameters
// Integer is the subtype of Number
// ArrayList<E> is the subtype of List<E>
// List<E> is the subtype of Collection<E>
// Collection<E> is the supertype of List<E>
// transitive property of subtyping
// But List<Integer> is not the subtype of List<Number>
// this why we need wildcards
// Wildcards are used to make a generic type more flexible
// ? is the wildcard
// the supertype of all collections

// Object is the parent class for Integer
// a List of objects is the supertype of a List of integers
// compiler will not allow this
// Fix:  ? is the wild card



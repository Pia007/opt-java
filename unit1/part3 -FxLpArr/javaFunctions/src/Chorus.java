package src;//never ever copy and paste code
// use a function instead
    // grp of code that can perform a task
// 5 parts to a function
    // level of access - public(access from anywhere)
    // return value  - void(the function does not return anything)
    // function name - reflects the task that it performs, camelCase, aka methods
    // parameters
    // code
// call the function - call it from the entry point of the app

public class Chorus {
    public static void main(String[] args) {
        singChorus();
        singChorus();
        singChorus();
        singChorus();
        singChorus();
    }

    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine.");
        System.out.println("Don't blame it on the moonlight.");
        System.out.println("Don't blame it on the good times.");
        System.out.println("Blame it on the boogie.\n");
    }
}

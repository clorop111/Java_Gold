package ex52;

public class Sample {
    public static void main(String[] args) {
        var subject = new Subject("A");
    }
    // class Subject {
    //     String name;
    //     Subject(String name) {
    //         this.name = name;
    //     }
    // }
}

class Subject {
    String name;
    Subject(String name) {
        this.name = name;
    }
}
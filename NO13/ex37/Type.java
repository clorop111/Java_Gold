package ex37;

public enum Type {
    A(1), B(2), C(3);
    int num;
    Type(int num) {
        this.num = num;
    }


    // public String toString() {
    //     return String.valueOf(Type.values()[1]);
    // }
    //  String toString() {
    //     return "2";
    // }
    public String toString() {
        return String.valueOf(A.num);
    }
    // public String toString() {
    //     return String.valueOf(num);
    // }
}

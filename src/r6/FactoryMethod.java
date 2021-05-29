package r6;

interface Developer {
    void write();
    static Developer of(String type){
        switch(type){
            case "Java": return new JavaDeveloper();
            case "Python" : return new PythonDeveloper();
            default: throw new UnsupportedOperationException("Not supported for " + type);
        }
    }
}
class JavaDeveloper implements Developer {
    @Override public void write() {
        System.out.println("Im coding on java");
    }
}
class PythonDeveloper implements Developer {
    @Override public void write() {
        System.out.println("I just like snakes");
    }
}
public class FactoryMethod {
    public static void main(String[] args) {
        Developer javaDeveloper = Developer.of("Java");
        javaDeveloper.write();
        Developer pythonDeveloper = Developer.of("Python");
        pythonDeveloper.write();
    }
}
package r8.part2;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
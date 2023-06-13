public interface Shape{
    void draw();
}

public class Circle implements Shape{

    @Override
    static void draw(){
        System.out.println("Circle");
    }
}

public class Rectangle implements Shape{

    @Override
    static void draw(){
        System.out.println("Rectangle");
    }
}

public class Square implements Shape{

    @Override
    static void draw(){
        System.out.println("Square");
    }
}

public class ShapeMaker{

    void drawCircle(){
        Circle.draw();
    }

    void drawRectangle(){
        Rectangle.draw();
    }

    void drawSquare(){
        Square.draw();
    }
}

public class FacadeDemo{

    public static void main(String [] args){

        ShapeMaker maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
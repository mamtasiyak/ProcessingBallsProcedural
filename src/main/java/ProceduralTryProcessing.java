import processing.core.PApplet;
public class ProceduralTryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    int x=0;
    //int speed=0;

    public static void main(String[] args) {
        PApplet.main("ProceduralTryProcessing",args);
    }

    @Override
    public void settings() {
        //setting method called once by processing
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //setup method called once by processing
        System.out.println("Printed fron the setup method");
       // ellipse(WIDTH/2, HEIGHT/2, 108,100);
    }

    @Override
    public void draw() {
        //draw method called infinitely by processing in a loop
        //System.out.println("Printed from the draw method");
         //super.draw();
       //extractedToPaintWhite();
        drawCircle();
    }

    private void drawCircle() {
        int var=400;
        for (int i =0; i<4  ; i++) {
            ellipse(move(i+1), HEIGHT-var, DIAMETER, DIAMETER);
            var=var-100;
        }

        //ellipse(x, mouseY, DIAMETER, DIAMETER);
        x++;
    }

    public float move(int speed) {
        return x*speed;
    }

    private void extractedToPaintWhite() {
        background(255);
    }
}

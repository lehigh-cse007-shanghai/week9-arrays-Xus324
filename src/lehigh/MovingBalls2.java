package lehigh;

import processing.core.PApplet;

import java.util.*;

public class MovingBalls2 extends PApplet {
    int score = 0;
    class Ball {
        int x,y,radius;
        float x_speed, y_speed;
        int [] color;

        Ball(){
            radius = (int) random(30,30);
            x = (int) random(width - radius);
            y = (int) random(height - radius);
            x_speed = random(0.88f, 5.0f);
            y_speed = random(0.88f, 5.0f);
            color = new int[]{(int)random(255),(int)random(255),(int)random(255)};
        }

        public void move() {
            fill(color[0], color[1], color[2]);
            x += x_speed;
            y += y_speed;
            if ((x - radius < 0) || (x + radius) > width)
                x_speed = -x_speed;
            if ((y - radius < 0) || (y + radius) > height)
                y_speed = -y_speed;
            ellipse(x, y, radius, radius);
        }
    }

    ArrayList<Ball> balls;

    public void settings(){
        size(500,500);
        balls = new ArrayList<>();
        for(int i = 0; i < 30; i++){
            balls.add(new Ball());
        }
    }
    public void draw() {
        background(255);
        fill(255);
        textSize(20);
        fill(0);
        text("score: " + score,100,100);
        for (Ball ball : balls) {
            ball.move();
        }}
        public void mouseClicked () {
            for (int i = 0; i < 30; i++) {
                if (balls.get(i).x - balls.get(i).radius < mouseX && mouseX < balls.get(i).x + balls.get(i).radius
                        && balls.get(i).y - balls.get(i).radius < mouseY && mouseY < balls.get(i).y + balls.get(i).radius) {
                    balls.get(i).x_speed += 10;
                    balls.get(i).y_speed += 10;
                    score++;
                }
            }
        }
    public static void main (String[]args){
        String[] processingArgs = {"MovingBalls2"};
        MovingBalls2 movingBalls2 = new MovingBalls2();
        PApplet.runSketch(processingArgs, movingBalls2);
    }
}

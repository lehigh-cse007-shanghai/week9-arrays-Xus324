package lehigh;

import processing.core.PApplet;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class MovingBalls extends PApplet {
    int numofballs = 12;
    float x[] = new float[numofballs];
    float y[] = new float[numofballs];
    float[] x_speed = new float[numofballs];
    float[] y_speed = new float[numofballs];
    float[][] color = new float[numofballs][3];
    int radius = 20;

    public void settings() {

        size(500, 500);

        for (int i = 0; i < numofballs; i++) {
            x[i] = random(radius, width - radius);
            y[i] = random(radius, height - radius);
            x_speed[i] = random(8);
            y_speed[i] = random(8);
            color[i] = new float[]{random(255), random(255), random(255)};

        }
    }

    public void draw() {
        background(255);
        for (int i = 0; i < numofballs; i++) {
            fill(color[i][0], color[i][1], color[i][2]);
            ellipse(x[i], y[i], radius * 3, radius * 3);
            if ((x[i] - radius <= 0) || (x[i] + radius) >= width)
                x_speed[i] = -x_speed[i];
            if ((y[i] - radius <= 0) || (y[i] + radius) >= height)
                y_speed[i] = -y_speed[i];
            x[i] += x_speed[i];
            y[i] += y_speed[i];
                for (int j = 0; j < numofballs; j++) {
                float X = Math.abs(x[i] - x[j]);
                float Y = Math.abs(y[i] - y[j]);

                    if ((X <= 30) || Y<= 30)
                        line(x[i], y[i], x[j], y[j]);
                    }
                }
            }



        public static void main (String[]args){
            String[] processingArgs = {"MovingBalls"};
            MovingBalls movingBalls = new MovingBalls();
            PApplet.runSketch(processingArgs, movingBalls);
        }
    }


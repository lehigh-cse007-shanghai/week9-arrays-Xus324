package lehigh;

import processing.core.PApplet;

public class BubbleSortProcessing extends PApplet {
    int[] arr = {15, 8, 6, 11, 1, 3, 9};
    float[] x = {20, 70, 120, 170, 220, 270, 320};
    float y = 130;

    public void settings() {
        size(400, 200);
    }

    public void draw(){
        background(0);

        for(int i = 0; i < arr.length; i ++) {
            textSize(20);
            fill(255);
            text(Integer.toString(arr[i]), x[i], y);
        }

    }

    public static void main (String[]args){
        String[] processingArgs = {"BubbleSortTextProcessing"};
        BubbleSortProcessing bubbleSortTextProcessing = new BubbleSortProcessing();
        PApplet.runSketch(processingArgs, bubbleSortTextProcessing);
    }
}
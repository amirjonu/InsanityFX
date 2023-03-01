package com.example.test;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    Scene startG, game;
    int w=700,l=700;

    int move=55;
    Stage stage;

    private ArrayList<Peg> pegnames= new ArrayList<Peg>();
    private ArrayList<Line> lines= new ArrayList<Line>();

    private ArrayList<ImageView> images= new ArrayList<ImageView>();

    @Override
    public void start(Stage ge) throws IOException {
        Style s= new Style();
        stage= ge;
        stage.setTitle("Insanity!");
        Button start = new Button("Start");
        start.setStyle(s.button());
        Label instructions = new Label("Just get the four same color to opposite sides by moving by one space or jumping over a peg!");
        instructions.setStyle(s.label());
        VBox startLayout = new VBox(20);
        startLayout.getChildren().addAll(start, instructions);
        startLayout.setAlignment(Pos.CENTER);
        startG = new Scene(startLayout, w, l);


        start.setOnAction(e -> {
            stage.setScene(game);
        });


        Pane gamelayout= new Pane();
        Image img4= new Image("img_3.PNG");
        ImageView viewB= new ImageView(img4);
        viewB.setFitHeight(l);
        viewB.setFitWidth(w);
        viewB.setLayoutX(0);
        viewB.setLayoutY(0);


        Image bpeg1= new Image("img_1.png");
        ImageView viewbp1= new ImageView(bpeg1);
        viewbp1.setFitHeight(400);
        viewbp1.setFitWidth(400);
        viewbp1.setLayoutX(270);
        viewbp1.setLayoutY(150);
        pegnames.add(new Peg("blue", 1));

        Image bpeg2= new Image("img_1.png");
        ImageView viewbp2= new ImageView(bpeg2);
        viewbp2.setFitHeight(400);
        viewbp2.setFitWidth(400);
        viewbp2.setLayoutX(270-move);
        viewbp2.setLayoutY(150);
        pegnames.add(new Peg("blue", 2));

        Image bpeg3= new Image("img_1.png");
        ImageView viewbp3= new ImageView(bpeg3);
        viewbp3.setFitHeight(400);
        viewbp3.setFitWidth(400);
        viewbp3.setLayoutX(270-(move*2));
        viewbp3.setLayoutY(150);
        pegnames.add(new Peg("blue", 3));

        Image bpeg4= new Image("img_1.png");
        ImageView viewbp4= new ImageView(bpeg4);
        viewbp4.setFitHeight(400);
        viewbp4.setFitWidth(400);
        viewbp4.setLayoutX(270-(move*3));
        viewbp4.setLayoutY(150);
        pegnames.add(new Peg("blue", 4));
        images.add(viewbp1);
        images.add(viewbp2);
        images.add(viewbp3);
        images.add(viewbp4);


        Image rpeg1= new Image("img_2.png");
        ImageView viewrp1= new ImageView(rpeg1);
        viewrp1.setFitHeight(400);
        viewrp1.setFitWidth(400);
        viewrp1.setLayoutX(50);
        viewrp1.setLayoutY(150);
        pegnames.add(new Peg("red", 1));

        Image rpeg2= new Image("img_2.png");
        ImageView viewrp2= new ImageView(rpeg2);
        viewrp2.setFitHeight(400);
        viewrp2.setFitWidth(400);
        viewrp2.setLayoutX(50+move);
        viewrp2.setLayoutY(150);
        pegnames.add(new Peg("red", 2));

        Image rpeg3= new Image("img_2.png");
        ImageView viewrp3= new ImageView(rpeg3);
        viewrp3.setFitHeight(400);
        viewrp3.setFitWidth(400);
        viewrp3.setLayoutX(50+(move*2));
        viewrp3.setLayoutY(150);
        pegnames.add(new Peg("red", 3));

        Image rpeg4= new Image("img_2.png");
        ImageView viewrp4= new ImageView(rpeg4);
        viewrp4.setFitHeight(400);
        viewrp4.setFitWidth(400);
        viewrp4.setLayoutX(50+(move*3));
        viewrp4.setLayoutY(150);
        pegnames.add(new Peg("red", 4));
        images.add(viewrp1);
        images.add(viewrp2);
        images.add(viewrp3);
        images.add(viewrp4);



        Line line1 = new Line(90, 370, 91, 350);
        line1.setStroke(Color.BLACK);
        lines.add(line1);
        Line line2 = new Line(90+(move), 370, 91+(move), 350);
        line2.setStroke(Color.BLACK);
        lines.add(line2);
        Line line3 = new Line(90+(move)*2, 370, 91+(move)*2, 350);
        line3.setStroke(Color.BLACK);
        lines.add(line3);
        Line line4 = new Line(90+(move)*3, 370, 91+(move)*3, 350);
        line4.setStroke(Color.BLACK);
        lines.add(line4);
        Line line5 = new Line(90+(move)*4, 370, 91+(move)*4, 350);
        line5.setStroke(Color.BLACK);
        lines.add(line5);
        Line line6 = new Line(90+(move)*5, 370, 91+(move)*5, 350);
        line6.setStroke(Color.BLACK);
        lines.add(line6);
        Line line7 = new Line(90+(move)*6, 370, 91+(move)*6, 350);
        line7.setStroke(Color.BLACK);
        lines.add(line7);
        Line line8 = new Line(90+(move)*7, 370, 91+(move)*7, 350);
        line8.setStroke(Color.BLACK);
        lines.add(line8);
        Line line9 = new Line(90+(move)*8, 370, 91+(move)*8, 350);
        line9.setStroke(Color.BLACK);
        lines.add(line9);
        Line line10 = new Line(90+(move)*9, 370, 91+(move)*9, 350);
        line10.setStroke(Color.BLACK);
        lines.add(line10);
        Line line11 = new Line(90+(move)*10-20, 370, 91+(move)*10-20, 350);
        line11.setStroke(Color.BLACK);
        lines.add(line11);

        gamelayout.getChildren().addAll(viewB, viewbp1, viewbp2, viewbp3, viewbp4, viewrp1, viewrp2, viewrp3, viewrp4, line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11);
        gamelayout.getChildren().forEach(this:: makeDraggable);

        game= new Scene(gamelayout, w,l);
        stage.setScene(startG);
        stage.show();
    }


    private double startx, startY;
    private double x, y;
    private double counterx, countery;


    Board board21= new Board();
    private void makeDraggable(Node node){
        node.setOnMousePressed(e->{
            startx=e.getSceneX()-node.getTranslateX();
            startY=e.getSceneY()-node.getTranslateY();
            x= node.getLayoutX();
            y= node.getLayoutY();
            counterx=x;
            countery=y;
        });
        node.setOnMouseDragged(e->{
            Board bClass= new Board();
            node.setTranslateX(e.getSceneX()-startx);
            node.setTranslateY(e.getSceneY()-startY);
        });
        node.setOnMouseReleased(e->{
            int idx=0;
            int idxMove=0;
            for (int i =0; i<images.size(); i++){
                if (node== images.get(i)){
                    idx=i;
                }
            }
            if (pegnames.get(idx).getColor().equals("red")){
                x=x+67;
                //incorrect image input calculation corrections
                for (int i =0; i< lines.size()-1; i++){
                    if (x+node.getTranslateX()>lines.get(i).getStartX() && x+node.getTranslateX()< lines.get(i+1).getStartX()){
                        idxMove=i;
                        break;
                    }
                    
                }
            }else{
                x=x+397;
                //image incorrect import size corrections
                for (int i =0; i< lines.size()-1; i++){
                    if (x+node.getTranslateX()>lines.get(i).getStartX() && x+node.getTranslateX()< lines.get(i+1).getStartX()){
                        idxMove=i-1;
                        break;
                    }
                    
                }
            }




            if (board21.movePeg(pegnames.get(idx).getColor(), pegnames.get(idx).getNumber(), idxMove)){
                node.setTranslateY(0);
                if (pegnames.get(idx).getColor().equals("blue")){
                    node.setTranslateX(-1*(x-(lines.get(idxMove+1).getStartX()+(move/2))));

                }else{
                    node.setTranslateX(-1*(x-(lines.get(idxMove).getStartX()+(move/2))));
                }
                node.setLayoutX(counterx+ node.getTranslateX());
                node.setTranslateX(0);


            }else{
                node.setTranslateX(0);
                node.setTranslateY(0);
            }
            if (board21.winCondition()){
                if (ConfirmBox.display("VICTORY", "You have won. Do you wanna exit?")) {
                    stage.close();
                }
            }


        });

    }



    public static void main(String[] args) {
        launch();
    }
}
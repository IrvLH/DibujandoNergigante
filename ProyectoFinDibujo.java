
package proyectofindibujo;

import javafx.scene.shape.Path;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.QuadCurveTo;
import javafx.stage.Stage;

/*
 * @author Selx
 */
public class ProyectoFinDibujo extends Application {
    Pane root = new Pane();
    Color c = Color.web("#484139");
    Color c2 = Color.web("#A1977C");
    Color c3 = Color.web("#6D645E");
    Color c4 = Color.web("#E3A53E");
    Color c5 = Color.web("#FAF312");
    Color c6 = Color.web("#EC5885");
    Color c7 = Color.web("#757761");
    
    @Override
    public void start(Stage primaryStage) {
        root.setId("pane");
        root.setOnMouseClicked(ev ->{
            double x = ev.getX();
            double y = ev.getY();
            Nergi(x,y);
        });
        
        Scene scene = new Scene(root, 800, 600);//961, 977
        scene.getStylesheets().addAll(this.getClass().getResource("Fondo.css").toExternalForm());
        primaryStage.setTitle("Nergigante");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void Nergi(double x, double y){
        Path pat = new Path();
        MoveTo m = new MoveTo(x,y);
        LineTo l1 = new LineTo();
        l1.setX(x+30);
        l1.setY(y-5);
        LineTo l2 = new LineTo();
        l2.setX(x+35);
        l2.setY(y-35);
        QuadCurveTo cur = new QuadCurveTo();
        cur.setX(x+55);
        cur.setY(y-42);
        cur.setControlX(x+38);
        cur.setControlY(y-44);
        LineTo l3 = new LineTo();
        l3.setX(x+70);
        l3.setY(y-42);
        LineTo l4 = new LineTo();
        l4.setX(x+85);
        l4.setY(y-31);
        LineTo l5 = new LineTo();
        l5.setX(x+82);
        l5.setY(y-23);
        LineTo l6 = new LineTo();
        l6.setX(x+86);
        l6.setY(y-27);
        LineTo l7 = new LineTo();
        l7.setX(x+87);
        l7.setY(y-16);
        LineTo l8 = new LineTo();
        l8.setX(x+92);
        l8.setY(y-22);
        LineTo l9 = new LineTo();
        l9.setX(x+110);
        l9.setY(y-22);
        
        LineTo l10 = new LineTo();
        l10.setX(x+115);
        l10.setY(y-16);
        LineTo l11 = new LineTo();
        l11.setX(x+116);
        l11.setY(y-27);
        LineTo l12 = new LineTo();
        l12.setX(x+120);
        l12.setY(y-23);
        LineTo l13 = new LineTo();
        l13.setX(x+117);
        l13.setY(y-31);
        LineTo l14 = new LineTo();
        l14.setX(x+132);
        l14.setY(y-42);
        QuadCurveTo cur2 = new QuadCurveTo();
        cur2.setX(x+167);
        cur2.setY(y-35);
        cur2.setControlX(x+164);
        cur2.setControlY(y-44);
        LineTo l15 = new LineTo();
        l15.setX(x+172);
        l15.setY(y-5);
        LineTo l16 = new LineTo();
        l16.setX(x+202);
        l16.setY(y);
        
        LineTo l17 = new LineTo();
        l17.setX(x+188);
        l17.setY(y-13);
        LineTo l18 = new LineTo();
        l18.setX(x+186);
        l18.setY(y-34);
        LineTo l19 = new LineTo();
        l19.setX(x+194);
        l19.setY(y-42);
        LineTo l20 = new LineTo();
        l20.setX(x+190);
        l20.setY(y-43);
        LineTo l21 = new LineTo();
        l21.setX(x+196);
        l21.setY(y-50);
        LineTo l22 = new LineTo();
        l22.setX(x+189);
        l22.setY(y-51);
        LineTo l23 = new LineTo();
        l23.setX(x+196);
        l23.setY(y-59);
        LineTo l24 = new LineTo();
        l24.setX(x+185);
        l24.setY(y-55);
        LineTo l25 = new LineTo();
        l25.setX(x+190);
        l25.setY(y-68);
        LineTo l26 = new LineTo();
        l26.setX(x+171);
        l26.setY(y-58);
        LineTo l27 = new LineTo();
        l27.setX(x+160);
        l27.setY(y-58);
        LineTo l28 = new LineTo();
        l28.setX(x+192);
        l28.setY(y-75);
        LineTo l29 = new LineTo();
        l29.setX(x+174);
        l29.setY(y-76);
        LineTo l30 = new LineTo();
        l30.setX(x+194);
        l30.setY(y-96);
        LineTo l31 = new LineTo();
        l31.setX(x+160);
        l31.setY(y-83);
        LineTo l32 = new LineTo();
        l32.setX(x+194);
        l32.setY(y-118);
        LineTo l33 = new LineTo();
        l33.setX(x+166);
        l33.setY(y-110);
        LineTo l34 = new LineTo();
        l34.setX(x+190);
        l34.setY(y-144);
        LineTo l35 = new LineTo();
        l35.setX(x+152);
        l35.setY(y-120);
        LineTo l36 = new LineTo();
        l36.setX(x+167);
        l36.setY(y-173);
        LineTo l37 = new LineTo();
        l37.setX(x+136);
        l37.setY(y-140);
        LineTo l38 = new LineTo();
        l38.setX(x+140);
        l38.setY(y-182);
        LineTo l39 = new LineTo();
        l39.setX(x+114);
        l39.setY(y-144);
        LineTo l40 = new LineTo();
        l40.setX(x+110);
        l40.setY(y-183);
        
        LineTo l41 = new LineTo();
        l41.setX(x+101);
        l41.setY(y-145);
        
        LineTo l42 = new LineTo();
        l42.setX(x+92);
        l42.setY(y-183);
        LineTo l43 = new LineTo();
        l43.setX(x+88);
        l43.setY(y-144);
        LineTo l44 = new LineTo();
        l44.setX(x+62);
        l44.setY(y-182);
        LineTo l45 = new LineTo();
        l45.setX(x+66);
        l45.setY(y-140);
        LineTo l46 = new LineTo();
        l46.setX(x+35);
        l46.setY(y-173);
        LineTo l47 = new LineTo();
        l47.setX(x+50);
        l47.setY(y-120);
        LineTo l48 = new LineTo();
        l48.setX(x+12);
        l48.setY(y-144);
        LineTo l49 = new LineTo();
        l49.setX(x+36);
        l49.setY(y-110);
        LineTo l50 = new LineTo();
        l50.setX(x+8);
        l50.setY(y-118);
        LineTo l51 = new LineTo();
        l51.setX(x+42);
        l51.setY(y-83);
        LineTo l52 = new LineTo();
        l52.setX(x+8);
        l52.setY(y-96);
        LineTo l53 = new LineTo();
        l53.setX(x+28);
        l53.setY(y-76);
        LineTo l54 = new LineTo();
        l54.setX(x+10);
        l54.setY(y-75);
        LineTo l55 = new LineTo();
        l55.setX(x+42);
        l55.setY(y-58);
        LineTo l56 = new LineTo();
        l56.setX(x+31);
        l56.setY(y-58);
        LineTo l57 = new LineTo();
        l57.setX(x+12);
        l57.setY(y-68);
        LineTo l58 = new LineTo();
        l58.setX(x+17);
        l58.setY(y-55);
        LineTo l59 = new LineTo();
        l59.setX(x+6);
        l59.setY(y-59);
        LineTo l60 = new LineTo();
        l60.setX(x+13);
        l60.setY(y-51);
        LineTo l61 = new LineTo();
        l61.setX(x+6);
        l61.setY(y-50);
        LineTo l62 = new LineTo();
        l62.setX(x+12);
        l62.setY(y-43);
        LineTo l63 = new LineTo();
        l63.setX(x+8);
        l63.setY(y-42);
        LineTo l64 = new LineTo();
        l64.setX(x+16);
        l64.setY(y-34);
        LineTo l65 = new LineTo();
        l65.setX(x+14);
        l65.setY(y-13);
        ClosePath l66 = new ClosePath();
        
        pat.getElements().add(m);
        pat.getElements().add(l1);
        pat.getElements().add(l2);
        pat.getElements().add(cur);
        pat.getElements().add(l3);
        pat.getElements().add(l4);
        pat.getElements().add(l5);
        pat.getElements().add(l6);
        pat.getElements().add(l7);
        pat.getElements().add(l8);
        pat.getElements().add(l9);
        pat.getElements().add(l10);
        pat.getElements().add(l11);
        pat.getElements().add(l12);
        pat.getElements().add(l13);
        pat.getElements().add(l14);
        pat.getElements().add(cur2);
        pat.getElements().add(l15);
        pat.getElements().add(l16);
        pat.getElements().add(l17);
        pat.getElements().add(l18);
        pat.getElements().add(l19);
        pat.getElements().add(l20);
        pat.getElements().add(l21);
        pat.getElements().add(l22);
        pat.getElements().add(l23);
        pat.getElements().add(l24);
        pat.getElements().add(l25);
        pat.getElements().add(l26);
        pat.getElements().add(l27);
        pat.getElements().add(l28);
        pat.getElements().add(l29);
        pat.getElements().add(l30);
        pat.getElements().add(l31);
        pat.getElements().add(l32);
        pat.getElements().add(l33);
        pat.getElements().add(l34);
        pat.getElements().add(l35);
        pat.getElements().add(l36);
        pat.getElements().add(l37);
        pat.getElements().add(l38);
        pat.getElements().add(l39);
        pat.getElements().add(l40);
        pat.getElements().add(l41);
        pat.getElements().add(l42);
        pat.getElements().add(l43);
        pat.getElements().add(l44);
        pat.getElements().add(l45);
        pat.getElements().add(l46);
        pat.getElements().add(l47);
        pat.getElements().add(l48);
        pat.getElements().add(l49);
        pat.getElements().add(l50);
        pat.getElements().add(l51);
        pat.getElements().add(l52);
        pat.getElements().add(l53);
        pat.getElements().add(l54);
        pat.getElements().add(l55);
        pat.getElements().add(l56);
        pat.getElements().add(l57);
        pat.getElements().add(l58);
        pat.getElements().add(l59);
        pat.getElements().add(l60);
        pat.getElements().add(l61);
        pat.getElements().add(l62);
        pat.getElements().add(l63);
        pat.getElements().add(l64);
        pat.getElements().add(l65);
        pat.getElements().add(l66);
        
        pat.setStroke(c);
        pat.setFill(c);
        root.getChildren().add(pat);
        
        Path patf = new Path();
        MoveTo mt = new MoveTo(x,y);
        LineTo lf1 = new LineTo(x+30,y-5);
        LineTo lf2 = new LineTo(x+35,y-35);
        LineTo lf3 = new LineTo(x+30,y-36);
        LineTo lf4 = new LineTo(x+32,y-31);
        LineTo lf5 = new LineTo(x+24,y-10);
        LineTo lf6 = new LineTo(x+15,y-15);
        LineTo lf7 = new LineTo(x+14,y-13);
        ClosePath lf8 = new ClosePath();
        
        patf.getElements().add(mt);
        patf.getElements().add(lf1);
        patf.getElements().add(lf2);
        patf.getElements().add(lf3);
        patf.getElements().add(lf4);
        patf.getElements().add(lf5);
        patf.getElements().add(lf6);
        patf.getElements().add(lf7);
        patf.getElements().add(lf8);
                
        patf.setStroke(c4);
        patf.setStrokeWidth(2);
        patf.setFill(c4);
        root.getChildren().add(patf);
        
        Path patf2 = new Path();
        MoveTo mt2 = new MoveTo(x+202,y);
        LineTo lfi1 = new LineTo(x+172,y-5);
        LineTo lfi2 = new LineTo(x+167,y-35);
        LineTo lfi3 = new LineTo(x+172,y-36);
        LineTo lfi4 = new LineTo(x+170,y-31);
        LineTo lfi5 = new LineTo(x+182,y-10);
        LineTo lfi6 = new LineTo(x+187,y-15);
        LineTo lfi7 = new LineTo(x+188,y-13);
        ClosePath lfi8 = new ClosePath();
        
        patf2.getElements().add(mt2);
        patf2.getElements().add(lfi1);
        patf2.getElements().add(lfi2);
        patf2.getElements().add(lfi3);
        patf2.getElements().add(lfi4);
        patf2.getElements().add(lfi5);
        patf2.getElements().add(lfi6);
        patf2.getElements().add(lfi7);
        patf2.getElements().add(lfi8);
                
        patf2.setStroke(c4);
        patf2.setStrokeWidth(2);
        patf2.setFill(c4);
        root.getChildren().add(patf2);
        
        Path patf3 = new Path();
        MoveTo mt3 = new MoveTo(x+35,y-35);
        LineTo lfii1 = new LineTo(x+30,y-36);
        LineTo lfii2 = new LineTo(x+28,y-39);
        LineTo lfii3 = new LineTo(x+37,y-39);
        LineTo lfii4 = new LineTo(x+43,y-42);
        LineTo lfii5 = new LineTo(x+43,y-49);
        LineTo lfii6 = new LineTo(x+55,y-44);
        LineTo lfii7 = new LineTo(x+55,y-49);
        LineTo lfii8 = new LineTo(x+70,y-42);
        LineTo lfii9 = new LineTo(x+43,y-42);
        LineTo lfii10 = new LineTo(x+37,y-39);
        ClosePath lfii11 = new ClosePath();
        
        
        patf3.getElements().add(mt3);
        patf3.getElements().add(lfii1);
        patf3.getElements().add(lfii2);
        patf3.getElements().add(lfii3);
        patf3.getElements().add(lfii4);
        patf3.getElements().add(lfii5);
        patf3.getElements().add(lfii6);
        patf3.getElements().add(lfii7);
        patf3.getElements().add(lfii8);
        patf3.getElements().add(lfii9);
        patf3.getElements().add(lfii10);
        patf3.getElements().add(lfii11);
        
        patf3.setStroke(c6);
        patf3.setStrokeWidth(2);
        patf3.setFill(c6);
        root.getChildren().add(patf3);
        
        Path patf4 = new Path();
        MoveTo mt4 = new MoveTo(x+167,y-35);
        LineTo lfd1 = new LineTo(x+172,y-36);
        LineTo lfd2 = new LineTo(x+174,y-39);
        LineTo lfd3 = new LineTo(x+165,y-39);
        LineTo lfd4 = new LineTo(x+156,y-42);
        LineTo lfd5 = new LineTo(x+156,y-49);
        LineTo lfd6 = new LineTo(x+144,y-44);
        LineTo lfd7 = new LineTo(x+144,y-49);
        LineTo lfd8 = new LineTo(x+129,y-42);
        LineTo lfd9 = new LineTo(x+156,y-42);
        LineTo lfd10 = new LineTo(x+165,y-39);
        ClosePath lfd11 = new ClosePath();
        
        
        patf4.getElements().add(mt4);
        patf4.getElements().add(lfd1);
        patf4.getElements().add(lfd2);
        patf4.getElements().add(lfd3);
        patf4.getElements().add(lfd4);
        patf4.getElements().add(lfd5);
        patf4.getElements().add(lfd6);
        patf4.getElements().add(lfd7);
        patf4.getElements().add(lfd8);
        patf4.getElements().add(lfd9);
        patf4.getElements().add(lfd10);
        patf4.getElements().add(lfd11);
        
        agregar(patf4,c6,2);
        
        NergiPaTr(x,y);
        
    }
    
    private void NergiPaTr(double x, double y) {
        Path patp1 = new Path();
        MoveTo mt = new MoveTo(x+50,y-2);
        LineTo l1 = new LineTo(x+70,y-2);
        LineTo l2 = new LineTo(x+79,y-30);
        LineTo l3 = new LineTo(x+70,y-37);
        LineTo l4 = new LineTo(x+45,y-37);
        LineTo l5 = new LineTo(x+38,y-15);
        LineTo l6 = new LineTo(x+64,y-15);
        LineTo l7 = new LineTo(x+64,y-12);
        LineTo l8 = new LineTo(x+50,y-12);
        LineTo l9 = new LineTo(x+47,y-2);
        
        patp1.getElements().add(mt);
        patp1.getElements().add(l1);
        patp1.getElements().add(l2);
        patp1.getElements().add(l3);
        patp1.getElements().add(l4);
        patp1.getElements().add(l5);
        patp1.getElements().add(l6);
        patp1.getElements().add(l7);
        patp1.getElements().add(l8);
        patp1.getElements().add(l9);
        patp1.setStroke(c);
        patp1.setFill(c);
        root.getChildren().add(patp1);
        
        Path patp1f = new Path();
        MoveTo mt2 = new MoveTo(x+50,y-2);
        LineTo lf1 = new LineTo(x+70,y-2);
        LineTo lf2 = new LineTo(x+79,y-30);
        LineTo lf3 = new LineTo(x+50,y-32);
        LineTo lf4 = new LineTo(x+50,y-22);
        LineTo lf5 = new LineTo(x+56,y-26);
        LineTo lf6 = new LineTo(x+60,y-20);
        LineTo lf7 = new LineTo(x+65,y-24);
        LineTo lf8 = new LineTo(x+68,y-20);
        LineTo lf9 = new LineTo(x+64,y-15);
        LineTo lf10 = new LineTo(x+64,y-12);
        LineTo lf11 = new LineTo(x+50,y-12);
        LineTo lf12 = new LineTo(x+47,y-2);
        
        patp1f.getElements().add(mt2);
        patp1f.getElements().add(lf1);
        patp1f.getElements().add(lf2);
        patp1f.getElements().add(lf3);
        patp1f.getElements().add(lf4);
        patp1f.getElements().add(lf5);
        patp1f.getElements().add(lf6);
        patp1f.getElements().add(lf7);
        patp1f.getElements().add(lf8);
        patp1f.getElements().add(lf9);
        patp1f.getElements().add(lf10);
        patp1f.getElements().add(lf11);
        patp1f.getElements().add(lf12);
        patp1f.setStroke(c4);
        patp1f.setStrokeWidth(1);
        patp1f.setFill(c4);
        root.getChildren().add(patp1f);
        
        NergiPatTr2(x,y);
    }

    private void NergiPatTr2(double x, double y) {
        Path patp2 = new Path();
        MoveTo mt = new MoveTo(x+152,y-2);
        LineTo l1 = new LineTo(x+132,y-2);
        LineTo l2 = new LineTo(x+123,y-30);
        LineTo l3 = new LineTo(x+132,y-37);
        LineTo l4 = new LineTo(x+157,y-37);
        LineTo l5 = new LineTo(x+164,y-15);
        LineTo l6 = new LineTo(x+138,y-15);
        LineTo l7 = new LineTo(x+138,y-12);
        LineTo l8 = new LineTo(x+152,y-12);
        LineTo l9 = new LineTo(x+155,y-2);
        
        patp2.getElements().add(mt);
        patp2.getElements().add(l1);
        patp2.getElements().add(l2);
        patp2.getElements().add(l3);
        patp2.getElements().add(l4);
        patp2.getElements().add(l5);
        patp2.getElements().add(l6);
        patp2.getElements().add(l7);
        patp2.getElements().add(l8);
        patp2.getElements().add(l9);
        
        patp2.setStroke(c);
        patp2.setFill(c);
        root.getChildren().add(patp2);
        
        Path patp2f = new Path();
        MoveTo mt2 = new MoveTo(x+152,y-2);
        LineTo lf1 = new LineTo(x+132,y-2);
        LineTo lf2 = new LineTo(x+123,y-30);
        LineTo lf3 = new LineTo(x+152,y-32);
        LineTo lf4 = new LineTo(x+152,y-22);
        LineTo lf5 = new LineTo(x+146,y-26);
        LineTo lf6 = new LineTo(x+142,y-20);
        LineTo lf7 = new LineTo(x+137,y-24);
        LineTo lf8 = new LineTo(x+134,y-20);
        LineTo lf9 = new LineTo(x+138,y-15);
        LineTo lf10 = new LineTo(x+138,y-12);
        LineTo lf11 = new LineTo(x+152,y-12);
        LineTo lf12 = new LineTo(x+155,y-2);
        
        patp2f.getElements().add(mt2);
        patp2f.getElements().add(lf1);
        patp2f.getElements().add(lf2);
        patp2f.getElements().add(lf3);
        patp2f.getElements().add(lf4);
        patp2f.getElements().add(lf5);
        patp2f.getElements().add(lf6);
        patp2f.getElements().add(lf7);
        patp2f.getElements().add(lf8);
        patp2f.getElements().add(lf9);
        patp2f.getElements().add(lf10);
        patp2f.getElements().add(lf11);
        patp2f.getElements().add(lf12);
        patp2f.setStroke(c4);
        patp2f.setStrokeWidth(1);
        patp2f.setFill(c4);
        root.getChildren().add(patp2f);
        
        NergiManch(x,y);
    }
    
    private void NergiManch(double x, double y){
        Path pa1 = new Path();
        MoveTo mt = new MoveTo(x+17, y-24);
        LineTo l1 = new LineTo(x+21, y-20);
        LineTo l2 = new LineTo(x+23, y-20);
        LineTo l3 = new LineTo(x+25, y-24);
        LineTo l4 = new LineTo(x+25, y-26);
        LineTo l5 = new LineTo(x+21, y-30);
        ClosePath c = new ClosePath();
        
        pa1.getElements().add(mt);
        pa1.getElements().add(l1);
        pa1.getElements().add(l2);
        pa1.getElements().add(l3);
        pa1.getElements().add(l4);
        pa1.getElements().add(l5);
        pa1.getElements().add(c);
        pa1.setStroke(c4);
        pa1.setFill(c4);
        root.getChildren().add(pa1);
        
        Path pa2 = new Path();
        MoveTo mt2 = new MoveTo(x+18, y-32);
        LineTo l21 = new LineTo(x+21, y-34);
        LineTo l22 = new LineTo(x+21, y-36);
        LineTo l23 = new LineTo(x+19, y-36);
        
        pa2.getElements().add(mt2);
        pa2.getElements().add(l21);
        pa2.getElements().add(l22);
        pa2.getElements().add(l23);
        pa2.getElements().add(c);
        pa2.setStroke(c4);
        pa2.setFill(c4);
        root.getChildren().add(pa2);
        
        Path pa3 = new Path();
        MoveTo mt3 = new MoveTo(x+24, y-39);
        LineTo l31 = new LineTo(x+20, y-42);
        LineTo l32 = new LineTo(x+23, y-44);
        LineTo l33 = new LineTo(x+25, y-44);
        
        pa3.getElements().add(mt3);
        pa3.getElements().add(l31);
        pa3.getElements().add(l32);
        pa3.getElements().add(l33);
        pa3.getElements().add(c);
        pa3.setStroke(c4);
        pa3.setFill(c4);
        root.getChildren().add(pa3);
        
        Path pa4 = new Path();
        MoveTo mt4 = new MoveTo(x+52, y-20);
        QuadCurveTo l41 = new QuadCurveTo();
        l41.setX(x+57);
        l41.setY(y-20);
        l41.setControlX(x+54);
        l41.setControlY(y-25);
        LineTo l42 = new LineTo(x+55, y-17);
        LineTo l43 = new LineTo(x+53, y-17);
        
        pa4.getElements().add(mt4);
        pa4.getElements().add(l41);
        pa4.getElements().add(l42);
        pa4.getElements().add(l43);
        pa4.getElements().add(c);
        pa4.setStroke(c4);
        pa4.setFill(c4);
        root.getChildren().add(pa4);
        
        Path pa5 = new Path();
        MoveTo mt5 = new MoveTo(x+48, y-21);
        LineTo l51 = new LineTo(x+47, y-23);
        QuadCurveTo l52 = new QuadCurveTo();
        l52.setX(x+47);
        l52.setY(y-16);
        l52.setControlX(x+38);
        l52.setControlY(y-19);
        LineTo l53 = new LineTo(x+48, y-18);
        
        pa5.getElements().add(mt5);
        pa5.getElements().add(l51);
        pa5.getElements().add(l52);
        pa5.getElements().add(l53);
        pa5.getElements().add(c);
        pa5.setStroke(c4);
        pa5.setFill(c4);
        root.getChildren().add(pa5);
        
        Path pa6 = new Path();
        MoveTo mt6 = new MoveTo(x+45, y-30);
        QuadCurveTo l61 = new QuadCurveTo();
        l61.setX(x+46);
        l61.setY(y-25);
        l61.setControlX(x+42);
        l61.setControlY(y-25);
        LineTo l62 = new LineTo(x+47, y-27);
        LineTo l63 = new LineTo(x+46, y-30);
        
        pa6.getElements().add(mt6);
        pa6.getElements().add(l61);
        pa6.getElements().add(l62);
        pa6.getElements().add(l63);
        pa6.getElements().add(c);
        pa6.setStroke(c4);
        pa6.setFill(c4);
        root.getChildren().add(pa6);
        
        NergiMach2(x,y);
    }
    
    private void NergiMach2(double x, double y) {
        Path pa1 = new Path();
        MoveTo mt = new MoveTo(x+185, y-24);
        LineTo l1 = new LineTo(x+181, y-20);
        LineTo l2 = new LineTo(x+179, y-20);
        LineTo l3 = new LineTo(x+177, y-24);
        LineTo l4 = new LineTo(x+177, y-26);
        LineTo l5 = new LineTo(x+181, y-30);
        ClosePath c = new ClosePath();
        
        pa1.getElements().add(mt);
        pa1.getElements().add(l1);
        pa1.getElements().add(l2);
        pa1.getElements().add(l3);
        pa1.getElements().add(l4);
        pa1.getElements().add(l5);
        pa1.getElements().add(c);
        pa1.setStroke(c4);
        pa1.setFill(c4);
        root.getChildren().add(pa1);
        
        Path pa2 = new Path();
        MoveTo mt2 = new MoveTo(x+184, y-32);
        LineTo l21 = new LineTo(x+181, y-34);
        LineTo l22 = new LineTo(x+181, y-36);
        LineTo l23 = new LineTo(x+183, y-36);
        
        pa2.getElements().add(mt2);
        pa2.getElements().add(l21);
        pa2.getElements().add(l22);
        pa2.getElements().add(l23);
        pa2.getElements().add(c);
        pa2.setStroke(c4);
        pa2.setFill(c4);
        root.getChildren().add(pa2);
        
        Path pa3 = new Path();
        MoveTo mt3 = new MoveTo(x+178, y-39);
        LineTo l31 = new LineTo(x+182, y-42);
        LineTo l32 = new LineTo(x+179, y-44);
        LineTo l33 = new LineTo(x+177, y-44);
        
        pa3.getElements().add(mt3);
        pa3.getElements().add(l31);
        pa3.getElements().add(l32);
        pa3.getElements().add(l33);
        pa3.getElements().add(c);
        pa3.setStroke(c4);
        pa3.setFill(c4);
        root.getChildren().add(pa3);
        
        Path pa4 = new Path();
        MoveTo mt4 = new MoveTo(x+150, y-20);
        QuadCurveTo l41 = new QuadCurveTo();
        l41.setX(x+145);
        l41.setY(y-20);
        l41.setControlX(x+148);
        l41.setControlY(y-25);
        LineTo l42 = new LineTo(x+147, y-17);
        LineTo l43 = new LineTo(x+149, y-17);
        
        pa4.getElements().add(mt4);
        pa4.getElements().add(l41);
        pa4.getElements().add(l42);
        pa4.getElements().add(l43);
        pa4.getElements().add(c);
        pa4.setStroke(c4);
        pa4.setFill(c4);
        root.getChildren().add(pa4);
        
        Path pa5 = new Path();
        MoveTo mt5 = new MoveTo(x+154, y-21);
        LineTo l51 = new LineTo(x+155, y-23);
        QuadCurveTo l52 = new QuadCurveTo();
        l52.setX(x+155);
        l52.setY(y-16);
        l52.setControlX(x+164);
        l52.setControlY(y-19);
        LineTo l53 = new LineTo(x+154, y-18);
        
        pa5.getElements().add(mt5);
        pa5.getElements().add(l51);
        pa5.getElements().add(l52);
        pa5.getElements().add(l53);
        pa5.getElements().add(c);
        pa5.setStroke(c4);
        pa5.setFill(c4);
        root.getChildren().add(pa5);
        
        Path pa6 = new Path();
        MoveTo mt6 = new MoveTo(x+157, y-30);
        QuadCurveTo l61 = new QuadCurveTo();
        l61.setX(x+156);
        l61.setY(y-25);
        l61.setControlX(x+160);
        l61.setControlY(y-25);
        LineTo l62 = new LineTo(x+155, y-27);
        LineTo l63 = new LineTo(x+156, y-30);
        
        pa6.getElements().add(mt6);
        pa6.getElements().add(l61);
        pa6.getElements().add(l62);
        pa6.getElements().add(l63);
        pa6.getElements().add(c);
        pa6.setStroke(c4);
        pa6.setFill(c4);
        root.getChildren().add(pa6);
        
        NergiPuasM(x,y);
    }
    
    private void NergiPuasM(double x, double y) {
        ClosePath c = new ClosePath();
        Path pa = new Path();
        MoveTo mt = new MoveTo(x+101, y-192);
        LineTo l1 = new LineTo(x+96, y-140);
        LineTo l2 = new LineTo(x+101, y-132);
        LineTo l3 = new LineTo(x+106, y-140);
        
        pa.getElements().add(mt);
        pa.getElements().add(l1);
        pa.getElements().add(l2);
        pa.getElements().add(l3);
        pa.getElements().add(c);
        pa.setStroke(c2);
        pa.setFill(c2);
        root.getChildren().add(pa);
        
        Path pa2 = new Path();
        MoveTo mt2 = new MoveTo(x+101, y-125);
        LineTo l21 = new LineTo(x+96, y-95);
        LineTo l22 = new LineTo(x+101, y-100);
        LineTo l23 = new LineTo(x+106, y-95);
        
        pa2.getElements().add(mt2);
        pa2.getElements().add(l21);
        pa2.getElements().add(l22);
        pa2.getElements().add(l23);
        pa2.getElements().add(c);
        pa2.setStroke(c2);
        pa2.setFill(c2);
        root.getChildren().add(pa2);
        
        Path pa3 = new Path();
        MoveTo mt3 = new MoveTo(x+101, y-90);
        LineTo l31 = new LineTo(x+96, y-77);
        LineTo l32 = new LineTo(x+101, y-79);
        LineTo l33 = new LineTo(x+106, y-77);
        
        pa3.getElements().addAll(mt3,l31,l32,l33,c);
        agregar(pa3, c3, 1);
        
        Path pa4 = new Path();
        MoveTo mt4 = new MoveTo(x+101, y-70);
        LineTo l41 = new LineTo(x+96, y-60);
        LineTo l42 = new LineTo(x+101, y-62);
        LineTo l43 = new LineTo(x+106, y-60);
        
        pa4.getElements().addAll(mt4,l41,l42,l43,c);
        agregar(pa4, c3, 1);
        
        Path pa5 = new Path();
        MoveTo mt5 = new MoveTo(x+101, y-52);
        LineTo l51 = new LineTo(x+90, y-44);
        LineTo l52 = new LineTo(x+101, y-37);
        LineTo l53 = new LineTo(x+112, y-44);
        
        pa5.getElements().addAll(mt5,l51,l52,l53,c);
        agregar(pa5, c3, 1);
        
        Path pa6 = new Path();
        MoveTo mt6 = new MoveTo(x+101, y-32);
        LineTo l61 = new LineTo(x+96, y-35);
        LineTo l62 = new LineTo(x+97, y-30);
        LineTo l63 = new LineTo(x+99, y-28);
        LineTo l64 = new LineTo(x+102, y-28);
        LineTo l65 = new LineTo(x+105, y-30);
        LineTo l66 = new LineTo(x+106, y-35);
        
        pa6.getElements().addAll(mt6,l61,l62,l63,l64,l65,l66,c);
        agregar(pa6, c3, 1);
        
        Path pa7 = new Path();
        MoveTo mt7 = new MoveTo(x+101, y-135);
        LineTo l71 = new LineTo(x+98, y-140);
        LineTo l72 = new LineTo(x+104, y-140);
        
        pa7.getElements().addAll(mt7,l71,l72,c);
        agregar(pa7, c3, 1);
        
        Path pa8 = new Path();
        MoveTo mt8 = new MoveTo(x+101, y-100);
        LineTo l81 = new LineTo(x+106, y-95);
        LineTo l82 = new LineTo(x+104, y-108);
        LineTo l83 = new LineTo(x+101, y-106);
        LineTo l84 = new LineTo(x+98, y-108);
        LineTo l85 = new LineTo(x+96, y-95);
        pa8.getElements().addAll(mt8,l81,l82,l83,l84,l85,c);
        agregar(pa8, c3, 1);
        
        NergiLadoA(x,y);
    }
    
    private void NergiLadoA(double x, double y) {
        ClosePath c = new ClosePath();
        Path pa = new Path();
        MoveTo mt = new MoveTo(x+91, y-90);
        LineTo l1 = new LineTo(x+91, y-97);
        LineTo l2 = new LineTo(x+72, y-120);
        LineTo l3 = new LineTo(x+84, y-92);
        pa.getElements().addAll(mt,l1,l2,l3,c);
        agregar(pa, c3, 1);
        
        Path pa2 = new Path();
        MoveTo mt2 = new MoveTo(x+91, y-107);
        LineTo l21 = new LineTo(x+86, y-110);
        LineTo l22 = new LineTo(x+80, y-140);
        LineTo l23 = new LineTo(x+93, y-113);
        pa2.getElements().addAll(mt2,l21,l22,l23,c);
        agregar(pa2, c3, 1);
        
        Path pa3 = new Path();
        MoveTo mt3 = new MoveTo(x+79, y-85);
        LineTo l31 = new LineTo(x+77, y-92);
        LineTo l32 = new LineTo(x+50, y-104);
        LineTo l33 = new LineTo(x+70, y-85);
        pa3.getElements().addAll(mt3,l31,l32,l33,c);
        agregar(pa3, c3, 1);
        
        Path pa4 = new Path();
        MoveTo mt4 = new MoveTo(x+71, y-105);
        LineTo l41 = new LineTo(x+68, y-113);
        LineTo l42 = new LineTo(x+31, y-135);
        LineTo l43 = new LineTo(x+60, y-107);
        pa4.getElements().addAll(mt4,l41,l42,l43,c);
        agregar(pa4, c2, 1);
        
        Path pa5 = new Path();
        MoveTo mt5 = new MoveTo(x+77, y-122);
        LineTo l51 = new LineTo(x+75, y-135);
        LineTo l52 = new LineTo(x+41, y-181);
        LineTo l53 = new LineTo(x+65, y-132);
        pa5.getElements().addAll(mt5,l51,l52,l53,c);
        agregar(pa5, c2, 1);
        
        Path pa6 = new Path();
        MoveTo mt6 = new MoveTo(x+92, y-130);
        LineTo l61 = new LineTo(x+92, y-140);
        LineTo l62 = new LineTo(x+75, y-192);
        LineTo l63 = new LineTo(x+85, y-139);
        pa6.getElements().addAll(mt6,l61,l62,l63,c);
        agregar(pa6, c2, 1);
        
        Path pa7 = new Path();
        MoveTo mt7 = new MoveTo(x+72, y-120);
        LineTo l71 = new LineTo(x+84, y-105);
        LineTo l72 = new LineTo(x+84, y-101);
        LineTo l73 = new LineTo(x+79, y-103);
        pa7.getElements().addAll(mt7,l71,l72,l73,c);
        agregar(pa7, c2, 1);
        
        Path pa8 = new Path();
        MoveTo mt8 = new MoveTo(x+80, y-140);
        LineTo l81 = new LineTo(x+88, y-123);
        LineTo l82 = new LineTo(x+87, y-118);
        LineTo l83 = new LineTo(x+84, y-121);
        pa8.getElements().addAll(mt8,l81,l82,l83,c);
        agregar(pa8, c2, 1);
        
        Path pa9 = new Path();
        MoveTo mt9 = new MoveTo(x+50, y-104);
        LineTo l91 = new LineTo(x+70, y-95);
        LineTo l92 = new LineTo(x+73, y-90);
        LineTo l93 = new LineTo(x+66, y-90);
        pa9.getElements().addAll(mt9,l91,l92,l93,c);
        agregar(pa9, c2, 1);
        
        Path pa10 = new Path();
        MoveTo mt10 = new MoveTo(x+66, y-113);
        LineTo l101 = new LineTo(x+67, y-108);
        LineTo l102 = new LineTo(x+61, y-108);
        pa10.getElements().addAll(mt10,l101,l102,c);
        agregar(pa10, c3, 1);
        
        Path pa11 = new Path();
        MoveTo mt11 = new MoveTo(x+74, y-126);
        LineTo l111 = new LineTo(x+73, y-136);
        LineTo l112 = new LineTo(x+68, y-132);
        pa11.getElements().addAll(mt11,l111,l112,c);
        agregar(pa11, c3, 1);
        
        Path pa12 = new Path();
        MoveTo mt12 = new MoveTo(x+91, y-133);
        LineTo l121 = new LineTo(x+91, y-140);
        LineTo l122 = new LineTo(x+86, y-139);
        pa12.getElements().addAll(mt12,l121,l122,c);
        agregar(pa12, c3, 1);
        
        Path pa13 = new Path();
        MoveTo mt13 = new MoveTo(x+93, y-44);
        LineTo l131 = new LineTo(x+91, y-64);
        CubicCurveTo l132 = new CubicCurveTo(); 
        l132.setX(x+23);
        l132.setY(y-105);
        l132.setControlX1(x+75);
        l132.setControlY1(y-90);
        l132.setControlX2(x+40);
        l132.setControlY2(y-65);
        CubicCurveTo l133 = new CubicCurveTo(); 
        l133.setX(x+93);
        l133.setY(y-44);
        l133.setControlX1(x+25);
        l133.setControlY1(y-50);
        l133.setControlX2(x+50);
        l133.setControlY2(y-35);
        pa13.getElements().addAll(mt13,l131,l132,l133,c);
        agregar(pa13, c7, 1);
        
        Path pa14 = new Path();
        MoveTo mt14 = new MoveTo(x+23, y-105);
        QuadCurveTo l141 = new QuadCurveTo();
        l141.setX(x+27);
        l141.setY(y-75);
        l141.setControlX(x+25);
        l141.setControlY(y-90);
        LineTo l142 = new LineTo(x+29, y-82);
        LineTo l143 = new LineTo(x+35, y-76);
        LineTo l144 = new LineTo(x+33, y-85);
        LineTo l145 = new LineTo(x+37, y-86);
        pa14.getElements().addAll(mt14,l141,l142,l143,l144,l145,c);
        agregar(pa14, c2, 1);
        
        Path pa15 = new Path();
        MoveTo mt15 = new MoveTo(x+91, y-42);
        LineTo l151 = new LineTo(x+88, y-42);
        QuadCurveTo l152 = new QuadCurveTo();
        l152.setX(x+94);
        l152.setY(y-35);
        l152.setControlX(x+85);
        l152.setControlY(y-35);
        LineTo l153 = new LineTo(x+95, y-39);
        pa15.getElements().addAll(mt15,l151,l152,l153,c);
        agregar(pa15, c6, 1);
        
        Path pa16 = new Path();
        MoveTo mt16 = new MoveTo(x+91, y-42);
        CubicCurveTo l161 = new CubicCurveTo();
        l161.setX(x+95);
        l161.setY(y-39);
        l161.setControlX1(x+85);
        l161.setControlY1(y-40);
        l161.setControlX2(x+93);
        l161.setControlY2(y-34);
        pa16.getElements().addAll(mt16,l161,c);
        agregar(pa16, c5, 1);
        
        Path pa17 = new Path();
        MoveTo mt17 = new MoveTo(x+83, y-36);
        LineTo l171 = new LineTo(x+86, y-34);
        LineTo l172 = new LineTo(x+84, y-26);
        pa17.getElements().addAll(mt17,l171,l172,c);
        agregar(pa17, c3, 1);
        
        Path pa18 = new Path();
        MoveTo mt18 = new MoveTo(x+89, y-32);
        LineTo l181 = new LineTo(x+93, y-30);
        LineTo l182 = new LineTo(x+90, y-22);
        pa18.getElements().addAll(mt18,l181,l182,c);
        agregar(pa18, c3, 1);
        
        Path pa19 = new Path();
        MoveTo mt19 = new MoveTo(x+94, y-20);
        LineTo l191 = new LineTo(x+99, y-20);
        LineTo l192 = new LineTo(x+97, y-27);
        pa19.getElements().addAll(mt19,l191,l192,c);
        agregar(pa19, c3, 1);
        
        Path pa20 = new Path();
        MoveTo mt20 = new MoveTo(x+85, y-46);
        LineTo l201 = new LineTo(x+88, y-52);
        LineTo l202 = new LineTo(x+81, y-53);
        pa20.getElements().addAll(mt20,l201,l202,c);
        agregar(pa20, c2, 1);
        
        Path pa21 = new Path();
        MoveTo mt21 = new MoveTo(x+75, y-50);
        LineTo l211 = new LineTo(x+78, y-56);
        LineTo l212 = new LineTo(x+71, y-57);
        pa21.getElements().addAll(mt21,l211,l212,c);
        agregar(pa21, c2, 1);
        
        Path pa22 = new Path();
        MoveTo mt22 = new MoveTo(x+65, y-55);
        LineTo l221 = new LineTo(x+68, y-61);
        LineTo l222 = new LineTo(x+61, y-61);
        pa22.getElements().addAll(mt22,l221,l222,c);
        agregar(pa22, c2, 1);
        
        Path pa23 = new Path();
        MoveTo mt23 = new MoveTo(x+55, y-60);
        LineTo l231 = new LineTo(x+58, y-66);
        LineTo l232 = new LineTo(x+51, y-66);
        pa23.getElements().addAll(mt23,l231,l232,c);
        agregar(pa23, c2, 1);
        
        Path pa24 = new Path();
        MoveTo mt24 = new MoveTo(x+45, y-66);
        LineTo l241 = new LineTo(x+48, y-72);
        LineTo l242 = new LineTo(x+41, y-72);
        pa24.getElements().addAll(mt24,l241,l242,c);
        agregar(pa24, c2, 1);
        
        Path pa25 = new Path();
        MoveTo mt25 = new MoveTo(x+85, y-58);
        LineTo l251 = new LineTo(x+88, y-64);
        LineTo l252 = new LineTo(x+81, y-64);
        pa25.getElements().addAll(mt25,l251,l252,c);
        agregar(pa25, c2, 1);
        
        Path pa26 = new Path();
        MoveTo mt26 = new MoveTo(x+75, y-62);
        LineTo l261 = new LineTo(x+78, y-68);
        LineTo l262 = new LineTo(x+71, y-68);
        pa26.getElements().addAll(mt26,l261,l262,c);
        agregar(pa26, c2, 1);
        
        Path pa27 = new Path();
        MoveTo mt27 = new MoveTo(x+65, y-66);
        LineTo l271 = new LineTo(x+68, y-72);
        LineTo l272 = new LineTo(x+61, y-72);
        pa27.getElements().addAll(mt27,l271,l272,c);
        agregar(pa27, c2, 1);
        
        Path pa28 = new Path();
        MoveTo mt28 = new MoveTo(x+56, y-70);
        LineTo l281 = new LineTo(x+57, y-76);
        LineTo l282 = new LineTo(x+50, y-76);
        pa28.getElements().addAll(mt28,l281,l282,c);
        agregar(pa28, c2, 1);
        
        Path pa29 = new Path();
        MoveTo mt29 = new MoveTo(x+46, y-76);
        LineTo l291 = new LineTo(x+45, y-80);
        LineTo l292 = new LineTo(x+41, y-79);
        pa29.getElements().addAll(mt29,l291,l292,c);
        agregar(pa29, c2, 1);
        
        Path pa30 = new Path();
        MoveTo mt30 = new MoveTo(x+67, y-44);
        LineTo l301 = new LineTo(x+70, y-50);
        LineTo l302 = new LineTo(x+63, y-51);
        pa30.getElements().addAll(mt30,l301,l302,c);
        agregar(pa30, c2, 1);
        
        Path pa31 = new Path();
        MoveTo mt31 = new MoveTo(x+55, y-47);
        LineTo l311 = new LineTo(x+58, y-53);
        LineTo l312 = new LineTo(x+51, y-55);
        pa31.getElements().addAll(mt31,l311,l312,c);
        agregar(pa31, c2, 1);
        
        Path pa32 = new Path();
        MoveTo mt32 = new MoveTo(x+45, y-50);
        LineTo l321 = new LineTo(x+48, y-56);
        LineTo l322 = new LineTo(x+41, y-58);
        pa32.getElements().addAll(mt32,l321,l322,c);
        agregar(pa32, c2, 1);
        
        Path pa33 = new Path();
        MoveTo mt33 = new MoveTo(x+37, y-58);
        LineTo l331 = new LineTo(x+40, y-64);
        LineTo l332 = new LineTo(x+33, y-66);
        pa33.getElements().addAll(mt33,l331,l332,c);
        agregar(pa33, c2, 1);
        
        NergiLadoB(x,y);
    }
    
    private void NergiLadoB(double x, double y) {
        ClosePath c = new ClosePath();
        Path pa = new Path();
        MoveTo mt = new MoveTo(x+111, y-90);
        LineTo l1 = new LineTo(x+111, y-97);
        LineTo l2 = new LineTo(x+130, y-120);
        LineTo l3 = new LineTo(x+118, y-92);
        pa.getElements().addAll(mt,l1,l2,l3,c);
        agregar(pa, c3, 1);
        
        Path pa2 = new Path();
        MoveTo mt2 = new MoveTo(x+111, y-107);
        LineTo l21 = new LineTo(x+116, y-110);
        LineTo l22 = new LineTo(x+122, y-140);
        LineTo l23 = new LineTo(x+109, y-113);
        pa2.getElements().addAll(mt2,l21,l22,l23,c);
        agregar(pa2, c3, 1);
        
        Path pa3 = new Path();
        MoveTo mt3 = new MoveTo(x+123, y-85);
        LineTo l31 = new LineTo(x+125, y-92);
        LineTo l32 = new LineTo(x+152, y-104);
        LineTo l33 = new LineTo(x+132, y-85);
        pa3.getElements().addAll(mt3,l31,l32,l33,c);
        agregar(pa3, c3, 1);
        
        Path pa4 = new Path();
        MoveTo mt4 = new MoveTo(x+131, y-105);
        LineTo l41 = new LineTo(x+134, y-113);
        LineTo l42 = new LineTo(x+171, y-135);
        LineTo l43 = new LineTo(x+142, y-107);
        pa4.getElements().addAll(mt4,l41,l42,l43,c);
        agregar(pa4, c2, 1);
        
        Path pa5 = new Path();
        MoveTo mt5 = new MoveTo(x+125, y-122);
        LineTo l51 = new LineTo(x+127, y-135);
        LineTo l52 = new LineTo(x+161, y-181);
        LineTo l53 = new LineTo(x+137, y-132);
        pa5.getElements().addAll(mt5,l51,l52,l53,c);
        agregar(pa5, c2, 1);
        
        Path pa6 = new Path();
        MoveTo mt6 = new MoveTo(x+110, y-130);
        LineTo l61 = new LineTo(x+110, y-140);
        LineTo l62 = new LineTo(x+127, y-192);
        LineTo l63 = new LineTo(x+117, y-139);
        pa6.getElements().addAll(mt6,l61,l62,l63,c);
        agregar(pa6, c2, 1);
        
        Path pa7 = new Path();
        MoveTo mt7 = new MoveTo(x+130, y-120);
        LineTo l71 = new LineTo(x+118, y-105);
        LineTo l72 = new LineTo(x+118, y-101);
        LineTo l73 = new LineTo(x+123, y-103);
        pa7.getElements().addAll(mt7,l71,l72,l73,c);
        agregar(pa7, c2, 1);
        
        Path pa8 = new Path();
        MoveTo mt8 = new MoveTo(x+122, y-140);
        LineTo l81 = new LineTo(x+114, y-123);
        LineTo l82 = new LineTo(x+115, y-118);
        LineTo l83 = new LineTo(x+118, y-121);
        pa8.getElements().addAll(mt8,l81,l82,l83,c);
        agregar(pa8, c2, 1);
        
        Path pa9 = new Path();
        MoveTo mt9 = new MoveTo(x+152, y-104);
        LineTo l91 = new LineTo(x+132, y-95);
        LineTo l92 = new LineTo(x+129, y-90);
        LineTo l93 = new LineTo(x+136, y-90);
        pa9.getElements().addAll(mt9,l91,l92,l93,c);
        agregar(pa9, c2, 1);
        
        Path pa10 = new Path();
        MoveTo mt10 = new MoveTo(x+136, y-113);
        LineTo l101 = new LineTo(x+135, y-108);
        LineTo l102 = new LineTo(x+141, y-108);
        pa10.getElements().addAll(mt10,l101,l102,c);
        agregar(pa10, c3, 1);
        
        Path pa11 = new Path();
        MoveTo mt11 = new MoveTo(x+128, y-126);
        LineTo l111 = new LineTo(x+129, y-136);
        LineTo l112 = new LineTo(x+134, y-132);
        pa11.getElements().addAll(mt11,l111,l112,c);
        agregar(pa11, c3, 1);
        
        Path pa12 = new Path();
        MoveTo mt12 = new MoveTo(x+111, y-133);
        LineTo l121 = new LineTo(x+111, y-140);
        LineTo l122 = new LineTo(x+116, y-139);
        pa12.getElements().addAll(mt12,l121,l122,c);
        agregar(pa12, c3, 1);
        
        Path pa13 = new Path();
        MoveTo mt13 = new MoveTo(x+109, y-44);
        LineTo l131 = new LineTo(x+111, y-64);
        CubicCurveTo l132 = new CubicCurveTo(); 
        l132.setX(x+179);
        l132.setY(y-105);
        l132.setControlX1(x+127);
        l132.setControlY1(y-90);
        l132.setControlX2(x+162);
        l132.setControlY2(y-65);
        CubicCurveTo l133 = new CubicCurveTo(); 
        l133.setX(x+109);
        l133.setY(y-44);
        l133.setControlX1(x+177);
        l133.setControlY1(y-50);
        l133.setControlX2(x+152);
        l133.setControlY2(y-35);
        pa13.getElements().addAll(mt13,l131,l132,l133,c);
        agregar(pa13, c7, 1);
        
        Path pa14 = new Path();
        MoveTo mt14 = new MoveTo(x+179, y-105);
        QuadCurveTo l141 = new QuadCurveTo();
        l141.setX(x+175);
        l141.setY(y-75);
        l141.setControlX(x+177);
        l141.setControlY(y-90);
        LineTo l142 = new LineTo(x+173, y-82);
        LineTo l143 = new LineTo(x+167, y-76);
        LineTo l144 = new LineTo(x+169, y-85);
        LineTo l145 = new LineTo(x+165, y-86);
        pa14.getElements().addAll(mt14,l141,l142,l143,l144,l145,c);
        agregar(pa14, c2, 1);
        
        Path pa15 = new Path();
        MoveTo mt15 = new MoveTo(x+111, y-42);
        LineTo l151 = new LineTo(x+114, y-42);
        QuadCurveTo l152 = new QuadCurveTo();
        l152.setX(x+108);
        l152.setY(y-35);
        l152.setControlX(x+117);
        l152.setControlY(y-35);
        LineTo l153 = new LineTo(x+107, y-39);
        pa15.getElements().addAll(mt15,l151,l152,l153,c);
        agregar(pa15, c6, 1);
        
        Path pa16 = new Path();
        MoveTo mt16 = new MoveTo(x+111, y-42);
        CubicCurveTo l161 = new CubicCurveTo();
        l161.setX(x+107);
        l161.setY(y-39);
        l161.setControlX1(x+117);
        l161.setControlY1(y-40);
        l161.setControlX2(x+109);
        l161.setControlY2(y-34);
        pa16.getElements().addAll(mt16,l161,c);
        agregar(pa16, c5, 1);
        
        Path pa17 = new Path();
        MoveTo mt17 = new MoveTo(x+119, y-36);
        LineTo l171 = new LineTo(x+116, y-34);
        LineTo l172 = new LineTo(x+118, y-26);
        pa17.getElements().addAll(mt17,l171,l172,c);
        agregar(pa17, c3, 1);
        
        Path pa18 = new Path();
        MoveTo mt18 = new MoveTo(x+113, y-32);
        LineTo l181 = new LineTo(x+109, y-30);
        LineTo l182 = new LineTo(x+112, y-22);
        pa18.getElements().addAll(mt18,l181,l182,c);
        agregar(pa18, c3, 1);
        
        Path pa19 = new Path();
        MoveTo mt19 = new MoveTo(x+108, y-20);
        LineTo l191 = new LineTo(x+103, y-20);
        LineTo l192 = new LineTo(x+105, y-27);
        pa19.getElements().addAll(mt19,l191,l192,c);
        agregar(pa19, c3, 1);
        
        Path pa20 = new Path();
        MoveTo mt20 = new MoveTo(x+117, y-46);
        LineTo l201 = new LineTo(x+114, y-52);
        LineTo l202 = new LineTo(x+121, y-53);
        pa20.getElements().addAll(mt20,l201,l202,c);
        agregar(pa20, c2, 1);
        
        Path pa21 = new Path();
        MoveTo mt21 = new MoveTo(x+127, y-50);
        LineTo l211 = new LineTo(x+124, y-56);
        LineTo l212 = new LineTo(x+131, y-57);
        pa21.getElements().addAll(mt21,l211,l212,c);
        agregar(pa21, c2, 1);
        
        Path pa22 = new Path();
        MoveTo mt22 = new MoveTo(x+137, y-55);
        LineTo l221 = new LineTo(x+134, y-61);
        LineTo l222 = new LineTo(x+141, y-61);
        pa22.getElements().addAll(mt22,l221,l222,c);
        agregar(pa22, c2, 1);
        
        Path pa23 = new Path();
        MoveTo mt23 = new MoveTo(x+147, y-60);
        LineTo l231 = new LineTo(x+144, y-66);
        LineTo l232 = new LineTo(x+151, y-66);
        pa23.getElements().addAll(mt23,l231,l232,c);
        agregar(pa23, c2, 1);
        
        Path pa24 = new Path();
        MoveTo mt24 = new MoveTo(x+157, y-66);
        LineTo l241 = new LineTo(x+154, y-72);
        LineTo l242 = new LineTo(x+161, y-72);
        pa24.getElements().addAll(mt24,l241,l242,c);
        agregar(pa24, c2, 1);
        
        Path pa25 = new Path();
        MoveTo mt25 = new MoveTo(x+117, y-58);
        LineTo l251 = new LineTo(x+114, y-64);
        LineTo l252 = new LineTo(x+121, y-64);
        pa25.getElements().addAll(mt25,l251,l252,c);
        agregar(pa25, c2, 1);
        
        Path pa26 = new Path();
        MoveTo mt26 = new MoveTo(x+127, y-62);
        LineTo l261 = new LineTo(x+124, y-68);
        LineTo l262 = new LineTo(x+131, y-68);
        pa26.getElements().addAll(mt26,l261,l262,c);
        agregar(pa26, c2, 1);
        
        Path pa27 = new Path();
        MoveTo mt27 = new MoveTo(x+137, y-66);
        LineTo l271 = new LineTo(x+134, y-72);
        LineTo l272 = new LineTo(x+141, y-72);
        pa27.getElements().addAll(mt27,l271,l272,c);
        agregar(pa27, c2, 1);
        
        Path pa28 = new Path();
        MoveTo mt28 = new MoveTo(x+146, y-70);
        LineTo l281 = new LineTo(x+145, y-76);
        LineTo l282 = new LineTo(x+152, y-76);
        pa28.getElements().addAll(mt28,l281,l282,c);
        agregar(pa28, c2, 1);
        
        Path pa29 = new Path();
        MoveTo mt29 = new MoveTo(x+156, y-76);
        LineTo l291 = new LineTo(x+157, y-80);
        LineTo l292 = new LineTo(x+161, y-79);
        pa29.getElements().addAll(mt29,l291,l292,c);
        agregar(pa29, c2, 1);
        
        Path pa30 = new Path();
        MoveTo mt30 = new MoveTo(x+135, y-44);
        LineTo l301 = new LineTo(x+132, y-50);
        LineTo l302 = new LineTo(x+139, y-51);
        pa30.getElements().addAll(mt30,l301,l302,c);
        agregar(pa30, c2, 1);
        
        Path pa31 = new Path();
        MoveTo mt31 = new MoveTo(x+147, y-47);
        LineTo l311 = new LineTo(x+144, y-53);
        LineTo l312 = new LineTo(x+151, y-55);
        pa31.getElements().addAll(mt31,l311,l312,c);
        agregar(pa31, c2, 1);
        
        Path pa32 = new Path();
        MoveTo mt32 = new MoveTo(x+157, y-50);
        LineTo l321 = new LineTo(x+154, y-56);
        LineTo l322 = new LineTo(x+161, y-58);
        pa32.getElements().addAll(mt32,l321,l322,c);
        agregar(pa32, c2, 1);
        
        Path pa33 = new Path();
        MoveTo mt33 = new MoveTo(x+165, y-58);
        LineTo l331 = new LineTo(x+162, y-64);
        LineTo l332 = new LineTo(x+169, y-66);
        pa33.getElements().addAll(mt33,l331,l332,c);
        agregar(pa33, c2, 1);
        
        NergiGarrasA(x,y);
    }
    
    private void NergiGarrasA(double x, double y) {
        
        Path pa = new Path();
        MoveTo mt = new MoveTo(x+3, y);
        LineTo l1 = new LineTo(x+2, y-3);
        LineTo l2 = new LineTo(x-4, y+1);
        LineTo l3 = new LineTo(x-3, y+5);
        LineTo l4 = new LineTo(x-2, y+2);
        pa.getElements().addAll(mt,l1,l2,l3,l4);
        agregar(pa, c3, 1);
        
        Path pa2 = new Path();
        MoveTo mt2 = new MoveTo(x+15, y-2);
        LineTo l21 = new LineTo(x+12, y-5);
        LineTo l22 = new LineTo(x+7, y+1);
        LineTo l23 = new LineTo(x+7, y+5);
        pa2.getElements().addAll(mt2,l21,l22,l23);
        agregar(pa2, c3, 1);
        
        Path pa3 = new Path();
        MoveTo mt3 = new MoveTo(x+25, y-3);
        LineTo l31 = new LineTo(x+23, y-6);
        LineTo l32 = new LineTo(x+17, y+3);
        LineTo l33 = new LineTo(x+20, y+5);
        LineTo l34 = new LineTo(x+18, y+4);
        pa3.getElements().addAll(mt3,l31,l32,l33,l34);
        agregar(pa3, c3, 1);
        
        Path pa4 = new Path();
        MoveTo mt4 = new MoveTo(x+34, y-7);
        LineTo l41 = new LineTo(x+30, y+6);
        LineTo l42 = new LineTo(x+36, y+2);
        pa4.getElements().addAll(mt4,l41,l42);
        agregar(pa4, c3, 1);
        
        Path pa5 = new Path();
        MoveTo mt5 = new MoveTo(x+46, y-12);
        LineTo l51 = new LineTo(x+40, y-12);
        LineTo l52 = new LineTo(x+38, y);
        pa5.getElements().addAll(mt5,l51,l52);
        agregar(pa5, c3, 1);
        
        Path pa6 = new Path();
        MoveTo mt6 = new MoveTo(x+58, y-13);
        LineTo l61 = new LineTo(x+55, y-13);
        QuadCurveTo l62 = new QuadCurveTo();
        l62.setX(x+47);
        l62.setY(y+2);
        l62.setControlX(x+45);
        l62.setControlY(y-14);
        pa6.getElements().addAll(mt6,l61,l62);
        agregar(pa6, c3, 1);
        
        Path pa7 = new Path();
        MoveTo mt7 = new MoveTo(x+65, y-5);
        QuadCurveTo l71 = new QuadCurveTo();
        l71.setX(x+57);
        l71.setY(y+2);
        l71.setControlX(x+58);
        l71.setControlY(y-10);
        pa6.getElements().addAll(mt7,l71);
        agregar(pa7, c3, 1);
        
        NergiGarrasB(x,y);
    }
    
    private void NergiGarrasB(double x, double y) {
        
        Path pa = new Path();
        MoveTo mt = new MoveTo(x+199, y);
        LineTo l1 = new LineTo(x+202, y-2);
        LineTo l2 = new LineTo(x+206, y+1);
        LineTo l3 = new LineTo(x+205, y+5);
        LineTo l4 = new LineTo(x+204, y+2);
        pa.getElements().addAll(mt,l1,l2,l3,l4);
        agregar(pa, c3, 1);
        
        Path pa2 = new Path();
        MoveTo mt2 = new MoveTo(x+187, y-2);
        LineTo l21 = new LineTo(x+190, y-5);
        LineTo l22 = new LineTo(x+195, y+1);
        LineTo l23 = new LineTo(x+195, y+5);
        pa2.getElements().addAll(mt2,l21,l22,l23);
        agregar(pa2, c3, 1);
        
        Path pa3 = new Path();
        MoveTo mt3 = new MoveTo(x+177, y-3);
        LineTo l31 = new LineTo(x+179, y-6);
        LineTo l32 = new LineTo(x+185, y+3);
        LineTo l33 = new LineTo(x+182, y+5);
        LineTo l34 = new LineTo(x+184, y+4);
        pa3.getElements().addAll(mt3,l31,l32,l33,l34);
        agregar(pa3, c3, 1);
        
        Path pa4 = new Path();
        MoveTo mt4 = new MoveTo(x+168, y-7);
        LineTo l41 = new LineTo(x+172, y+6);
        LineTo l42 = new LineTo(x+166, y+2);
        pa4.getElements().addAll(mt4,l41,l42);
        agregar(pa4, c3, 1);
        
        Path pa5 = new Path();
        MoveTo mt5 = new MoveTo(x+156, y-12);
        LineTo l51 = new LineTo(x+162, y-12);
        LineTo l52 = new LineTo(x+164, y);
        pa5.getElements().addAll(mt5,l51,l52);
        agregar(pa5, c3, 1);
        
        Path pa6 = new Path();
        MoveTo mt6 = new MoveTo(x+144, y-13);
        LineTo l61 = new LineTo(x+147, y-13);
        QuadCurveTo l62 = new QuadCurveTo();
        l62.setX(x+155);
        l62.setY(y+2);
        l62.setControlX(x+157);
        l62.setControlY(y-14);
        pa6.getElements().addAll(mt6,l61,l62);
        agregar(pa6, c3, 1);
        
        Path pa7 = new Path();
        MoveTo mt7 = new MoveTo(x+137, y-5);
        QuadCurveTo l71 = new QuadCurveTo();
        l71.setX(x+145);
        l71.setY(y+2);
        l71.setControlX(x+144);
        l71.setControlY(y-10);
        pa6.getElements().addAll(mt7,l71);
        agregar(pa7, c3, 1);
    }
    
    public void agregar(Path p, Color co, int gr){
        p.setStroke(co);
        p.setStrokeWidth(gr);
        p.setFill(co);
        root.getChildren().add(p);
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    

    

}

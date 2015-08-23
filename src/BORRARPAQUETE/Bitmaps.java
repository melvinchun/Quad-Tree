/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BORRARPAQUETE;

/**
 *
 * @author guitartsword
 */
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Random;

public class Bitmaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        //TAMAÑO DE LA IMAGEN
        int sizeX = 1000;
        int sizeY = 1000;
        //MIDE LA EFICIENCIA DEL PROGRAMA
        long start = System.nanoTime();
        //CREA UNA NUEVA IMAGEN
                                            //width, height, type
        BufferedImage image= new BufferedImage(sizeX,sizeY,BufferedImage.TYPE_3BYTE_BGR);
        
        //RELLANA TODA LA IMAGEN DE COLO BLANCO
        int cont=-70000;
        for(int i = 0; i< sizeX; i++){
            long startSetRGB = System.nanoTime();
            for (int j = 0; j < sizeY; j++) {
                image.setRGB(i, j, cont++);//imagen en el pixel i,j con color Blanco
            }
            long endSetRGB = System.nanoTime();
            System.out.println("Tiempo para finalizar fila: " + (endSetRGB-startSetRGB)/1000 + "microseg");
        }
        //Metodo para cortar :') PROTOTIPO!
        /*cutImage(image, Color.BLACK.getRGB(), 1);
        cutImage(image, Color.BLACK.getRGB(), 2);
        cutImage(image, Color.BLACK.getRGB(), 3);
        cutImage(image, Color.BLACK.getRGB(), 4);*/
        
        //EXPORTA LA IMAGEN
        try {
            File outputfile = new File("./Imagenes Generadas/image.bmp");
            ImageIO.write(image, "bmp", outputfile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        long end = System.nanoTime();
        long totalTime = end - start;
        long nano = totalTime%1000000 ;
        long milli = (totalTime/1000000)%1000;
        long secs = (totalTime/1000000/1000);
        System.out.println(secs + "sec " + milli + "ms " + nano + "ns");
    }

    private static void cutImage(BufferedImage image, int colorRGB, int quadrant) {
        for(int i = 0; i < image.getWidth(); i++){
            image.setRGB(i, image.getHeight()/2, colorRGB);
        }
        for(int i = 0; i < image.getHeight(); i++){
            image.setRGB(image.getWidth()/2, i, colorRGB);
        }
        int random = new Random().nextInt(5);
        if(image.getHeight()<4 || image.getWidth()< 4){
            random = 0;
        }
        System.out.println("Random = " + random);
        if(quadrant == 1){
                            //.getSubimage(INICIO en X, INICIO en Y, ancho, alto)
            cutImage(image.getSubimage(image.getWidth()/2, 0, image.getWidth()/2, image.getHeight()/2), colorRGB, random);
            cutImage(image.getSubimage(image.getWidth()/2, 0, image.getWidth()/2, image.getHeight()/2), colorRGB, random);
        }
        if(quadrant == 2){
            cutImage(image.getSubimage(0, 0, image.getWidth()/2, image.getHeight()/2), colorRGB, random);
            cutImage(image.getSubimage(0, 0, image.getWidth()/2, image.getHeight()/2), colorRGB, random);
        }
        if(quadrant == 3){
            cutImage(image.getSubimage(0, image.getHeight()/2, image.getWidth()/2, image.getHeight()/2), colorRGB, random);
            cutImage(image.getSubimage(0, image.getHeight()/2, image.getWidth()/2, image.getHeight()/2), colorRGB, random);
        }
        if(quadrant == 4){
            cutImage(image.getSubimage(image.getWidth()/2, image.getHeight()/2, image.getWidth()/2, image.getHeight()/2), colorRGB, random);
            cutImage(image.getSubimage(image.getWidth()/2, image.getHeight()/2, image.getWidth()/2, image.getHeight()/2), colorRGB, random);
        }
    }
}
package game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Data {
	private ImageIcon imgfondo;
	private Map<String, Image> Letras;
	private Image imagefleca;
	private BufferedImage bfimg;
	
	public Data() {
		
	}
	
	public ImageIcon Cargafondomenu() {
		imgfondo = new ImageIcon("img/fondomenu.png");
		return imgfondo;
	}
	
	public Map<String, Image> Cargaletras() {
		Letras = new HashMap<>();
		int posx = 420;
		int posy = 26;
		int width = 28;
		int height = 29;
		try {
			bfimg = ImageIO.read(new File("img/letra.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 65; i <= 90; i++) {
			Letras.put(""+(char)i, bfimg.getSubimage(posx, posy, width, height));
			posx+=width;
			if (posx >= 504) {
				posx = 0;
				posy+=height;
			}
		}
		
		return Letras;
	}
	
	public Image Cargafleca() {
		//imagefleca = Toolkit.getDefaultToolkit().createImage("flecha-animada.gif");
		imagefleca = new ImageIcon("img/flecha-animada.gif").getImage();
		return imagefleca;
	}
	
	
}

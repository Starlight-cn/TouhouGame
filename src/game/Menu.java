package game;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Map;

import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import actions.ActionMenu;

public class Menu extends JPanel {
	private Data data;
	private Image imgfleca;
	private ImageIcon imgfondo;
	private GameStart gamestart;
	private ActionMenu actionmenu;
	private Map<String, Image> imgletras;
	private int posxpalabra, posypalabra = 420, numpalabra = 1;
	private int posxflecha = 20, posyflecha = 420;
	
	public Menu(GameStart gameStart) {
		this.gamestart = gameStart;
		data = new Data();
		actionmenu = new ActionMenu(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		imgfondo = data.Cargafondomenu();
		imgfondo.paintIcon(this, g, -580, 0);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		imgletras = data.Cargaletras();
		imgfleca = data.Cargafleca();
		DibujaLetraMenu(g, "START");
		DibujaLetraMenu(g, "OPTION");
		DibujaLetraMenu(g, "EXIT");
		g.drawImage(imgfleca, posxflecha, posyflecha, 30, 30, this);
	}

	private void DibujaLetraMenu(Graphics g, String str) {
		// TODO Auto-generated method stub
		if (numpalabra > 3) {
			posypalabra = 420;
			numpalabra = 1;
		}
		posxpalabra = 50*numpalabra;
		for (int i = 0; i < str.length(); i++) {
			for (Map.Entry<String, Image> entry : imgletras.entrySet()) {
				if ((str.charAt(i)+"").equals(entry.getKey())) {
					g.drawImage(entry.getValue(), posxpalabra, posypalabra, 28, 29, null);
					break;
				}
			}
			posxpalabra+=28;
		}
		
		posypalabra+=29*2;
		numpalabra++;
		
	}

	public int getPosxflecha() {
		return posxflecha;
	}

	public void setPosxflecha(int posxflecha) {
		this.posxflecha = posxflecha;
	}

	public int getPosyflecha() {
		return posyflecha;
	}

	public void setPosyflecha(int posyflecha) {
		this.posyflecha = posyflecha;
	}
}

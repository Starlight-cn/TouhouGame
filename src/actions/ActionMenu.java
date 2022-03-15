package actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.Menu;

public class ActionMenu {
	private Menu menu;
	
	public ActionMenu(Menu menu) {
		this.menu = menu;
			
		menu.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_UP && menu.getPosxflecha() > 50) {
					menu.setPosxflecha(menu.getPosxflecha()-50);
					menu.setPosyflecha(menu.getPosyflecha()-58);
					menu.repaint();
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN && menu.getPosxflecha() < 100) {
					menu.setPosxflecha(menu.getPosxflecha()+50);
					menu.setPosyflecha(menu.getPosyflecha()+58);
					menu.repaint();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}

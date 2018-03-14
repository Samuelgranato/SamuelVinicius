package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//A expressão "implements ActionListener" estabelece
//que objetos dessa classe podem reagir ao relógio.
public class Controller implements ActionListener, KeyListener {
	private Model model;
	private View view;
	public HumanPlayer humanPlayer;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		humanPlayer = new HumanPlayer(0, 0);
	}

	// Esse método especial, que a expressão "implements ActionListener"
	// obriga a ter, é o método chamado pelo relógio a cada segundo.
	@Override
	public void actionPerformed(ActionEvent event) {
		model.update();
		view.repaint();
	}

	@Override
	public void keyPressed(KeyEvent event) {
		if(event.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("pressionei cima!");        
			int rowShift=-1;
	        int colShift=0;
	        model.updatePlayer(rowShift, colShift);
		}else{
			if(event.getKeyCode() == KeyEvent.VK_DOWN) {
				System.out.println("pressionei baixo!");
				int rowShift=1;
				int colShift=0;
				model.updatePlayer(rowShift, colShift);
			}else{
				if(event.getKeyCode() == KeyEvent.VK_LEFT) {
					System.out.println("pressionei esquerda!");
					int rowShift=0;
					int colShift=-1;
					model.updatePlayer(rowShift, colShift);
				}else{
					if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
						System.out.println("pressionei direita!");
						int rowShift=0;
						int colShift=1;
						model.updatePlayer(rowShift, colShift);
					}
				}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}

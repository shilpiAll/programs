package com.BrainMentors.games;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;

import javax.swing.JPanel;

import com.BrainMentors.games.utils.GameConstants;
import com.BrainMentors.games.utils.GameUtils;

public class Board extends JPanel implements GameConstants{
	private Timer timer;
	private GameUtils gameUtils;
	final int SPEED = 30;
	public Board()
	{
		gameUtils = new GameUtils(SPEED);
		setSize(GAME_WIDTH, GAME_HEIGHT);
		setBackground(Color.CYAN);
		gameloop();
	}
	int x = 100;
	int speed = SPEED;
	int y = 100;
	int yspeed = SPEED;
	public void gameloop()
	{
		timer = new Timer(GAME_SPEED , (e)->{
			repaint();
			move();
			changeDirection();
		});
		timer.start();
	}
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, 50, 50);
		//g.setColor(Color.BLUE);
		//g.fillOval((x-10),(y-10),20,20);
	}
	public void move()
	{
		x+=speed;
		y+=yspeed;
	}
	public void changeDirection()
	{
		if(x>=(GAME_WIDTH-50)){
			speed = -gameUtils.getRandomNumber();
		}
		if(x<= 0){
			speed = gameUtils.getRandomNumber();
		}
		if(y>=(GAME_HEIGHT-50)){
			yspeed = -gameUtils.getRandomNumber();
		}
		if(y<= 0){
			yspeed = gameUtils.getRandomNumber();
		}
	}
}

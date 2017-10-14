package com.BrainMentors.games;
import javax.swing.JFrame;
import com.BrainMentors.games.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants{
	public GameFrame()
	{
		setSize(GAME_WIDTH, GAME_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle(GAME_TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Board board = new Board();
		add(board);
	}
	public static void main(String args[]){
		GameFrame frame = new GameFrame();
	}
}

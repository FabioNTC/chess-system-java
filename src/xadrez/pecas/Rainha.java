package xadrez.pecas;

import boardgame.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class Rainha extends ChessPiece{

	public Rainha(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}
}

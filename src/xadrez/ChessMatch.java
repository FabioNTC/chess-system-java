package xadrez;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import xadrez.pecas.Bispo;
import xadrez.pecas.Peao;
import xadrez.pecas.Rainha;
import xadrez.pecas.Rei;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		configInicial();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		validateSourcePosition(source);
		Piece capturedPiece = makeMove(source, target);
		return (ChessPiece)capturedPiece;
	}
	
	private Piece makeMove(Position source, Position target) {
		Piece p = board.removePiece(source);
		Piece capturedPiece = board.removePiece(target);
		board.placePiece(p, target);
		return capturedPiece;
	}
	
	
	private void validateSourcePosition(Position position) {
		if (!board.thereIsAPiece(position)) {
			throw new ChessException("Nao existe peca na posicao de origem");
		}
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	private void configInicial() {
		
		placeNewPiece('c', 1, new Bispo(board, Color.White));
		placeNewPiece('d', 1, new Rainha(board, Color.White));
		placeNewPiece('e', 1, new Rei(board, Color.White));
		placeNewPiece('c', 2, new Peao(board, Color.White));
		placeNewPiece('d', 2, new Peao(board, Color.White));
		placeNewPiece('e', 2, new Peao(board, Color.White));
		
		placeNewPiece('c', 8, new Bispo(board, Color.Black));
		placeNewPiece('d', 8, new Rei(board, Color.Black));
		placeNewPiece('e', 8, new Rainha(board, Color.Black));
		placeNewPiece('c', 7, new Peao(board, Color.Black));
		placeNewPiece('d', 7, new Peao(board, Color.Black));
		placeNewPiece('e', 7, new Peao(board, Color.Black));
	}
}

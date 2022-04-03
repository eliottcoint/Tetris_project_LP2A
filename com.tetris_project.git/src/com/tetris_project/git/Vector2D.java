package com.tetris_project.git;

public class Vector2D {
	private int x; 
	private int y;
	
	public Vector2D(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	public Vector2D() {
		this.x = 0; 
		this.y = 0;
	}
	public Vector2D(Vector2D vector) {
		this.x = vector.x; 
		this.y = vector.y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	} 
	
	public void add(Vector2D vector) {
		this.x += vector.x; 
		this.y += vector.y;
	}
	
}

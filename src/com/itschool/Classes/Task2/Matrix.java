package com.itschool.Classes.Task2;

public class Matrix
{
	public int[][] matrix;
	int rows;
	int columns;

	public Matrix(int size)
	{
		this.columns = size;
		this.rows = size;
		this.matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			this.matrix[i] = new int[size];
		}
	}

	public Matrix(int rows, int columns)
	{
		this.columns = columns;
		this.rows = rows;
		this.matrix = new int[rows][columns];
	}

	public boolean isIdentity()
	{
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == j) {
					if (this.matrix[i][j] != 1) { return false; }
				}
				else {
					if (this.matrix[i][j] != 0) { return false; }
				}
			}
		}
		return true;
	}
}

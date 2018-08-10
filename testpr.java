
public void open(int row, int col){
        assert row < n;
        assert row >= 0;
        assert col < n;
        assert col >= 0;
        grid[row][col] = true;
    }    // open site (row, col) if it is not open already

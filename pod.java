public class pod {
    //eject pod
    
    int size;
    int row;
    int column;
    int bins = 1;
    int[][] theGrid;
    
    public pod (int userSize, int userRow, int userColumn) {
        size = userSize;
        row = userRow;
        column = userColumn;
        theGrid = new int[row][column];
        fill();
    }
    
    private void fill() {
        for(int row = 0; row < theGrid.length; ++row) {
            for(int column = 0; column < theGrid[row].length; ++column) {
                theGrid[row][column] = bins;
                bins++;
            }
        }
    }
    
    public void showPod(){
        for (int row = 0; row < theGrid.length; row++){
            for (int column = 0; column < theGrid[0].length; column++){
                System.out.print(theGrid[row][column] + " ");
            }
            System.out.println();
        }
    }
    
    public int showPodSize(){
        return size;
    }
    
    public void showHeavyBins(){
        for (int row = 0; row < theGrid.length; row++){
            if(row == theGrid.length - 2 || row == theGrid.length - 1){
                for (int column = 0; column < theGrid[0].length; column++){
                    System.out.print(theGrid[row][column] + " ");
                }
            }
        }
    }
}

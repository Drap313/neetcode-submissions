class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean isValid = true;
        java.util.HashMap<String,Integer> row = new java.util.HashMap<>();
        java.util.HashMap<String,Integer> column = new java.util.HashMap<>();
        java.util.HashMap<String,Integer> left = new java.util.HashMap<>();
        java.util.HashMap<String,Integer> mid = new java.util.HashMap<>();
        java.util.HashMap<String,Integer> right = new java.util.HashMap<>();  
    for(int i = 0;i<board.length;i++){

        if(i%3==0){
            left.clear();
            mid.clear();
            right.clear();
        }
            for(int j = 0; j<board[i].length;j++){    
                //checks the column, outside moves the i, how do we check
                int count = 0;
                char c2 = board[j][i]; //columns
                char c = board[i][j]; //row
                if(c != '.' && row.containsKey(""+c)){
                    isValid = false;
                    System.out.println("this is "+c);
                }
                else{
                    row.put(""+c,0);
                }

                if(j<3){
                    if(c != '.' && left.containsKey(""+c)){
                        isValid = false;
                    }
                    else{
                        left.put(""+c,0);   
                    }
                }
                else if(j<6){
                    if(c != '.' && mid.containsKey(""+c)){
                        isValid = false;
                    }
                    else{
                        mid.put(""+c,0);   
                    }
                }
                else{
                    if(c != '.' && right.containsKey(""+c)){
                        isValid = false;
                    }
                    else{
                        right.put(""+c,0);   
                    }
                }

                if(c2 != '.' && column.containsKey(""+c2)){
                    isValid = false;
                    System.out.println("this is "+c2);
                }
                else{
                    column.put(""+c2,0);
                }
                
            }      
            row.clear();
            column.clear();  
        }

        System.out.println(row);
        System.out.println(column);
           //ok so [] is rows, and [] column
        //we iterate throught the rows and if we find a number equivalent then
        //set valid to false, and same with iteration through the columns
        //we work on that and then figure out the ones in the 3x3
        // at the same time we know there are 9 3x3s 
        return isValid;
    }
}

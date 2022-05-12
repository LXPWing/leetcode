package 单词搜索;

/**
 * 79
 */
public class main {

    static boolean ans = false;
    static int[] dx = new int[]{1,0,-1,0};
    static int[] dy = new int[]{0,1,0,-1};
    static int cx;
    static int cy;

    public static boolean exist(char[][] board, String word) {
        cy = board[0].length;
        cx = board.length;
        for(int i = 0 ; i<cx ; i++){
            for(int j = 0 ; i< cy ; j++){
                if(dfs(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, String word, int u, int zx, int zy){
        if(board[zx][zy] != word.charAt(u))return false;
        if(u == word.length()-1)return true;
        char t = board[zx][zy];
        board[zx][zy] = '*';
        for(int i=0;i<4;i++){
            int x = zx + dx[i], y = zy + dy[i];
            if(x>=0 && x<cx && y>=0 && y<cy){
                if(dfs(board,word,u+1,x,y)){
                    return true;
                }
            }
        }
        board[zx][zy] = t;
        return false;
    }

    public static void main(String[] args) {
        char[][] c = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String str = "ABCCED";
        System.out.println(exist(c,str));
    }
}

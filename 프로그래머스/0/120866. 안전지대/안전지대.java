class Solution {
    public int solution(int[][] board) {
       /*
        * 안전지대
        * 1. 문제
        * 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸 모두 위험지역 분류
        * 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재
        * 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return
        * 2. 규칙 찾기
        * 1) 이동해야할 위치를 표시 배열로 정의한다.
        * 2) 위험 지역 표시
        * 3) 안전 지역 카운트
        * */
        int n = board.length;
        boolean[][] danger = new boolean[n][n];

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    danger[i][j] = true; //위험 지역 표시

                    //주변 8칸 위험 지역 표시
                    for (int k = 0; k <8 ; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if(nx>=0 && ny>=0 && nx<n && ny<n){
                            danger[nx][ny] = true;
                        }
                    }
                }

            }
        }
        //안전지대 cnt
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if (!danger[i][j]) {
                    cnt++;
                }

            }
        }


        return cnt;
    }
}
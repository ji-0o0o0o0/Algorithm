import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        /*모의고사
        * 문제
        * 1번학생 {1, 2, 3, 4, 5}, 2번학생 {2, 1, 2, 3, 2, 4, 2, 5}, 3번학생 {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        * 이 순서로 답을 찍을때 answer(답안지)와 비교했을때 제일 많이 맞춘 1인은?*/
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[][] students = {student1, student2, student3};
        int[] scores = new int[3]; // 각 학생의 점수

        // 1단계: 각 학생의 점수 계산
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == students[i][j % students[i].length]) {
                    scores[i]++;
                }
            }
        }

        // 2단계 최고점 찾기
        int maxScore = Arrays.stream(scores).max().getAsInt();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore){
                result.add(i+1);
            }
        }
        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
public class asdasd {
  class Solution {
    public String[] solution(String[] req_id, int[][] req_info) {
      String[] answer = {};
      int[][] result = new int [req_id.length][2];//중복제가 필요
      for(int i=0;i<req_id.length;i++){
        if(req_info[i][0]==0){ // 등록시 삽니다.
          for(int j=0;j<i;j++){
            if(req_info[j][0]==1&&req_info[j][2]<=req_info[i][2]){ // 거래 시작
              System.out.println("삽니다 : "+i+" / "+req_info[i][2]);
              int min=99999;
              int pointer=0;

              for(int p=0;p<i;p++){
                if(req_info[p][0]==1&&req_info[p][1]>0&&req_info[p][2]>req_info[i][0]){
                  //제일 싼가격 찾아야함
                  if(min>req_info[p][2]){
                    pointer=p;
                    min=req_info[p][2];
                  }
                  System.out.println(" 거래하는 사람! :"+p);
                }
                System.out.println(min+" / "+pointer);
              }

            }
          }
        }
        else {    // 등록시 팝니다.
          for(int j=0;j<i;j++){
            if(req_info[j][0]==0&&req_info[j][2]>=req_info[i][2]){ // 거래 시작
              System.out.println(i+" / "+j);

            }
          }

        }

      }

      return answer;
    }
  }
}

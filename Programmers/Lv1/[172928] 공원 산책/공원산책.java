package Programmers.Lv1;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;
        // 시작지점 찾기
        for(int i=0; i<park.length; i++) {
            for(int j=0; j<park[0].length(); j++) {
                if(park[i].charAt(j)=='S') {
                    x = j;
                    y = i;
                    break;
                }
            }
        }

        for(String route: routes) {
            int a = x, b = y;
            String direction = route.split(" ")[0];
            int distance = Integer.valueOf(route.split(" ")[1]);

            // 해당 거리만큼 수행
            for(int i=0; i<distance; i++) {
                switch(direction) {
                    case "N" : b--;
                        break;
                    case "E" : a++;
                        break;
                    case "W" : a--;
                        break;
                    case "S" : b++;
                        break;
                }

                // 공원을 벗어나는 경우
                if(a<0||a>park[0].length()-1||b<0||b>park.length-1) break;

                // 장애물이 있는 경우
                if(park[b].charAt(a)=='X') {
                    a = -1;
                    break;
                }
            }

            //공원을 벗어나거나 장애물이 있는 경우 해당 명령 무시
            if(a<0||a>park[0].length()-1||b<0||b>park.length-1) continue;

            x = a;
            y = b;
        }

        return new int[] {y,x};
    }
}
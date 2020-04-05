#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> heights) {
	vector<int> answer;
	answer.push_back(0);
	for (int i = 0; i < heights.size(); i++) {
		for (int j = i - 1; j >= 0; j--) {  //왜 j>=0이지?
			if (heights[j] > heights[i]) {
				answer.push_back(j + 1);
				break; // 반복문 끝냄 

			}
			else if (j == 0) {
				answer.push_back(0);
			}
		}
	}
	return answer;
}
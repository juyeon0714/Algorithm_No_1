#include <string>
#include <vector>
#include <algorithm>
#include <functional>

using namespace std;

string solution(string s) {
	// string answer = "";
	// for(int i=0; i<s.size(); i++){
	//     return s[i]=s[s.size()-i];
// }
	sort(s.begin(), s.end(), greater<char>());
	return s;
}
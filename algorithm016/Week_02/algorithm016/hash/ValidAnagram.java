package algorithm016.hash;

import java.util.Arrays;

/**
 * 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class ValidAnagram {
	
    public boolean isAnagram1(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
    	return Arrays.equals(ss, tt);
    }	

    public boolean isAnagram2(String s, String t) {
    	/**
    	 * https://liuwanping.github.io/2018/10/31/Java%E4%B8%ADchar%EF%BC%8Cint%EF%BC%8CString%E7%9A%84%E7%9B%B8%E5%8A%A0%E5%87%8F/
    	 */
    	if(s.length() != t.length()) {
    	    return false;
    	}
    	
    	int[] counter = new int[26];
    	
    	for (int i = 0; i < s.length(); i++) {
    		counter[s.charAt(i) - 'a']++;
    		counter[t.charAt(i) - 'a']--;
		}
        for (int i = 0; i < counter.length; i++) {
        	if(counter[i] != 0) {
        		return false;
        	}
		}	
    	return true;
    }	

	public static void main(String[] args) {
		
	}

}

import java.util.Stack;
public class Nomor2 {
	public static void main(String args[]) {
	      System.out.println(solution("())"));
	      System.out.println(solution("(()(())())"));
	    }
	
	    static int solution(String s) {
	       Stack<Character> stack = new Stack<>();
	       boolean isProper = true;
	       // looping string s
	       for(int i = 0 ; i < s.length() ; ++i){
	           //jika s[i] sama dengan '(' saya masukan ke stack
	           if(s.charAt(i) == '('){
	               stack.push('(');
	           }
	           //jika s[i] sama dengan ')' maka akan saya pop dari stack
	           else if(s.charAt(i) == ')' && !stack.empty()){
	               stack.pop();
	           }
	           //untuk menghandle jika tidak ada yg bisa di pop lagi berarti sudah pasti tidak proper
	           else{
	               isProper = false;
	               break;
	           }
	       }
	       if(!isProper){
	           return 0;
	       }
	       else if(stack.empty()){
	           return 1;
	       }
	
	       return 0;
	    }
	    
}
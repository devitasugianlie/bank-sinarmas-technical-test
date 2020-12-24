public class Nomor1 {
    public static void main(String[] args) {
        solution(11011101);
        solution(-100);
        solution(521455130);
        solution(7451000);
    }

    static void solution(int N) {
        int enablePrint = 0;
        boolean isBack = true; // looping selama N masih di atas 0
        while (N > 0) {
        	
        	enablePrint = N % 10;
        	//biar tidak langsung print 0 di belakang
            //dan hanya print jika semua 0 di belakang sudah di lewati
        	
            if (enablePrint > 0 || !isBack) {
            	System.out.print(enablePrint);
            }
            N /= 10;
            //kondisi biar 0 dibelakang tidak di print
            if (enablePrint != 0) {
            	isBack = false;
            }
        }
        System.out.println();
    }
}
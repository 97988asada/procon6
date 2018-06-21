import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long A = Long.parseLong(str.split(" ")[0]);
		long B = Long.parseLong(str.split(" ")[1]);
		long K = Long.parseLong(str.split(" ")[2]);
		long sum = 0;
		for(long i=A; i<B; i++) {
			if(i%K == 0) sum = sum + i;
		}
		System.out.println(sum);
	}
}
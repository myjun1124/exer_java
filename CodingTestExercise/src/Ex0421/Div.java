package Ex0421;

public class Div {
	public int a, b;
	public Div(int a, int b) {	//생성자
		this.a = a;
		this.b = b;
	}
    public int divSum(int n) {	// 약수의 합
        int total=0;
        for (int i=1;i<n;i++) {
            if (n%i==0) {
                total+=i;
            }
        }
        return total;
    }
    public void printDiv() {	//친화수 조건을 만족하는 두 수 찾기
    	for (int i=a;i<b;i++) {
            for (int j=a;j<b;j++) {
                if ((i != j)&& (j == divSum(i) && i == divSum(j))) {
                	for(int k=1;k<i;k++) {
                		if(i%k==0) {
                			System.out.print(i/k + " ");
                		}
                	}
                    System.out.println(" : " + i);
                    for(int l=1;l<j;l++) {
                    	if(j%l==0) {
                    		System.out.print(j/l + " ");
                    	}
                    }
                    System.out.println(" : " + j);
                }
            }
        }
    }
}
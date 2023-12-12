
public class Priningminimumnumber{
	public static void main(String[] args) {
	int [][] a = {{1,3,5},{4,0,2},{6,7,8}};
	int min = a[0][1];
	int minim = 0;
	for(int i = 0;i<3;i++) {
		for(int j = 0;j<3;j++) {
			if(a[i][j]<min) {
			min = a[i][j];
			minim = j;
			}
		}
	}
	int k = 0;
	int max = a[0][minim];
	while(k<3) {
		if(a[k][minim]>max) {
			max = a[k][minim];
		}
		k++;
	}
	System.out.println(max);
	
	
	}
	
}
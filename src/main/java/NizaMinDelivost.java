import java.util.Scanner;
public class NizaMinDelivost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner vn = new Scanner(System.in);
	System.out.print("Vnesi 5 broja");
	int niza[] = new int[5];
	for (int i=0; i<5; i++) {
		niza[i]=vn.nextInt();
	}
	int min=niza[0];
	for (int i=1; i<5; i++) {
		if(min>niza[i]) min=niza[i];
	}
	System.out.print("Najmal e :"+min+" i broevi delivi so nego se ");
for (int i=0; i<5; i++) {
		if(niza[i]%min==0)System.out.print(niza[i]+" ");
	}

vn.close();
	}

}

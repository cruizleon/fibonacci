
package fobonacci_;

/**
 *
 * @author Cristhian javier Ruiz León
 */
public class Fobonacci_ {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		int anterior = 0;
		int temp;
		while(true){
			
			System.out.println(x);
			temp = x;
			x=x+anterior;
			anterior=temp;
			if(x>100)
			{break;}
		}
	}
}
/* This file is an example from <Suanfa Yu CHengxu Sheji> (信息技术-选修1:算法与程序设计 2010印次) P15
 * */
package application;
import javax.swing.JOptionPane;
public class TaxiBill {

	public static void main(String[] args) {
		double P1 = 10;
		double P2 = 8;
		double X1 = 2;
		double X2 = 2.2;
		//----------------------------"Please input distance of driving"
		String s = JOptionPane.showInputDialog("请输入行驶的里程数"); 
		int n = Integer.parseInt(s);
		
		if (n >= 3) {
			P1 = P1 + X1*(n-3+1);
			P2 = P2 + X2*(n-3+1);
		}
		
		//output
		//----------------"when both cars drive for n kms,Car I saves money","fees of two different taxi with their own price"
		if (P1 < P2) JOptionPane.showMessageDialog(null, n+"千米时，乘甲车省钱","出租车的计费问题",JOptionPane.INFORMATION_MESSAGE);
		else {
			//---------------"when both cars drive for n kms,Car II saves money","fees of two different taxi with their own price"
			if (P1 > P2) JOptionPane.showMessageDialog(null, n+"千米时，乘乙车省钱","出租车的计费问题",JOptionPane.INFORMATION_MESSAGE);
			//--"when both cars drive for n kms,both cars need same money","fees of two different taxi with their own price"
			else JOptionPane.showMessageDialog(null, n+"千米时，两车费用相同","出租车的计费问题",JOptionPane.INFORMATION_MESSAGE);
		}

	}

}

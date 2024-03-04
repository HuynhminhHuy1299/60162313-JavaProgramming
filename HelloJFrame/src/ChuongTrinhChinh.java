import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Vi du JFrame");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200); //kích thước cửa sổ
		
		//Qui định loại bố cục  (layout)
		f.setLayout(new FlowLayout());
		
		
		//Tao mot nut bam
		JButton btnOK = new JButton("Nhấn tôi đi");
		
		//gắn vào cho nút ok
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPeformed(ActionEvent e) {
				//Mã xử lý khi user click chuột ở đây
				JDialog dialog = new JDialog();
				dialog.setTitle("Thông báo gì đó");
				dialog.setSize(220,120);
				dialog.show();
			}
		};
		
		JButton btnKhac = new JButton("Nhấn em đi");
		//gắn lên form
		f.add(btnOK);
		
		f.add(btnKhac);
		
		f.show();
	}
	/*private static class BoLangNgheOK implements ActionListener{
		
		@Override
		public void actionPeformed(ActionEvent e) {
			//Mã xử lý khi user click chuột ở đây
			JDialog dialog = new JDialog();
			dialog.setTitle("Thông báo gì đó");
			dialog.setSize(220,120);
			dialog.show();
		}
	}*/

}


public class SanPham {
	// Định nghĩa các thuộc tính 
	int maSP;
	String tenSP;
	String loaiSP;  
	String anhSP;   // tên file ảnh
	//Ham tao
	public SanPham() {
		// khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
	}
	
	//public SanPham(int _maSP, String _tenSP, String _loaiSP, String _anhSP) {
		// khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
		//maSP = _maSP;
		//tenSP = _tenSP;
		//loaiSP = _loaiSP;
		//anhSP = _anhSP;
	//}
	
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
		// khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
	}
	//Các getter,setter
	
	public int	getMaSP() {
		return maSP;
	}
	public void	setMaSP(int maSP) {
		this.maSP = maSP;
	}
}

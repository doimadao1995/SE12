package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.BaiDangBean;
import model.bean.DanhMucBean;
import model.bean.TinhThanhBean;

public class HomeForm extends ActionForm{
	
	private static final long serialVersionUID = 1L;
	
	private int maBaiDang;
	private String maDanhMuc;
	private String tenDanhMuc;
	private ArrayList<DanhMucBean> listDanhMuc;
	private String maTinhThanh;
	private String tenTinhThanh;
	private String soLuotThich;
	private ArrayList<TinhThanhBean> listTinhThanh;
	private ArrayList<BaiDangBean> listBaiDang;
	//Làm đẹp
	private ArrayList<BaiDangBean> listBaiDang_1;
	//Kinh doanh
	private ArrayList<BaiDangBean> listBaiDang_2;
	//Dich vụ ăn uống
	private ArrayList<BaiDangBean> listBaiDang_3;
	//Tài chánh
	private ArrayList<BaiDangBean> listBaiDang_4;
	//Sức khỏe
	private ArrayList<BaiDangBean> listBaiDang_5;
	//Khách sạn
	private ArrayList<BaiDangBean> listBaiDang_6;
	//Giải trí
	private ArrayList<BaiDangBean> listBaiDang_7;
	
	private String[] sao;
	
	public HomeForm() {
	}
	
	public String getSoLuotThich() {
		return soLuotThich;
	}

	public void setSoLuotThich(String soLuotThich) {
		this.soLuotThich = soLuotThich;
	}

	public ArrayList<BaiDangBean> getListBaiDang_1() {
		return listBaiDang_1;
	}


	public void setListBaiDang_1(ArrayList<BaiDangBean> listBaiDang_1) {
		this.listBaiDang_1 = listBaiDang_1;
	}


	public ArrayList<BaiDangBean> getListBaiDang_2() {
		return listBaiDang_2;
	}


	public void setListBaiDang_2(ArrayList<BaiDangBean> listBaiDang_2) {
		this.listBaiDang_2 = listBaiDang_2;
	}


	public ArrayList<BaiDangBean> getListBaiDang_3() {
		return listBaiDang_3;
	}


	public void setListBaiDang_3(ArrayList<BaiDangBean> listBaiDang_3) {
		this.listBaiDang_3 = listBaiDang_3;
	}


	public ArrayList<BaiDangBean> getListBaiDang_4() {
		return listBaiDang_4;
	}


	public void setListBaiDang_4(ArrayList<BaiDangBean> listBaiDang_4) {
		this.listBaiDang_4 = listBaiDang_4;
	}


	public ArrayList<BaiDangBean> getListBaiDang_5() {
		return listBaiDang_5;
	}


	public void setListBaiDang_5(ArrayList<BaiDangBean> listBaiDang_5) {
		this.listBaiDang_5 = listBaiDang_5;
	}


	public ArrayList<BaiDangBean> getListBaiDang_6() {
		return listBaiDang_6;
	}


	public void setListBaiDang_6(ArrayList<BaiDangBean> listBaiDang_6) {
		this.listBaiDang_6 = listBaiDang_6;
	}


	public ArrayList<BaiDangBean> getListBaiDang_7() {
		return listBaiDang_7;
	}


	public void setListBaiDang_7(ArrayList<BaiDangBean> listBaiDang_7) {
		this.listBaiDang_7 = listBaiDang_7;
	}


	public int getMaBaiDang() {
		return maBaiDang;
	}


	public void setMaBaiDang(int maBaiDang) {
		this.maBaiDang = maBaiDang;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getMaDanhMuc() {
		return maDanhMuc;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	public ArrayList<DanhMucBean> getListDanhMuc() {
		return listDanhMuc;
	}
	public void setListDanhMuc(ArrayList<DanhMucBean> listDanhMuc) {
		this.listDanhMuc = listDanhMuc;
	}

	public String getMaTinhThanh() {
		return maTinhThanh;
	}

	public void setMaTinhThanh(String maTinhThanh) {
		this.maTinhThanh = maTinhThanh;
	}

	public String getTenTinhThanh() {
		return tenTinhThanh;
	}

	public void setTenTinhThanh(String tenTinhThanh) {
		this.tenTinhThanh = tenTinhThanh;
	}

	public ArrayList<TinhThanhBean> getListTinhThanh() {
		return listTinhThanh;
	}

	public void setListTinhThanh(ArrayList<TinhThanhBean> listTinhThanh) {
		this.listTinhThanh = listTinhThanh;
	}

	public ArrayList<BaiDangBean> getListBaiDang() {
		return listBaiDang;
	}

	public void setListBaiDang(ArrayList<BaiDangBean> listBaiDang) {
		this.listBaiDang = listBaiDang;
	}

	public String[] getSao() {
		return sao;
	}

	public void setSao(String[] sao) {
		this.sao = sao;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try
		{
			request.setCharacterEncoding("UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		super.reset(mapping, request);
	}

}

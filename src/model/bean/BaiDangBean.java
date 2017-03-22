package model.bean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 * BaiDangBean
 *
 * Version 1.0
 *
 * Date: 7-3-2017
 *
 * Copyright 
 *
 * Modification Logs:
 * DATE                 AUTHOR          DESCRIPTION
 * -----------------------------------------------------------------------
 * 7-3-2017         DonNA            Create
 */

public class BaiDangBean {
	private int sTT;
	private int maBaiDang;
	private String tieuDe;
	private String noiDung;
	private String diaChi;
	private String diaChiWeb;
	private String viDo;
	private String kinhDo;
	private String sDT;
	private int giaCaoNhat;
	private int giaThapNhat;
	private Date ngayDang;
	private Date ngayHetHan;
	private int soLuongTruyCap;
	private int soLuotThich;
	private int diemDanhGia;
	
	private String userName;
	private int maDanhMuc;
	private String tenDanhMuc;
	private int maLoaiTin;
	private String tenLoaiTin;
	private int maTinhThanh;
	private String tenTinhThanh;
	private String anhBia;
	private ArrayList<HinhAnhBean> listHinhAnh;
	private ArrayList<DichVuBean> listDichVu;
	private ArrayList<BinhLuanBean> listBinhLuan;
	private SimpleDateFormat sdf;
	//ngay dinh dang
	public SimpleDateFormat getSdf()
	{
		if(sdf == null)
			sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf;
	}
	
	public BaiDangBean() {
		super();
	}
	
	//lay ngay hien tai
	public Date getNgayDangDate() 
	{
		Date date=new Date();
		String str= getSdf().format(date);
		
		Date currentDate=null;
		try {
			currentDate = getSdf().parse(str);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		return currentDate;
	}
	//toan bo du lieu
	
	public String getNoiDung() {
		return noiDung;
	}

	//dung cho form dang bai len
	public BaiDangBean(int maBaiDang, String tieuDe, String noiDung, String diaChi, String diaChiWeb, String viDO,
			String kinhDo, String sDT, int giaCaoNhat, int giaThapNhat, Date ngayDang, String userName, int maDanhMuc,
			int maTinhThanh) {
		super();
		this.maBaiDang = maBaiDang;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.diaChi = diaChi;
		this.diaChiWeb = diaChiWeb;
		this.viDo = viDO;
		this.kinhDo = kinhDo;
		this.sDT = sDT;
		this.giaCaoNhat = giaCaoNhat;
		this.giaThapNhat = giaThapNhat;
		this.ngayDang = ngayDang;
		this.userName = userName;
		this.maDanhMuc = maDanhMuc;
		this.maTinhThanh = maTinhThanh;
	}
	//tat ca cac truong
	
	public BaiDangBean(int maBaiDang, String tieuDe, String noiDung, String diaChi, String diaChiWeb, String viDO,
			String kinhDo, String sDT, int giaCaoNhat, int giaThapNhat, Date ngayDang, Date ngayHetHan,
			int soLuongTruyCap, int soLuotThich, int diemDanhGia, String userName, int maDanhMuc, String tenDanhMuc,
			int maLoaiTin, int maTinhThanh, String tenTinhThanh, String anhBia, ArrayList<HinhAnhBean> listHinhAnh,ArrayList<DichVuBean> listDichVu) {
		super();
		this.maBaiDang = maBaiDang;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.diaChi = diaChi;
		this.diaChiWeb = diaChiWeb;
		this.viDo = viDO;
		this.kinhDo = kinhDo;
		this.sDT = sDT;
		this.giaCaoNhat = giaCaoNhat;
		this.giaThapNhat = giaThapNhat;
		this.ngayDang = ngayDang;
		this.ngayHetHan = ngayHetHan;
		this.soLuongTruyCap = soLuongTruyCap;
		this.soLuotThich = soLuotThich;
		this.diemDanhGia = diemDanhGia;
		this.userName = userName;
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
		this.maLoaiTin = maLoaiTin;
		this.maTinhThanh = maTinhThanh;
		this.tenTinhThanh = tenTinhThanh;
		this.anhBia = anhBia;
		this.listHinhAnh = listHinhAnh;
		this.listDichVu=listDichVu;
	}
	
	//get and set
	
	public String getTenLoaiTin() {
		return tenLoaiTin;
	}

	public int getsTT() {
		return sTT;
	}

	public void setsTT(int sTT) {
		this.sTT = sTT;
	}

	public void setViDo(String viDo) {
		this.viDo = viDo;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public ArrayList<BinhLuanBean> getListBinhLuan() {
		return listBinhLuan;
	}

	public void setListBinhLuan(ArrayList<BinhLuanBean> listBinhLuan) {
		this.listBinhLuan = listBinhLuan;
	}

	public void setTenLoaiTin(String tenLoaiTin) {
		this.tenLoaiTin = tenLoaiTin;
	}

	public ArrayList<DichVuBean> getListDichVu() {
		return listDichVu;
	}

	public void setListDichVu(ArrayList<DichVuBean> listDichVu) {
		this.listDichVu = listDichVu;
	}

	public String getTenTinhThanh() {
		return tenTinhThanh;
	}

	public void setTenTinhThanh(String tenTinhThanh) {
		this.tenTinhThanh = tenTinhThanh;
	}

	public ArrayList<HinhAnhBean> getListHinhAnh() {
		return listHinhAnh;
	}

	public void setListHinhAnh(ArrayList<HinhAnhBean> listHinhAnh) {
		this.listHinhAnh = listHinhAnh;
	}

	public int getDiemDanhGia() {
		return diemDanhGia;
	}

	public void setDiemDanhGia(int diemDanhGia) {
		this.diemDanhGia = diemDanhGia;
	}

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public int getMaBaiDang() {
		return maBaiDang;
	}

	public void setMaBaiDang(int maBaiDang) {
		this.maBaiDang = maBaiDang;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDiaChiWeb() {
		return diaChiWeb;
	}

	public void setDiaChiWeb(String diaChiWeb) {
		this.diaChiWeb = diaChiWeb;
	}

	public String getViDo() {
		return viDo;
	}

	public void setViDO(String viDo) {
		this.viDo = viDo;
	}

	public String getKinhDo() {
		return kinhDo;
	}

	public void setKinhDo(String kinhDo) {
		this.kinhDo = kinhDo;
	}

	public String getsDT() {
		return sDT;
	}

	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public int getGiaCaoNhat() {
		return giaCaoNhat;
	}

	public void setGiaCaoNhat(int giaCaoNhat) {
		this.giaCaoNhat = giaCaoNhat;
	}

	public int getGiaThapNhat() {
		return giaThapNhat;
	}



	public void setGiaThapNhat(int giaThapNhat) {
		this.giaThapNhat = giaThapNhat;
	}



	public int getMaDanhMuc() {
		return maDanhMuc;
	}



	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}



	public int getMaLoaiTin() {
		return maLoaiTin;
	}



	public void setMaLoaiTin(int maLoaiTin) {
		this.maLoaiTin = maLoaiTin;
	}



	public int getMaTinhThanh() {
		return maTinhThanh;
	}



	public void setMaTinhThanh(int maTinhThanh) {
		this.maTinhThanh = maTinhThanh;
	}



	public Date getNgayDang() {
		return ngayDang;
	}

	public void setNgayDang(Date ngayDang) {
		this.ngayDang = ngayDang;
	}

	public Date getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public int getSoLuongTruyCap() {
		return soLuongTruyCap;
	}

	public void setSoLuongTruyCap(int soLuongTruyCap) {
		this.soLuongTruyCap = soLuongTruyCap;
	}

	public int getSoLuotThich() {
		return soLuotThich;
	}

	public void setSoLuotThich(int soLuotThich) {
		this.soLuotThich = soLuotThich;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAnhBia() {
		return anhBia;
	}

	public void setAnhBia(String anhBia) {
		this.anhBia = anhBia;
	}
	
}

package model.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.DataBaseConnect;
import common.StringProcess;
import model.bean.BinhLuanBean;
import model.bean.HinhAnhBean;
/**
 * BinhLuanDAO
 *
 * Version 1.0
 *
 * Date: 15-3-2017
 *
 * Copyright 
 *
 * Modification Logs:
 * DATE                 AUTHOR          DESCRIPTION
 * -----------------------------------------------------------------------
 * 15-3-2017         DonNA            Create
 */
public class BinhLuanDAO extends DataBaseConnect{
	private static PreparedStatement prepSt=null;
	private static Statement st=null;
	private static ResultSet rs=null;

	public static void insertBinhLuan(BinhLuanBean binhLuan) {
		try {
			String insertTableSQL = "insert into BinhLuan values(?,?,?,?,?,?)";
			System.out.println(insertTableSQL);
			prepSt = getConnect().prepareStatement(insertTableSQL);
			prepSt.setString(1, binhLuan.getTieuDe());
			prepSt.setString(2, binhLuan.getNoiDung());
			prepSt.setDate(3, new Date(StringProcess.getNgayDangDate().getTime()));
			prepSt.setInt(4, binhLuan.getDiemDanhGia());
			prepSt.setInt(5, binhLuan.getMaBaiDang());
			prepSt.setString(6, binhLuan.getUserName());
			prepSt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				getConnect().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static ArrayList<BinhLuanBean> infoBinhLuanByMa(int maBaiDang) {
		ArrayList<BinhLuanBean> listBinhLuan = new ArrayList<BinhLuanBean>();
		BinhLuanBean binhLuan;
		try {
			st=getConnect().createStatement();
			rs=st.executeQuery("select * FROM BinhLuan "
					+ "where MaBaiDang = "+maBaiDang+"");
			while(rs.next()){
				binhLuan = new BinhLuanBean();
				binhLuan.setMaBinhLuan(rs.getInt("MaBinhLuan"));
				binhLuan.setTieuDe(rs.getString("TieuDe"));
				binhLuan.setNoiDung(rs.getString("NoiDung"));
				binhLuan.setNgayBinhLuan(rs.getDate("NgayBinhLuan"));
				binhLuan.setDiemDanhGia(rs.getInt("DiemDanhGia"));
				binhLuan.setUserName(rs.getString("userName"));
				listBinhLuan.add(binhLuan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				getConnect().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listBinhLuan;
	}
}

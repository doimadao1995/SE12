<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<jsp:include page="Admin_Header.jsp" flush="true"></jsp:include>
		<div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <html:form action="/xemTinChuaDuyet">
                    <div class="col-lg-12">
                        <h1 class="page-header">Thông tin chi tiết</h1>
                    </div>
                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                       
                            <tr>
							<th style="width: 28.6%;">Tiêu đề:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="tieuDe"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Nội dung:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="noiDung"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Địa chỉ:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="diaChi"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Website:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="diaChiWeb"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Số điện thoại:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="sDT"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Giá cao nhất:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="giaCaoNhat"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Giá thấp nhất</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="giaThapNhat"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Ngày đăng:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="ngayDang"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Ngày hết hạn:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="ngayHetHan"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Số lượt truy cập:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="soLuongTruyCap"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Số lượt thích</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="soLuotThich"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Username</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="userName"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Danh mục:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="tenDanhMuc"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Trạng thái:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="tenLoaiTin"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Tỉnh:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="tenTinhThanh"/></td>
					</tr>
					<tr>
							<th style="width: 28.6%;">Điểm đánh giá:</th>
							<td class="db-align-center db-status"><bean:write name="danhSachBaiDangDaDuyetForm" property="diemDanhGia"/></td>
					</tr>
                    </table>
                    </html:form>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
    <jsp:include page="Admin_Footer.jsp" flush="true"></jsp:include>
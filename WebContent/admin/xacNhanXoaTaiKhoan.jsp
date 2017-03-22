<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<jsp:include page="Admin_Header.jsp" flush="true"></jsp:include>
	<!-- thu -->

		<style>
		#div1 {
		  	font-size:80px;
		   	width: 300px;
		    border: 25px;
	        padding:25px;
		    margin: 25px; 
		}
		.button {
		    background-color: #4CAF50; /* Green */
		    border: none;
		    color: white;
		    padding: 16px 32px;
		    text-align: center;
		    text-decoration: none;
		    display: inline-block;
		    font-size: 16px;
		    margin: 4px 2px;
		    -webkit-transition-duration: 0.4s; /* Safari */
		    transition-duration: 0.4s;
		    cursor: pointer;
		    border-radius: 8px;
		}
		.button2 {
	    background-color:  #008CBA; 
	    color: white; 
	    
		}
	
		.button2:hover {
		    background-color:white ;
		    color:  #008CBA;
		    border: 2px solid #008CBA;
		} 
		
		.button3 {
		    background-color: #f44336; 
		    color: white; 
		    border: 2px solid white ;
		}
		
		.button3:hover {
		    background-color: white;
		    color: #f44336;
		    border: 2px solid #f44336;
		}
		</style>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">		
	<!-- end thu -->

    <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8">
                        <h1 class="page-header">Xác nhận xóa tài khoản</h1>
                    </div>    
	<html:form action="/xoaTaiKhoan">
		<div class="row form-group">
	         <div>
	             <html:hidden property="userName"/>
	         </div>
	    </div>
		<div class="col-lg-12">
			<h3><label>Bạn chắc chắn muốn xóa tài khoản "</label>
			<b><i style="color:#8B0000"><bean:write name="danhSachTaiKhoanForm" property="userName"/></i></b>
			<label>" ? </label></h3> 
		</div>
		<center>
		<div class="col-lg-10">
			<!--  thu -->
			<div id="div1" class="fa" ></div>
			<!-- end thu -->
		</div>
		<br>
		<div class="col-lg-10">
			<button type="submit" name="submit" value="xoaTaikhoan" class="button button2">Xác nhận</button>
			<html:link action="/danhSachTaiKhoan.do"><span class="button button3">Hủy</span>
			</html:link>
		</div>
		</center>

	</html:form>
	</div>
           <!-- /.row -->
         </div>
     <!-- /.container-fluid -->
    </div>
	 <!-- /#wrapper -->
<jsp:include page="Admin_Footer.jsp" flush="true"></jsp:include>
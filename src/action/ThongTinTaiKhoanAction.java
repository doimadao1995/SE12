package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ThongTinTaiKhoanForm;
import model.bean.TaiKhoanBean;
import model.bean.User;
import model.bo.TaiKhoanBO;

public class ThongTinTaiKhoanAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		ThongTinTaiKhoanForm thisForm= (ThongTinTaiKhoanForm)form;
		TaiKhoanBO taiKhoanBO= new TaiKhoanBO();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("userActivity");
		System.err.println("uss "+user.getUserName());
		TaiKhoanBean taiKhoan= taiKhoanBO.getThongTinTaiKhoan(user.getUserName());
		thisForm.setUserName(taiKhoan.getUserName());
		thisForm.setPassCu(taiKhoan.getPassWord());
		thisForm.seteMail(taiKhoan.geteMail());
		//danh sach bai dang
		thisForm.setListBaiDang(TaiKhoanBO.danhSachBaiDang(user));
		//danh sach yeu thich
		thisForm.setListYeuThich(TaiKhoanBO.danhSachYeuThich(user));
		return mapping.findForward("thongTinTaiKhoan");
	}
}

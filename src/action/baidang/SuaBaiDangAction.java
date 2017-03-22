package action.baidang;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.StringProcess;
import form.BaiDangForm;
import model.bean.User;
import model.bo.BaiDangBO;
import model.bo.DanhMucBO;
import model.bo.TinhThanhBO;
import model.bo.DichVuBO;

public class SuaBaiDangAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		BaiDangForm thisForm = (BaiDangForm) form;
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("userActivity");
		if(user == null || user.getMaQuyen() == -1)
			return mapping.findForward("login");
		thisForm.setUserName(user.getUserName());
		if (StringProcess.equals(thisForm.getSubmit(), "suaTin")){
			ActionErrors errors = new ActionErrors();
			errors = thisForm.validateBaiDang(mapping, request);
			if (!errors.isEmpty()) {
				saveErrors(request, errors);
				thisForm.setListDanhMuc(DanhMucBO.getListDanhMuc());
				thisForm.setListTinhThanh(TinhThanhBO.getListTinhThanh());
				thisForm.setListDichVu(DichVuBO.getListDichVu());
				return mapping.getInputForward();
			}
			else if(StringProcess.equals(thisForm.getSubmit(), "suaTin")){
				//thong tin bai dang, anh bia xoa, hinh anh xoa..
				System.out.println("ss of "+user.getUserName()+" la"+ thisForm.getBaiDang());
				BaiDangBO.updateBaiDang(thisForm.getBaiDang(),thisForm.isAnhBiaXoa(),thisForm.getHinhXoa(),thisForm.getFileAnhBia(),thisForm.getFileHinhAnh(),thisForm.getDichVu(),getServlet());
				return mapping.findForward("suaTinxong");
			}
		}
		//them cac du lieu danh sach
		thisForm.setListDanhMuc(DanhMucBO.getListDanhMuc());
		thisForm.setListTinhThanh(TinhThanhBO.getListTinhThanh());
		thisForm.setListDichVu(DichVuBO.getListDichVu());
		thisForm.setSuaBaiDang(BaiDangBO.infoSuaBaiDang(thisForm.getMaBaiDang()));
		return mapping.getInputForward();
	}
	
	
}

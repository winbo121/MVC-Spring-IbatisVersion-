package example.winbo.test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class GuestBookController extends HttpServlet implements Controller{

	
	private GuestBookService guestbookService;
	private GuestBookVO guestbookVO;
	private PageMaker pageMaker;
	
	public GuestBookController() {
		System.out.println("111111111111111111111111111");
	}

	
	public void setGuestbookService(GuestBookService guestbookService) {
		System.out.println("22222222222222222222222222");
		this.guestbookService = guestbookService;
	}

	public void setGuestbookVO(GuestBookVO guestbookVO) {
		System.out.println("333333333333333333333333");
		this.guestbookVO = guestbookVO;
	}
	

	public void setPageMaker(PageMaker pageMaker) {
		System.out.println("44444444444444444444444444");
		this.pageMaker = pageMaker;
	}


	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String path=request.getRequestURI();
		System.out.println(path);
		
		if(path.equals("/list.guest")) {
			ModelAndView mav = new ModelAndView();	
			String page=request.getParameter("page");
		
			if(page == null ) {
				
				page="1";
				
			}
			
			guestbookVO.setOffset(( Integer.parseInt(page)-1)*10);
			guestbookVO.setLimits(guestbookVO.getOffset()+10);
			
			List<GuestBookVO> userList=guestbookService.userList(guestbookVO);
	
			pageMaker.setTotalCount(guestbookService.userAllCount(), Integer.parseInt(page));
			
			mav.addObject("pageMaker",pageMaker);
			mav.addObject("userList",userList);
			mav.setViewName("../board/listAll");
			
			return mav;	
		}
		else if(path.equals("/insertForm.guest")) {
			return new ModelAndView("../board/register");	
		}
		
		else if(path.equals("/insertPro.guest")) {
			
			guestbookVO.setName(request.getParameter("name"));
			guestbookVO.setPassword(request.getParameter("password"));
			
			guestbookService.userInsert(guestbookVO);
		
			return new ModelAndView("redirect:/list.guest");	
		}
		
		else if(path.equals("/readForm.guest")) {
			String name=request.getParameter("name");
			guestbookVO=guestbookService.userRead(name);
			return new ModelAndView("../board/read","user",guestbookVO);
		}
		else if(path.equals("/deletePro.guest")) {
			String name=request.getParameter("name");
			guestbookService.userDelete(name);
			
			return new ModelAndView("redirect:/list.guest");	
		}
		
		return null;
		
		
		
	}



}

package sign.Service;

import VO.SignVO;

public interface signService {
	void join(SignVO vo);
	SignVO getSignVO(String id);
	void editSignVO(SignVO vo);
	void remSignVO(String id);
	boolean login(String id, String pwd);
}

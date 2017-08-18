package service.impl;
import java.util.List;

import dto.PojoDto;
import entity.Pojo;
import service.PojoService;

public class PojoServiceImpl implements PojoService {

	@Override
	public List<PojoDto> findEntityList(PojoDto entity, int start, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PojoDto> findEntity(PojoDto param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertEntityBatch(List<Pojo> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEntityBatch(List<Pojo> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEntityBatch(List<Long> ids) {
		// TODO Auto-generated method stub
		return 0;
	}

}

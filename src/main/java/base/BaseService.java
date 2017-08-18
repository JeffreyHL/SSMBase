package base;
import java.util.List;

public interface BaseService<T, K extends BaseDto<T>> {

	/**
	 * 查询List
	 * 
	 * @author HL 2017-08-04 16:42:23
	 * @param param
	 *            过滤参数
	 * @param start
	 *            查询起始点(为null时，查询所有结果)
	 * @param limit
	 *            查询长度(为null时，查询所有结果)
	 */
	public List<K> findEntityList(K param, int start, int limit);

	/**
	 * 查询单一结果
	 * 
	 * @author HL 2017-08-04 16:45:25
	 * @param param
	 *            过滤参数
	 */
	public List<K> findEntity(K param);

	/**
	 * 批量插入数据（可插入单条数据）
	 * 
	 * @author HL 2017-08-04 16:46:58
	 * @param params
	 *            待插入的数据
	 */
	public int insertEntityBatch(List<T> params);

	/**
	 * 批量修改数据（可修改单条数据）
	 * 
	 * @author HL 2017-08-04 16:48:23
	 * @param params
	 *            待修改的数据
	 * @return
	 */
	public int updateEntityBatch(List<T> params);

	/**
	 * 批量删除数据（可删除单条数据）
	 * 
	 * @author HL 2017-08-04 16:50:10
	 * @param ids
	 *            待删除的数据主键值
	 * @return
	 */
	public int deleteEntityBatch(List<Long> ids);

}

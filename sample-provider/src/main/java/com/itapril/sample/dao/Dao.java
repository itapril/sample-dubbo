package com.itapril.sample.dao;

/**
 * @author itapril.
 * @create 2018/8/8 17:21.
 */
public interface Dao {
    /**
     * 保存对象
     * @param str
     * @param obj
     * @return
     * @throws Exception
     */
    Object save(String str, Object obj) throws Exception;

    /**
     * 修改对象
     * @param str
     * @param obj
     * @return
     * @throws Exception
     */
    Object update(String str, Object obj) throws Exception;

    /**
     * 删除对象
     * @param str
     * @param obj
     * @return
     * @throws Exception
     */
    Object delete(String str, Object obj) throws Exception;

    /**
     * 查找对象
     * @param str
     * @param obj
     * @return
     * @throws Exception
     */
    Object findForObject(String str, Object obj) throws Exception;

    /**
     * 查找对象
     * @param str
     * @param obj
     * @return
     * @throws Exception
     */
    Object findForList(String str, Object obj) throws Exception;

    /**
     * 查找对象封装成Map
     * @param obj
     * @return
     * @throws Exception
     */
    Object findForMap(String sql, Object obj, String key, String value) throws Exception;
}

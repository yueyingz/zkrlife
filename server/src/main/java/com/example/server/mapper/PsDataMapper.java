package com.example.server.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;
/**
 * 保全
 *
 * @author zuosy
 */
@Mapper
public interface PsDataMapper {


    /**
     * 退保数据落地
     *
     * @param infoMap 退保数据
     * @return 结果
     */
    public void stpremInsert(Map<String, Object> infoMap);

    /**
     * 追加数据落地
     *
     * @param infoMap 退保数据
     * @return 结果
     */
    public void addpremInsert(Map<String, Object> infoMap);

    /**
     * 重要资料变更数据落地
     *
     * @param infoMap 退保数据
     * @return 结果
     */
    public void importantChangeInsert(Map<String, Object> infoMap);

}

package com.example.server.service;

import java.util.Map;

/**
 * 保全
 *
 * @author zuosy
 */
public interface PsDataService {

    /**
     * 保全退保数据落地
     *
     * @param infoMap 集合
     *
     */
    public void stpremService(Map<String, Object> infoMap);

    /**
     * 保全追加数据落地
     *
     * @param infoMap 集合
     *
     */
    public void addpremService(Map<String, Object> infoMap);

    /**
     * 重要资料变更数据落地
     *
     * @param infoMap 集合
     *
     */
    public void importantChangeService(Map<String, Object> infoMap);



}

package com.example.server.service.Impl;

import com.example.server.mapper.PsDataMapper;
import com.example.server.service.PsDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
/**
 * 保全
 *
 * @author zuosy
 */
@Service
public class PsDataServicelmpl implements PsDataService {

    @Autowired
    private PsDataMapper psDataMapper;
    /**
     * 退保数据落地
     *
     * @param infoMap
     */
    @Override
    public void stpremService(Map<String, Object> infoMap)
    {
        psDataMapper.stpremInsert(infoMap);
    }

    /**
     * 追加数据落地
     *
     * @param infoMap
     */
    @Override
    public void addpremService(Map<String, Object> infoMap)
    {
        psDataMapper.addpremInsert(infoMap);
    }

    /**
     * 重要资料变更数据落地
     *
     * @param infoMap
     */
    @Override
    public void importantChangeService(Map<String, Object> infoMap)
    {
        psDataMapper.importantChangeInsert(infoMap);
    }
}

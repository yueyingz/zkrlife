package com.example.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.server.service.PsDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 保全数据落地
 *
 * @author zuosy
 */
@RestController
@RequestMapping("/data")
public class PsDataController {
    @Autowired
    private PsDataService psDataService;

    /**
     * 保全退保数据落地
     *
     * @param jsonreq
     *
     */
    @RequestMapping("/get")
    public void psstPrem(@RequestBody JSONObject jsonReq){

//        JSONObject jsonReq =  JSONObject.parseObject(jsonreq);
        Date date= new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMddHHmmss");
        String str=sdf.format(date);
        Map<String, Object> infoMap = new HashMap<String, Object>();

        String edorNo = jsonReq.getString("policyNo")+str;//工单号
        String policyNo = jsonReq.getString("policyNo");//保单号
        String riskName = jsonReq.getString("riskName");//险种名称
        String ctmoney = jsonReq.getString("ctmoney");//退费金额

        infoMap.put("edorNo",edorNo);
        infoMap.put("policyNo",policyNo);
        infoMap.put("riskName",riskName);
        infoMap.put("ctmoney",ctmoney);
        psDataService.stpremService(infoMap);
        //return null;
    }


    /**
     * 保全追加保费数据落地
     *
     * @param jsonreq
     *
     */
    public void addPrem(String jsonreq){
        JSONObject jsonReq =  JSONObject.parseObject(jsonreq);
        SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMddHHmmss");
        Date date= new Date();
        String str=sdf.format(date);

        Map<String, Object> infoMap = new HashMap<String, Object>();
        String edorNo = jsonReq.getString("policyNo")+str;//工单号
        String policyNo = jsonReq.getString("policyNo");//保单号
        String billcode = jsonReq.getString("policyNo")+str;//业务单据编码
        String prodSeq = "1";//险种序号
        String riskCode = jsonReq.getString("riskCode");//险种编码
        String riskName = jsonReq.getString("riskName");//险种名称
        String addprem = jsonReq.getString("addprem");//追加金额
        String fee = jsonReq.getString("fee");//手续费金额
        String accountSum = jsonReq.getString("accountSum");//进账户金额

        infoMap.put("edorNo",edorNo);
        infoMap.put("policyNo",policyNo);
        infoMap.put("billcode",billcode);
        infoMap.put("prodSeq",prodSeq);
        infoMap.put("riskCode",riskCode);
        infoMap.put("riskName",riskName);
        infoMap.put("addprem",addprem);
        infoMap.put("fee",fee);
        infoMap.put("accountSum",accountSum);
        psDataService.addpremService(infoMap);
    }


    /**
     * 重要资料变更数据落地
     *
     * @param jsonreq
     *
     */
    public void importantChange(String jsonreq){
        JSONObject jsonReq =  JSONObject.parseObject(jsonreq);
        SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMddHHmmss");
        Date date= new Date();
        String str=sdf.format(date);

        Map<String, Object> infoMap = new HashMap<String, Object>();
        String edorNo = jsonReq.getString("policyNo")+str;//工单号
        String policyNo = jsonReq.getString("policyNo");//保单号
        String name = jsonReq.getString("name")+str;//姓名
        String modifyName = jsonReq.getString("modifyName");//变更后姓名
        String sex = jsonReq.getString("sex");//性别
        String modifySex = jsonReq.getString("modifySex");//变更后性别
        String idtype = jsonReq.getString("idtype");//证件类型
        String modifyIdtype = jsonReq.getString("modifyIdtype");//变更后证件类型
        String idnum = jsonReq.getString("idnum");//证件号码
        String modifyIdnum = jsonReq.getString("modifyIdnum");//变更后证件号码
        String birthday = jsonReq.getString("birthday");//生日
        String modifyBirthday = jsonReq.getString("modifyBirthday");//变更后生日
        String changeRole = jsonReq.getString("changeRole");//变更对象

        infoMap.put("edorNo",edorNo);
        infoMap.put("policyNo",policyNo);
        infoMap.put("name",name);
        infoMap.put("modifyName",modifyName);
        infoMap.put("sex",sex);
        infoMap.put("modifySex",modifySex);
        infoMap.put("idtype",idtype);
        infoMap.put("modifyIdtype",modifyIdtype);
        infoMap.put("idnum",idnum);
        infoMap.put("modifyIdnum",modifyIdnum);
        infoMap.put("birthday",birthday);
        infoMap.put("modifyBirthday",modifyBirthday);
        infoMap.put("changeRole",changeRole);
        psDataService.importantChangeService(infoMap);
    }
}

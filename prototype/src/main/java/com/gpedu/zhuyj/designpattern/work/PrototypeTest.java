package com.gpedu.zhuyj.designpattern.work;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/13 18:06
 * @Description:
 * @Version 1.0
 */
public class PrototypeTest {

    public static void main(String[] args) {
        //此处为数据库查询
        List<Map<String, Object>> list = new ArrayList<>();

        //修改后
        String arg = JSONArray.toJSONString(list);
        List<ResMonitorProgressAct> progress = JSONArray.parseArray(arg,ResMonitorProgressAct.class);

        //修改前
        /*for (int i = 0; i < list.size(); i++) {
            ResMonitorProgressAct progress = new ResMonitorProgressAct();
            progress.setCampActTargCode((String) list.get(i).get(BeanUtils.transferFieldToCamel(IBOMaCampActivitySubtargValue.S_CampActTargSubcode)));
            progress.setLaunchDeptName((String) list.get(i).get(BeanUtils.transferFieldToCamel("LAUNCH_DEPART_NAME")));
            progress.setExeDeptName((String) list.get(i).get(BeanUtils.transferFieldToCamel(IBOMaCampActivitySubtargValue.S_OrgName)));
            progress.setDistrictName((String) list.get(i).get(BeanUtils.transferFieldToCamel(IBOSecDistrictValue.S_DistrictName)));
            progress.setProductName((String) list.get(i).get(BeanUtils.transferFieldToCamel(IBOMaCampActivityTargValue.S_ProductName)));
            progress.setNormName((String) list.get(i).get(BeanUtils.transferFieldToCamel(IBOMaCampNormValue.S_NormName)));
            progress.setNormDesc((String) list.get(i).get(BeanUtils.transferFieldToCamel(IBOMaCampNormValue.S_NormDesc)));
            long unit = DataTypeUtils.toLong(list.get(i).get(BeanUtils.transferFieldToCamel(IBOMaCampActivityTargValue.S_Unit)));
            double targetValue = DataTypeUtils.toDouble((String) list.get(i).get(BeanUtils.transferFieldToCamel(IBOMaCampActivitySubtargValue.S_TargValue)));
            progress.setTargetValue(targetValue + "(" + BussiUtils.getValue(Constant.DictStaticActivity.NORM_UNIT, String.valueOf(unit)) + ")");
            progress.setCompValue(0 + "(" + BussiUtils.getValue(Constant.DictStaticActivity.NORM_UNIT, String.valueOf(unit)) + ")");
            progress.setCompRate("0%");
        }*/

    }
}

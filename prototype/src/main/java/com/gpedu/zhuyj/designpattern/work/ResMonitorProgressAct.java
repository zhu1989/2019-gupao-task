package com.gpedu.zhuyj.designpattern.work;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/13 18:04
 * @Description:
 * @Version 1.0
 */
public class ResMonitorProgressAct implements Serializable {
    private String campActTargCode;
    private String launchDeptName;
    private String exeDeptName;
    private String districtName;
    private String productName;
    private String normName;
    private String normDesc;//指标口径说明
    private String targetValue;
    private String compValue;
    private String compValueRank;//完成值排名
    private String compRate;
    private String compRateRank;//完成率排名
    private List<Object> children;

    public String getNormDesc() {
        return normDesc;
    }

    public void setNormDesc(String normDesc) {
        this.normDesc = normDesc;
    }

    public String getCompValueRank() {
        return compValueRank;
    }

    public void setCompValueRank(String compValueRank) {
        this.compValueRank = compValueRank;
    }

    public String getCompRateRank() {
        return compRateRank;
    }

    public void setCompRateRank(String compRateRank) {
        this.compRateRank = compRateRank;
    }

    public String getCampActTargCode() {
        return campActTargCode;
    }

    public void setCampActTargCode(String campActTargCode) {
        this.campActTargCode = campActTargCode;
    }

    public String getLaunchDeptName() {
        return launchDeptName;
    }

    public void setLaunchDeptName(String launchDeptName) {
        this.launchDeptName = launchDeptName;
    }

    public String getExeDeptName() {
        return exeDeptName;
    }

    public void setExeDeptName(String exeDeptName) {
        this.exeDeptName = exeDeptName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getNormName() {
        return normName;
    }

    public void setNormName(String normName) {
        this.normName = normName;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public String getCompValue() {
        return compValue;
    }

    public void setCompValue(String compValue) {
        this.compValue = compValue;
    }

    public String getCompRate() {
        return compRate;
    }

    public void setCompRate(String compRate) {
        this.compRate = compRate;
    }

    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }
}


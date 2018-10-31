package cn.edu.pku.lxy.db;

import org.litepal.crud.DataSupport;

//记录市的信息
public class City extends DataSupport {
    private int id;//每一个实体类中都应该有的字段
    private String cityName;//市名
    private int cityCode;//市编号
    private int provinceId;//该市所属省的编号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

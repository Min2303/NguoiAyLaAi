package com.example.nguoiaylaai.model;

public class BinhChon {
    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public int getDocThan() {
        return DocThan;
    }

    public void setDocThan(int docThan) {
        DocThan = docThan;
    }

    public int getDaCoChu() {
        return DaCoChu;
    }

    public void setDaCoChu(int daCoChu) {
        DaCoChu = daCoChu;
    }

    public int getLGBT() {
        return LGBT;
    }

    public void setLGBT(int LGBT) {
        this.LGBT = LGBT;
    }

    public int getCountDocThan() {
        return countDocThan;
    }

    public void setCountDocThan(int countDocThan) {
        this.countDocThan = countDocThan;
    }

    public int getCountDaCoChu() {
        return countDaCoChu;
    }

    public void setCountDaCoChu(int countDaCoChu) {
        this.countDaCoChu = countDaCoChu;
    }

    public int getCountLGBT() {
        return countLGBT;
    }

    public void setCountLGBT(int countLGBT) {
        this.countLGBT = countLGBT;
    }

    public String Ten;
    public String HinhAnh;
    public int DocThan;
    public int DaCoChu;
    public int LGBT;
    private int countDocThan;
    private int countDaCoChu;
    private int countLGBT;
    public BinhChon(String ten, String hinhanh, int docthan, int dacochu, int lgbt) {
        Ten = ten;
        HinhAnh = hinhanh;
        DocThan = docthan;
        DaCoChu = dacochu;
        LGBT = lgbt;
        this.countDocThan = docthan;
        this.countDaCoChu = dacochu;
        this.countLGBT = lgbt;
    }
}

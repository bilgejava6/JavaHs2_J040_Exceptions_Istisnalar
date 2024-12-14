package com.muhammet.havadurumu;

public class HavaDurumu {
    String ilAdi;
    Integer min;
    Integer max;
    Integer avg;

    public HavaDurumu(String ilAdi, Integer min, Integer max) {
        this.ilAdi = ilAdi;
        this.min = min;
        this.max = max;
        this.avg = (min + max) / 2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HavaDurumu{");
        sb.append("ilAdi='").append(ilAdi).append('\'');
        sb.append(", min=").append(min);
        sb.append(", max=").append(max);
        sb.append(", avg=").append(avg);
        sb.append('}');
        return sb.toString();
    }

    public String getIlAdi() {
        return ilAdi;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getAvg() {
        return avg;
    }
}

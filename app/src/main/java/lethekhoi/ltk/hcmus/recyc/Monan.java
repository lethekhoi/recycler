package lethekhoi.ltk.hcmus.recyc;

public class Monan {
    private String ten;

    public Monan(String ten, String mota, int hinhanh) {
        this.ten = ten;
        this.mota = mota;
        this.hinhanh = hinhanh;
    }

    public Monan() {
    }

    private String mota;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    private int hinhanh;
}

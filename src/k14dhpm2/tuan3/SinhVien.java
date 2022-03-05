package k14dhpm2.tuan3;

public class SinhVien {
    private int msv;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    SinhVien(){};

    SinhVien(int ms, String hT, float LT, float TH){
        msv = ms;
        hoTen = hT;
        diemLT = LT;
        diemTH = TH;
    }

    public int getMSSV(){
        return this.msv;
    }

    public void setMSSV(int msv){
        this.msv = msv;
    }

    public String getHoTen(){
        return this.hoTen;
    }

    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public float getDiemLT(){
        return this.diemLT;
    }

    public void setDiemLT(float diemLT){
        this.diemLT = diemLT;
    }

    public float getDiemTH(){
        return this.diemTH;
    }

    public void setDiemTH(float diemTH){
        this.diemTH = diemTH;
    }

    public float tinhTrungBinh(){
        return (this.diemLT + diemTH)/2;
    }

    public String toString(){
        String str = "Mã SV: " + this.msv + " Ho ten: "+this.hoTen + " Diem LT: "+this.diemLT + " Diem TH: "+this.diemTH  + " Diem trung binh: "+ this.tinhTrungBinh();
        return str;
    }
}

package k14dhpm2.tuan3;

public class HinhChuNhat {
    //implementation
    private float chieuDai;
    private float chieuRong;

    //interface
    public float getChieuDai(){
        return this.chieuDai;
    }

    public void setChieuDai(Float chieuDai){
        this.chieuDai = chieuDai;
    }

    public float getChieuRong(){
        return this.chieuRong;
    }

    public void setChieuRong(Float chieuRong){
        this.chieuRong = chieuRong;
    }

    public float tinhChuVi(){
        return (this.chieuDai+this.chieuRong)*2;
    }

    public float tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }

    public String toString(){
        String str = "Chieu Dai: " + this.chieuDai + " Chieu rong: "+this.chieuRong + " chu vi: "+ this.tinhChuVi() +" Dien Tich: "+ this.tinhDienTich();
        return str;
    }
}

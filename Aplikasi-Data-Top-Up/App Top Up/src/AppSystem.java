public class AppSystem {
    private String ID;
    private String jumlah;
    private String no;
    private String pembayaran;
    private String email;
    private String harga;

    public AppSystem() {
    }

    public AppSystem(String ID, String jumlah, String no, String pembayaran, String email) {
        this.ID = ID;
        this.jumlah = jumlah;
        this.no = no;
        this.pembayaran = pembayaran;
        this.email = email;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
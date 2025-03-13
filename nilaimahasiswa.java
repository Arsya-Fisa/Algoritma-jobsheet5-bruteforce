public class nilaimahasiswa {
    String nama;
    int nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public nilaimahasiswa(String nama,int nim,int tahunMasuk, int nilaiUTS,int nilaiUAS){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public static int cariUTSTertinggi(nilaimahasiswa[] data, int l, int r){
        if (l==r) {
            return data[l].nilaiUTS;
        }
        int mid = (l+r) /2;
        int a = cariUTSTertinggi(data, l, mid);
        int b = cariUTSTertinggi(data, mid + 1, r);
        if (a > b) {
            return a;
        }else{
            return b;
        }
    }
    public static int cariUTSTerendah(nilaimahasiswa[] data, int l, int r){
        if (l == r) {
            return data[l].nilaiUTS;
        }
        int mid = (l+r) /2;
        int a = cariUTSTerendah(data, l, mid);
        int b = cariUTSTerendah(data, mid + 1, r);
        if (a < b) {
            return a;
        }else{
            return b;
        }
    }
    public static double hitungRataUAS(nilaimahasiswa[] data){
        int total = 0;
        for (nilaimahasiswa n : data){
            total += n.nilaiUAS;
        }
        return (double) total/data.length;
    }
}

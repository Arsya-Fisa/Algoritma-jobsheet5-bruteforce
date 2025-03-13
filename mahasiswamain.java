public class mahasiswamain {
    public static void main(String[] args) {
        nilaimahasiswa [] mahasiswa = {
            new nilaimahasiswa("Ahmad", 22101001, 2022, 78, 82),
            new nilaimahasiswa("Budi", 220101002, 2022, 85, 88),
            new nilaimahasiswa("Cindy", 220101003, 2021, 90, 87),
            new nilaimahasiswa("Dian", 220101004, 2021, 76, 79),
            new nilaimahasiswa("Eko", 220101005, 2023, 92, 95),
            new nilaimahasiswa("Fajar", 220101006, 2020, 88, 85),
            new nilaimahasiswa("Gina", 220101007, 2023, 80, 83),
            new nilaimahasiswa("Hadi", 220101008, 2020, 82, 84),
        };
        int utsTinggi = nilaimahasiswa.cariUTSTertinggi(mahasiswa, 0, mahasiswa.length - 1);
        int utsrendah = nilaimahasiswa.cariUTSTerendah(mahasiswa, 0, mahasiswa.length - 1);
        double rataUAS = nilaimahasiswa.hitungRataUAS(mahasiswa);
        
        System.out.println("Nilai UTS tertinggi: " + utsTinggi);
        System.out.println("Nilai UTS terendah: " + utsrendah);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);
    }
}

package com.dercoding.antibotic;

public class Drugs {
    private String name;
    private String detail;
    private int photo;
    //tambahan indikasi
    private String indikasi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    //tambahan indikasi

    //fungsi ini untuk mengirim data kemanapun karna indikasinya udah ada nilai dari setIndikasi
    public String getIndikasi() {
        return indikasi;
    }
// nilai Indikasi disini dapet dari DrugsData
    public void setIndikasi(String indikasi) { // << setIndikasinya jadi kuning, kalo tadi masih abu
        this.indikasi = indikasi;
    }
}

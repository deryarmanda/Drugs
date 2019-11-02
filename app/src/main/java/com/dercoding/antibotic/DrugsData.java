package com.dercoding.antibotic;

import java.util.ArrayList;

public class DrugsData {
    private static String[] drugsNames = {
            "Ampicillin",
            "Amoxicillin",
            "Cefazolin",
            "Cefixime",
            "Paracetamol",
            "Ibuprofen",
            "Tramadol",
            "Simvastatin",
            "Atorvastatin",
            "Allopurinol",
            "Colchicine",
            "Amplodipine",
            "Catopril"
    };

    private static String[] drugsDetails = {
            "Ampicillin adalah obat yang dapat digunakan untuk mengatasi infeksi akibat bakteri, seperti infeksi saluran pernapasan, saluran pencernaan, jantung (endokarditis), saluran kemih, kelamin (gonore), dan telinga. Obat yang termasuk ke dalam golongan antibiotik penisilin ini bekerja dengan cara membunuh bakteri penyebab infeksi.\n",
            "Amoxicillin adalah obat untuk mengatasi berbagai jenis infeksi bakteri. Amoksisilin atau amoxicillin akan menghambat pertumbuhan bakteri yang menyebabkan infeksi di organ paru-paru, saluran kemih, kulit, serta di bagian telinga, hidung, dan tenggorokan.",
            "Cefazolin adalah antibiotik yang digunakan untuk menangani beragam kondisi akibat infeksi bakteri. Selain itu, obat ini juga dapat digunakan untuk mencegah infeksi bakteri pada seseorang yang akan dan telah menjalani operasi.",
            "Cefixime adalah antibiotik untuk mengobati infeksi bakteri pada telinga, saluran pernapasan, dan infeksi saluran kemih. Obat cefixime akan menghambat perkembangbiakan bakteri, tetapi tidak dengan virus. Oleh karena itu, cefixime tidak diperlukan untuk mengobati infeksi virus, seperti flu.",
            "Paracetamol adalah salah satu obat yang masuk ke dalam golongan analgesik (pereda nyeri) dan antipiretik (penurun demam). Obat ini dipakai untuk meredakan rasa sakit ringan hingga menengah, serta menurunkan demam. Untuk orang dewasa, dianjurkan untuk mengonsumsi paracetamol 1-2 tablet sebanyak 500 miligram hingga 1 gram tiap 4-6 jam sekali dalam 24 jam.",
            "Ibuprofen termasuk jenis obat antiinflamasi nonsteroid. Obat ini dapat meredakan rasa sakit ringan hingga menengah, serta mengurangi peradangan. Contoh gejala yang dapat ditangani ibuprofen adalah nyeri otot dan sendi, migrain, nyeri menstruasi, sakit gigi, serta nyeri setelah operasi. Di samping itu, ibuprofen juga dipakai untuk mengurangi demam dan pegal-pegal akibat flu.",
            "Tramadol adalah obat pereda rasa sakit, misalnya rasa sakit atau nyeri setelah operasi. Tramadol atau lengkapnya tramadol hydrochloride (HCl) bermanfaat untuk pasien dewasa dan anak-anak berusia 12 tahun ke atas. Obat ini bekerja dengan cara memengaruhi reaksi kimia di dalam otak untuk mengurangi sensasi rasa sakit.",
            "Simvastatin adalah obat untuk menurunkan kadar kolesterol dalam darah. Penggunaan simvastatin yang disertai pola diet rendah kolesterol bisa mencegah serangan jantung dan stroke. Kolesterol adalah zat lemak yang dibutuhkan oleh tubuh untuk memproduksi hormon dan vitamin D, serta membantu mencerna makanan.",
            "Atorvastatin adalah obat yang digunakan untuk menurunkan kolesterol jahat (LDL) dan trigliserida, serta meningkatkan jumlah kolesterol baik (HDL) di dalam darah. Jika kolesterol dalam darah tetap terjaga dalam nilai normal, maka akan menurunkan risiko stroke dan serangan jantung.",
            "Allopurinol adalah obat yang digunakan untuk menurunkan kadar asam urat di dalam darah. Selain karena pola makan yang kurang sehat, kadar asam urat juga bisa naik akibat pengobatan kemoterapi pada penderita kanker. Kadar asam urat yang tinggi tidak hanya dapat menyebabkan penyakit asam urat atau gout, namun juga bisa menyebabkan pembentukan batu ginjal.",
            "Colchicine adalah obat yang digunakan untuk mencegah gout akut (serangan penyakit asam urat), yaitu rasa nyeri hebat yang datang tiba-tiba pada satu atau beberapa sendi. Obat ini juga digunakan untuk mengurangi rasa sakit ketika serangan penyakit asam urat terjadi. Serangan penyakit asam urat paling sering terjadi pada jempol kaki, lutut, atau pergelangan kaki.",
            "Amlodipine adalah obat darah tinggi atau hipertensi. Tekanan darah yang terkontrol dapat mencegah penyakit stroke, serangan jantung, dan penyakit ginjal. Amlodipine, atau tepatnya amlodipine besylate, bisa dikonsumsi sebagai obat tunggal atau dikombinasikan dengan obat lain dalam mengatasi hipertensi.",
            "Captopril adalah obat yang masuk ke dalam kelompok penghambat enzim pengubah angiotensin (ACE inhibitors). Fungsi utama captopril adalah untuk mengobati hipertensi dan gagal jantung. Selain itu, obat ini juga berguna untuk melindungi jantung setelah terjadi serangan jantung, serta menangani penyakit ginjal akibat diabetes (nefropati diabetik)."
    };

    private static int[] drugsImage = {
            R.drawable.ampicillin,
            R.drawable.amoxicillin,
            R.drawable.cefazolin,
            R.drawable.cefixime,
            R.drawable.paracetamol,
            R.drawable.ibuprofen,
            R.drawable.tramadol,
            R.drawable.simvastatin,
            R.drawable.atorvastatin,
            R.drawable.allopurinol,
            R.drawable.colchicine,
            R.drawable.amplodipine,
            R.drawable.catopril,
    };

    //tambahan indikasi

    // kirim data ke variable indikasi yang di setIndikasi
    private static String[] drugsIndiksi = {
            "Indikasi Ampicillin antibiotik : infeksi\n" + "Dosis : 0.25 - 2 g setiap 6 jam\n" + "Kontraindikasi : riwayat alergi ampicilin atau penisilin",
            "Indikasi Amoxicillin antibiotik : infeksi\n"+ "Dosis : 250 - 500 mg setiap 8 jam\n"+ "Kontraindikasi : riwayat alergi amoksisilin atau penisilin",
            "Indikasi Cefazolin antibiotik : infeksi\n"+ "Dosis : 0.25 - 0.5 g setiap 8 jam\n"+ "Kontraindikasi : alergi obat cephalosporin",
            "Indikasi Sefiksim antibiotik : infeksi\n"+ "Dosis : 200mg - 400mg perhari\n"+ "Kontraindikasi : alergi obat chepalosporin, bayi baru lahir, dan bayi prematur",
            "Indikasi Paracetamol (NSAID) : mengurangi rasa sakit derajat ringan sampai sedang\n"+ "Dosis : 0.5 - 1 g setiap 4-6 jam, dosis maksimal 4 g perhari\n"+ "Kontraindikasi : gangguan fungsi hati dan penyakit hati yang masih aktif",
            "Indikasi Ibuprofen : mengurangi rasa sakit derajat ringan sampai sedang\n"+ "Dosis : 400 - 800 mg setiap 6 jam\n"+ "Kontraindikasi : riwayat alergi obat NSAID, riwayat asma, riwayat pendarahan saluran cerna.",
            "Indikasi Tramadol: mengurangi rasa sakit derajat sedang sampai berat\n"+ "Dosis : 50 - 100 mg setiap 4 - 6 jam \n"+ "Kontraindikasi : epilepsi tidak terkontrol, riwayat asma yang berat, penyakit ginjal dan hati",
            "Indikasi Simvastatin: hiperkolesterol\n"+ "Dosis : 10 - 20 mg sehari\n"+ "Kontraindikasi : penyakit hati akut, penderita HIV, ibu hamil dan menyusui",
            "Indikasi Atorvastatin : hiperkolesterol\n"+ "Dosis : 10 - 20 mg perhari\n"+ "Kontraindikasi : ibu hamil dan menyusui, penyakit hati akut",
            "Indikasi Allopurinol: hiperurisemia (asam urat)\n"+ "Dosis : 100 mg perhari\n"+ "Kontraindikasi : HLA-B*58:01-Positive pasien",
            "Indikasi Colchicine: Gout \n"+ "Dosis : 1 mg, dilanjutkan 0.5 mg setelah 1 jam. \n"+ "Kontraindikasi : penyakit ginjal dan hati, HIV positif",
            "Indikasi Amlodipine: hipertensi, angina stabil kronik\n"+ "Dosis : 5mg perhari\n"+ "Kontraindikasi : riwayat dan resiko hipotensi berat, riwayat gagal jantung",
            "Indikasi Captopril: hipertensi\n"+ "Dosis : 25 - 75 mg perhari dibagi 2-3 dosis\n"+ "Kontraindikasi : hiperkalsium, gagal ginjal"
    };

    static ArrayList<Drugs> getListData() {
        ArrayList<Drugs> list = new ArrayList<>();
        for (int position = 0; position < drugsNames.length; position++) {
            Drugs drugs = new Drugs();
            drugs.setName(drugsNames[position]);
            drugs.setDetail(drugsDetails[position]);
            drugs.setPhoto(drugsImage[position]);
            // ngirim data String[] drugsIndikasi diatas ke setIndikasi yang ada di Drugs
            drugs.setIndikasi(drugsIndiksi[position]);
            list.add(drugs);
        }
        return list;
    }
}

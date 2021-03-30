package com.example.tugas_3;


import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class CabrioletData extends AppCompatActivity {


    private static String[] CabrioletNames ={
            "Audi A3 Cabriolet",
            "Audi TT roadster",
            "BMW 4 Series Convertible",
            "Mazda MX 5",
            "Mercedes Benz SLC",
            "Mini Coopers S Cabrio",
            "Morgan Plus Four",
            "Porsche 718 Spyder 14",
            "Range Rovers Evoque"
    };
    private static String[] CabrioletDetails ={
            "mobil pabrikan dari jerman,  harganya sekitar Rp. 600 juta",
            "mobil pabrikan dari jerman,  harganya sekitaran Rp 1,42 Milyar ",
            "mobil pabrikan dari jerman, harganya sekitaran Rp 1,62 Milyar",
            "mobil pabrikan dari Amerika dengan Roadster jepang, harganya sekitaran Rp 808 Juta Milyar",
            "mobil pabrikan dari jerman, harganya sekitaran Rp 1,78 Milyar",
            "mobil pabrikan dari inggris, harganya sekitaran Rp 1 Milyar",
            "mobil pabrikan dari inggris, harganya sekitaran Rp 1,14 Milyar",
            "mobil pabrikan dari prancis, harganya sekitaran Rp 2,5 Milyar",
            "mobil pabrikan dari inggris, harganya sekitaran Rp 1,5 Milyar"
    };
    private static String[] CabrioletList ={
            "spesifikasi mesin Audi A3, ini ditenagai dua pilihan mesin Bensin berkapasitas 1197 cc. A3 tersedia dengan transmisi Otomatis tergantung variannya.",
            "spesifikasi mesin Audi TT Coupe, ini ditenagai dua pilihan mesin Bensin berkapasitas 1984 cc. TT Coupe tersedia dengan transmisi Otomatis tergantung variannya. TT Coupe adalah Coupe 4 seater dengan panjang 4177 mm, lebar 1832 mm, wheelbase 2505 mm.",
            "spesifikasi mesin BMW 4 Series Convertible, ini ditenagai dua pilihan mesin Bensin berkapasitas 1998 cc. 4 Series Convertible tersedia dengan transmisi Otomatis tergantung variannya. Juga, tergantung pilihan dan jenis bahan bakar, konsumsi BBM 4 Series Convertible mencapai 13.3 kmpl untuk perkotaan, 20 kmpl saat menjelajah perjalanan luar kota. 4 Series Convertible adalah Convertible 4 seater dengan panjang 4638 mm, lebar 2017 mm, wheelbase 2810 mm.",
            "spesifikasi mesin Mazda MX 5 RF, ini ditenagai dua pilihan mesin Bensin berkapasitas 1998 cc. MX 5 RF tersedia dengan transmisi Otomatis tergantung variannya. MX 5 RF adalah Convertible 2 seater dengan panjang 3914 mm, lebar 1735 mm, wheelbase 2309 mm.",
            "spesifikasi mesin Marcedes Benz SLC 1991 cc, Tenaga 184 hp, Kecepatan maksimum 240 kmph, akselerasi 7.0 s, Jenis Bahan Bakar, Bensin Torsi 300 Nm",
            "spesifikasi mesin  Mini Coopers S Cabrio 2.0 Liter, 4-Cylinder MINI TwinPower Turbo Engine – Turbo Charging, Direct Injection, VALVETRONIC, Dual VANOS Kapasitas Mesin 1499 cc, Silinder 4, Transmisi Otomatis,Tipe Transmisi 8 Kecepatan, Tenaga Maksimal 192 hp @ 5,000-6,000 rpm, Torsi Maksimal 280 Nm @ 1,250 – 4,6000 rpm, Bahan Bakar Bensin",
            "spesifikasi mesin Morgan Plus Four diklaim mampu berakselerasi dari 0-100 km per jam hanya dalam waktu 5,2 detik dan dapat melesat hingga 240 Km per jam.mesin twinPower turbo 2.0-liter empat-silinder yang mampu menghasilkan daya hingga 255 Tenaga kuda dan torsi 400 Nm",
            "spesifikasi mesin Porsche 718, ini ditenagai dua pilihan mesin Bensin berkapasitas 2497 cc. 718 tersedia dengan transmisi Manual and Otomatis tergantung variannya. 718 adalah Coupe 2 seater dengan panjang 4379 mm, lebar 1801 mm, wheelbase 2475 mm.",
            "spesifikasi mesin Land Rover Range Rover Evoque, ini ditenagai dua pilihan mesin Bensin berkapasitas 1999 cc. Range Rover Evoque tersedia dengan transmisi Otomatis tergantung variannya. Range Rover Evoque adalah SUV 5 seater dengan panjang 4365 mm, lebar 2125 mm, wheelbase 2660 mm. serta ground clearance 212 mm."
    };
    private static int[] CabrioletImages ={
            R.drawable.audi_a3_cabriolet,
            R.drawable.audi_tt_roadster,
            R.drawable.bmw_4_series_convertible,
            R.drawable.mazda_mx_5,
            R.drawable.mercedes_benz_slc,
            R.drawable.mini_cooper_s_cabrio_1,
            R.drawable.morgan_plus_four,
            R.drawable.porsche_718_spyder_14,
            R.drawable.range_rovers_evoque
    };

    static ArrayList<cabriolet> getListData(){
        ArrayList<cabriolet> list = new ArrayList<>();
        for (int position =0; position < CabrioletNames.length;position++ ){

            cabriolet cabriolet = new cabriolet();
            cabriolet.setName(CabrioletNames[position]);
            cabriolet.setDetail(CabrioletDetails[position]);
            cabriolet.setList(CabrioletList[position]);
            cabriolet.setPhoto(CabrioletImages[position]);
            list.add(cabriolet);
        }
        return list;
    }
}

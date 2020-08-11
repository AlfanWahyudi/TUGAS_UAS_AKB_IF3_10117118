package com.example.tugas_uas_akb_if3_10117118.Data.Sqlite;

import android.content.Context;

public class TambahDataWisata  {
    private static sqliteHelper databaseHelper;

    public TambahDataWisata(Context context) {
        databaseHelper  = new sqliteHelper(context);

//        databaseHelper.insertData("Farmhouse Lembang",
//                "Taman",
//                "Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
//                "Senin-Minggu",
//                "https://alampriangan.com/wp-content/uploads/2016/12/farmhouse-lembang.jpg",
//                "8AM-8PM",
//                "Tempat ini langsung menyedot banyak pengunjung karena lokasinya yang strategis, dan banyaknya spot berfoto yang bagus banget.",
//                "-6.833014",
//                "107.605668");
//
//        databaseHelper.insertData("Curug Cinulang Cicalengka",
//                "Air terjun",
//                "Jl. Curug CinulangKec. Cicalengka, Bandung, Jawa Barat 40395      ",
//                "Senin-Minggu",
//                "https://www.bastianrental.com/wp-content/uploads/2018/12/wisata-bandung-curug-cinulang-cicalengka-selfie-hits-1080x540.jpg",
//                "8AM-5PM",
//                "Curug Cinulang terletak di perbatasan kabupaten Bandung dengan Sumedang. Tapi tempatnya lebih mudah dijangkau dari Bandung, tepatnya dari Cicalengka.",
//                "-6.963031",
//                "107.882329");
//
//        databaseHelper.insertData("Gunung Tangkuban Perahu",
//                "Gunung",
//                "Cikahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat         ",
//                "Senin-Minggu",
//                "https://yourbandung.com/wp-content/uploads/2019/07/030315-GUNUNG-TANGKUBAN-PARAHU0065.jpg",
//                "8AM-5PM",
//                " Terletak di daerah Lembang, sekitar 20 kilometer di utara Kota Bandung, gunung yang bentuknya menyerupai perahu terbalik ini selalu padat pengunjung pada akhir pekan dan waktu liburan.",
//                "-6.759640",
//                "107.609782");
//
//        databaseHelper.insertData("Kawah Putih Ciwidey",
//                "Kawah, Kawah belerang",
//                "Sugihmukti, Kec. Pasirjambu, Bandung, Jawa Barat                  ",
//                "Senin-Minggu",
//                "https://cdn0-production-images-kly.akamaized.net/_l6SHhXRTDHyZ3NW-UZtDYaFL-o=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2784457/original/045292900_1555906786-iStock-1065331334.jpg",
//                "8AM-5PM",
//                "Kawah yang terletak di daerah Ciwidey sekitar 50 Km di selatan Bandung ini merupakan kawah vulkanik dengan tanah yang berwarna putih akibat kandungan belerang pada tanahnya tersebut.",
//                "-7.166229",
//                "1107.402124");
//
//        databaseHelper.insertData("Museum Geologi Bandung",
//                "Museum",
//                "Jl. Diponegoro No.57, Cihaur Geulis, Kec. Cibeunying Kaler, Kota Bandung, Jawa Barat 40122",
//                "Senin-Minggu",
//                "https://www.wisataidn.com/wp-content/uploads/2020/07/Lokasi-Museum-Geologi-Bandung-750x450.jpg",
//                "8AM-5PM",
//                "Tempat wisata edukasi ini terletak di jalan Diponegoro, sangat dekat dengan Gedung Sate dan Taman Lansia. Museum ini memiliki koleksi fosil, bebatuan, mineral dan peta (geologi, geofisika, gunung api, geomorfologi, dsb).",
//                "-6.900729",
//                "107.621454");
//
//        databaseHelper.insertData("Danau Situ Patenggang",
//                "Danau",
//                "Patengan, Kec. Rancabali, Bandung, Jawa Barat                     ",
//                "Senin-Minggu",
//                "https://wisatapedi.com/wp-content/uploads/2015/06/danau-situ-patenggang-bandung.jpg",
//                "8AM-6PM",
//                "Pemandangan yang disuguhkan danau ini sangat indah. Dikelilingi oleh lembah dan perkebunan teh yang hijau, banyak pengunjung menjadikan tempat ini sebagai tempat bersantai bersama keluarga dan teman.",
//                "-7.167101",
//                "107.357544");
//
//        databaseHelper.insertData("Curug Cimahi",
//                "Air terjun",
//                "Jl. Kolonel Masturi No.325, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551",
//                "Senin-Minggu",
//                "https://wisatabagus.com/wp-content/uploads/2020/02/curug-cimahi.jpg",
//                "8AM-6PM",
//                "Suasana di area curug cimahi Bandung alami dan tertata baik, anda bisa menikmati air terjun yang tinggi dengan air yang jernis, plus suasana alami yang indah.",
//                "-6.799273",
//                "107.577532");
//
//        databaseHelper.insertData("Taman Hutan Raya Ir. H. Djuanda",
//                "Taman",
//                "Kompleks Tahura, Jl. Ir. H. Juanda No.99, Ciburial, Kec. Cimenyan, Bandung, Jawa Barat 40198",
//                "Senin-Minggu",
//                "https://tourbandung.id/wp-content/uploads/2019/05/Lokasi-Taman-Hutan-Raya-Ir.-H.-Juanda-1030x541.jpg",
//                "7AM-6PM",
//                "Taman Hutan Raya terletak di kawasan Dago Pakar, membentang sampai ke daerah Maribaya. Terdapat kurang lebih 2500 jenis tanaman.",
//                "-6.856603",
//                "107.632667");
//
//        databaseHelper.insertData("Taman Buru Kareumbi Masigit",
//                "Taman",
//                "Desa Leuwiliang, Tanjungwangi, Cicalengka, Tanjungwangi, Kec. Cicalengka, Bandung, Jawa Barat 40395",
//                "Senin-Minggu",
//                "https://www.hargatiket.net/wp-content/uploads/2019/11/Taman-Buru-Masigit-Kareumbi.jpg",
//                "24 Jam",
//                "Di taman buru Kareumbi Masigit, anda bisa hiking, berkeliling hutan, menginap di rumah pohon, ataupun kegaitan outbond rombongan.",
//                "-6.953250",
//                "107.914261");
//
//        databaseHelper.insertData("Ciwidey Valley Hot Spring Water Park",
//                "Taman air",
//                "Jl. Barutunggul KM. 17, Ciwidey, Alamendah, Rancabali, Alamendah, Kec. Rancabali, Bandung, Jawa Barat 40973",
//                "Senin-Sabtu",
//                "https://tempatasik.com/wp-content/uploads/2019/09/harga-tiket-masuk-ciwidey-valley.jpg",
//                "none",
//                "Disini kita bisa menikmati berbagai permainan di waterpark air panas yang tersedia.",
//                "-7.134899",
//                "107.415950");
    }
}
